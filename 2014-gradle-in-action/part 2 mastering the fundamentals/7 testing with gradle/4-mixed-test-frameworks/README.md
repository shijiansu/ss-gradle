```bash
gradle wrapper7

./gradlew :repository:test
./gradlew :repository:test -i

# this uses "check" to depend on "aggregateTestReports"
./gradlew :repository:build

# refer to https://stackoverflow.com/a/16921750 to see how to aggregate for all sub projects
./gradlew :repository:aggregateTestReports

open ./repository/build/reports/tests/test/index.html

./gradlew 
# <taskName>.single=<testNamePattern>
./gradlew clean -Dtest.single=""**/*Spec.groovy"" :repository:test # still execute all test... look like

./gradlew clean :repository:test --tests "InMemoryToDoRepositorySpec"
open ./repository/build/reports/tests/test/index.html
```

# How to run a single test only
```bash
# not working...
# <taskName>.single=<testNamePattern>
./gradlew clean -Dtest.single=""**/*Spec.groovy"" :repository:test # execute all test
# also not working...
./gradlew clean :repository:test --tests "InMemoryToDoRepositorySpec"

open ./repository/build/reports/tests/test/index.html
# https://blog.csdn.net/p15097962069/article/details/106575387
gradle test --tests org.gradle.SomeTest.someSpecificFeature
gradle test --tests *SomeTest.someSpecificFeature
gradle test --tests *SomeSpecificTest
gradle test --tests all.in.specific.package*
gradle test --tests *IntegTest
gradle test --tests *IntegTest*ui*
gradle test --tests *IntegTest.singleMethod
gradle someTestTask --tests *UiTest someOtherTestTask --tests *WebTest*ui
```

Another way is to set test filters, not verify yet
```groovy
apply plugin: 'java'
 
test {
  filter {
    //specific test method
      includeTestsMatching "org.gradle.SomeTest.someSpecificFeature"
 
     //specific test method, use wildcard for packages
     includeTestsMatching "*SomeTest.someSpecificFeature"
 
     //specific test class
     includeTestsMatching "org.gradle.SomeTest"
 
     //specific test class, wildcard for packages
     includeTestsMatching "*.SomeTest"
 
     //all classes in package, recursively
     includeTestsMatching "com.gradle.tooling.*"
 
     //all integration tests, by naming convention
      includeTestsMatching "*IntegTest"
 
     //only ui tests from integration tests, by some naming convention
     includeTestsMatching "*IntegTest*ui"
   }
}
```

# How to remotely debug
```bash
./gradlew -Dtest.debug :repository:test 
```
