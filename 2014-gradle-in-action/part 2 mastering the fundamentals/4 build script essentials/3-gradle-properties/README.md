The file gradle.properties needs to be copied to the directory <USER_HOME>/.gradle

```bash
gradle wrapper7

./gradlew -q printGradleProperty
Second property: 455

# Project property via the –P command-line option
# System property via the –D command-line option
# Environment property following the pattern
ORG_GRADLE_PROJECT_propertyName=someValue
```
