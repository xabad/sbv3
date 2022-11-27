package com.example.sbv3

import com.baomidou.mybatisplus.core.mapper.BaseMapper
import org.apache.ibatis.annotations.Mapper
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
@Mapper
interface SysUserMapper : BaseMapper<SysUser>
