package techyydata.templatemod.registries;

import net.minecraft.item.Item;
import techyydata.templatemod.Reference;
import techyydata.templatemod.common.TMTab;
import techyydata.templatemod.common.items.ItemTestItem;
import techyydata.templatemod.handlers.RegistryHandler;

public class ItemRegistry {
    public static final Item TEST_ITEM = new ItemTestItem().setRegistryName(Reference.MOD_ID, "testitem").setUnlocalizedName(Reference.MOD_ID + ":testitem").setCreativeTab(TMTab.templateTab);


    public static void init() {
        RegistryHandler.registerItem(TEST_ITEM);
    }
}
