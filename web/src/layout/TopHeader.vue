<template>
  <div class="header border-b border-gray-300 shadow flex flex-row">
    <div class="flex-grow flex-row flex p-2">
      <img
        class="h-8 px-2"
        src="https://tailwindui.com/img/logos/workflow-mark-indigo-600.svg"
        alt="Workflow"
      />
    </div>
    <div class="flex flex-row pr-4 text-gray-400 items-center">
      <PlusIcon class="h-4 px-1 hover:text-gray-600 cursor-pointer" />
      <BellIcon class="h-4 px-1 hover:text-gray-600 cursor-pointer" />
      <TopSearch class="m-2 px-1 hover:text-gray-600 cursor-pointer" />
      <UserHandler />
      <QuestionMarkCircleIcon
        class="h-4 px-1 hover:text-gray-600 cursor-pointer"
      />
    </div>
  </div>
</template>

<script>
import TopSearch from "./TopSearch.vue";
import {
  LockClosedIcon,
  PlusIcon,
  QuestionMarkCircleIcon,
  BellIcon,
} from "@heroicons/vue/solid";

import UserHandler from "./UserHandler.vue";
export default {
  components: {
    PlusIcon,
    QuestionMarkCircleIcon,
    BellIcon,
    TopSearch,
    UserHandler,
  },
  name: "Header",
};
</script>
