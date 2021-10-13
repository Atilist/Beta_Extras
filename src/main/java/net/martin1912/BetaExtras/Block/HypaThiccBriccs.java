package net.martin1912.BetaExtras.Block;

import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

@HasMetaNamedBlockItem
public class HypaThiccBriccs extends TemplateBlockBase {

    public HypaThiccBriccs(Identifier identifier, Material material) {
        super(identifier, material);
    }

    public HypaThiccBriccs setHardness(float Hardness) {
        return (HypaThiccBriccs) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0:
                switch (side) {
                    case 0:
                        return TextureListener.HypaThiccBriccMiddle;
                    case 1:
                        return TextureListener.HypaThiccBriccTopTop;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return TextureListener.HypaThiccBriccTop;
                }
            case 1:
                return TextureListener.HypaThiccBriccMiddle;
            case 2:
                switch (side) {
                    case 0:
                        return TextureListener.HypaThiccBriccBottomBottom;
                    case 1:
                        return TextureListener.HypaThiccBriccMiddle;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return TextureListener.HypaThiccBriccBottom;
                }
            case 3:
                return TextureListener.HypaThiccBriccGlue;
            case 4:
                switch (side) {
                    case 0:
                        return TextureListener.OldHypaThiccBriccMiddle;
                    case 1:
                        return TextureListener.OldHypaThiccBriccTopTop;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return TextureListener.OldHypaThiccBriccTop;
                }
            case 5:
                return TextureListener.OldHypaThiccBriccMiddle;
            case 6:
                switch (side) {
                    case 0:
                        return TextureListener.OldHypaThiccBriccBottomBottom;
                    case 1:
                        return TextureListener.OldHypaThiccBriccMiddle;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return TextureListener.OldHypaThiccBriccBottom;
                }
            case 7:
                return TextureListener.OldHypaThiccBriccGlue;
            case 8:
                switch (side) {
                    case 0:
                        return TextureListener.AlphaHypaThiccBriccMiddle;
                    case 1:
                        return TextureListener.AlphaHypaThiccBriccTopTop;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return TextureListener.AlphaHypaThiccBriccTop;
                }
            case 9:
                return TextureListener.AlphaHypaThiccBriccMiddle;
            case 10:
                switch (side) {
                    case 0:
                        return TextureListener.AlphaHypaThiccBriccBottomBottom;
                    case 1:
                        return TextureListener.AlphaHypaThiccBriccMiddle;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return TextureListener.AlphaHypaThiccBriccBottom;
                }
            case 11:
                return TextureListener.AlphaHypaThiccBriccGlue;
            default:
                return super.getTextureForSide(side, meta);}
    }
}
