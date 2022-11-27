package com.example.sbv3


import io.swagger.v3.oas.annotations.media.Schema
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.io.Serializable

@Entity
data class SysDept(
    @Id
    @Schema(name = "主键id")
    val deptId: Long,

    @Schema(title = "部门名称")
    val name: String,
    @Schema(title = "部门编码")
    val deptCode: String?,
    @Schema(title = "备注")
    val remark: String?,

    @Schema(title = "排序")
    val sortOrder: Int?,
    @Schema(title = "删除")
    val delFlag: Int?,
    @Schema(title = "状态")
    val status: Int?,

    @Schema(title = "父ID")
    val parentId: Long,
):Serializable {
}
