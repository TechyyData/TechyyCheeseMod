package techyydata.templatemod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import techyydata.templatemod.registries.BlockRegistry;
import techyydata.templatemod.registries.ItemRegistry;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        BlockRegistry.init();
        ItemRegistry.init();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}
