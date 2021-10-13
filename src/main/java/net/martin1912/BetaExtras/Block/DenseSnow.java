package net.martin1912.BetaExtras.Block;

import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

@HasMetaNamedBlockItem
public class DenseSnow extends TemplateBlockBase {
    public DenseSnow(Identifier identifier, Material material) {
        super(identifier, material);
        setSounds(SNOW.sounds);
    }

    @Override
    public DenseSnow setHardness(float Hardness) { return (DenseSnow) super.setHardness(Hardness); }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0:
                return TextureListener.DenseSnow;
            case 1:
                return TextureListener.VeryDenseSnow;
            case 2:
                return TextureListener.DenseSlush;
            default:
                return super.getTextureForSide(side, meta);
        }
    }
}
