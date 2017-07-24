package zippity.magiamod.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabMagia extends CreativeTabs{

    public CreativeTabMagia(int index, String label) {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.CAKE;
    }
}
