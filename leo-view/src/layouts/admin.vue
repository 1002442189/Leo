<template >
  
  <div class="common-layout">
    <el-container>
    <el-header>  <f-header/> </el-header> 
    <router-view/> 
  </el-container>
  </div>
</template>
<script setup>
import FHeader from "./components/FHeader.vue";
</script>
<style>
    common-layout{
      position: absolute;
      top: 0px;
      bottom: 100px;
    }
</style>