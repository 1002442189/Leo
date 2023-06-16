<template>
 
    <div class="f-header"> 
    <el-menu
      :default-active="activeIndex"
      class="el-menu-demo"
      mode="horizontal"
      background-color="#545c64"
      text-color="#fff"
      active-text-color="#ffd04b"
      @select="handleSelect">
      <el-menu-item index="1" @click="mains">首页</el-menu-item>
      <el-menu-item index="2" @click="addButton">新增</el-menu-item>
      <el-input  class="souSuo inputDeep  font-serif hover:font-sans" v-model="souSuo" placeholder="搜索" > <template #prefix>
        <el-icon class="el-icon-right"><Search /></el-icon>
      </template></el-input> 
      <el-button type="primary" round @click="Searchs">搜索</el-button>
      <el-avatar class="touxiang" shape="square" :size="40" :src="squareUrl" /> 
    </el-menu> 
   
    </div>
</template>

<script setup>
  import {useRouter} from 'vue-router'
  import {ref,toRefs,reactive } from 'vue';
 
  const activeIndex = ref('1')  
  const state = reactive({ 
  squareUrl:
    'public/images/bgimg1.jpg',
})

const { circleUrl, squareUrl, sizeList } = toRefs(state)

const handleSelect = (key, keyPath) => {  
  if(key=='1'){
    mains()
  }else{
    addButton()
  }
}

  const souSuo = ref('')
  const router=useRouter();
  const addButton=()=>{ 
    router.push("/add")
  } 
  const Searchs=()=>{
    
    router.push("/")
  }
  const mains=()=>{
    router.push("/")
  }
  router.push("/") //刷新时回到首页
</script>

<style>
.f-header {
  @apply flex items-center bg-light-50   fixed top-0 left-0 right-0;
  height: 64px;
  z-index: 1000;  
  color: black;
  display: inline-block;
  font-size: 20px;
  background-color: #FFFFFF;
  
} 
.el-menu-demo{
  display: inline-block;
  width: 100%;
}
  .souSuo{ 
    background-color: #F6F6F6; 
    height: 30px;
    width: 300px;    
    margin: 10px 10px 10px 0;
    border-radius:40px !important;
    font-size: 15px; 

  } 
  /* 去掉搜索的边框 */
  .el-input > .el-input__wrapper{
  background: none;
  box-shadow: none;
 }
 .touxiang{
  display:inline-block;
    position: relative;
    top: 15px;
    left:20px;
 }
</style>