<template>
  <div
    class="
      swim
      border
      rounded
      hover:shadow
      mx-1
      bg-gray-100
      flex flex-col flex-shrink-0
    "
  >
    <div class="px-4 py-2 flex border-b border-gray-200 items-center">
      <div class="b bg-gray-300 rounded-full">(20)</div>
      <div class="flex-grow text-sm">name</div>
      <div class="flex"><PlusIcon class="w-5" /> <PlusIcon class="w-5" /></div>
    </div>
    <div class="p-2 flex-grow swim-content">
      <div
        v-for="l in data.list"
        :key="l"
        class="
          p-1
          task
          h-20
          hover:bg-white
          border
          rounded
          hover:border-gray-400
        "
      >
        {{ l.name }}
      </div>
    </div>
    <div class="px-4 py-2 flex border-t border-gray-200 items-center"></div>
  </div>
</template>

<script>
import { PlusIcon } from "@heroicons/vue/solid";
export default {
  components: {
    PlusIcon,
  },
  props: {
    data: Object,
  },
};
</script>

<style scoped>
.swim {
  overflow-y: auto;
  height: 100%;
}
.swim-content {
  overflow-y: auto;
}
.task {
  width: 300px;
}
</style>
