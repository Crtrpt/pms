<template>
  <div class="flex justify-center items-center">
    <div class="w-1/6">
      <div class="font-black text-5xl">PMS.com</div>
      <div class="mt-10 text-3xl">找回密码</div>
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
        </div>

        <div class="flex items-center justify-between">
          <div class="flex items-center">
            <input
              id="remember-me"
              name="remember-me"
              type="checkbox"
              class="
                h-4
                w-4
                text-blue-600
                focus:ring-blue-500
                border-gray-300
                rounded
              "
            />
            <label for="remember-me" class="ml-2 block text-sm text-gray-900">
              记住我
            </label>
          </div>

          <div class="text-sm">
            <a href="#" class="font-medium text-blue-600 hover:text-blue-500">
              忘记密码
            </a>
          </div>
        </div>

        <div>
          <button
            type="submit"
            @submit="submit($event)"
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
            登录
          </button>
        </div>
      </form>
      <div class="mt-2 text-sm text-gray-400 hover:text-gray-600">
        还没有账号?<a
          @click="goSignup"
          href="javascript:;"
          class="cursor-pointer ml-2 hover:text-blue-600"
          >去注册</a
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
      },
    };
  },
  methods: {
    goSignup(e) {
      this.$router.push({ name: "signup" });
    },
    submit(e) {
      e.defaultPrevented();
      e.stopPropagation();

      console.log(this.form);
    },
  },
};
</script>
