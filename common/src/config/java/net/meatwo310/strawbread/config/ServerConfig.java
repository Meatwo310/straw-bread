package net.meatwo310.strawbread.config;

import net.meatwo310.strawbread.mdk.config.ConfigEntries;
import net.meatwo310.strawbread.mdk.config.ConfigEntryBuilder;

public class ServerConfig {
    private static final ConfigEntryBuilder BUILDER = new ConfigEntryBuilder();

    public static final ConfigEntries ENTRIES = BUILDER.build();
}
