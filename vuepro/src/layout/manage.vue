<template>
	<div>
		<el-menu
		  :default-active="activeIndex2"
		  class="el-menu-demo"
		  mode="horizontal"
		  @select="handleSelect"
		  background-color="#1d2264"
		  text-color="#fff"
		  active-text-color="#ffd04b"
		  router
		  >
		  <el-menu-item index="index"><i class="el-icon-grape"/>首页</el-menu-item>
		  <el-menu-item index="checkingIn"><i class="el-icon-watermelon"/>考勤签到</el-menu-item>
		  <el-menu-item index="checkingManager"><i class="el-icon-cherry"/>我的考勤</el-menu-item>
		  <el-menu-item index="courseAdd"><i class="el-icon-apple"/>考勤管理</el-menu-item>
		  <p style="float: right; padding: 3px 0;font-size:18px;color:#ffff">考勤管理系统 | 中国石油大学（华东）</p>
		</el-menu>
		<router-view/>
	</div>
</template>

<script>
    export default {
		computed: {
			defaultActive: function(){
				return this.$route.path.replace('/', '');
			}
		},
    }
</script>

<style>
	.el-col-4 {
	    width: 15.66667%;
	}
</style>