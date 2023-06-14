 <template>
  <div class="f-content">
    <el-form :model="form">
      <el-form-item  >
        <el-input class="h-10" v-model="form.title" placeholder="请输入标题" />
      </el-form-item>
      <vue3-tinymce v-model="state.content" :setting="state.setting" />
      <el-form-item class="buttons">
        <el-button size="large" class="w-20" type="primary" @click="onSubmit" >提交</el-button>
        <el-button size="large" class="w-20" @click="returnMain">取消</el-button>
      </el-form-item>
    </el-form>
    
  </div> 
</template>
 
<script  setup lang="ts">
import { reactive,ref } from "vue";
import { useRouter } from "vue-router"; 
import add from "~/api/manager";
// 引入富文本组件
import Vue3Tinymce from '@jsdawn/vue3-tinymce';
import {ElNotification,ElMessageBox} from 'element-plus'
const state = reactive({
    content: '',
    // editor 配置项
    setting: {
    language: 'zh-Hans',//汉化富文本编辑器
    language_url: '/tinymce/langs/zh-Hans.js',
      height: 400, // editor 高度
      
    },
  });

const router = useRouter();
 
const form = reactive({
  title: "",
  content: "",
}); 
const onSubmit = () => {
  if(form.title==""){
    ElNotification({
        message:"标题不能为空",
        type:"error",
        duration:3000
       }); 
       return;
  }
  if(state.content==""){
    ElNotification({
        message:"内容不能为空",
        type:"error",
        duration:3000
       }); 
       return;
  }
  form.content=state.content;
add(form).then(res=>{
  ElNotification({
        message:"新增成功",
        type:"success",
        duration:3000
       });
      router.push("/");
   });

};
const returnMain = () => {
  router.push("/");
};
</script>

<style>
.f-content {
  width: 1200px;
  padding: 30px;
}
</style>