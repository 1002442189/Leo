<template>
    <div class="f-header">
        <div class="pl-50 ">头部</div>
         <el-button class="addButton" type="success" @click="addButton">新增</el-button>
    </div>
</template>

<script setup>
  import {useRouter} from 'vue-router'
const router=useRouter();
  const addButton=()=>{
    router.push("/add")
  }
</script>

<style>
  .f-header {
  @apply flex items-center bg-light-50   fixed top-0 left-0 right-0;
  height: 64px;
  z-index: 1000;
}
.pl-50{
  color: #056DE8;
  padding-right: 40px;
}
 
</style>