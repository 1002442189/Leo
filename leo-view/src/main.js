import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import router from './router'
import EventBus  from 'vue3-eventbus'
import * as ElementPlusIconsVue from '@element-plus/icons-vue'
const app=createApp(App)
app.use(ElementPlus)
app.use(router)
app.use(EventBus)
import 'virtual:windi.css'
for (const [key, component] of Object.entries(ElementPlusIconsVue)) {
    app.component(key, component)
  }
app.mount('#app')



