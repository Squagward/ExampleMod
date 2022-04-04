package com.squagward.examplemod.config

import gg.essential.vigilance.Vigilant
import gg.essential.vigilance.data.Property
import gg.essential.vigilance.data.PropertyType
import java.io.File

class ExampleConfig : Vigilant(File("./config/ExampleMod.toml"), "Example Mod Settings") {
    @Property(
        type = PropertyType.SWITCH,
        name = "Toggle Mod",
        description = "Toggle the Example Mod on or off",
        category = "General"
    )
    var toggleMod = true
}
