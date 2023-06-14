<template>
    <vue3-tinymce v-model="state.content" :setting="state.setting" />
  </template>
  
  <script setup>
  import { reactive } from 'vue';
  // 引入组件
  import Vue3Tinymce from '@jsdawn/vue3-tinymce';
 
  const state = reactive({
    content: 'hello vue3-tinymce!',
    // editor 配置项
    setting: {
        language: 'zh-Hans',
    language_url: '/tinymce/langs/zh-Hans.js',
      height: 400, // editor 高度
    },
  });
  </script>