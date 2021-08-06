initscript {
    repositories {
        gradlePluginPortal()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
        mavenCentral()
    }
    dependencies {
        classpath("com.diffplug.spotless:spotless-plugin-gradle:5.14.2")
    }
}

allprojects {
    println("[SYSTEM] Initialization - before apply plugin")
    // apply common plugin
    apply(plugin = "java-library") // directly use Plugin ID case
    apply(plugin = "maven-publish")
    apply(plugin = "jacoco")
    // https://discuss.gradle.org/t/cannot-apply-plugin-by-id-in-init-gradle-script/30377
    // 这里必须用 implementation class 全称 ->
    // 如果根据 https://plugins.gradle.org/plugin/com.diffplug.gradle.spotless 配置 plugin id 不行,
    // apply(plugin = "com.diffplug.gradle.spotless") 会显示 DefaultPluginManager.apply 错误 "Plugin with id '"
    // 参考了 https://docs.gradle.org/current/userguide/init_scripts.html#sec:init_script_plugins
    apply<com.diffplug.gradle.spotless.SpotlessPlugin>()

    println("[SYSTEM] Initialization - after apply plugin")
    // load variables
    println("[SYSTEM] ========================================")
    println(project.name) // able to access. Loaded in Initialization phase, and access in Configuration phase
    println(project.group) // empty, because this init.d files are loaded before the build.gradle
    println(project.findProperty("fromApplicationGradleProperties")) // able to access
    println("[SYSTEM] ========================================")

    // apply common configuration for microservice environment
    configure<JavaPluginExtension> {
        sourceCompatibility = JavaVersion.VERSION_11
        // sourceCompatibility = JavaVersion.VERSION_12
    }

    // way 2
    // extensions.findByType(JavaPluginExtension::class.java)?.apply{
    //      sourceCompatibility = JavaVersion.VERSION_11
    // }

    // way 3
    // 使用 getByType 不会返回 null, 所以不需要使用 "?"
    // extensions.getByType(JavaPluginExtension::class.java).apply {
    //      sourceCompatibility = JavaVersion.VERSION_11
    // }

    tasks.withType<Test> {
        useJUnitPlatform()
    }

    // 貌似配置不可在 build.gradle.kts 中识别 (Groovy DSL 是可以的), 但 task 在 build.gradle.kts 可见
    configure<com.diffplug.gradle.spotless.SpotlessExtension> {
        java {
            googleJavaFormat()
        }
    }

    tasks.withType<JacocoReport> {
        dependsOn(tasks.getByName("test"))
        reports {
            xml.isEnabled = true
        }
    }
}
