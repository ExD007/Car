plugins {
    id("com.android.application")
}

android {
    namespace = "ru.zarabotok40.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "ru.zarabotok40.app"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            applicationIdSuffix = ".debug"
            versionNameSuffix = "-debug"
        }
    }
}
