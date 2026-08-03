plugins {
    id("freecam.i18n")
}

i18n {
    transform("${meta.id}.mod.description") {
        rename("fcam.mod.description")
    }
}
