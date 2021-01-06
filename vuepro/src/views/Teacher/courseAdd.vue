<template>
  <el-table
    :data="tableData"
    stripe
    style="width: 80% ;margin-top: 20px;margin: 0 auto"
	>
   <el-table-column
     prop="id"
     label="课程序号"
     width="80">
   </el-table-column>
   <el-table-column
     prop="title"
     label="课程名称"
     width="180">
   </el-table-column>
   <el-table-column
     prop="room"
     label="教室"
     width="180">
   </el-table-column>
   <el-table-column
     prop="stuClass"
     label="上课班级"
     width="180">
   </el-table-column>
   <el-table-column
     prop="teacher"
     label="教师"
     width="180">
   </el-table-column>
   <el-table-column
     prop="time"
     label="上课时间"
     width="150">
   </el-table-column>
   <el-table-column fixed="right" label="操作" width="100">
   	<template slot-scope="scope">
   		<el-button  type="primary" @click="detail(scope.row.id)" round>详情</el-button>
   	</template>
   </el-table-column>
  </el-table>
</template>

<script>
  export default {
    data() {
      return {
        tableData: [{
          id:"5",
		  title:"离散数学",
		  room:"南教202",
		  teacher:"老师",
		  stuClass:"计算1703",
		  time:"2021-01-09",
        }]
      }
    },
	methods:{
		detail(id) {
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