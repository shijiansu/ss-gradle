![](https://img.shields.io/badge/language-groovy,%20kotlin-blue)
![](https://img.shields.io/badge/technology-gradle-blue)
![](https://img.shields.io/badge/development%20year-2020-orange)
![](https://img.shields.io/badge/contributor-shijian%20su-purple)
![](https://img.shields.io/badge/license-MIT-lightgrey)

![](https://img.shields.io/github/languages/top/shijiansu/gradle)
![](https://img.shields.io/github/languages/count/shijiansu/gradle)
![](https://img.shields.io/github/languages/code-size/shijiansu/gradle)
![](https://img.shields.io/github/repo-size/shijiansu/gradle)
![](https://img.shields.io/github/last-commit/shijiansu/gradle?color=red)

--------------------------------------------------------------------------------

# default

- Build Setup tasks
  - init - Initializes a new Gradle build.
  - wrapper - Generates Gradle wrapper files.
- Help tasks
  - buildEnvironment - Displays all buildscript dependencies declared in root project 'new-project'.
  - components - Displays the components produced by root project 'new-project'.
  - dependencies - Displays all dependencies declared in root project 'new-project'.
  - dependencyInsight - Displays the insight into a specific dependency in root project 'new-project'.
  - dependentComponents - Displays the dependent components of components in root project 'new-project'.
  - help - Displays a help message.
  - model - Displays the configuration model of root project 'new-project'.
  - outgoingVariants - Displays the outgoing variants of root project 'new-project'.
  - projects - Displays the sub-projects of root project 'new-project'.
  - properties - Displays the properties of root project 'new-project'.
  - tasks - Displays the tasks runnable from root project 'new-project'.

# plugin - id 'java'

- Build tasks
  - assemble - Assembles the outputs of this project.
  - build - Assembles and tests this project.
  - buildDependents - Assembles and tests this project and all projects that depend on it.
  - buildNeeded - Assembles and tests this project and all projects it depends on.
  - classes - Assembles main classes.
  - clean - Deletes the build directory.
  - jar - Assembles a jar archive containing the main classes.
  - testClasses - Assembles test classes.
- Documentation tasks
  - javadoc - Generates Javadoc API documentation for the main source code.
- Verification tasks
  - check - Runs all checks.
  - test - Runs the unit tests.
- Rules
  - Pattern: clean<TaskName>: Cleans the output files of a task.
  - Pattern: build<ConfigurationName>: Assembles the artifacts of a configuration.
  - Pattern: upload<ConfigurationName>: Assembles and uploads the artifacts belonging to a configuration.

properties
- sourceCompatibility: 11
- distsDir


# plugin - id 'maven-publish'

- Publishing tasks
  - publish - Publishes all publications produced by this project.
  - publishToMavenLocal - Publishes all Maven publications produced by this project to the local Maven cache.

model

+ projectPublicationRegistry
      | Type:   	org.gradle.api.internal.artifacts.ivyservice.projectmodule.ProjectPublicationRegistry
      | Creator: 	PublishingPluginRules#projectPublicationRegistry(ServiceRegistry)
      | Rules:
         ⤷ PublishingPluginRules#addConfiguredPublicationsToProjectPublicationRegistry(ProjectPublicationRegistry, PublishingExtension)
+ publishing
      | Type:   	org.gradle.api.publish.PublishingExtension
      | Value:  	extension 'publishing'
      | Creator: 	PublishingPluginRules#publishing(ExtensionContainer)
+ tasks
      | Rules:
         ⤷ PublishingPluginRules#tasksDependOnProjectPublicationRegistry(ModelMap<Task>, PublishingExtension)
     + publish
          | Type:   	org.gradle.api.DefaultTask
          | Value:  	task ':publish'
          | Creator: 	Project.<init>.tasks.publish()
          | Rules:
             ⤷ copyToTaskContainer
    + publishToMavenLocal
          | Type:   	org.gradle.api.DefaultTask
          | Value:  	task ':publishToMavenLocal'
          | Creator: 	Project.<init>.tasks.publishToMavenLocal()
          | Rules:
             ⤷ copyToTaskContainer

# plugin - id 'idea'

No new tasks

# plugin - id 'org.springframework.boot' version '2.2.5.RELEASE'

buildEnvironment

classpath
\--- org.springframework.boot:org.springframework.boot.gradle.plugin:2.2.5.RELEASE
     \--- org.springframework.boot:spring-boot-gradle-plugin:2.2.5.RELEASE
          +--- org.springframework.boot:spring-boot-loader-tools:2.2.5.RELEASE
          |    +--- org.springframework:spring-core:5.2.4.RELEASE
          |    |    \--- org.springframework:spring-jcl:5.2.4.RELEASE
          |    \--- org.apache.commons:commons-compress:1.19
          +--- io.spring.gradle:dependency-management-plugin:1.0.9.RELEASE
          \--- org.apache.commons:commons-compress:1.19

(*) - dependencies omitted (listed previously)

# plugin - id 'io.spring.dependency-management' version '1.0.9.RELEASE'

- Help tasks
  - dependencyManagement - Displays the dependency management declared in root project 'new-project'.

buildEnvironment

classpath
\--- io.spring.dependency-management:io.spring.dependency-management.gradle.plugin:1.0.9.RELEASE
     \--- io.spring.gradle:dependency-management-plugin:1.0.9.RELEASE

--------------------------------------------------------------------------------

# Execute all tests in repo

`/bin/bash run-repo-test.sh`
