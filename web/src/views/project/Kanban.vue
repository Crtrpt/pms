<template>
  <div class="flex flex-col">
    <div class="border-b border-gray-200">
      <div class="p-2">ADD</div>
    </div>
    <div class="flex p-2 h-full flex-grow" style="height: 0; overflow: auto">
      <Swim v-for="s in swim" :key="s" :data="s" />
    </div>
  </div>
</template>

<script>
import Swim from "./Swim.vue";
export default {
  name: "Kanban",
  components: {
    Swim,
  },
  data() {
    return {
      swim: [
        {
          name: "泳道1",
          list: [
            {
              name: "修复首页登录",
            },
            {
              name: "修复退出问题",
            },
            {
              name: "修复首页登录",
            },
            {
              name: "修复首页登录",
            },
            {
              name: "修复首页登录",
            },
            {
              name: "修复首页登录",
            },
            {
              name: "修复首页登录",
            },
            {
              name: "修复首页登录",
            },
            {
              name: "修复首页登录",
            },
            {
              name: "修复首页登录",
            },
          ],
        },
        {
          name: "泳道2",
          list: [
            {
              name: "修复首页登录",
            },
            {
              name: "修复退出问题",
            },
          ],
        },
        {
          name: "泳道2",
          list: [
            {
              name: "修复首页登录",
            },
            {
              name: "修复退出问题",
            },
          ],
        },
        {
          name: "泳道2",
          list: [
            {
              name: "修复首页登录",
            },
            {
              name: "修复退出问题",
            },
          ],
        },
        {
          name: "泳道2",
          list: [
            {
              name: "修复首页登录",
            },
            {
              name: "修复退出问题",
            },
          ],
        },
        {
          name: "泳道2",
          list: [
            {
              name: "修复首页登录",
            },
            {
              name: "修复退出问题",
            },
          ],
        },
        {
          name: "泳道2",
          list: [
            {
              name: "修复首页登录",
            },
            {
              name: "修复退出问题",
            },
          ],
        },
        {
          name: "泳道2",
          list: [
            {
              name: "修复首页登录",
            },
            {
              name: "修复退出问题",
            },
          ],
        },
      ],
    };
  },
};
</script>

<style scoped>
.way {
  width: 200px;
  border: 1px solid gray;
  padding: 10px;
  margin: 10px;
}
</style>
