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
      <div class="b bg-gray-300 rounded-full w-6 text-center text-xs p-1">
        {{ vlist.length }}
      </div>
      <div class="flex-grow text-sm pl-2 text-gray-600">{{ data.name }}</div>
      <div class="flex text-gray-500">
        <PlusIcon class="w-3 mx-2 cursor-pointer" @click="addTask" />
        <DotsHorizontalIcon class="w-3 cursor-pointer" />
      </div>
    </div>
    <div class="p-2 flex-grow swim-content">
      <div
        v-for="l in vlist"
        :key="l"
        class="
          p-1
          my-1
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
import { PlusIcon, DotsHorizontalIcon } from "@heroicons/vue/solid";
export default {
  components: {
    PlusIcon,
    DotsHorizontalIcon,
  },
  props: {
    data: Object,
  },
  watch: {
    data: {
      deep: true,
      handler(n, o) {
        this.vlist = this.data.list;
      },
    },
  },
  created() {
    this.vlist = this.data.list;
  },
  data() {
    return {
      vlist: [],
    };
  },
  methods: {
    addTask() {
      this.vlist.push({
        name: "",
      });
    },
  },
};
</script>

<style scoped>
.swim {
  overflow-y: auto;
  height: 100%;
}
.swim-content {
  width: 300px;
  overflow-y: auto;
}
.task {
  width: 100%;
}
</style>
