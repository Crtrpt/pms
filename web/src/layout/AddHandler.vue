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
        px-2
        hover:text-gray-600
      "
    >
      <PlusIcon class="h-4 px-1 hover:text-gray-600 cursor-pointer" />
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
import { PlusIcon } from "@heroicons/vue/solid";

export default {
  components: {
    PlusIcon,
  },
  data() {
    return {
      display: false,
      mlist: [
        {
          name: "创建项目",
        },
        {
          name: "创建组织",
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
};
</script>

<style scoped>
.user-handler {
  position: absolute;
  width: 160px;
}
</style>
