import { createApp } from 'vue'
import App from './App.vue'
import './index.css'
import {  h, defineAsyncComponent } from "vue";
import { createRouter, createWebHashHistory } from "vue-router";
import route from "./route/index.js";
import store from "./store/index.js";

const router = createRouter({
    history: createWebHashHistory(),
    routes: route,
});
const app = createApp(App);
app.use(router);
app.use(store);
app.mount('#app')
