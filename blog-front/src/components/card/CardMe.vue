<template>
  <el-card>
    <h1 class="me-author-name">润火</h1>
    <div class="me-author-description">
      <span><i class="el-icon-location-outline"></i> &nbsp;广东&湛江</span>
      <span><i class="me-icon-job"></i> java爱好者</span>
    </div>
    <div class="me-author-tool">
      <i @click="showTool(qq)" :title="qq.title" class="iconfont icon-qq"></i>
      <i @click="showTool(gitee)" :title="gitee.title" class="iconfont icon-gitee-fill-round"></i>
    </div>
  </el-card>

</template>

<script>
  export default {
    name: 'CardMe',
    data() {
      return {
        qq: {title: 'QQ', message: '1984045322'},
        gitee: {
          title: 'gitee',
          message: '<a target="_blank" href="https://gitee.com/runhuo">https://gitee.com/runhuo</a>'
        }
      }
    },
    methods: {
      showTool(tool) {
        this.$message({
          duration: 0,
          showClose: true,
          dangerouslyUseHTMLString: true,
          message: '<strong>' + tool.message + '</strong>'
        });
      }
    }
  }
</script>

<style scoped>
  .me-author-name {
    text-align: center;
    font-size: 30px;
    border-bottom: 1px solid #5FB878;
  }

  .me-author-description {
    padding: 8px 0;
  }

  .me-icon-job {
    padding-left: 16px;
  }

  .me-author-tool {
    text-align: center;
    padding-top: 10px;
  }

  .me-author-tool i {
    cursor: pointer;
    padding: 4px 10px;
    font-size: 30px;
  }
</style>
