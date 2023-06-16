<template >
    <el-row class="f-content">
    <el-card class="box-card">
   <ul>
    <li v-for="mes in count" :key="mes" class="infinite-list-item" >
      <div class="c-title">
        <div class="text-1xl font-semibold" style="maring-bottom:5px">{{mes.title}}</div>
        <div class="contens">
          <div class="text-sm" :class="boxShow?'text-sm-off':'text-sm-open'" v-html="mes.content"></div>
             <div class="isClick" @click="isClick" v-if="boxShow==true"><span>...</span>点击展开</div>
             <div class="isClick" @click="isClick" v-else><span>...</span>点击关闭</div>
        </div> 
        <div class="line"></div>
        </div> 
    </li>
   </ul>
     </el-card>
    </el-row>
</template>

<script setup>
import  {ref} from 'vue'
import {selectAll,likeSearch} from "~/api/manager" 
import emit from "~/eventBus/mitt.js";
const count=ref([]) 
let boxShow= ref(true);/*常量在语法糖中要通过ref定义*/
const form ={
  title: "",
  content: "",
}; 
 const isClick=()=>{  

  boxShow.value=!boxShow.value /*常量只能修改值*/
 }
 emit.on('search',function(e){ 
  alert(e)
  if(e!=null||e!=""){
    form.title=e;
    likeSearch(form).then(res=>{ 
    count.value=res.data
   });
  }
  else{
    selectAll().then(res=>{ 
    count.value=res.data
   });
  } 
 })
 selectAll().then(res=>{ 
    count.value=res.data
   });
  
</script>
<style>
  .f-content{
    position: absolute;
    top: 100px;
    left: 10%;
  }
  .box-card{ 
    width: 100%;
  }
  .c-title{
text-align: left;  
  padding-bottom:10px;
  word-wrap:break-word;/*超出显示范围自动换行*/
  padding-top: 10px;
 
  position:relative;
}
.contens{
  width: 100%; 
}
.text-sm{
  margin-top: 8px;
  margin-bottom: 10px; 
  width: 100%;
} 
.text-sm-off{
height: 40px;
overflow: hidden; 

}
.text-sm-open{  
  width: 100%;
}
.isClick{
  background-color: #dee2e6;
  position:absolute;/*绝对定位*/
  width: 100px;
  right: 0;
  bottom: 22px;;
  cursor: pointer;
}
.line{
  width: 100%;
  height: 2px;
  background-color: #dee2e6; 
  position: relative;
}
</style>