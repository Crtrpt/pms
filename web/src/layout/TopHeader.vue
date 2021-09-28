<template>
  <div class="header border-b border-gray-300 shadow flex flex-row">
    <div class="flex-grow flex-row flex p-2">
      <img
        class="h-8 px-2"
        src="https://tailwindui.com/img/logos/workflow-mark-indigo-600.svg"
        alt="Workflow"
      />
    </div>
    <div class="flex flex-row pr-4">
      <TopSearch class="m-2" />
      <UserHandler />
    </div>
  </div>
</template>

<script>
import TopSearch from "./TopSearch.vue";
import UserHandler from "./UserHandler.vue";
export default {
  components: {
    TopSearch,
    UserHandler,
  },
  name: "Header",
};
</script>
