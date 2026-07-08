package net.meatwo310.strawbread.mdk.config;

interface ConfigElement {
    void bindTo(ConfigVisitor visitor);
}
