import {
    createRouter,
    createWebHashHistory

} from 'vue-router'
import Index from '~/pages/index.vue'
import Admin  from "~/layouts/admin.vue"
import About from '~/pages/about.vue'
import Add from "~/pages/add.vue"
import NotFound from '~/pages/404.vue'
import Login from '~/pages/login.vue'

const routes=[
    {
        path:'/',
        component:Admin,
        children:[{
            path:"/",
            component:Index,
            meta:{
                title:"后台首页"
            }
        } 
        ,{
            path:'/add',
            component:Add
        } 
    
    ]
    },
    {
        path:'/about',
        component:About
    }
    ,
     {
        path:'/login',
        name:Login,
        component:Login
    } ,
    {
        path:'/:pathMatch(.*)*',
        name:'NotFound',
        component:NotFound}
        
]

const router =createRouter({
    history:createWebHashHistory(),
    routes,
})

export default router