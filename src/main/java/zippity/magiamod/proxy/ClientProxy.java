package zippity.magiamod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import zippity.magiamod.item.MagiaModItems;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Override
    public void init(FMLInitializationEvent event) {

        MagiaModItems.registerRenders();
    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }
}
