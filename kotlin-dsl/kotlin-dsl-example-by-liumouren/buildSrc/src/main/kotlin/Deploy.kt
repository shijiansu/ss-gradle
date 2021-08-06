import java.text.SimpleDateFormat
import java.util.*

object Deploy {

    //当前时间
    fun getSystemTime(): String {
        val mSimpleDateFormat = SimpleDateFormat("YYYY_MM_dd_HH_mm_ss", Locale.CHINA)
        return mSimpleDateFormat.format(System.currentTimeMillis())
    }

    //版本
    const val kotlinVersion = "1.3.72"
    const val gradleVersion = "4.0.0"

    //插件
    const val pluginAndroidId = "com.android.application"
    const val pluginAndroid = "android"
    const val pluginAndroidExtensions = "android.extensions"

    //SDK版本
    const val compileSdkVersion = 29
    const val buildToolsVersion = "29.0.3"
    const val applicationId = "com.liuguilin.kotlindsl"
    const val minSdkVersion = 21
    const val targetSdkVersion = 29

    //版本
    const val versionCode = 1
    const val versionName = "1.0"

    //依赖
    const val androidJUnitRunner = "androidx.test.runner.AndroidJUnitRunner"
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
    const val kotlinCoreKtx = "androidx.core:core-ktx:1.3.0"
    const val appcompat = "androidx.appcompat:appcompat:1.1.0"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"
    const val junit = "junit:junit:4.12"
    const val testJunit = "androidx.test.ext:junit:1.1.1"
    const val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"
}