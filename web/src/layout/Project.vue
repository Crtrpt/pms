<script setup></script>

<template>
  <div class="flex flex-col h-full">
    <TopHeader />
    <div class="flex-grow flex flex-row">
      <div class="bz bg-blue-500 px-2 w-20 text-white shadow">bar</div>
      <div class="left h-full px-2 w-1/4 border-r border-gray-100">left</div>
      <div class="conten h-full">
        <router-view> </router-view>
      </div>
    </div>
  </div>
</template>
<script>
import TopHeader from "./TopHeader.vue";
export default {
  components: {
    TopHeader,
  },
};
</script>
<style>
#app {
  width: 100vw;
  height: 100vh;
}
</style>
