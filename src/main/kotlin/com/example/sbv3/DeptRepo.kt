package com.example.sbv3

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DeptRepo:JpaRepository<SysDept,Long> {
}
