<template>
  <div class="w-full" style="overflow: auto">
    <div class="flex flex-row p-2 container mx-auto">
      <div class="flex-grow">
        <ActiveChart class="p-2 container mx-auto" />

        <ActiveFlow class="p-2 container mx-auto" />
      </div>
    </div>
  </div>
</template>

<script>
import ActiveChart from "./ActiveChart.vue";
import ActiveFlow from "./ActiveFlow.vue";
import Today from "./Today.vue";
export default {
  components: { ActiveChart, ActiveFlow, Today },
};
</script>
