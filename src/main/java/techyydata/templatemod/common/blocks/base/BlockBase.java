package techyydata.templatemod.common.blocks.base;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import techyydata.templatemod.Reference;

public class BlockBase extends Block {
    public BlockBase(Material blockMaterialIn, MapColor blockMapColorIn, String name) {
        super(blockMaterialIn, blockMapColorIn);
        setName(name);
    }

    private void setName(String name) {
        this.setRegistryName(Reference.MOD_ID, name);
        this.setUnlocalizedName(Reference.MOD_ID + ":" + name);
    }
}
