package net.martin1912.BetaExtras.Block;

import net.martin1912.BetaExtras.Item.ItemListener;
import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.level.Level;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

import java.util.Random;

@HasMetaNamedBlockItem
public class AlphiumOre extends TemplateBlockBase {

    public AlphiumOre(Identifier identifier, Material material) {
        super(identifier, material);
    }

    @Override
    public AlphiumOre setHardness(float Hardness) {
        return (AlphiumOre) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0: {
                return TextureListener.AlphiumOre;
            }
            case 1: {
                return TextureListener.AlphiumBlock;
            }
            default:
                return super.getTextureForSide(side, meta);
        }
    }
}