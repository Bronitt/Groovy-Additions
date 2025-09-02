package net.bronit.groovyadditions.proxy;

import net.bronit.groovyadditions.Config;
import net.bronit.groovyadditions.Constants;
import net.bronit.groovyadditions.GroovyAdditions;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
        GroovyAdditions.config = new Config(Constants.CONFIG_GENERAL);

    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
