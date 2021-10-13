package net.martin1912.BetaExtras.Block;

import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

@HasMetaNamedBlockItem
public class DenseIce extends TemplateBlockBase {
    public DenseIce(Identifier identifier, Material material) {
        super(identifier, material);
    }

    @Override
    public DenseIce setHardness(float Hardness) { return (DenseIce) super.setHardness(Hardness); }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0:
                return TextureListener.DenseIce;
            case 1:
                return TextureListener.VeryDenseIce;
            case 2:
                return TextureListener.IceIron;
            case 3:
                return TextureListener.IceGold;
            case 4:
                return TextureListener.IceBricks;
            case 5:
                return TextureListener.IceThiccBriccs;
            default:
                return super.getTextureForSide(side, meta);
        }
    }
}
