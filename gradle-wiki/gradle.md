## Gradle plugins

- https://plugins.gradle.org/
  - 进入plugin的页面后, 点击组织 (Owner) 的图标, 可以看到该组织下的所有plugin, 例如
    - https://plugins.gradle.org/plugin/io.spring.dependency-management ->
    - https://plugins.gradle.org/u/spring

```groovy
buildscript { // Configuration phase, similar as initscript for Initialization phase
    repositories {
        gradlePluginPortal() // looks at https://plugins.gradle.org/m2/
        // maven { url "https://plugins.gradle.org/m2/" }
    }
    dependencies {
        classpath "org.springframework.boot:spring-boot-gradle-plugin:2.4.9"
        classpath "io.spring.gradle:dependency-management-plugin:1.0.11.RELEASE"
    }
}
```

## Dependencies cache

Library download location: `~/.gradle/caches/modules-2/files-2.1`.
More information, refer to `devops-repo-nexus3/nexus3-first-try/README.md`

## Organizing Gradle Projects

- https://docs.gradle.org/current/userguide/organizing_gradle_projects.html

- Customize Gradle Wrapper
  - https://docs.gradle.org/current/userguide/organizing_gradle_projects.html#sec:custom_gradle_distribution
