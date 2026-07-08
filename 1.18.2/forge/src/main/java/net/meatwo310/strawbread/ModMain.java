package net.meatwo310.strawbread;

import net.meatwo310.strawbread.config.ModConfigs;
import net.meatwo310.strawbread.mdk.config.PlatformConfigRegistrar;
import net.meatwo310.strawbread.mdk.config.VersionedConfigSpec;
import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MODID)
public class ModMain {
    public ModMain() {
        Constants.LOGGER.debug(Constants.INITIALIZING, ModUtils.loc("1.18.2-forge"));
        PlatformConfigRegistrar.registerAll(VersionedConfigSpec.bindAll(ModConfigs.ALL));
    }
}
