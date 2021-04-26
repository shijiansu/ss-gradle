```bash
gradle wrapper7

./gradlew dependencies # before include the cargo dependencies
> Task :dependencies
------------------------------------------------------------
Root project '1-cargo-configuration'
------------------------------------------------------------
cargo - Classpath for Cargo Ant tasks.
No dependencies

./gradlew dependencies
> Task :dependencies
------------------------------------------------------------
Root project '1-cargo-configuration'
------------------------------------------------------------
cargo - Classpath for Cargo Ant tasks.
+--- org.codehaus.cargo:cargo-core-uberjar:1.3.1
|    +--- commons-discovery:commons-discovery:0.4
|    |    \--- commons-logging:commons-logging:1.0.4
|    +--- jdom:jdom:1.0
|    +--- dom4j:dom4j:1.4
|    |    +--- xml-apis:xml-apis:1.0.b2 -> 1.3.03
|    |    +--- jaxen:jaxen:1.0-FCS
|    |    +--- saxpath:saxpath:1.0-FCS
|    |    +--- msv:msv:20020414
|    |    +--- relaxngDatatype:relaxngDatatype:20020414
|    |    \--- isorelax:isorelax:20020414
|    +--- jaxen:jaxen:1.0-FCS
|    +--- saxpath:saxpath:1.0-FCS
|    +--- msv:msv:20020414
|    +--- relaxngDatatype:relaxngDatatype:20020414
|    +--- isorelax:isorelax:20020414
|    +--- com.sun.xml.bind:jaxb-impl:2.1.13
|    |    \--- javax.xml.bind:jaxb-api:2.1
|    |         +--- javax.xml.stream:stax-api:1.0-2
|    |         \--- javax.activation:activation:1.1
|    +--- javax.xml.bind:jaxb-api:2.1 (*)
|    +--- javax.xml.stream:stax-api:1.0-2
|    +--- javax.activation:activation:1.1
|    +--- org.apache.ant:ant:1.7.1
|    |    \--- org.apache.ant:ant-launcher:1.7.1
|    +--- org.apache.ant:ant-launcher:1.7.1
|    +--- xerces:xercesImpl:2.8.1
|    |    \--- xml-apis:xml-apis:1.3.03
|    +--- xml-apis:xml-apis:1.3.03
|    \--- commons-logging:commons-logging:1.0.4
\--- org.codehaus.cargo:cargo-ant:1.3.1
     \--- org.codehaus.cargo:cargo-core-uberjar:1.3.1 (*)

> Task :printDependencies # 
/Users/someone/.gradle/caches/modules-2/files-2.1/org.codehaus.cargo/cargo-core-uberjar/1.3.1/3d6aff857b753e36bb6bf31eccf9ac7207ade5b7/cargo-core-uberjar-1.3.1.jar
/Users/someone/.gradle/caches/modules-2/files-2.1/org.codehaus.cargo/cargo-ant/1.3.1/a5a790c6f1abd6f4f1502fe5e17d3b43c017e281/cargo-ant-1.3.1.jar
/Users/someone/.gradle/caches/modules-2/files-2.1/dom4j/dom4j/1.4/8decb7e2c04c9340375aaf7dd43a7a6a9b9a46b1/dom4j-1.4.jar
/Users/someone/.gradle/caches/modules-2/files-2.1/xerces/xercesImpl/2.8.1/25101e37ec0c907db6f0612cbf106ee519c1aef1/xercesImpl-2.8.1.jar
/Users/someone/.gradle/caches/modules-2/files-2.1/commons-discovery/commons-discovery/0.4/9e3417d3866d9f71e83b959b229b35dc723c7bea/commons-discovery-0.4.jar
/Users/someone/.gradle/caches/modules-2/files-2.1/jdom/jdom/1.0/a2ac1cd690ab4c80defe7f9bce14d35934c35cec/jdom-1.0.jar
/Users/someone/.gradle/caches/modules-2/files-2.1/jaxen/jaxen/1.0-FCS/9609e8fbc28b62c53623ffaa441b666d17c7e1ef/jaxen-1.0-FCS.jar
/Users/someone/.gradle/caches/modules-2/files-2.1/saxpath/saxpath/1.0-FCS/69a47458a9966089491aa94bcb06cca51da2934b/saxpath-1.0-FCS.jar
/Users/someone/.gradle/caches/modules-2/files-2.1/msv/msv/20020414/42ededb9109dfea492e6aaf2a483cafd154fb9bd/msv-20020414.jar
/Users/someone/.gradle/caches/modules-2/files-2.1/relaxngDatatype/relaxngDatatype/20020414/de7952cecd05b65e0e4370cc93fc03035175eef5/relaxngDatatype-20020414.jar
/Users/someone/.gradle/caches/modules-2/files-2.1/isorelax/isorelax/20020414/80c676efa1c3218273c930822fed4c53fd904290/isorelax-20020414.jar
/Users/someone/.gradle/caches/modules-2/files-2.1/com.sun.xml.bind/jaxb-impl/2.1.13/7c1ea3e298d0a32fafcebcb734e77990598f7720/jaxb-impl-2.1.13.jar
/Users/someone/.gradle/caches/modules-2/files-2.1/javax.xml.bind/jaxb-api/2.1/d68570e722cffe2000358ce9c661a0b0bf1ebe11/jaxb-api-2.1.jar
/Users/someone/.gradle/caches/modules-2/files-2.1/javax.xml.stream/stax-api/1.0-2/d6337b0de8b25e53e81b922352fbea9f9f57ba0b/stax-api-1.0-2.jar
/Users/someone/.gradle/caches/modules-2/files-2.1/javax.activation/activation/1.1/e6cb541461c2834bdea3eb920f1884d1eb508b50/activation-1.1.jar
/Users/someone/.gradle/caches/modules-2/files-2.1/org.apache.ant/ant/1.7.1/1d33711018e7649a8427fff62a87f94f4e7d310f/ant-1.7.1.jar
/Users/someone/.gradle/caches/modules-2/files-2.1/org.apache.ant/ant-launcher/1.7.1/a9cbbcefbbb5e7f97596045268243a8c1c7aafca/ant-launcher-1.7.1.jar
/Users/someone/.gradle/caches/modules-2/files-2.1/commons-logging/commons-logging/1.0.4/f029a2aefe2b3e1517573c580f948caac31b1056/commons-logging-1.0.4.jar
```
