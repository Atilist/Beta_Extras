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
public class ColouredThiccBriccs extends TemplateBlockBase {

    public ColouredThiccBriccs(Identifier identifier, Material material) {
        super(identifier, material);
    }

    @Override
    public ColouredThiccBriccs setHardness(float Hardness) {
        return (ColouredThiccBriccs) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0: {
                return TextureListener.WhiteThiccBriccs;
            }
            case 1: {
                return TextureListener.OrangeThiccBriccs;
            }
            case 2: {
                return TextureListener.MagentaThiccBriccs;
            }
            case 3: {
                return TextureListener.LightblueThiccBriccs;
            }
            case 4: {
                return TextureListener.YellowThiccBriccs;
            }
            case 5: {
                return TextureListener.LimeThiccBriccs;
            }
            case 6: {
                return TextureListener.PinkThiccBriccs;
            }
            case 7: {
                return TextureListener.GrayThiccBriccs;
            }
            case 8: {
                return TextureListener.LightgrayThiccBriccs;
            }
            case 9: {
                return TextureListener.CyanThiccBriccs;
            }
            case 10: {
                return TextureListener.PurpleThiccBriccs;
            }
            case 11: {
                return TextureListener.BlueThiccBriccs;
            }
            case 12: {
                return TextureListener.BrownThiccBriccs;
            }
            case 13: {
                return TextureListener.GreenThiccBriccs;
            }
            case 14: {
                return TextureListener.RedThiccBriccs;
            }
            case 15: {
                return TextureListener.BlackThiccBriccs;
            }
            default:
                return super.getTextureForSide(side, meta);}
    }
    @Override
    public boolean canUse(Level level, int x, int y, int z, PlayerBase player) {
        if (((BlockStateView) level).getBlockState(x, y, z).get(ColouredThiccBriccs.METASUBSTITUTE) < 15)
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.colouredThiccBriccs.getDefaultState().with(ColouredThiccBriccs.METASUBSTITUTE, ((BlockStateView) level).getBlockState(x, y, z).get(ColouredThiccBriccs.METASUBSTITUTE) + 1));
        else
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.colouredThiccBriccs.getDefaultState().with(ColouredThiccBriccs.METASUBSTITUTE, 0));
        return true;
    }

    @Override
    public void appendProperties(StateManager.Builder<BlockBase, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(METASUBSTITUTE);
    }

    public static final IntProperty METASUBSTITUTE = IntProperty.of("metasubstitute", 0, 15);
}
