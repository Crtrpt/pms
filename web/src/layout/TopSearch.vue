<template>
  <div
    class="
      top-search
      border border-gray-200
      hover:border-gray-400 hover:shadow
      bg-white
      rounded-md
      p-1
      px-2
      flex
      items-center
    "
  >
    <input
      class="flex-grow outline-none"
      placeholder="Ctrl+R 搜索"
      v-model="v"
      @change="search"
    />
    <SearchIcon class="ml-2 h-4 text-gray-300" />
  </div>
</template>

<script>
import { LockClosedIcon, SearchIcon } from "@heroicons/vue/solid";
export default {
  name: "Search",
  components: { LockClosedIcon, SearchIcon },
  data() {
    return {
      v: "22",
    };
  },
  methods: {
    search() {
      this.$emit("input", this.v);
    },
  },
};
</script>
<style scoped></style>
