import Vue from 'vue'
import VueRouter from 'vue-router'
Vue.use(VueRouter)

const routes = [
	{
		path: '/',
		component: manage => import('../views/login.vue'),
	},
	{
		path: '/index',
		component: manage => import('../layout/manage.vue'),
		children: [{
				path: "/checkingIn",
				name: "考勤签到",
				component: checkingIn => import('../views/Student/checkingIn.vue') 
			},
			{
				path: "/checkingManager",
				name: "我的报名",
				component: checkingManager => import('../views/Teacher/checkingManage.vue')
			},
			{
				path: "/courseAdd",
				mame: "添加课程",
				component: courseAdd => import('../views/Teacher/courseAdd.vue')
			},
			{
				path: "/detail",
				name: "细节",
				component: checkingIn => import('../views/Student/detail.vue') 
			},
			{
				path: "/index",
				name: "首页",
				component: index => import('../views/index.vue') 
			},
			{
				path: "/gameManage",
				name: "报名审核",
				component: gameManage => import('../views/Teacher/gameManage.vue')
			}
		]
	}
];

const router = new VueRouter({
	mode: "history",
	base: process.env.BASE_URL,
	routes
});

export default router;