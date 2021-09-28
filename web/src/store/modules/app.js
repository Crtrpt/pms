var App = {
  namespaced: true,
  state() {
    return {
      version: "v0.0.1",
      menuDisplay: {
        display: false,
        left: "200px",
        top:"200px",
      },
      collectMenu: [],
      contextMenu: [],
      //弹框
      dialog: {
        component:"about",
        display:false,
        title:""
      },
    };
  },
  getters: {
    version(state) {
      return state.version;
    },
    displayContextMenu(state) {
      return state.menuDisplay;
    },
    getMenuList(state) {
      return state.contextMenu;
    },
    dialog(state) {
      return state.dialog
    },
    dialogDisplay(state) {
      return state.dialog.display;
    }
  },
  mutations: {
    displayContextMenu(state, ctx) {
      state.menuReCollect = true;
      state.contextMenu = state.collectMenu;
      state.collectMenu = [];
      state.menuDisplay.display = true;
      state.menuDisplay.left = ctx.pageX + "px";
      state.menuDisplay.top = ctx.pageY +"px";
      console.log("显示右键菜单");
      console.log(ctx);
      console.log(state.contextMenu);
    },
    collectMenu(state, ctx) {
      console.log("收集菜单");
      console.log(ctx);
      state.collectMenu = [
        ...state.collectMenu,
        ...ctx
      ]
    },

    closeMenu(state) {
      state.menuDisplay.display = false;
    },
    closeDialog(state) {
      state.dialog.display = false;
    },
    displayDialog(state, payload) {
      state.dialog = {
        ...state.dialog,
        ...payload,
        display:true
      }
    }
  },
  actions: {
    displayContextMenu(context, ctx) {
      context.commit("displayContextMenu", ctx);
    },
    collectMenu(context, ctx) {
      context.commit("collectMenu", ctx);
    },
    closeMenu(context) {
      context.commit("closeMenu");
    },
    closeDialog(context) {
      context.commit("closeDialog");
    },
    displayDialog(context,payload) {
      context.commit("displayDialog",payload);
    }
  },
};

export default App;
