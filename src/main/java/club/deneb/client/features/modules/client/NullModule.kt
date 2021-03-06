package club.deneb.client.features.modules.client

import club.deneb.client.features.Category
import club.deneb.client.features.Module

@Module.Info(
    name = "NullModule",
    description = "Null Error!",
    category = Category.HIDDEN,
    visible = false
)
class NullModule : Module()