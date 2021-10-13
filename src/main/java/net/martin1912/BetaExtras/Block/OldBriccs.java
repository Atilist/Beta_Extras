package net.martin1912.BetaExtras.Block;

import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

@HasMetaNamedBlockItem
public class OldBriccs extends TemplateBlockBase {

    public OldBriccs(Identifier identifier, Material material) {
        super(identifier, material);
    }

    public OldBriccs setHardness(float Hardness) {
        return (OldBriccs) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        if(i <= 5) {
            return i;
        }
        else {
            switch (i) {
                case 6:
                case 7:
                case 10:
                case 11:
                    return 6;
                case 8:
                case 9:
                case 12:
                case 13:
                    return 8;
            }
        }
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0: {
                return TextureListener.OldBricks;
            }
            case 1: {
                return TextureListener.OldThiccBriccs;
            }
            case 2: {
                return TextureListener.OldCutSupahThiccBricc;
            }
            case 3: {
                return TextureListener.OldSupahThiccBricc;
            }
            case 4: {
                return TextureListener.OldSmolBriccs;
            }
            case 5: {
                return TextureListener.OldThinnBriccs;
            }
            case 6: {
                switch (side){
                    case 0:
                        return TextureListener.YesOldThiccBricc;
                    case 1:
                        return TextureListener.YesOldThiccBricc;
                    case 2:
                        return TextureListener.OldThiccBriccs;
                    case 3:
                        return TextureListener.OldBricks;
                    case 4:
                        return TextureListener.OldLeftThiccBricc;
                    case 5:
                        return TextureListener.OldRightThiccBricc;
                }
            }
            case 7: {
                switch (side){
                    case 0:
                        return TextureListener.OldRightThiccBricc;
                    case 1:
                        return TextureListener.OldRightThiccBricc;
                    case 2:
                        return TextureListener.OldLeftThiccBricc;
                    case 3:
                        return TextureListener.OldRightThiccBricc;
                    case 4:
                        return TextureListener.OldBricks;
                    case 5:
                        return TextureListener.OldThiccBriccs;
                }
            }
            case 8: {
                switch (side){
                    case 0:
                        return TextureListener.YesOldSupahThiccBricc;
                    case 1:
                        return TextureListener.YesOldSupahThiccBricc;
                    case 2:
                        return TextureListener.OldSupahThiccBricc;
                    case 3:
                        return TextureListener.OldThiccBriccs;
                    case 4:
                        return TextureListener.OldLeftSupahThiccBricc;
                    case 5:
                        return TextureListener.OldRightSupahThiccBricc;
                }
            }
            case 9: {
                switch (side){
                    case 0:
                        return TextureListener.OldRightSupahThiccBricc;
                    case 1:
                        return TextureListener.OldRightSupahThiccBricc;
                    case 2:
                        return TextureListener.OldLeftSupahThiccBricc;
                    case 3:
                        return TextureListener.OldRightSupahThiccBricc;
                    case 4:
                        return TextureListener.OldThiccBriccs;
                    case 5:
                        return TextureListener.OldSupahThiccBricc;
                }
            }
            case 10:
                switch (side){
                    case 0:
                        return TextureListener.NoOldThiccBricc;
                    case 1:
                        return TextureListener.NoOldThiccBricc;
                    case 2:
                        return TextureListener.OldBricks;
                    case 3:
                        return TextureListener.OldThiccBriccs;
                    case 4:
                        return TextureListener.OldRightThiccBricc;
                    case 5:
                        return TextureListener.OldLeftThiccBricc;
                }
            case 11:
                switch (side){
                    case 0:
                        return TextureListener.OldLeftThiccBricc;
                    case 1:
                        return TextureListener.OldLeftThiccBricc;
                    case 2:
                        return TextureListener.OldRightThiccBricc;
                    case 3:
                        return TextureListener.OldLeftThiccBricc;
                    case 4:
                        return TextureListener.OldThiccBriccs;
                    case 5:
                        return TextureListener.OldBricks;
                }
            case 12:
                switch (side){
                    case 0:
                        return TextureListener.NoOldSupahThiccBricc;
                    case 1:
                        return TextureListener.NoOldSupahThiccBricc;
                    case 2:
                        return TextureListener.OldThiccBriccs;
                    case 3:
                        return TextureListener.OldSupahThiccBricc;
                    case 4:
                        return TextureListener.OldRightSupahThiccBricc;
                    case 5:
                        return TextureListener.OldLeftSupahThiccBricc;
                }
            case 13:
                switch (side){
                    case 0:
                        return TextureListener.OldLeftSupahThiccBricc;
                    case 1:
                        return TextureListener.OldLeftSupahThiccBricc;
                    case 2:
                        return TextureListener.OldRightSupahThiccBricc;
                    case 3:
                        return TextureListener.OldLeftSupahThiccBricc;
                    case 4:
                        return TextureListener.OldSupahThiccBricc;
                    case 5:
                        return TextureListener.OldThiccBriccs;
                }
            default:
                return super.getTextureForSide(side, meta);}
    }
}
