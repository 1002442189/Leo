 <template>
  <div class="f-content">
    <el-form :model="form" label-width="120px">
      <el-form-item label="标题">
        <el-input class="h-10" v-model="form.title" placeholder="请输入标题" />
      </el-form-item>
      <el-form-item label="内容">
        <el-input
          placeholder="请输入内容"
          rows="10"
          v-model="form.content"
          type="textarea"
        />
      </el-form-item>

      <el-form-item class="buttons">
        <el-button size="large" class="w-20" type="primary" @click="onSubmit"
          >提交</el-button
        >
        <el-button size="large" class="w-20" @click="returnMain"
          >取消</el-button
        >
      </el-form-item>
    </el-form>
  </div>
</template>

<script  setup>
import { reactive } from "vue";
import { useRouter } from "vue-router"; 
import add from "~/api/manager";
const router = useRouter();
// do not use same name with ref
const form = reactive({
  title: "",
  content: "",
});
 
const onSubmit = () => {
  debugger 
add(form).then(res=>{
    console.log(res)
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