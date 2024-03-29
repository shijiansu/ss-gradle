plugins {
    id(Deploy.pluginAndroidId)
    kotlin(Deploy.pluginAndroid)
    kotlin(Deploy.pluginAndroidExtensions)
}

android {
    compileSdkVersion(Deploy.compileSdkVersion)
    buildToolsVersion(Deploy.buildToolsVersion)

    defaultConfig {
        applicationId = Deploy.applicationId
        minSdkVersion(Deploy.minSdkVersion)
        targetSdkVersion(Deploy.targetSdkVersion)
        versionCode = Deploy.versionCode
        versionName = Deploy.versionName
        testInstrumentationRunner = Deploy.androidJUnitRunner
    }

    //签名配置
    signingConfigs {
        register("release") {
            //别名
            keyAlias = "kotlin"
            //别名密码
            keyPassword = "123456"
            //路径
            storeFile = file("/src/main/jks/kotlin.jks")
            //密码
            storePassword = "123456"
        }
    }

    //编译类型
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            //自动签名打包
            signingConfig = signingConfigs.getByName("release")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    //输出文件
    android.applicationVariants.all {
        //编译类型
        val buildType = this.buildType.name
        outputs.all {
            //输出APK
            if (this is com.android.build.gradle.internal.api.ApkVariantOutputImpl) {
                if (buildType == "debug") {
                    this.outputFileName =
                        "KOTLIN_DSL_V${defaultConfig.versionName}_${buildType}.apk"
                } else if (buildType == "release") {
                    this.outputFileName =
                        "KOTLIN_DSL_V${defaultConfig.versionName}_${buildType}_${Deploy.getSystemTime()}.apk"
                }
            }
        }
    }

    //依赖操作
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    //部署资源文件
    fun listSubFile(): ArrayList<String> {
        //新资源目录
        val resFolder = "src/main/res/layouts"
        //新资源目录下的文件夹
        val files = file(resFolder).listFiles()
        val folders = ArrayList<String>()
        //遍历路径
        files?.let {
            it.forEach { file ->
                folders.add(file.absolutePath)
            }
        }
        //资源整合
        folders.add(file(resFolder).parentFile.absolutePath)
        return folders
    }

    //资源重定向
    sourceSets {
        getByName("main") {
            res.srcDir(listSubFile())
        }
    }
}

//获取
fun getSystemTime(): Long {
    return System.currentTimeMillis()
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Deploy.kotlinStdlib)
    implementation(Deploy.kotlinCoreKtx)
    implementation(Deploy.appcompat)
    implementation(Deploy.constraintLayout)
    testImplementation(Deploy.junit)
    androidTestImplementation(Deploy.testJunit)
    androidTestImplementation(Deploy.espressoCore)
}
