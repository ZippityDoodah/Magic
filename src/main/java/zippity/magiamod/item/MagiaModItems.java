package zippity.magiamod.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import zippity.magiamod.MagiaMod;

public class MagiaModItems {

    public static Item magiaWand;

    public static void preInit() {

        magiaWand = new ItemMagiaWand("magia_wand");

        registerItems();

    }

    public static void registerItems() {
        GameRegistry.register(magiaWand, new ResourceLocation(MagiaMod.MODID, "magia_wand"));

    }

    public static void registerRenders() {
        registerRender(magiaWand);

    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(MagiaMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }

}
