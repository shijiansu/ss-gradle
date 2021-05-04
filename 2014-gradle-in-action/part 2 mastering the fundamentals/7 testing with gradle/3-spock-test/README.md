# JDK 13 compatibility issue

Using Gradle 7.0.

`org.spockframework:spock-core:1.2-groovy-2.5` and `org.codehaus.groovy:groovy:2.5.4`,
not work well with JDK 13, 2 options here,

1. Downgrade JDK to 11, or
2. Downgrade to `org.spockframework:spock-core:1.3-groovy-2.4` and `org.codehaus.groovy:groovy-all:2.4.21'
   ` with JDK 13

```bash
gradle wrapper7

# Gradle uses the same testing report format
./gradlew :repository:test
./gradlew :repository:test -i

open ./repository/build/reports/tests/test/index.html
```
