## How to work with Plugins

- https://docs.gradle.org/current/userguide/plugins.html

### 2种不同的plugins

1. Binary plugins - 使用 `plugins` (新DSL), 和 `xxxscript{}` + `apply plugin:xxx`
2. Script plugins - 使用 `apply from`

### Binary plugins

**2个步骤**

1. Resolving a plugin
2. Applying a plugin

**关于plugins DSL**

在plugins{} (叫做plugins DSL) 里面, 该2个步骤合二为一处理, 但`Resolving a plugin`默认只可以处理`https://plugins.gradle.org`的, 除非在`settings.gradle`里面配置自定义的`pluginManagement`

- https://docs.gradle.org/current/userguide/plugins.html#sec:build_scripts_only

> Can only be used in build scripts and settings file
> The plugins {} block can currently only be used in a project’s build script and the settings.gradle file. 
> It cannot be used in script plugins or init scripts.

**使用情景**

1. 情景1: 在 init script
2. 情景2: 在 build.gradle - `plugins{}`
3. 情景3: 在 build.gradle - `xxxscript{}` + `apply plugin:xxx` (旧式)
4. 情景4: 在 buildSrc/build.gradle (自定义插件)

```groovy
// 情景1 - refer to "gradle-init-script"
// 情景2
plugins { id 'java' }
// or
plugins { id 'com.jfrog.bintray' version '1.8.5' }
// or
plugins { id 'com.example.hello' version '1.0.0' apply false // do not enable in the parent module }
// in child module
plugins { id 'com.example.hello' }
// --------------------------------------------------------------------------------
// 情景3 - 旧式用法(但init script只支持), 新的可以通过pluginManagement + plugins{} 达到custom repositories的插件 
apply plugin: 'java'
// or
apply plugin: JavaPlugin
// or
buildscript { // 这个可以配合 custom repositories
    repositories { gradlePluginPortal() }
    dependencies { classpath 'com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.5' }
}
apply plugin: 'com.jfrog.bintray'
// --------------------------------------------------------------------------------
// 情景4
plugins { id 'java-gradle-plugin' }
// or make your own plugin for build.gradle to use
// buildSrc/build.gradle
plugins { id 'java-gradle-plugin' }
gradlePlugin {
    plugins {
        myPlugins {
            id = 'my-plugin'
            implementationClass = 'my.MyPlugin'
        }
    }
}
// build.gradle
plugins { id 'my-plugin' }
```

**使用pluginManagement**

1. 情景1: 在 settings.gradle 中使用 // per-project
2. 情景2: 在 init.gradle 中使用 // globally

```groovy
// 情景1
// settings.gradle
pluginManagement {
    plugins {}
    resolutionStrategy {}
    repositories {
        maven { url './maven-repo' }
        gradlePluginPortal()
        ivy { url './ivy-repo' }
    }
}
rootProject.name = 'plugin-management'
// --------------------------------------------------------------------------------
// 情景2
// init.gradle - https://docs.gradle.org/current/userguide/plugins.html#sec:plugin_management
settingsEvaluated { settings ->
    settings.pluginManagement { // 这个只是设置pluginManagement而不是导入plugin, 参考下列"综合情景"
        plugins {}
        resolutionStrategy {}
        repositories {}
    }
}
```

**综合情景**

```groovy
// settings.gradle
pluginManagement { plugins { id 'com.example.hello' version "${helloPluginVersion}" } }
// build.gradle
plugins { id 'com.example.hello' }
// gradle.properties
helloPluginVersion=1.0.0
```

### Script plugins

相当于导入代码块, 可以是本地或者是远程HTTP的

```groovy
apply from: 'xxx.gradle'
// or
apply from: 'https://xxx.gradle'
```

## Lab

```bash
gradle wrapper
```
