package com.example.sbv3

import com.baomidou.mybatisplus.annotation.TableField
import com.fasterxml.jackson.annotation.JsonIgnore
import io.swagger.v3.oas.annotations.media.Schema
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.io.Serializable
@Entity
data class SysUser(
    @Id
    @Schema(name = "主键id")
    val userId: Long,
    /**
     * 用户名
     */
    @Schema(title = "用户名")
    val username: String,
    /**
     * 密码
     */
    @Schema(name = "密码")
    val password: String,

    @Schema(name = "工号")
    val workNo: String?,

    @Schema(name = "姓名")
    val realname: String?,
    /**
     * 随机盐
     */
    @JsonIgnore
    @Schema(name = "随机盐")
    val salt: String? = "default",
    /**
     * 锁定标记
     */
    @Schema(name = "锁定标记")
    val lockFlag: String,
    /**
     * 手机号
     */
    @Schema(name = "手机号")
    val phone: String,
    /**
     * 头像
     */
    @Schema(name = "头像地址")
    val avatar: String,
    /**
     * 部门ID
     */
    @Schema(name = "用户所属部门id")
    val deptId: Long,
    /**
     * 租户ID
     */
    @Schema(name = "租户id")
    var tenantId: String?,
    /**
     * 0-正常，1-删除
     */
    val delFlag: String
) : Serializable {
}
