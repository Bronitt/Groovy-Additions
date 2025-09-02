package net.bronit.groovyadditions;

import net.bronit.groovyadditions.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static net.bronit.groovyadditions.Constants.CONFIG_GENERAL;

@Mod(
        modid = Constants.MOD_ID,
        name = Constants.MOD_NAME,
        version = Constants.VERSION,
        acceptedMinecraftVersions = "[1.12,1.12.2]",
        dependencies = Constants.MOD_DEPS
)
public class GroovyAdditions {

    public static final Logger LOGGER = LogManager.getLogger(Constants.MOD_NAME);
    public static Config config;

    @SidedProxy(
            clientSide = "net.bronit.groovyadditions.proxy.ClientProxy",
            serverSide = "net.bronit.groovyadditions.proxy.CommonProxy"
    )
    public static CommonProxy proxy;

    @Instance
    public static GroovyAdditions instance;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);

    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);

    }

}
