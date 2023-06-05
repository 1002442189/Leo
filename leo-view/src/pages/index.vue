<template>
    <el-row class="f-content">
    <el-card class="box-card">
   <ul>
    <li v-for="i in count" :key="i" class="infinite-list-item">
      <div>{{i}}</div>
      <div>内容</div>
    </li>
   </ul>
     </el-card>
    </el-row>
</template>

<script setup>
import  {ref} from 'vue'
  const count=ref(40)
</script>
<style>
  .f-content{   
     width: 1024px; 
    background-color: #fff; 
  }
  .box-card{
    width: 100%;
  }
</style>