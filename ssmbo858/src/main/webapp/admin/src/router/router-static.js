import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import forum from '@/views/modules/forum/list'
    import news from '@/views/modules/news/list'
    import discussbaokanxinxi from '@/views/modules/discussbaokanxinxi/list'
    import dingyuefasong from '@/views/modules/dingyuefasong/list'
    import yonghu from '@/views/modules/yonghu/list'
    import storeup from '@/views/modules/storeup/list'
    import baokandingyue from '@/views/modules/baokandingyue/list'
    import config from '@/views/modules/config/list'
    import baokanxinxi from '@/views/modules/baokanxinxi/list'
    import baokanleixing from '@/views/modules/baokanleixing/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/forum',
        name: '报刊论坛',
        component: forum
      }
      ,{
	path: '/news',
        name: '订阅公告',
        component: news
      }
      ,{
	path: '/discussbaokanxinxi',
        name: '报刊信息评论',
        component: discussbaokanxinxi
      }
      ,{
	path: '/dingyuefasong',
        name: '订阅发送',
        component: dingyuefasong
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/baokandingyue',
        name: '报刊订阅',
        component: baokandingyue
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/baokanxinxi',
        name: '报刊信息',
        component: baokanxinxi
      }
      ,{
	path: '/baokanleixing',
        name: '报刊类型',
        component: baokanleixing
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
