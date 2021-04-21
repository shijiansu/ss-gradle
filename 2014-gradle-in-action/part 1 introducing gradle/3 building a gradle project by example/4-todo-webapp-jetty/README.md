```bash
gradle wrapper7

gradle build
jar tf build/libs/3-todo-webapp-customized.war # can see all resources are packaged

# 20210420 - gretty not yet support Gradle 7, latest support is 
./gradlew appRun
open http://localhost:8080/4-todo-webapp-jetty

# if go to tomcatRun or jettyRun then it will override the "servletContainer" in build.gradle
```
