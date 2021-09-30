var route = [
  {
    path: "/",
    component: () => import("../layout/Workspace.vue"),
    children: [
      {
        name: "home",
        path: "/home",
        component: () => import("../layout/Home.vue"),
      },
      {
        name: "project",
        path: "/project",
        component: () => import("../layout/Project.vue"),
      },
      {
        name: "projectDetail",
        path: "/project/:id",
        component: () => import("../layout/ProjectDetail.vue"),
      },
      {
        name: "task",
        path: "/task",
        component: () => import("../layout/task.vue"),
      },
      {
        name: "organization",
        path: "/organization",
        component: () => import("../layout/Organization.vue"),
      },
      {
        name: "calendar",
        path: "/calendar",
        component: () => import("../layout/Calendar.vue"),
      }
    ],
  },
  {
    path: "/auth",
    component: () => import("../layout/PageLayout.vue"),
    children: [
      {
        name: "login",
        path: "login",
        component: () => import("../pages/auth/Auth.vue"),
      },
      {
        name: "signup",
        path: "signup",
        component: () => import("../pages/auth/Signup.vue"),
      },
      {
        name: "found",
        path: "found",
        component: () => import("../pages/auth/Found.vue"),
      },
    ]
  },
  
];
export default route;
