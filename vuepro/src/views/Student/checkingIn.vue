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
   <el-table-column fixed="right" label="操作" width="100">
   	<template slot-scope="scope">
   		<el-button type="success" @click="detail(scope.row)" circle>签到</el-button>
   	</template>
   </el-table-column>
  </el-table>
</template>

<script>
  import http from "@/utils/http";

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
		detail(row) {
      this.$message({
        message: '学号1 你已经签到'+row.courseName,
        type: 'success'
      });
		},
		joinIn(id) {
			console.log(id)
		}
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