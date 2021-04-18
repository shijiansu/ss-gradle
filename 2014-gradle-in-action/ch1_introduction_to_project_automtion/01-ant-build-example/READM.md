```bash
# in case there is not library in local
mkdir lib && cd lib
curl https://repo1.maven.org/maven2/org/apache/commons/commons-lang3/3.1/commons-lang3-3.1.jar --output commons-lang3-3.1.jar

sdk list ant
ant -version
Apache Ant(TM) version 1.10.9 compiled on September 27 2020

ant # default is target "dist"
ant clean
```
