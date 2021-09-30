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
      <div class="flex-grow text-sm pl-2 text-gray-600">新增泳道</div>
    </div>
    <div class="p-2 flex-grow swim-content">
      <div
        @click="addSwim"
        class="
          p-1
          my-1
          task
          h-20
          bg-white
          border border-dashed
          rounded
          border-gray-400
          text-center
          leading-10
          flex
          justify-center
        "
      >
        <PlusIcon class="w-10 text-gray-400" />
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

  data() {
    return {
      vlist: [],
    };
  },
  methods: {
    addSwim() {
      this.$emit("add");
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
