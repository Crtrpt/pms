<script setup></script>

<template>
  <div class="flex flex-col c">
    <TopHeader />
    <div class="flex-grow flex-shrink flex flex-row project">
      <LeftBar />

      <div class="content flex-grow h-full flex flex-col" style="width: 0">
        <div class="project-nav flex border-b border-gray-200">
          <div
            class="
              p-2
              px-4
              cursor-pointer
              hover:bg-gray-300
              border-r border-gray-200
              bg-blue-400
              text-white
            "
          >
            看板
          </div>
          <div
            class="
              p-2
              px-4
              cursor-pointer
              hover:bg-gray-300
              border-r border-gray-200
            "
          >
            配置
          </div>
        </div>
        <router-view class="flex-grow" />
      </div>
    </div>
  </div>
</template>
<script>
import TopHeader from "./TopHeader.vue";
import LeftBar from "./LeftBar.vue";
import LeftList from "./ProjectList.vue";
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
  overflow-y: auto;
}
</style>
