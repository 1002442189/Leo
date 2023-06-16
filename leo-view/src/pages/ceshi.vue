<template>
  <div>
    <ul>
      <li v-for="mes in 10" :key="mes" >
        <button @click="isShow">点击展开/关闭</button>
        <div class="box" :class="boxshow?'box-active':'box-no'">
          啊啊
          啊
          啊
          啊
          啊
          啊
          啊啊啊
          啊啊
          啊啊啊啊
          啊啊啊
          啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊
          啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊
        </div> 
      </li>
     </ul>
    </div>
  
</template>

<script  setup> 
import  {ref} from 'vue'
import {selectAll,likeSearch} from "~/api/manager" 
const boxShow= ref(true);/*常量在语法糖中要通过ref定义*/
 
 const isShow=(mes)=>{
  
  console.log(mes.key) ;
 }
 
</script>
<style>
  .box {
  width: 200px;
  background-color: black;
  transition: height 0.3s ease;
}

.box-active { 
  background-color: green;
}

.box-no {
  height: 50px;
  overflow: hidden;
  background-color: red;
} 
</style>