```bash
gradle wrapper

./gradlew customTask4 # take 2 properties into the task

./gradlew propertyTypes -Pargs=ipsum -Dargs=lorem

# for main class
./gradlew :cmd-line-args:run --args="lorem ipsum dolor"
./gradlew cmdLineJavaExec -Pargs="lorem ipsum dolor" # use the task wrapper

```
