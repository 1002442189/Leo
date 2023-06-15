<template>
 
    <div class="f-header">
        <div class="f-title"> 
          <div class="f-shouye font-serif hover:font-sans"  id="shouye" @click="mains">首页</div> 
          <div class="f-add font-serif hover:font-sans"  id="xinzen" @click="addButton">新增</div> 
           <el-input  class="souSuo inputDeep  font-serif hover:font-sans" v-model="souSuo" placeholder="搜索" > <template #prefix>
            <el-icon class="el-icon-right"><Search /></el-icon>
          </template></el-input> 
          <div class="line"></div>
        </div>
       
    </div>
</template>

<script setup>
  import {useRouter} from 'vue-router'
  import {ref} from 'vue';
 
  const souSuo = ref('')
  const router=useRouter();
  const addButton=()=>{
    
    router.push("/add")
  }
  const yesButton=()=>{
    router.push("/yes")
  }
  const mains=()=>{
    router.push("/")
  }
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
.f-shouye{ 
  cursor: pointer; 
  display: inline-block; 
  margin:15px 10px 10px 0;  
  padding-bottom: 4px;
  border-bottom: red solid 3px;
  }
 
.f-add{
  cursor: pointer; 
  display: inline-block; 
  }
  
  .f-souSuo{
    margin-left: 20px;
    display: inline-block; 
  } 
  .f-title{
    background-color: aquamarine;
  }
  .souSuo{ 
    background-color: #F6F6F6; 
    height: 35px;
    width: 350px;    
    margin-left: 10px;
    border-radius:40px !important;
    font-size: 20px; 
  } 
  /* 去掉搜索的边框 */
  .el-input > .el-input__wrapper{
  background: none;
  box-shadow: none;
 }
 
</style>