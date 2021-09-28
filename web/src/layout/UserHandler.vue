<template>
  <div class="h-full" @mouseenter="enter" @mouseleave="leave">
    <div
      class="
        flex flex-row
        justify-start
        items-center
        cursor-pointer
        h-full
        hover:bg-gray-100
        px-4
        hover:text-gray-600
      "
    >
      <div class="p-2 h-6 w-6 border border-gray-200 rounded-full mx-2">
        <img
          class="h-full"
          src="https://tailwindui.com/img/logos/workflow-mark-indigo-600.svg"
        />
      </div>
      <div class="">测试用户</div>
      <ChevronDownIcon class="ml-2 w-4" />
    </div>
    <div
      v-if="display"
      class="
        user-handler
        bg-white
        border-b border-r border-l border-gray-400
        shadow
        py-2
      "
    >
      <div
        v-for="m in mlist"
        :key="m"
        class="pl-4 py-1 hover:bg-gray-200 cursor-pointer"
      >
        {{ m.name }}
      </div>
    </div>
  </div>
</template>

<script>
import { ChevronDownIcon } from "@heroicons/vue/solid";

export default {
  data() {
    return {
      display: false,
      mlist: [
        {
          name: "我的信息",
        },
        {
          name: "我的组织",
        },
        {
          name: "退出",
        },
      ],
    };
  },
  methods: {
    leave() {
      this.display = false;
    },
    enter() {
      this.display = true;
    },
  },
  components: {
    ChevronDownIcon,
  },
};
</script>

<style scoped>
.user-handler {
  position: absolute;
  width: 160px;
}
</style>
