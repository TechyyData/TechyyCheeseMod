package techyydata.templatemod.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import techyydata.templatemod.Reference;

public class TMTab {
    public static CreativeTabs templateTab = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(Items.STICK);
        }
    };
}
