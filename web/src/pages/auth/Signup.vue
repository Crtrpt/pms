<template>
  <div class="flex justify-center items-center">
    <div class="w-1/6">
      <div class="font-black text-5xl">PMS.com</div>
      <div class="mt-10 text-3xl">注册</div>
    </div>
    <div class="w-1/6">
      <form class="mt-8 space-y-6 border p-4 shadow" @submit="submit($event)">
        <input type="hidden" name="remember" value="true" />
        <div class="rounded-md shadow-sm -space-y-px">
          <div>
            <label for="email-address" class="sr-only">账号</label>
            <input
              id="email-address"
              name="email"
              required=""
              class="
                appearance-none
                rounded-none
                relative
                block
                w-full
                px-3
                py-2
                border border-gray-300
                placeholder-gray-500
                text-gray-900
                rounded-t-md
                focus:outline-none
                focus:ring-blue-500
                focus:border-blue-500
                focus:z-10
                sm:text-sm
              "
              placeholder="账户"
              v-model="form.account"
            />
          </div>
          <div>
            <label for="password" class="sr-only">密码</label>
            <input
              v-model="form.password"
              id="password"
              name="password"
              type="password"
              autocomplete="current-password"
              required=""
              class="
                appearance-none
                rounded-none
                relative
                block
                w-full
                px-3
                py-2
                border border-gray-300
                placeholder-gray-500
                text-gray-900
                rounded-b-md
                focus:outline-none
                focus:ring-blue-500
                focus:border-blue-500
                focus:z-10
                sm:text-sm
              "
              placeholder="密码"
            />
          </div>
          <div>
            <label for="phone" class="sr-only">手机号</label>
            <input
              v-model="form.phone"
              id="phone"
              name="phone"
              type="phone"
              required=""
              class="
                appearance-none
                rounded-none
                relative
                block
                w-full
                px-3
                py-2
                border border-gray-300
                placeholder-gray-500
                text-gray-900
                rounded-b-md
                focus:outline-none
                focus:ring-blue-500
                focus:border-blue-500
                focus:z-10
                sm:text-sm
              "
              placeholder="手机号"
            />
          </div>
          <div>
            <label for="verifCode" class="sr-only">验证码</label>
            <input
              v-model="form.verifCode"
              id="verifCode"
              name="verifCode"
              type="verifCode"
              required=""
              class="
                appearance-none
                rounded-none
                relative
                block
                w-full
                px-3
                py-2
                border border-gray-300
                placeholder-gray-500
                text-gray-900
                rounded-b-md
                focus:outline-none
                focus:ring-blue-500
                focus:border-blue-500
                focus:z-10
                sm:text-sm
              "
              placeholder="验证码"
            />
          </div>
        </div>

        <div>
          <button
            type="submit"
            class="
              group
              relative
              w-full
              flex
              justify-center
              py-2
              px-4
              border border-transparent
              text-sm
              font-medium
              rounded-md
              text-white
              bg-blue-600
              hover:bg-blue-700
              focus:outline-none
              focus:ring-2
              focus:ring-offset-2
              focus:ring-indigo-500
            "
          >
            <span class="absolute left-0 inset-y-0 flex items-center pl-3">
              <LockClosedIcon
                class="h-5 w-5 text-blue-500 group-hover:text-blue-400"
                aria-hidden="true"
              />
            </span>
            注册
          </button>
        </div>
      </form>
      <div class="mt-2 text-sm text-gray-400 hover:text-gray-600">
        已经有账号了?<a
          @click="goLogin"
          href="javascript:;"
          class="cursor-pointer ml-2 hover:text-blue-600"
          >去登录</a
        >
      </div>
    </div>
  </div>
</template>

<script>
import { LockClosedIcon } from "@heroicons/vue/solid";

export default {
  components: {
    LockClosedIcon,
  },
  data() {
    return {
      form: {
        account: "",
        password: "",
        phone: "",
        verifCode: "",
      },
    };
  },
  methods: {
    goLogin(e) {
      this.$router.push({ name: "login" });
    },
    submit(e) {
      e.stopPropagation();
      e.defaultPrevented();
      console.log(this.form);
    },
  },
};
</script>
