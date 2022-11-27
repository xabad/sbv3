import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "3.0.0"
    id("io.spring.dependency-management") version "1.1.0"
    kotlin("jvm") version "1.7.21"
    kotlin("kapt") version "1.7.21"
    kotlin("plugin.spring") version "1.7.21"
    id("org.jetbrains.kotlin.plugin.jpa") version "1.7.21"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.boot:spring-boot-dependencies:3.0.0")
    }
}

repositories {
    mavenCentral()
    maven { url = uri("https://maven.aliyun.com/repository/central") }
    maven { url = uri("https://maven.aliyun.com/repository/public") }
    maven { url = uri("https://maven.aliyun.com/repository/google") }
    maven { url = uri("https://maven.aliyun.com/repository/spring") }
    maven { url = uri("https://maven.aliyun.com/repository/apache-snapshots") }
    maven { url = uri("https://oss.sonatype.org/content/groups/public/") }
    maven { url = uri("https://repo.spring.io/libs-milestone/") }
    maven { url = uri("https://repo.spring.io/snapshot/") }
    maven { url = uri("https://repo.spring.io/milestone/") }
    maven { url = uri("https://oss.sonatype.org/content/repositories/snapshots/") }
    maven { url = uri("https://www.jitpack.io") }
    maven {
        url = uri("https://repo.rdc.aliyun.com/repository/67905-release-p6vOzO/")
        credentials {
            username = "zj7buz"
            password = "OuJFdc4Ej1"
        }
    }
    google()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-aop")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-jdbc")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    compileOnly("org.projectlombok:lombok")
    runtimeOnly("com.mysql:mysql-connector-j")
    kapt("org.springframework.boot:spring-boot-configuration-processor")
    kapt("org.projectlombok:lombok")
    implementation("org.projectlombok:lombok")
    implementation("com.mysql:mysql-connector-j")
    implementation("jakarta.servlet:jakarta.servlet-api:6.0.0")
//    implementation("com.alibaba:druid-spring-boot-starter:1.2.15")
    implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.0")
    implementation("com.baomidou:mybatis-plus-boot-starter:4.0.0")
    implementation("com.baomidou:dynamic-datasource-spring-boot-starter:4.0.0")
    implementation("io.swagger.core.v3:swagger-annotations:2.2.7")
}

sourceSets.getByName("main") {
    java.srcDirs("src/main/java", "src/main/kotlin")
}
tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}
configurations.all {
    resolutionStrategy {
        force(" org.springframework.boot:spring-boot-dependencies:3.0.0")
    }
}
noArg {
    annotation("jakarta.persistence.Entity")
    annotation("org.springframework.data.mongodb.core.mapping.Document")
}
System.setProperty("socksProxyHost", "127.0.0.1")
System.setProperty("socksProxyPort", "10808")
