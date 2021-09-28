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
    <input class="outline-none" placeholder="请输入想要搜索的内容" />
    <SearchIcon class="h-4 text-gray-300" />
  </div>
</template>

<script>
import { LockClosedIcon, SearchIcon } from "@heroicons/vue/solid";
export default {
  name: "Header",
  components: { LockClosedIcon, SearchIcon },
};
</script>
<style scoped>
.top-search {
  width: 300px;
}
</style>
