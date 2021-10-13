package net.martin1912.BetaExtras.Block;

import net.minecraft.block.BlockBase;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;
import net.modificationstation.stationapi.api.template.item.MetaNamedBlock;

public class ItemBlockExtraSaplings extends MetaNamedBlock {
    public ItemBlockExtraSaplings(int i) {
        super(i);
    }

    @Override
    public int getTexturePosition(int damage) {
        return BlockBase.BY_ID[id].getTextureForSide(0, damage);
    }
}
