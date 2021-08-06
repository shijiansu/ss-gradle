plugins {
    base
    id("org.springframework.boot") version ("2.4.9")
    id("io.spring.dependency-management") version ("1.0.11.RELEASE")
    `java-library` // because there is a "-"
}

group = "su.shijian.gradle.plugin"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<Wrapper> {
    gradleVersion = "7.1.1"
}
