# Controlling the settings file search behavior

There are two command-line parameters that are helpful in determining the search behavior for a settings file:

- `-u, --no-search-upward`: Tells Gradle not to search for a settings file in parent directories. This option is useful if you want to avoid the performance hit of searching all parent directories in a deeply nested project structure.
- `-c, --settings-file`: Specifies the location of the settings file. You may want to use this option if your settings filename deviates from the standard naming convention.

```bash
gradle wrapper7

./gradlew -q projects
------------------------------------------------------------
Root project '1-todo-multiproject'
------------------------------------------------------------
Root project '1-todo-multiproject'
+--- Project ':model'
+--- Project ':repository'
\--- Project ':web'

./gradlew -i :model:build # output info log

./gradlew :web:compileJa

./gradlew :repository:build # only compile the code of dependent projects
./gradlew :repository:build -a # --no-rebuild, Partial multiproject builds
./gradlew :repository:buildNeeded # to run the tests in dependent projects also
./gradlew :repository:buildDependents # verify the impact of code change by building and testing dependent projects

./gradlew hello
> Task :hello
Hello from root project
> Task :repository:hello
Hello from repository project
> Task :model:hello
Hello from model project
```
