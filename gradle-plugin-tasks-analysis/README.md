```bash
gradle wrapper
./gradlew analyzeTasks -PpluginId=war # pass via command line
# > Task :analyzeTasks
# war: [bootWar, bootWarMainClassName, war]
```

```bash
/gradlew # as configuration
```

```text
> Configure project :

== common ==
base: [assemble, build, check, clean]
idea: [cleanIdea, cleanIdeaModule, cleanIdeaProject, cleanIdeaWorkspace, idea, ideaModule, ideaProject, ideaWorkspace, openIdea]
java-library: [buildDependents, buildNeeded, classes, compileJava, compileTestJava, jar, javadoc, processResources, processTestResources, test, testClasses]
maven-publish: [publish, publishToMavenLocal]

== spring ==
org.springframework.boot: [bootBuildImage, bootJar, bootJarMainClassName, bootRun, bootRunMainClassName]
io.spring.dependency-management: [dependencyManagement]

== quality ==
jacoco: [jacocoTestCoverageVerification, jacocoTestReport]
com.diffplug.spotless: [spotlessApply, spotlessCheck, spotlessDiagnose, spotlessInternalRegisterDependencies]
org.sonarqube: [sonarqube]
org.sonatype.gradle.plugins.scan: [nexusIQScan, ossIndexAudit]
```
