## Lab

```bash
gradle wrapper
```

### Execution way 1 (good for testing)

```bash
./gradlew --init-script src/main/kotlin/gradle/initd/init-script.init.gradle.kts compileJava
```

### Execution way 2

In Groovy, it can be .gradle, but in Kotlin, it must be init.gradle.kts

```bash
[[ -d "${HOME}/.gradle/init.d/" ]] || mkdir "${HOME}/.gradle/init.d/"
ln -s "$(PWD)/src/main/kotlin/gradle/initd/init-script.init.gradle.kts" "${HOME}/.gradle/init.d/init-script.init.gradle.kts"

./gradlew hello # output as below
./gradlew compileJava # Java from init.d file

unlink "${HOME}/.gradle/init.d/init-script.init.gradle.kts"
```

```text
SYSTEM] Initialization
[SYSTEM] Initialization - before apply plugin
[SYSTEM] Initialization - after apply plugin
[SYSTEM] ========================================
gradle-init-script-kotlin

abcd1234
[SYSTEM] ========================================

> Configure project :
[SYSTEM] Configuration - after plugins{}
11
abcd1234
```
