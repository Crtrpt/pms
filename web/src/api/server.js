import Vue from 'vue'
import config from '../utils/config'
import cache from '../utils/cache'
import router from 'vue-router'
const axios = require('axios')

const endpoint = config.VUE_APP_ENDPOINT
const version = ''
const prefix = ''

console.log('endpoint', endpoint)

const RequestPrefixUrl = endpoint + version + prefix

const server = axios.create({
  baseURL: RequestPrefixUrl, // api的base_url
  timeout: 30000 // request timeout
})

server.interceptors.request.use(
  function (config) {
    // Do something before request is sent
    const param = {
      token: window.localStorage.token,
      accessToken: window.localStorage.accessToken,
      timestamp: (new Date()).getTime(),
      appId: window.localStorage.appId
    }
    if (config.method === 'post') {
      // config.data.token = window.localStorage.token;
      config.headers.Authorization = `Bearer ${window.localStorage.token}`
      config.headers.token = `Bearer ${window.localStorage.token}`
      config.headers.X_ACCESS = `appId ${window.localStorage.appId} accessToken ${window.localStorage.accessToken} t ${(new Date()).getTime()} `
    } else {
      config.params = Object.assign(param, config.params)
    }

    // 检查缓存

    let aCache = cache.get(config.url)
    if (aCache) {
      const source = axios.CancelToken.source()
      config.cancelToken = source.token
      source.cancel(JSON.stringify({
        type: 'CANCELTTYPE.CACHE',
        data: aCache
      }))
    }

    // TODO 增加签名
    return config
  },
  function (error) {
    // Do something with request error
    return Promise.reject(error)
  }
)

server.interceptors.response.use(
  function (response) {
    // 检测API版本变化
    let apiVersion = response.headers['x-api-version']
    if ((apiVersion != undefined) && (localStorage.apiVersion != undefined) && (apiVersion != localStorage.apiVersion)) {
      localStorage.setItem('apiVersion', apiVersion)
      location.reload()
    }
    localStorage.setItem('apiVersion', apiVersion)

    if (response.data.code === 0) {
      // 缓存
      let cacheTime = response.config.cacheTime
      if (cacheTime && cacheTime > 0) {
        cache.set(response.config.url, response.data.data, cacheTime)
      }

      return response.data.data
    } else {
      if (response.data.code === 10004) {
        // window.app._bv__toast._vm._bv__modal.msgBoxOk(response.data.msg);
        // window.localStorage.removeItem("username");
        // window.localStorage.removeItem("id");
        // window.localStorage.removeItem("token");
        // window.localStorage.removeItem("role");
        // window.localStorage.removeItem("groupName");
        window.app.$router.push('/login')
        return
      }
      if (response.data.code === 10005) {
        window.app.$store.dispatch('auth/setDuplicateLoginMsg', response.data.msg)
        // sessionStorage.setItem('duplicate-logined-msg', response.data.msg)
        window.app.$bvModal.show('duplicate-logined')
        // window.app.$router.push('/login')
        return
      }

      if (response.data.code === -1) {
        console.log(response.data.msg)
      } else {
        window.app.$bvToast.toast(response.data.msg, {title: '提示:', toaster: 'b-toaster-top-center', variant: 'danger'})
      }
      return Promise.reject(new Error(response.data.msg))
    }
  },
  function (error) {
    return Promise.reject(error)
  }
)

export { server }
