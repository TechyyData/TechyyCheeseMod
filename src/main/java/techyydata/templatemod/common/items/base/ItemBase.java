package techyydata.templatemod.common.items.base;

import net.minecraft.item.Item;
import techyydata.templatemod.Reference;

public class ItemBase extends Item {
    public ItemBase(String name) {
        setName(name);
    }

    private void setName(String name) {
        this.setRegistryName(Reference.MOD_ID, name);
        this.setUnlocalizedName(Reference.MOD_ID + ":" + name);
    }
}
