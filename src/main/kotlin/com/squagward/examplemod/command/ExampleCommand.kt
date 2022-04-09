package com.squagward.examplemod.command

import com.squagward.examplemod.config.ExampleConfig
import gg.essential.api.EssentialAPI
import gg.essential.api.commands.Command
import gg.essential.api.commands.DefaultHandler

@Suppress("unused")
object ExampleCommand : Command("examplemod") {
    @DefaultHandler
     fun handle() {
        EssentialAPI.getGuiUtil().openScreen(ExampleConfig.gui())
    }
}
