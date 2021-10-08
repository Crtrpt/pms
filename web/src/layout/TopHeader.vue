<template>
  <div class="header border-b border-gray-200 flex flex-row hover:shadow px-2">
    <div class="flex-grow flex-row flex items-center">
      <img
        class="h-8 px-2"
        src="https://tailwindui.com/img/logos/workflow-mark-indigo-600.svg"
        alt="Workflow"
      />
      <p class="leading-10">PMS.com</p>
      <TopBar class="ml-10" />
    </div>

    <div class="flex flex-row pr-4 text-gray-400 items-center">
      <AddHandler />
      <NoticeHandler />
      <!-- <TopSearch class="m-2 px-1 hover:text-gray-600 cursor-pointer" /> -->
      <UserHandler />
      <QuestionMarkCircleIcon
        class="h-4 px-1 hover:text-gray-600 cursor-pointer"
      />
    </div>
  </div>
</template>

<script>
import TopSearch from "./TopSearch.vue";
import NoticeHandler from "./NoticeHandler.vue";
import AddHandler from "./AddHandler.vue";
import ProjectHandler from "./ProjectHandler.vue";
import TopBar from "./TopBar.vue";
import {
  LockClosedIcon,
  PlusIcon,
  QuestionMarkCircleIcon,
  BellIcon,
} from "@heroicons/vue/solid";

import UserHandler from "./UserHandler.vue";
export default {
  components: {
    TopBar,
    PlusIcon,
    QuestionMarkCircleIcon,
    BellIcon,
    TopSearch,
    UserHandler,
    AddHandler,
    NoticeHandler,
    ProjectHandler,
  },
  name: "Header",
};
</script>
