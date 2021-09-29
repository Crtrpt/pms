<template>
  <div class="bg-blue-500 text-white hover:shadow flex-shrink">
    <div
      v-for="i in mList"
      :key="i"
      class="
        p-4
        flex flex-col
        justify-center
        items-center
        hover:bg-blue-600
        cursor-pointer
      "
    >
      <LockClosedIcon class="w-5 h-5" />
      <div class="text-sm">{{ i.name }}</div>
    </div>
  </div>
</template>

<script>
import {
  LockClosedIcon,
  PlusIcon,
  QuestionMarkCircleIcon,
  BellIcon,
} from "@heroicons/vue/solid";
export default {
  name: "LeftBar",
  components: { LockClosedIcon },
  data() {
    return {
      mList: [
        {
          name: "项目",
        },
        {
          name: "任务",
        },
      ],
    };
  },
};
</script>
