package com.deneb.client.utils.clazz;

import com.deneb.client.features.Module;

public class ActivedModule {
    public Module mod;
    public String string;

    public ActivedModule(Module module, String string) {
        this.mod = module;
        this.string = string;
    }

    public String string() {
        return string;
    }
}