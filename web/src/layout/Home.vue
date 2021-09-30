<template>
  <div class="w-full">
    <div class="flex flex-col">
      <div class="text-xl text-gray-600 p-2 border-b border-gray-200">
        活动图
      </div>
      <ActiveChart class="p-2 justify-center items-end" />
    </div>
  </div>
</template>

<script>
import ActiveChart from "./ActiveChart.vue";
export default {
  components: { ActiveChart },
};
</script>
