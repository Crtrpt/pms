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
      <div class="flex-grow text-sm pl-2 text-gray-600"># {{ data.name }}</div>
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
          hover:bg-white
          border
          rounded
          hover:border-gray-400
          flex flex-col
        "
      >
        <div class="flex text-sm pl-1 py-2 mr-1">
          <div>#</div>
          <div class="flex-grow">{{ l.name }}</div>
          <div class="text-gray-500">
            <DotsHorizontalIcon class="w-3 cursor-pointer" />
          </div>
        </div>

        <div
          class="flex-grow text-xs pl-1 py-2 task-content flex text-gray-400"
        >
          {{ l.content }}
        </div>
        <div class="py-1 flex pt-2">
          <div class="bg-gray-200 rounded-full px-2 mx-1 text-xs">讨论</div>
          <div class="bg-red-600 text-white rounded-full px-2 mx-1 text-xs">
            紧急
          </div>
          <div class="bg-green-600 text-white rounded-full px-2 mx-1 text-xs">
            已处理
          </div>
          <div class="bg-yellow-600 text-white rounded-full px-2 mx-1 text-xs">
            已处理
          </div>
        </div>
        <div class="text-xs text-gray-600 flex flex-row pt-2">
          <div class="mr-5 ml-1 bg-gray-200 rounded-full px-1">20</div>
          <div class="flex-grow">管理员</div>
          <div>2021/9/29 11:49</div>
        </div>
      </div>
    </div>
    <div class="px-4 py-2 flex border-t border-gray-200 items-center">
      <div class="flex-grow text-gray-400 text-sm">描述信息</div>
      <div class="text-gray-400">
        <DotsHorizontalIcon class="w-3 cursor-pointer" />
      </div>
    </div>
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
.task-content {
  max-height: 400px;
  overflow-y: auto;
}
</style>
