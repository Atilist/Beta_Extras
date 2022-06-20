package net.martin1912.BetaExtras.Block;

import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.level.Level;
import net.modificationstation.stationapi.api.block.BlockState;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.level.BlockStateView;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.state.StateManager;
import net.modificationstation.stationapi.api.state.property.IntProperty;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

@HasMetaNamedBlockItem
public class AlphaBriccs extends TemplateBlockBase {

    public AlphaBriccs(Identifier identifier, Material material) {
        super(identifier, material);
    }

    public AlphaBriccs setHardness(float Hardness) {
        return (AlphaBriccs) super.setHardness(Hardness);
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
                return TextureListener.AlphaBricks;
            }
            case 1: {
                return TextureListener.AlphaThiccBriccs;
            }
            case 2: {
                return TextureListener.AlphaCutSupahThiccBricc;
            }
            case 3: {
                return TextureListener.AlphaSupahThiccBricc;
            }
            case 4: {
                return TextureListener.AlphaSmolBriccs;
            }
            case 5: {
                return TextureListener.AlphaThinnBriccs;
            }
            case 6: {
                switch (side){
                    case 0:
                        return TextureListener.YesAlphaThiccBricc;
                    case 1:
                        return TextureListener.YesAlphaThiccBricc;
                    case 2:
                        return TextureListener.AlphaThiccBriccs;
                    case 3:
                        return TextureListener.AlphaBricks;
                    case 4:
                        return TextureListener.AlphaLeftThiccBricc;
                    case 5:
                        return TextureListener.AlphaRightThiccBricc;
                }
            }
            case 7: {
                switch (side){
                    case 0:
                        return TextureListener.AlphaRightThiccBricc;
                    case 1:
                        return TextureListener.AlphaRightThiccBricc;
                    case 2:
                        return TextureListener.AlphaLeftThiccBricc;
                    case 3:
                        return TextureListener.AlphaRightThiccBricc;
                    case 4:
                        return TextureListener.AlphaBricks;
                    case 5:
                        return TextureListener.AlphaThiccBriccs;
                }
            }
            case 8: {
                switch (side){
                    case 0:
                        return TextureListener.YesAlphaSupahThiccBricc;
                    case 1:
                        return TextureListener.YesAlphaSupahThiccBricc;
                    case 2:
                        return TextureListener.AlphaSupahThiccBricc;
                    case 3:
                        return TextureListener.AlphaThiccBriccs;
                    case 4:
                        return TextureListener.AlphaLeftSupahThiccBricc;
                    case 5:
                        return TextureListener.AlphaRightSupahThiccBricc;
                }
            }
            case 9: {
                switch (side){
                    case 0:
                        return TextureListener.AlphaRightSupahThiccBricc;
                    case 1:
                        return TextureListener.AlphaRightSupahThiccBricc;
                    case 2:
                        return TextureListener.AlphaLeftSupahThiccBricc;
                    case 3:
                        return TextureListener.AlphaRightSupahThiccBricc;
                    case 4:
                        return TextureListener.AlphaThiccBriccs;
                    case 5:
                        return TextureListener.AlphaSupahThiccBricc;
                }
            }
            case 10:
                switch (side){
                    case 0:
                        return TextureListener.NoAlphaThiccBricc;
                    case 1:
                        return TextureListener.NoAlphaThiccBricc;
                    case 2:
                        return TextureListener.AlphaBricks;
                    case 3:
                        return TextureListener.AlphaThiccBriccs;
                    case 4:
                        return TextureListener.AlphaRightThiccBricc;
                    case 5:
                        return TextureListener.AlphaLeftThiccBricc;
                }
            case 11:
                switch (side){
                    case 0:
                        return TextureListener.AlphaLeftThiccBricc;
                    case 1:
                        return TextureListener.AlphaLeftThiccBricc;
                    case 2:
                        return TextureListener.AlphaRightThiccBricc;
                    case 3:
                        return TextureListener.AlphaLeftThiccBricc;
                    case 4:
                        return TextureListener.AlphaThiccBriccs;
                    case 5:
                        return TextureListener.AlphaBricks;
                }
            case 12:
                switch (side){
                    case 0:
                        return TextureListener.NoAlphaSupahThiccBricc;
                    case 1:
                        return TextureListener.NoAlphaSupahThiccBricc;
                    case 2:
                        return TextureListener.AlphaThiccBriccs;
                    case 3:
                        return TextureListener.AlphaSupahThiccBricc;
                    case 4:
                        return TextureListener.AlphaRightSupahThiccBricc;
                    case 5:
                        return TextureListener.AlphaLeftSupahThiccBricc;
                }
            case 13:
                switch (side){
                    case 0:
                        return TextureListener.AlphaLeftSupahThiccBricc;
                    case 1:
                        return TextureListener.AlphaLeftSupahThiccBricc;
                    case 2:
                        return TextureListener.AlphaRightSupahThiccBricc;
                    case 3:
                        return TextureListener.AlphaLeftSupahThiccBricc;
                    case 4:
                        return TextureListener.AlphaSupahThiccBricc;
                    case 5:
                        return TextureListener.AlphaThiccBriccs;
                }
            default:
                return super.getTextureForSide(side, meta);}
    }

    @Override
    public boolean canUse(Level level, int x, int y, int z, PlayerBase player) {
        if (((BlockStateView) level).getBlockState(x, y, z).get(AlphaBriccs.METASUBSTITUTE) < 13)
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.alphaBriccs.getDefaultState().with(AlphaBriccs.METASUBSTITUTE, ((BlockStateView) level).getBlockState(x, y, z).get(AlphaBriccs.METASUBSTITUTE) + 1));
        else
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.alphaBriccs.getDefaultState().with(AlphaBriccs.METASUBSTITUTE, 0));
        return true;
    }

    @Override
    public void appendProperties(StateManager.Builder<BlockBase, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(METASUBSTITUTE);
    }

    public static final IntProperty METASUBSTITUTE = IntProperty.of("metasubstitute", 0, 13);
}
