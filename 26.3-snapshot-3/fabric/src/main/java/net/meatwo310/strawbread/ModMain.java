package net.meatwo310.strawbread;

import net.fabricmc.api.ModInitializer;

public class ModMain implements ModInitializer {
    @Override
    public void onInitialize() {
        Constants.LOGGER.debug(Constants.INITIALIZING, ModUtils.id("26.3-snapshot-3-fabric"));
    }
}
