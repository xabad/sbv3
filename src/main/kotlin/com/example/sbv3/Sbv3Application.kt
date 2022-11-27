package com.example.sbv3

import jakarta.annotation.Resource
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.session.SqlSessionFactory
import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Primary
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import javax.sql.DataSource

@SpringBootApplication(scanBasePackages = ["com.example.sbv3"])
@EnableJpaRepositories(basePackages = ["com.example.sbv3"])
@EntityScan("com.example.sbv3")
@MapperScan(basePackages = ["com.example.sbv3"], annotationClass = Mapper::class)
class Sbv3Application

fun main(args: Array<String>) {
    runApplication<Sbv3Application>(*args) {

    }
}
