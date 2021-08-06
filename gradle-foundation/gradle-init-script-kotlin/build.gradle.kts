plugins {
    id("org.springframework.boot") version ("2.4.9")
    id("io.spring.dependency-management") version ("1.0.11.RELEASE")
}

println("[SYSTEM] Configuration - after plugins{}")

group = "su.shijian.gradle.init_script"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Wrapper> {
    gradleVersion = "7.1.1"
}

println(java.sourceCompatibility) // verified the setting is working

println(project.findProperty("fromApplicationGradleProperties"))

// 需要在理解 project 对象及其方法
