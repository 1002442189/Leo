<template>
    <el-row class="f-content">
    <el-card class="box-card">
   <ul>
    <li v-for="mes in count" :key="mes" class="infinite-list-item">
      <div class="c-title">
        <div style="maring-bottom:5px">{{mes.title}}</div>
        <div>{{mes.content}}</div>
        </div>
    
    </li>
   </ul>
     </el-card>
    </el-row>
</template>

<script setup>
import  {ref} from 'vue'
import {selectAll} from "~/api/manager" 
 debugger;
const count=ref([]) 

selectAll().then(res=>{
    count.value=res.data
   });
 
 
</script>
<style>
 
  .box-card{
    width: 100%;
  }
  .c-title{
text-align: left;
  background-color: #F6F6F6;
  padding-bottom: 10px;
  padding-bottom:10px;
  border-bottom:solid 1px #dee2e6 ;
  padding-top: 10px;
}

</style>