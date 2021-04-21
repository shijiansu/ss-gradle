The file gradle.properties needs to be copied to the directory <USER_HOME>/.gradle

```bash
gradle wrapper7

./gradlew printVersion1
> Task :printVersion1
Version: 0.1-SNAPSHOT
Version: 0.1-SNAPSHOT

./gradlew tasks
Versioning tasks
----------------
printVersion2 - Prints project version.
printVersion3 - Prints project version.

./gradlew third
> Task :first
first
> Task :second
second
> Task :printVersion4
Version: 0.1-SNAPSHOT
> Task :third
third

./gradlew -q third
first
second
Version: 0.1-SNAPSHOT
third

./gradlew -q one  
first
second
```
