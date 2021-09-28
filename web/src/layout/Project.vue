<script setup></script>

<template>
  <div class="flex flex-col c">
    <TopHeader />
    <div class="flex-grow flex-shrink flex flex-row project">
      <LeftBar />
      <LeftList class="left h-full w-1/4 border-r border-gray-200"></LeftList>
      <div class="content flex-grow h-full">
        <router-view />
      </div>
    </div>
  </div>
</template>
<script>
import TopHeader from "./TopHeader.vue";
import LeftBar from "./LeftBar.vue";
import LeftList from "./LeftList.vue";
export default {
  components: {
    TopHeader,
    LeftBar,
    LeftList,
  },
};
</script>
<style>
.c {
  height: 100%;
  width: 100%;
}
.project {
  overflow-y: scroll;
}
</style>
