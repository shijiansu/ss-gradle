```bash
gradle wrapper7
```

# Custom tasks

Consist of two components,

- Custom task class, a.k.a. task type
- Enhanced tasks

```bash
./gradlew -q # Version: 0.1-SNAPTHOT
./gradlew makeReleaseVersion # change the version.properties -> release = true
./gradlew -q # Version: 0.1
./gradlew rollbackReleaseVersion # change the version.properties -> release = false
./gradlew -q # Version: 0.1-SNAPTHOT
```

# Using Task types

Gradle’s built-in task types are derived classes from DefaultTask

- Zip
- Copy
