<script setup></script>

<template>
  <div class="flex flex-col c">
    <TopHeader />
    <div class="flex-grow flex-shrink flex flex-row project">
      <LeftBar />

      <router-view />
    </div>
  </div>
</template>
<script>
import TopHeader from "./TopHeader.vue";
import LeftBar from "./LeftBar.vue";
import LeftList from "./ProjectList.vue";
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
} from "@heroicons/vue/solid";
import Kanban from "../views/project/Kanban.vue";
import Task from "../views/project/Task.vue";
import Setting from "../views/project/Setting.vue";
export default {
  components: {
    Kanban,
    Task,
    Setting,
    TopHeader,
    LeftBar,
    LeftList,
    CodeIcon,
    PlusIcon,
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
      view: "kanban",
    };
  },
  methods: {
    goView(v) {
      this.view = v;
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
