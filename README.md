This is a repro project for https://github.com/spring-projects/spring-boot/issues/15397: Default values of Kotlin-based ConfigurationProperties are not documented properly.

To reproduce the issue:
 - Run `./gradlew kaptKotlin`
 - Check generated files in `build/tmp/kapt3/classes/main/META-INF/spring-configuration-metadata.json` and `build/tmp/kapt3/stubs/main/com/example/DemoProperties.java`
 - There is no `"foo` default value in metadata or Java class with Kotlin 1.3.71 and 1.4 M1
 
To double check it works as expected with annotations (which should be not needed with since https://youtrack.jetbrains.net/issue/KT-30164 is expected to be fixed):
 - Uncomment `@DefaultValue("foo")`
 - Run `./gradlew kaptKotlin`
 - Check `build/tmp/kapt3/classes/main/META-INF/spring-configuration-metadata.json` it contains `"defaultValue": "foo"`