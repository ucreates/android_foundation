# Foundation(Android)
The project is foundation for [Android](https://www.android.com).

## Description
The project is develoed by Android Studio(3.3.4).

Android foundation supported Android6.0 Later.

## Usage
***Notes on use for Android***

1.Add to your build.gradle(app).

- Java

```
・
・
・
repositories {
    maven {
        url 'https://github.com/ucreates/android_foundation/raw/master/repository/java/'
    }
}
・
・
・
dependencies {
    implementation 'com.ucreates:foundation:1.0.0' 
}    
```

- Kotlin

```
・
・
・
repositories {
    maven {
        url 'https://github.com/ucreates/android_foundation/raw/master/repository/kotlin/'
    }
}
・
・
・
dependencies {
    implementation 'com.ucreates:foundation:1.0.0' 
}    
```

2.Sync gradle in your Android project.

3.Build and Running Android Foundation on your Android Client App.
