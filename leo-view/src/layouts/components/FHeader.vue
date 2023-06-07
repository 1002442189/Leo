<template>
    <div class="f-header">
         <el-button class="addButton" style="margin-left:80px" type="success" @click="mains">主页</el-button>
   
         <el-button class="addButton" type="success" @click="addButton">新增</el-button>
    </div>
</template>

<script setup>
  import {useRouter} from 'vue-router'
const router=useRouter();
  const addButton=()=>{
    router.push("/add")
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
}
 
 
</style>