 <template>
 <div class="f-content">
     <el-form :model="form" label-width="120px">
    <el-form-item label="标题">
      <el-input class="h-10" v-model="form.title"  placeholder="请输入标题"/>
    </el-form-item> 
    <el-form-item label="内容">
      <el-input placeholder="请输入内容" rows="10" v-model="form.content" type="textarea" />
    </el-form-item>
 
    <el-form-item class=" buttons">
      <el-button   size="large" class="w-20" type="primary" @click="onSubmit">提交</el-button>
      <el-button  size="large" class="w-20">取消</el-button>
    </el-form-item>
  </el-form>
 </div>
</template>

<script lang="ts" setup>
import { reactive } from 'vue'

// do not use same name with ref
const form = reactive({
  title:"",
  content:""
})

const onSubmit = () => {
  console.log('submit!')
}
</script>

<style>
    .f-content{ 
    height: 400px;
    width: 1200px;
    padding: 30px;
    }
    .buttons{
      
    }
</style>