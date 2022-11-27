pluginManagement {
    repositories {
//        mavenLocal()
        maven(url = "https://plugins.gradle.org/m2/")
        gradlePluginPortal()
        maven(url = "https://repo.spring.io/plugins-release")
        maven(url = "https://repo.spring.io/plugins-milestone")
        maven(url = "https://repo.spring.io/plugins-snapshot")
        maven { url = uri("https://repo.spring.io/milestone") }
        maven(url = "https://maven.aliyun.com/repository/gradle-plugin")
        maven(url = "https://maven.aliyun.com/repository/spring-plugin")
        maven(url = "https://jetbrains.bintray.com/intellij-plugin-service")
    }
}

dependencyResolutionManagement {
    repositories {
        maven(url = "https://maven.aliyun.com/repository/public")
        maven(url = "https://maven.aliyun.com/repository/apache-snapshots")
        maven(url = "https://maven.aliyun.com/repository/central")
        maven(url = "https://maven.aliyun.com/repository/google")
        maven(url = "https://maven.aliyun.com/repository/gradle-plugin")
        maven(url = "https://maven.aliyun.com/repository/spring")
        maven(url = "https://maven.aliyun.com/repository/spring-plugin")
        mavenCentral()
        maven(url = "https://oss.sonatype.org/content/groups/public/")
        maven(url = "https://repo.spring.io/libs-milestone/")
        maven(url = "https://oss.sonatype.org/content/repositories/snapshots/")
        google()
        maven(url = "https://www.jitpack.io")
    }
}
rootProject.name = "sbv3"
