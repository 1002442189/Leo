import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'
import WindiCSS from 'vite-plugin-windicss'
import path from 'path'

 
export default defineConfig({
  resolve:{
 alias:{
  "~":path.resolve(__dirname,"src")
 }
  },
  //  开启跨域代理
  server:{
    proxy:{
     '/api':{
      target:'http://localhost:9999',
      changeOrigin:true,
      rewrite:(path)=>path.replace( /^\/api/,'')
     },
    } 
  }
    ,
 
  plugins: [vue(),WindiCSS()],
})
