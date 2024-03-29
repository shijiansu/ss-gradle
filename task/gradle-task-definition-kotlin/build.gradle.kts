group = "su.shijian.gradle.task"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.withType<Wrapper> {
    gradleVersion = "7.1.1"
}

// --------------------------------------------------------------------------------

val label: String by project
val answer: String by project

tasks.register("customTask1") {
    doLast { println("The $label is $answer.") }
}

// --------------------------------------------------------------------------------

val MyCopy by tasks.existing(Copy::class) {
    group = "Copy"
    description = "This is MyCopy Task"
    dependsOn("Copy")
    doFirst {
        println("MyCopy Do First")
    }
    doLast {
        println("MyCopy Do Last")
    }
}

tasks {
    val myCopy1 by register(Copy::class) {
        // TODO
    }
    val myCopy2 by existing(Copy::class) {
        // TODO
    }
}

allprojects {
    ext {
        kotlinVersion = "1.4.10"
    }
}

val versionCode: String by project // 读取 project 的 gradle.properties 文件定义的 versionCode 变量
val kotlinVersion: String by rootProject.extra  // 读取 project 对应的 build.gradle 文件中定义的 kotlinVersion 变量
val newKotlinVersion: String by extra("1.3.61")  // 定义一个新的 newKotlinVersion 变量

