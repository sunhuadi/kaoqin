<template>
  <el-table
    :data="tableData"
    stripe
    style="width: 80% ;margin-top: 20px;margin: 0 auto"
	>
   <el-table-column
     prop="stuNo"
     label="学号"
     width="180">
   </el-table-column>
   <el-table-column
     prop="stuName"
     label="姓名"
     width="180">
   </el-table-column>
   <el-table-column
     prop="stuClass"
     label="班级"
     width="180">
   </el-table-column>
   <el-table-column
     prop="sex"
     label="性别"
     width="80">
   </el-table-column>
   <el-table-column
     prop="stage"
     label="状态"
     width="180">
   </el-table-column>
   <el-table-column fixed="right" label="修改" width="100">
   	<template slot-scope="scope">
   		<el-button @click="detail(scope.row.id)" type="text" size="small">已签到</el-button>
		<el-divider direction="vertical"></el-divider>
		<el-button @click="detail(scope.row.id)" type="text" size="small">未签到</el-button>
		<el-divider direction="vertical"></el-divider>
		<el-button @click="detail(scope.row.id)" type="text" size="small">迟到</el-button>
   	</template>
   </el-table-column>
  </el-table>
</template>

<script>
	export default {
		data() {
			return {
				tableData: [{
				  stuNo:"17055555",
				  stuName:"刘森",
				  stuClass:"计算1703",
				  sex:"男",
				  stage:"已签到",
				}]
			}
		},
		created() {
			console.log(this.$route.query.id)
		}
	}
</script>

<style>
	.text {
		font-size: 14px;
	}

	.item {
		margin-bottom: 15px;
	}

	.clearfix:before,
	.clearfix:after {
		display: table;
		content: "";
	}

	.clearfix:after {
		clear: both
	}

	.box-card {
		width: 66.3%;
		margin: 0 auto;
	}
</style>
