<template>
  <div class="content flex-grow h-full flex flex-col" style="width: 0">
    <div class="p-2 border-b border-gray-200 flex items-center text-gray-600">
      <GoBack />
      <div class="text-xl">项目:</div>
      <ProjectHandler />
    </div>
    <div class="project-nav flex border-b border-gray-200">
      <div class="flex-grow flex">
        <div
          v-for="i in mList"
          :key="i"
          @click="goView(i)"
          class="
            p-1
            px-4
            cursor-pointer
            border-r border-gray-200
            flex
            items-center
          "
          :class="[
            view == i.name ? '  shadow-inner bg-white text-blue-500' : '',
          ]"
        >
          <component :is="i.icon" class="h-3" />
          <div class="pl-1">{{ i.displayName }}</div>
        </div>
      </div>

      <div class="flex">
        <div
          class="
            p-1
            px-4
            cursor-pointer
            bg-gray-200
            hover:bg-gray-300
            border-r border-gray-200
            flex
            text-gray-600
          "
        >
          <ChartPieIcon class="w-3" />
          <div class="pl-1">趋势</div>
        </div>
        <div
          @click="goView('setting')"
          class="
            p-1
            px-4
            cursor-pointer
            bg-gray-200
            hover:bg-gray-300
            border-r border-gray-200
            flex
            text-gray-600
          "
        >
          <CogIcon class="w-3" />
          <div class="pl-1">配置</div>
        </div>
      </div>
    </div>

    <component :is="view" class="flex-grow" />
  </div>
</template>
<script>
import TopHeader from "./TopHeader.vue";
import LeftBar from "./LeftBar.vue";
import LeftList from "./ProjectList.vue";
import ProjectHandler from "./ProjectHandler.vue";
import GoBack from "./GoBack.vue";
import TopSearch from "./TopSearch.vue";
import {
  PlusIcon,
  CogIcon,
  AdjustmentsIcon,
  BookOpenIcon,
  ChatAlt2Icon,
  ChartPieIcon,
  ChipIcon,
  CubeTransparentIcon,
  CodeIcon,
  CalendarIcon,
  ClipboardIcon,
  ArrowLeftIcon,
} from "@heroicons/vue/solid";
import Kanban from "../views/project/Kanban.vue";
import Task from "../views/project/Task.vue";
import Setting from "../views/project/Setting.vue";
export default {
  components: {
    GoBack,
    Kanban,
    Task,
    Setting,
    TopHeader,
    LeftBar,
    LeftList,
    ProjectHandler,
    TopSearch,
    CodeIcon,
    PlusIcon,
    ArrowLeftIcon,
    CogIcon,
    AdjustmentsIcon,
    BookOpenIcon,
    ChatAlt2Icon,
    ChartPieIcon,
    ChipIcon,
    CubeTransparentIcon,
    CalendarIcon,
    ClipboardIcon,
  },
  data() {
    return {
      mList: [
        {
          displayName: "看板",
          name: "kanban",
          icon: "AdjustmentsIcon",
          active: true,
        },
        {
          displayName: "工单",
          name: "task",
          icon: "ClipboardIcon",
          active: true,
        },
      ],
      view: "kanban",
    };
  },
  methods: {
    goView(v) {
      this.view = v.name;
    },
  },
};
</script>
<style>
.c {
  height: 100%;
  width: 100%;
}
.project {
  overflow-y: auto;
}
</style>
