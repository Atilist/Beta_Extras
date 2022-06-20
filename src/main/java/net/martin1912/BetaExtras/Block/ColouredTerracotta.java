package net.martin1912.BetaExtras.Block;

import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

@HasMetaNamedBlockItem
public class ColouredTerracotta extends TemplateBlockBase {

    public ColouredTerracotta(Identifier identifier, Material material) {
        super(identifier, material);
    }

    @Override
    public ColouredTerracotta setHardness(float Hardness) {
        return (ColouredTerracotta) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0: {
                return TextureListener.WhiteTerracotta;
            }
            case 1: {
                return TextureListener.OrangeTerracotta;
            }
            case 2: {
                return TextureListener.MagentaTerracotta;
            }
            case 3: {
                return TextureListener.LightblueTerracotta;
            }
            case 4: {
                return TextureListener.YellowTerracotta;
            }
            case 5: {
                return TextureListener.LimeTerracotta;
            }
            case 6: {
                return TextureListener.PinkTerracotta;
            }
            case 7: {
                return TextureListener.GrayTerracotta;
            }
            case 8: {
                return TextureListener.LightgrayTerracotta;
            }
            case 9: {
                return TextureListener.CyanTerracotta;
            }
            case 10: {
                return TextureListener.PurpleTerracotta;
            }
            case 11: {
                return TextureListener.BlueTerracotta;
            }
            case 12: {
                return TextureListener.BrownTerracotta;
            }
            case 13: {
                return TextureListener.GreenTerracotta;
            }
            case 14: {
                return TextureListener.RedTerracotta;
            }
            case 15: {
                return TextureListener.BlackTerracotta;
            }
            default:
                return super.getTextureForSide(side, meta);}
    }
}
