```bash
gradle wrapper7

./gradlew makeReleaseVersion
# after this execution, it changes
# release=false
# to
# release=true
# in the "version.properties"
[BEFORE]: false
[AFTER]: true

./gradlew -q printVersion
Reading the version file.
Version: 0.1

./gradlew -q makeReleaseVersion1 # do the same thing as "makeReleaseVersion"
```

# Task inputs/outputs evaluation

Remember, task inputs and outputs evaluates during the configuration phase to wire up the task dependencies.
That’s why they need to be defined in a configuration block.
