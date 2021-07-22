```bash
gradle wrapper
```

## Default

```bash
gradle tasks --all
gradle --profile clean build
```

## taskInfo

- https://gitlab.com/barfuin/gradle-taskinfo#gradle-taskinfo
- https://plugins.gradle.org/plugin/org.barfuin.gradle.taskinfo

```bash
./gradlew tiTree assemblee
```

```text
> Task :tiTree
:assemble                             (org.gradle.api.DefaultTask)
+--- :bootJar                         (org.springframework.boot.gradle.tasks.bundling.BootJar)
|    +--- :bootJarMainClassName       (org.springframework.boot.gradle.plugin.ResolveMainClassName)
|    |    `--- :classes               (org.gradle.api.DefaultTask)
|    |         +--- :compileJava      (org.gradle.api.tasks.compile.JavaCompile)
|    |         `--- :processResources (org.gradle.language.jvm.tasks.ProcessResources)
|    `--- :classes                    (org.gradle.api.DefaultTask)
|         +--- :compileJava           (org.gradle.api.tasks.compile.JavaCompile)
|         `--- :processResources      (org.gradle.language.jvm.tasks.ProcessResources)
`--- :jar                             (org.gradle.api.tasks.bundling.Jar)
     `--- :classes                    (org.gradle.api.DefaultTask)
          +--- :compileJava           (org.gradle.api.tasks.compile.JavaCompile)
          `--- :processResources      (org.gradle.language.jvm.tasks.ProcessResources)
```

```bash
./gradlew tiOrder assemblee
```

```text
> Task :tiOrder

In order to execute [:assemble], the following tasks would be executed in this order:

  1. :compileJava          (org.gradle.api.tasks.compile.JavaCompile)
  2. :processResources     (org.gradle.language.jvm.tasks.ProcessResources)
  3. :classes              (org.gradle.api.DefaultTask)
  4. :bootJarMainClassName (org.springframework.boot.gradle.plugin.ResolveMainClassName)
  5. :bootJar              (org.springframework.boot.gradle.tasks.bundling.BootJar)
  6. :jar                  (org.gradle.api.tasks.bundling.Jar)
  7. :assemble             (org.gradle.api.DefaultTask)
```

```bash
./gradlew tiJson assemble
cat build/taskinfo/taskinfo-assemble.json
```

## More

- https://stackoverflow.com/a/19525097
