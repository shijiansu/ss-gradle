```bash
gradle wrapper7

gradle groupTherapy

> Task :startSession
[ant:echo] Repeat after me...
> Task :yayGradle0
Gradle rocks
> Task :yayGradle1
Gradle rocks
> Task :yayGradle2
Gradle rocks

gradle -q tasks
------------------------------------------------------------
Tasks runnable from root project '02-dynamic-task-and-task-dependencies'
------------------------------------------------------------

Build Setup tasks
-----------------
init - Initializes a new Gradle build.
wrapper - Generates Gradle wrapper files.

Help tasks
----------
buildEnvironment - Displays all buildscript dependencies declared in root project '02-dynamic-task-and-task-dependencies'.
dependencies - Displays all dependencies declared in root project '02-dynamic-task-and-task-dependencies'.
dependencyInsight - Displays the insight into a specific dependency in root project '02-dynamic-task-and-task-dependencies'.
help - Displays a help message.
javaToolchains - Displays the detected java toolchains.
outgoingVariants - Displays the outgoing variants of root project '02-dynamic-task-and-task-dependencies'.
projects - Displays the sub-projects of root project '02-dynamic-task-and-task-dependencies'.
properties - Displays the properties of root project '02-dynamic-task-and-task-dependencies'.
tasks - Displays the tasks runnable from root project '02-dynamic-task-and-task-dependencies'.

To see all tasks and more detail, run gradle tasks --all

To see more detail about a task, run gradle help --task <task>

gradle -q tasks --all 

------------------------------------------------------------
Tasks runnable from root project '02-dynamic-task-and-task-dependencies'
------------------------------------------------------------

Build Setup tasks
-----------------
init - Initializes a new Gradle build.
wrapper - Generates Gradle wrapper files.

Help tasks
----------
buildEnvironment - Displays all buildscript dependencies declared in root project '02-dynamic-task-and-task-dependencies'.
dependencies - Displays all dependencies declared in root project '02-dynamic-task-and-task-dependencies'.
dependencyInsight - Displays the insight into a specific dependency in root project '02-dynamic-task-and-task-dependencies'.
help - Displays a help message.
javaToolchains - Displays the detected java toolchains.
outgoingVariants - Displays the outgoing variants of root project '02-dynamic-task-and-task-dependencies'.
projects - Displays the sub-projects of root project '02-dynamic-task-and-task-dependencies'.
properties - Displays the properties of root project '02-dynamic-task-and-task-dependencies'.
tasks - Displays the tasks runnable from root project '02-dynamic-task-and-task-dependencies'.

Other tasks
-----------
components - Displays the components produced by root project '02-dynamic-task-and-task-dependencies'. [deprecated]
dependentComponents - Displays the dependent components of components in root project '02-dynamic-task-and-task-dependencies'. [deprecated]
groupTherapy
model - Displays the configuration model of root project '02-dynamic-task-and-task-dependencies'. [deprecated]
prepareKotlinBuildScriptModel
startSession
yayGradle0
yayGradle1
yayGradle2

gradle yayGradle0 groupTherapy # execute yayGradle0 first, and all the tasks only executes once
gradle groupTherapy yayGradle0 # same result

gradle gT # == gradle groupTherapy ("g"roup"T"herapy)

gradle groupTherapy -x yayGradle0 # -x: exculde yayGradle0

gradle -h # gradle -?, gradle --help
gradle –b test.gradle # indicate build file. gradle --build-file test.gradle
gardle --offline # only use dependencies in local cache

gradle –Dmyprop=myvalue # system property
gradle -Pmyprop=myvalue # variable in the build script

-i, --info
-s, --stacktrace
-q, --quiet

gradle tasks
gradle properties


ps | grep gradle
```




