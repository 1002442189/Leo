<template>
    <div>
     <el-result 
     icon="warning"
     title="404提示"
     sub-title="你的页面丢失了"        
     >
    <template #extra>
        <el-button type="primary" @click="$router.push('/')">回到首页</el-button>
    </template>
     </el-result>
    </div>
</template>