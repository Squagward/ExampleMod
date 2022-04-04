package com.squagward.examplemod

import com.squagward.examplemod.command.ExampleCommand
import com.squagward.examplemod.config.ExampleConfig
import net.fabricmc.api.ClientModInitializer

object ExampleMod : ClientModInitializer {
    var config: ExampleConfig? = null

    override fun onInitializeClient() {
        config = ExampleConfig()
        config?.preload()

        ExampleCommand.register()
    }
}
