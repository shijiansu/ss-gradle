The file build-announcements.gradle needs to be copied to the directory `<USER_HOME>/.gradle/init.d`

Initialization scripts are run before any of your build script logic has been evaluated and executed. You’ll write an initialization script that applies the plugin to any of your projects without manual intervention.

Gradle will execute every initialization script it finds under init.d as long as the file extension matches .gradle.


> The announce and build-announcements plugins have been removed 
>
> https://docs.gradle.org/current/userguide/upgrading_version_5.html#the_announce_and_build_announcements_plugins_have_been_removed
