<template>
  <div @mouseenter="enter" @mouseleave="leave">
    <div
      class="
        flex flex-row
        justify-start
        items-center
        cursor-pointer
        h-full
        hover:bg-gray-100
        px-4
        text-gray-400
        hover:text-gray-600
      "
    >
      <div>
        <img
          class="h-4 px-2"
          src="https://tailwindui.com/img/logos/workflow-mark-indigo-600.svg"
          alt="Workflow"
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
  width: 150px;
}
</style>
