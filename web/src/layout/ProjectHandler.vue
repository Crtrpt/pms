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
        project-handler
        bg-white
        border-b border-r border-l border-gray-400
        shadow
        py-2
      "
    >
      <ProjectList />
    </div>
  </div>
</template>

<script>
import { PlusIcon } from "@heroicons/vue/solid";
import ProjectList from "./ProjectList.vue";
export default {
  components: {
    PlusIcon,
    ProjectList,
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
.project-handler {
  position: absolute;
  width: 300px;
  height: 50%;
}
</style>
