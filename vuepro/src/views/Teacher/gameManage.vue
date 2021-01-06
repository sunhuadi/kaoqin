<template>
  <el-table
    :data="tableData"
    stripe
    style="width: 70% ;margin-top: 20px;margin: 0 auto;"
	>
   <el-table-column
     prop="aid"
     label="竞赛序号"
     width="80">
   </el-table-column>
   <el-table-column
     prop="username"
     label="用户名"
     width="280">
   </el-table-column>
   <el-table-column
     prop="title"
     label="竞赛名称"
     width="280">
   </el-table-column>
   <el-table-column
     prop="stage"
     label="状态"
     width="280">
   </el-table-column>
   <el-table-column fixed="right" label="操作" width="100">
   	<template slot-scope="scope">
   		<el-button @click="reject(scope.row.id)" type="text" size="small">拒绝</el-button>
		<el-divider direction="vertical"></el-divider>
   		<el-button @click="joinIn(scope.row.id)" type="text" size="small">通过</el-button>
   	</template>
   </el-table-column>
  </el-table>
</template>

<script>
  export default {
    data() {
      return {
        tableData: [{
          aid:"1",
		  username:"shd",
		  title:"ACM国际大学生程序设计大赛",
		  stage:"未通过"
        }],
		
      }
    },
	methods:{
		reject(id) {
			this.$router.push({
				path: '/detail',
				query: {
					id: id,
				}
			})
		},
		joinIn(id) {
			console.log(id)
		}
	}
  }
</script>