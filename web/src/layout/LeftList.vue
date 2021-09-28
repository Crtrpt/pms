<template>
  <div class="bz bg-gray-50 flex flex-col">
    <div class="border-b border-gray-200 flex-shrink p-2">Top</div>
    <div class="list flex-grow">
      <div
        v-for="i in mList"
        :key="i"
        class="
          p-4
          flex flex-col
          justify-start
          cursor-pointer
          hover:bg-gray-200
          border-b border-gray-200
        "
      >
        <div class="text-sm">{{ i.name }}</div>
      </div>
    </div>
    <div class="border-t border-gray-200 flex-shrink-0 p-2">Bottom</div>
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
    var d = [];
    [...Array(50).keys()].forEach((s) => {
      d.push({
        name: "222",
      });
    });

    return {
      mList: d,
    };
  },
};
</script>

<style scoped>
.bz {
  height: 100%;
}
.list {
  overflow-y: scroll;
}
</style>
