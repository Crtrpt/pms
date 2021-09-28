var route = [
  {
    path: "/",
    component: () => import("../layout/Master.vue"),
    children: [
      {
        name: "home",
        path: "/home",
        component: () => import("../pages/Home.vue"),
      },
      {
        name: "project",
        path: "/project/:id",
        component: () => import("../layout/Project.vue"),
      }
    ],
  },
  {
    name: "login",
    path: "/login",
    component: () => import("../pages/auth/Auth.vue"),
  },
  {
    name: "sign",
    path: "/sign",
    component: () => import("../pages/auth/Sign.vue"),
  },
];
export default route;
