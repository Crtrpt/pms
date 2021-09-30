<template>
  <div class="bg-blue-500 text-white hover:shadow flex-shrink">
    <div
      @click="goView(i)"
      v-for="i in mList"
      :key="i"
      class="
        p-4
        flex flex-col
        justify-center
        items-center
        cursor-pointer
        hover:bg-gray-100 hover:text-blue-500
      "
      style="word-break: keep-all"
      :class="[
        this.$route.name == i.name ? 'shadow bg-white text-blue-500' : '',
      ]"
    >
      <component :is="i.icon" class="w-5 h-5" />
      <div class="text-sm" style="">{{ i.displayName }}</div>
    </div>
  </div>
</template>

<script>
import {
  LockClosedIcon,
  CalendarIcon,
  ClipboardIcon,
  HomeIcon,
  OfficeBuildingIcon,
} from "@heroicons/vue/solid";
export default {
  name: "LeftBar",
  components: {
    LockClosedIcon,
    CalendarIcon,
    ClipboardIcon,
    HomeIcon,
    OfficeBuildingIcon,
  },
  created() {
    console.log(this.$route.name);
  },
  methods: {
    goView(v) {
      this.$router.push({ name: v.name });
    },
  },
  data() {
    return {
      mList: [
        {
          displayName: "首页",
          name: "home",
          icon: "HomeIcon",
          active: true,
        },
        {
          displayName: "项目",
          name: "project",
          icon: "LockClosedIcon",
          active: true,
        },
        {
          displayName: "组织",
          name: "organization",
          icon: "OfficeBuildingIcon",
          active: true,
        },
        {
          displayName: "任务",
          name: "task",
          icon: "ClipboardIcon",
          active: false,
        },
        {
          displayName: "日历",
          name: "calendar",
          icon: "CalendarIcon",
          active: false,
        },
      ],
    };
  },
};
</script>
