<template>
  <div class="flex flex-col">
    <!-- <div class="border-b border-gray-200">
      <div class="p-2">ADD</div>
    </div> -->
    <div class="flex p-2 h-full flex-grow" style="height: 0; overflow: auto">
      <Swim v-for="s in swim" :key="s" :data="s" />
      <AddSwim @add="add" />
    </div>
  </div>
</template>

<script>
import Swim from "./Swim.vue";
import AddSwim from "./AddSwim.vue";
export default {
  name: "Kanban",
  components: {
    Swim,
    AddSwim,
  },
  data() {
    return {
      swim: [
        {
          name: "需求",
          list: [
            {
              name: "账户密码登录 ",
              content:
                "使用账户密码登录 使用账户密码登录使用账户密码登录使用账户密码登录使用账户密码登录使用账户密码登录使用账户密码登录使用账户密码登录使用账户密码登录使用账户密码登录使用账户密码登录使用账户密码登录使用账户密码登录使用账户密码登录使用账户密码登录使用账户密码登录使用账户密码登录使用账户密码登录使用账户密码登录使用账户密码登录使用账户密码登录使用账户密码登录使用账户密码登录使用账户密码登录使用账户密码登录",
            },
            {
              name: "手机号登录",
            },
            {
              name: "邮箱登录",
            },
            {
              name: "找回密码",
            },
          ],
        },
        {
          name: "讨论",
          list: [
            {
              name: "修复首页登录",
            },
            {
              name: "修复退出问题",
            },
            {
              name: "修复退出问题",
            },
          ],
        },
        {
          name: "评审",
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
          name: "开发",
          list: [
            {
              name: "修复首页登录",
            },
          ],
        },
        {
          name: "测试",
          list: [
            {
              name: "修复首页登录",
            },
          ],
        },
        {
          name: "部署",
          list: [
            {
              name: "部署到docker",
            },
            {
              name: "直接部署",
            },
          ],
        },
      ],
    };
  },
  methods: {
    add() {
      this.swim.push({
        name: "泳道名称",
        list: [],
      });
    },
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
