## Docs

- https://docs.gradle.org/current/userguide/init_scripts.html

Google关键字`init script` + `gradle`

启用init.gradle文件的方法,

- https://docs.gradle.org/current/userguide/init_scripts.html

1. 在命令行指定文件, 例如: `gradle --init-script yourdir/init.gradle -q taskName`.你可以多次输入此命令来指定多个init文件
2. 把init.gradle文件放到 `${HOME}/.gradle/` 目录下.
3. 把以.gradle结尾的文件放到 `${HOME}/.gradle/init.d/` 目录下.
4. 把以.gradle结尾的文件放到 `${GRADLE_HOME}/init.d/` 目录下.

如果存在上面的4种方式的2种以上, gradle会按上面的1-4序号依次执行这些文件, 如果给定目录下存在多个init脚本, 会按拼音a-z顺序执行这些脚本
类似于build.gradle脚本, init脚本有时groovy语言脚本. 每个init脚本都存在一个对应的gradle实例, 你在这个文件中调用的所有方法和属性, 都会
委托给这个gradle实例, 每个init脚本都实现了Script接口

PS:

- 在init script里面, 是使用`initscript` (Initialization phase)
- 在build.gradle里面, 是使用`buildscript` (Configuration phase)

## Lab

```bash
gradle wrapper
# option 1
./gradlew --init-script src/main/groovy/gradle/initd/init-script.gradle hello

# option 2
[[ -d "${HOME}/.gradle/init.d/" ]] || mkdir "${HOME}/.gradle/init.d/"
ln -s "$(PWD)/src/main/groovy/gradle/initd/init-script.gradle" "${HOME}/.gradle/init.d/init-script.gradle"

./gradlew hello # output as below
```

```text
[SYSTEM] Initialization
[SYSTEM] Initialization - before apply plugin
[SYSTEM] Initialization - after apply plugin
[SYSTEM] ========================================
gradle-init-script

abcd1234
[SYSTEM] ========================================

> Configure project :
[SYSTEM] Configuration - after plugins{}

> Task :hello
Hello from GreetingTask
gradle-init-script
su.shijian.gradle.init_script
```

```bash
./gradlew compileJava # java-labrary from init.d file

unlink "${HOME}/.gradle/init.d/init-script.gradle"
```
