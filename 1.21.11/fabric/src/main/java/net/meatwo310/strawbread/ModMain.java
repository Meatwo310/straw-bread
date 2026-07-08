package net.meatwo310.strawbread;

import net.fabricmc.api.ModInitializer;
import net.meatwo310.strawbread.config.ModConfigs;
import net.meatwo310.strawbread.mdk.config.PlatformConfigRegistrar;
import net.meatwo310.strawbread.mdk.config.VersionedConfigSpec;

public class ModMain implements ModInitializer {
    @Override
    public void onInitialize() {
        Constants.LOGGER.debug(Constants.INITIALIZING, ModUtils.loc("1.21.11-fabric"));
        PlatformConfigRegistrar.registerAll(Constants.MODID, VersionedConfigSpec.bindAll(ModConfigs.ALL));
    }
}
