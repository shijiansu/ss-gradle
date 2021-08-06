## Docs

Refer to `gradle-init-script` and `gradle-lifecycle-and-objects` first.

## Lab

```bash
gradle wrapper

# refer to gradle-lifecycle-and-objects/BUILD_LOG
./gradlew --init-script src/main/groovy/gradle/initd/apply-plugins-projectsloaded.gradle tasks | grep spotless # not applying
./gradlew --init-script src/main/groovy/gradle/initd/apply-plugins-allprojects.gradle tasks | grep spotless # working as expected
./gradlew --init-script src/main/groovy/gradle/initd/apply-plugins-afterevaluate.gradle tasks # error
./gradlew --init-script src/main/groovy/gradle/initd/apply-plugins-projectsevaluated.gradle tasks # error


```

Find only under `allprojects{}` it could apply the plugins as expected
