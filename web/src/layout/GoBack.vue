<template>
  <ArrowLeftIcon
    class="h-5 mx-2 hover:border-gray-700 cursor-pointer"
    @click="goback"
  />
  <RefreshIcon
    class="h-5 mx-2 hover:border-gray-700 cursor-pointer"
    @click="refresh"
  />
  <TopSearch class="mx-2" @input="search" />
</template>

<script>
import { ArrowLeftIcon, RefreshIcon } from "@heroicons/vue/solid";
import TopSearch from "./TopSearch.vue";

export default {
  components: { ArrowLeftIcon, RefreshIcon, TopSearch },
  methods: {
    goback() {
      console.log("goback");
      this.$router.back();
    },
    refresh() {
      console.log("refresh");
      this.$emit("refresh");
    },
    search(v) {
      this.$emit("search", v);
    },
  },
};
</script>
