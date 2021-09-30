<template>
  <div class="content flex-grow h-full flex flex-col" style="width: 0">
    <div class="p-2 border-b border-gray-200 flex items-center text-gray-600">
      <ArrowLeftIcon class="h-5 mx-2" />
      <div class="text-xl">我的项目({{ mList.length || 0 }})</div>
      <TopSearch class="mx-2" />
      <PlusIcon class="h-5 mx-2 cursor-pointer" />
      <RefreshIcon class="h-5 mx-2 cursor-pointer" />
    </div>

    <div class="grid grid-cols-4 gap-1">
      <div v-for="i in mList" :key="i">
        <div
          class="border p-2 m-2 hover:shadow cursor-pointer rounded bg-gray-100"
          @click="goProject(i)"
        >
          <div class="flex items-center">
            <div class="text-xl flex-grow overflow-y-hidden break-normal flex">
              <p>#</p>
              {{ i.displayName.substr(0, 20) }}
            </div>
            <div class="text text-gray-400 flex-shrink pl-10">
              <DotsVerticalIcon class="w-3" />
            </div>
          </div>
          <div class="text-gray-600 text-sm mt-2 h-10">{{ i.description }}</div>
          <div class="text-gray-600 text-sm mt-2">
            <div class="py-1 flex pt-2">
              <div class="bg-gray-200 rounded-full px-2 mr-1 text-xs">讨论</div>
              <div class="bg-red-600 text-white rounded-full px-2 mr-1 text-xs">
                紧急
              </div>
              <div
                class="bg-green-600 text-white rounded-full px-2 mr-1 text-xs"
              >
                已处理
              </div>
              <div
                class="bg-yellow-600 text-white rounded-full px-2 mr-1 text-xs"
              >
                已处理
              </div>
            </div>
          </div>
          <div class="project-member flex text-sm my-2">
            <div class="flex-grow">成员(20)</div>
            <div>创始人</div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
import TopHeader from "./TopHeader.vue";
import LeftBar from "./LeftBar.vue";
import LeftList from "./ProjectList.vue";
import Kanban from "../views/project/Kanban.vue";
import Task from "../views/project/Task.vue";
import Setting from "../views/project/Setting.vue";
import TopSearch from "./TopSearch.vue";
import {
  PlusIcon,
  DotsVerticalIcon,
  RefreshIcon,
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
export default {
  components: {
    Kanban,
    DotsVerticalIcon,
    Task,
    Setting,
    TopHeader,
    LeftBar,
    LeftList,
    TopSearch,
    RefreshIcon,
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
  },
  data() {
    return {
      mList: [
        {
          displayName: "项目1项目1项目1项目1项目1项目1项目1项目1",
          name: "kanban",
          icon: "AdjustmentsIcon",
          description:
            "测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目",
          active: true,
          id: "111111",
        },
        {
          displayName: "项目1",
          name: "kanban",
          icon: "AdjustmentsIcon",
          description:
            "测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目",
          active: true,
          id: "111111",
        },
        {
          displayName: "项目1",
          name: "kanban",
          icon: "AdjustmentsIcon",
          description:
            "测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目",
          active: true,
          id: "111111",
        },
        {
          displayName: "项目1",
          name: "kanban",
          icon: "AdjustmentsIcon",
          description:
            "测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目",
          active: true,
          id: "111111",
        },
        {
          displayName: "项目1",
          name: "kanban",
          icon: "AdjustmentsIcon",
          description:
            "测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目",
          active: true,
          id: "111111",
        },
        {
          displayName: "项目1",
          name: "kanban",
          icon: "AdjustmentsIcon",
          description:
            "测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目",
          active: true,
          id: "111111",
        },
        {
          displayName: "项目1",
          name: "kanban",
          icon: "AdjustmentsIcon",
          description:
            "测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目",
          active: true,
          id: "111111",
        },
        {
          displayName: "项目1",
          name: "kanban",
          icon: "AdjustmentsIcon",
          description:
            "测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目",
          active: true,
          id: "111111",
        },
        {
          displayName: "项目1",
          name: "kanban",
          icon: "AdjustmentsIcon",
          description:
            "测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目",
          active: true,
          id: "111111",
        },
        {
          displayName: "项目1",
          name: "kanban",
          icon: "AdjustmentsIcon",
          description:
            "测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目",
          active: true,
          id: "111111",
        },
        {
          displayName: "项目1",
          name: "kanban",
          icon: "AdjustmentsIcon",
          description:
            "测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目",
          active: true,
          id: "111111",
        },
        {
          displayName: "项目1",
          name: "kanban",
          icon: "AdjustmentsIcon",
          description:
            "测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目",
          active: true,
          id: "111111",
        },
        {
          displayName: "项目1",
          name: "kanban",
          icon: "AdjustmentsIcon",
          description:
            "测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目",
          active: true,
          id: "111111",
        },
        {
          displayName: "项目1",
          name: "kanban",
          icon: "AdjustmentsIcon",
          description:
            "测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目",
          active: true,
          id: "111111",
        },
        {
          displayName: "项目1",
          name: "kanban",
          icon: "AdjustmentsIcon",
          description:
            "测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目测试的项目",
          active: true,
          id: "111111",
        },
        {
          displayName: "项目2",
          name: "task",
          icon: "ClipboardIcon",
          description: "测试的项目",
          active: true,
          id: "222222",
        },
      ],
      view: "kanban",
    };
  },
  methods: {
    goProject(v) {
      this.$router.push(`/project/${v.id}`);
    },
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
