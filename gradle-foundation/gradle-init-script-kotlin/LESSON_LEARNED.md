
对比起 Groovy, Kotlin 的 init script 在 Intellij 中的支持没有那么好 (没有提示和识别), 不能直接在src下目录识别.

需要复制代码到 build.gradle.kts 去获得语法提示 (也不是全部都支持),

但是, 有些对象的加载方式会和 init.gradle.kts 不完全一样, 例如 apply(plugin...)
