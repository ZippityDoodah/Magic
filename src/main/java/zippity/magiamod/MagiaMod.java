package zippity.magiamod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import zippity.magiamod.item.MagiaModItems;
import zippity.magiamod.proxy.CommonProxy;
import zippity.magiamod.tab.CreativeTabMagia;

@Mod(modid = MagiaMod.MODID, version = MagiaMod.VERSION, name = MagiaMod.NAME)
public class MagiaMod
{
    public static final String MODID = "magiamod";
    public static final String VERSION = "1.0";
    public static final String NAME = "Magia Mod";

    @SidedProxy(clientSide = "zippity.magiamod.proxy.ClientProxy", serverSide = "zippity.magiamod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static MagiaMod instance;

    public static CreativeTabMagia tabMagia;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        tabMagia = new CreativeTabMagia(CreativeTabs.getNextID(), "tab_magia");
        MagiaModItems.preInit();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {

        proxy.init(event);
    }

    @EventHandler
    public void postInit (FMLPostInitializationEvent event) {

        proxy.postInit(event);

    }
}
