
## Configure

可以看到 `configure` 是 Project 对象的拓展方法，实际调用的是 ExtensionContainer 的 findPlugin(Class type) 方法，也就是说 configure 方法实际上等同于：

```kotlin
extensions.findByType<com.android.build.gradle.internal.dsl.BaseAppModuleExtension>().run {
  // TODO
}
```
