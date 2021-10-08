<template>
  <div style="height: 100%" class="flex">
    <div
      class="
        flex-grow
        item
        border
        rounded
        hover:shadow
        p-2
        m-2
        bg-gray-100
        flex flex-col flex-shrink-0
        item-content
      "
    >
      <div
        @click="add"
        class="
          p-1
          my-1
          w-full
          h-full
          bg-white
          border border-dashed
          rounded
          border-gray-400
          text-center
          leading-10
          flex flex-col
          justify-center
          items-center
        "
      >
        <PlusIcon class="w-10 text-gray-400" />
        <div class="px-4 py-2 flex items-center">
          <div class="flex-grow text-sm pl-2 text-gray-600">新增项目</div>
        </div>
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

  data() {
    return {
      vlist: [],
    };
  },
  methods: {
    add() {
      this.$emit("add");
    },
  },
};
</script>

<style scoped>
.item {
  overflow-y: auto;
}
.item-content {
  overflow-y: auto;
}
</style>
