pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "HI"
include(":app")
include(":step01hello")
include(":HelloKotlin")
include(":step02activity")
include(":step02activity2")
include(":step02activity3")
include(":step03layout")
include(":step04view")
include(":step04example")
include(":step05listview")
include(":test")
include(":step06customlistview")
