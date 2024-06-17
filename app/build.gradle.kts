plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")

}

android {
    namespace = "com.android.daggerdemo"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.android.daggerdemo"
        minSdk = 27
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


    //dagger2
    api( "com.google.dagger:dagger:2.37")
    api ("com.google.dagger:dagger-android:2.37")
    api ("com.google.dagger:dagger-android-support:2.37")

    annotationProcessor ("com.google.dagger:dagger-compiler:2.37")
    kapt ("com.google.dagger:dagger-compiler:2.37")

    annotationProcessor ("com.google.dagger:dagger-android-processor:2.37")
    kapt ("com.google.dagger:dagger-android-processor:2.37")




}