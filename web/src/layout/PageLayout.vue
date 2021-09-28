<template>
  <Header />
  <router-view class="page-content"></router-view>
  <Footer />
</template>
<script lang="ts">
import Header from "./page/Header.vue";
import Footer from "./page/Footer.vue";
export default {
  name: "Master",
  components: {
    Header,
    Footer,
  },
  setup() {
    console.log("App 初始化");
  },
  render() {
    return " <router-view></router-view>";
  },
};
</script>
<style>
.page-content {
  min-height: 90vh;
}
</style>
