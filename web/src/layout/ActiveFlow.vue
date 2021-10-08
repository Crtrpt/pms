<template>
  <div>
    <div v-for="i in list" :key="i" class="flex border-b border-gray-200 py-4">
      <div>
        <a href="/" class="flex-grow flex-row flex py-1 items-center">
          <img
            class="h-8 px-2"
            src="https://tailwindui.com/img/logos/workflow-mark-indigo-600.svg"
            alt="Workflow"
          />
        </a>
      </div>
      <div>
        <div class="text-sm text-gray-600">{{ i.name }}</div>
        <div class="text-sm text-gray-700">{{ i.content }}</div>
        <div class="text-xs text-gray-500">{{ i.time }}</div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      list: [
        {
          name: "ks",
          avatar: "",
          content: "创建了项目",
          time: "12分钟前",
        },
        {
          name: "cloud",
          avatar: "",
          content: "创建了一个任务",
          time: "12分钟前",
        },
        {
          name: "mix",
          avatar: "",
          content: "关闭了一个任务",
          time: "12分钟前",
        },
        {
          name: "mix",
          avatar: "",
          content: "关闭了一个任务",
          time: "12分钟前",
        },
        {
          name: "mix",
          avatar: "",
          content: "关闭了一个任务",
          time: "12分钟前",
        },
        {
          name: "mix",
          avatar: "",
          content: "关闭了一个任务",
          time: "12分钟前",
        },
        {
          name: "mix",
          avatar: "",
          content: "关闭了一个任务",
          time: "12分钟前",
        },
      ],
    };
  },
};
</script>
