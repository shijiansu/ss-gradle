The file gradle.properties needs to be copied to the directory <USER_HOME>/.gradle

```bash
gradle wrapper7

./gradlew -q printVersion
Reading the version file.
Version: 0.1-SNAPSHOT

./gradlew printVersion 
> Configure project :
Reading the version file.
> Task :printVersion
Version: 0.1-SNAPSHOT

# make "version.properties" to "release=true"
./gradlew printVersion
> Configure project :
Reading the version file.
> Task :printVersion
Version: 0.1
```

# To understand the Gradle build lifecycle phases

- initialization phase
  - create Project instance
- configuration phase
  - `incremental build` feature determines if any of tha Tasks in the model requires running
  - prefect for setting up the configuration
  - > any configuration code executes with every build of your proj- ect—even if you just execute gradle tasks
- execution phase
  - executed in the correct order

# Declaring task inputs and outputs

Gradle determines if a task is up to date by com- paring a snapshot of a task’s inputs and outputs between two builds

- An input can be a directory, 1...n files, or an arbitrary property. 
- A output is defined through a directory or 1...n files.
- Inputs and outputs are defined as fields in class DefaultTask
