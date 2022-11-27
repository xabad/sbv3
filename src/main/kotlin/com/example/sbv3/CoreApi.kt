package com.example.sbv3

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper
import jakarta.annotation.Resource
import org.apache.ibatis.session.SqlSessionFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import javax.sql.DataSource

@RestController
class CoreApi {
    @Resource
    private lateinit var deptRepo: DeptRepo
    @Resource
    private lateinit var sysUserMapper: SysUserMapper

    @GetMapping("/")
    fun index(): Any? {
        return deptRepo.findAll()
    }
    @GetMapping("/user")
    fun userList(): MutableList<SysUser>? {
        return sysUserMapper.selectList(QueryWrapper())
    }
}
