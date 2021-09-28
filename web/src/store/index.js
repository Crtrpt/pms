import { createStore } from "vuex";
import App from "./modules/app";



const store = createStore({
  modules: {
    app: App,
  },
});
export default store;
