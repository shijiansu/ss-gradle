```groovy
apply plugin: 'com.android.application'+
// 原形
project.apply([plugin: 'com.android.application'])

dependencies {
    compile 'com.google.code.gson:gson:2.3'
}
// 原形
project.dependencies({
    add('compile', 'com.google.code.gson:gson:2.3', {
    // Configuration statements
    })
})
```
