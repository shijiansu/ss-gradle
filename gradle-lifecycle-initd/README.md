
```bash
gradle wrapper
```

启用init.gradle文件的方法,

- https://docs.gradle.org/current/userguide/init_scripts.html

1. 在命令行指定文件, 例如: `gradle --init-script yourdir/init.gradle -q taskName`.你可以多次输入此命令来指定多个init文件
2. 把init.gradle文件放到 `${HOME}/.gradle/` 目录下.
3. 把以.gradle结尾的文件放到 `${HOME}/.gradle/init.d/` 目录下.
4. 把以.gradle结尾的文件放到 `${GRADLE_HOME}/init.d/` 目录下.

如果存在上面的4种方式的2种以上, gradle会按上面的1-4序号依次执行这些文件, 如果给定目录下存在多个init脚本, 会按拼音a-z顺序执行这些脚本
类似于build.gradle脚本, init脚本有时groovy语言脚本. 每个init脚本都存在一个对应的gradle实例, 你在这个文件中调用的所有方法和属性, 都会
委托给这个gradle实例, 每个init脚本都实现了Script接口

```bash
[[ -d "${HOME}/.gradle/init.d/" ]] || mkdir "${HOME}/.gradle/init.d/"
cp -v gradle_initd/auto-configuration.gradle "${HOME}/.gradle/init.d/"

./gradlew hello # output as below
./gradlew compileJava # auto-configuration from init.d file
rm -v "${HOME}/.gradle/init.d/auto-configuration.gradle"
```

```text
This is executed during the initialization phase.
[SYSTEM] This is executed during the Initialization phase - before apply plugin
[SYSTEM] This is executed during the Initialization phase - after apply plugin
[SYSTEM] ========================================
gradle-lifecycle-initd

abcd1234
[SYSTEM] ========================================

> Configure project :
This is executed during the Configuration phase - after plugins
[SYSTEM] Evaluation of root project 'gradle-lifecycle-initd' succeeded
[SYSTEM] Adding test2 task to root project 'gradle-lifecycle-initd'

> Task :hello
[SYSTEM] Executing task ':hello' ...
Hello from GreetingTask
gradle-lifecycle-initd
su.shijian.gradle.initd
[SYSTEM] DONE
```