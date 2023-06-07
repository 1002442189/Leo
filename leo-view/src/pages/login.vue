<template>
  <el-row style="min-height: 100vh" class="login-container">
    <el-col :lg="16" :md="12" class="left">
     
    </el-col>
    <el-col :lg="8" :md="12" class="right">
      
      <div>
        <span class="line"></span>
        <span>账号密码登录</span>
        <span class="line"></span>
      </div>

      <el-form ref="formRef"  :model="form">
        <el-form-item prop="username">
          <el-input v-model="form.name" placeholder="请输入用户名">
            <template #prefix>
              <el-icon><User /></el-icon>
            </template>
          </el-input>
        </el-form-item>
        <el-form-item prop="password">
          <el-input
             
            show-password
            v-model="form.age"
            placeholder="请输入年龄"
          >
            <template #prefix>
              <el-icon><Lock /></el-icon>
            </template>
          </el-input>
        </el-form-item>
        <el-form-item>
          <el-button
            round
            color="#626aef"
            class="w-[250px]"
            type="primary"
            @click="onSubmit" 
            >登录</el-button
          >
        </el-form-item>
      </el-form>
    </el-col>
  </el-row>
</template>
<script   setup>
import { ref, reactive, onMounted, onBeforeUnmount } from "vue"; 
import { useRouter } from "vue-router";
import login from "~/api/manager";
 
const router = useRouter(); 
const form = reactive({
  name: "",
  age: "",
});
 

const formRef = ref(null); 
const onSubmit = () => {
  debugger;
  formRef.value.validate((valid) => {
    if (!valid) {
      return false;
    } 
   login(form).then(res=>{
    console.log(res)
   })
  });
};
// 监听回车事件
function OnKeyUp(e) {
  if (e.key == "Enter") { 
    onSubmit();
  }
}

// 添加键盘监听事件
document.addEventListener("keyup", OnKeyUp);
// 移除键盘监听
onBeforeUnmount(() => {
  document.removeEventListener("keyup", OnKeyUp);
});
</script>
 