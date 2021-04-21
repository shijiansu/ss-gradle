```bash
gradle wrapper7
```

# Task rules in practice

Some of Gradle’s core plugins make good use of `task rules`. One of the task rules the Java plugins define is `clean<TaskName>`, which deletes the output of a specified task. For example, running gradle `cleanCompileJava` from the command line deletes all production code class files.

```bash
./gradlew -i incrementMajorVersion
./gradlew -i incrementMinorVersion

./gradlew -i incrementMajorVersion
Caching disabled for task ':incrementMajorVersion' because:
  Build cache is disabled
Task ':incrementMajorVersion' is not up-to-date because:
  Task has not declared any outputs despite executing actions.
Incrementing major project version: 1.1-SNAPSHOT -> 2.1-SNAPSHOT
[ant:propertyfile] Updating property file: ... ...

./gradlew tasks
Rules
-----
Pattern: increment<Classifier>VersionByRule – Increments the project version classifier.
./gradlew -i incrementMajorVersionByRule
```
