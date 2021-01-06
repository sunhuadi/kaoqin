<template>
  <el-table
    :data="tableData"
    stripe
    style="width: 80% ;margin-top: 20px;margin: 0 auto"
	>
   <el-table-column
     prop="cid"
     label="课程序号"
     width="80">
   </el-table-column>
   <el-table-column
     prop="courseName"
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
     width="180">
   </el-table-column>
   <el-table-column prop="action" fixed="right" lable="考勤状态">
	   <template slot-scope="scope">
	   <el-tag
	       :key="scope.row.id"
	       :type="scope.row.stage === '已考勤' ? 'success' : 'danger'"
	       effect="dark">
	       {{ scope.row.stage }}
	    </el-tag>
	   </template>
   </el-table-column>
  </el-table>
</template>

<script>
  import http from '../../utils/http.js'
  export default {
    data() {
      return {
        tableData: [{
          cid:"5",
          courseName:"离散数学",
		  room:"南教202",
		  teacher:"老师",
		  stuClass:"计算1703",
		  time:"2021-01-09",
		  stage:"已考勤"
        },
		{
		  cid:"6",
		  title:"离散数学",
		  room:"南教202",
		  teacher:"老师",
		  stuClass:"计算1703",
		  time:"2021-01-10",
		  stage:"迟到"
		}
		]
      }
    },
	methods:{
		
	},
    created() {
      const _this = this
      http.get('test1')
        .then(rep => {
          _this.tableData = rep.data
        })
        .catch(e => {
          console.log(e)
        })
    }
  }
</script>