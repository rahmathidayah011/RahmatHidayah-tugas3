// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    id("com.google.gms.google-services") version "4.4.2" apply false
}

// Jika kamu ingin menambahkan dependensi di project-level (misalnya untuk plugin buildscript), gunakan ini:
dependencies {
    // Contoh: classpath("com.google.dagger:hilt-android-gradle-plugin:2.44")
    // Jangan tambahkan library biasa seperti `cardview` di sini
}
