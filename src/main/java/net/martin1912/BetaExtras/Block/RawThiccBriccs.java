package net.martin1912.BetaExtras.Block;

import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

@HasMetaNamedBlockItem
public class RawThiccBriccs extends TemplateBlockBase {

    public RawThiccBriccs(Identifier identifier, Material material) {
        super(identifier, material);
        setSounds(CLAY.sounds);
    }

    @Override
    public RawThiccBriccs setHardness(float Hardness) { return (RawThiccBriccs) super.setHardness(Hardness); }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0:
                return TextureListener.RawSmolBriccs;
            case 1:
                return TextureListener.RawCutSupahThiccBricc;
            case 2:
                return TextureListener.RawSupahThiccBricc;
            case 3:
                switch (side) {
                    case 0:
                        return TextureListener.RawHypaThiccBriccMiddle;
                    case 1:
                        return TextureListener.RawHypaThiccBriccTopTop;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return TextureListener.RawHypaThiccBriccTop;
                }
            case 4:
                return TextureListener.RawHypaThiccBriccMiddle;
            case 5:
                switch (side) {
                    case 0:
                        return TextureListener.RawHypaThiccBriccBottomBottom;
                    case 1:
                        return TextureListener.RawHypaThiccBriccMiddle;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return TextureListener.RawHypaThiccBriccBottom;
                }
            case 6:
                return TextureListener.RawHypaThiccBriccGlue;
            default:
                return super.getTextureForSide(side, meta);}
        }
}