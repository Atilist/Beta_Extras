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
public class ColouredPlanks extends TemplateBlockBase {

    public ColouredPlanks(Identifier identifier, Material material) {
        super(identifier, material);
        setSounds(WOOD.sounds);
    }

    @Override
    public ColouredPlanks setHardness(float Hardness) {
        return (ColouredPlanks) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0: {
                return TextureListener.WhitePlanks;
            }
            case 1: {
                return TextureListener.OrangePlanks;
            }
            case 2: {
                return TextureListener.MagentaPlanks;
            }
            case 3: {
                return TextureListener.LightbluePlanks;
            }
            case 4: {
                return TextureListener.YellowPlanks;
            }
            case 5: {
                return TextureListener.LimePlanks;
            }
            case 6: {
                return TextureListener.PinkPlanks;
            }
            case 7: {
                return TextureListener.GrayPlanks;
            }
            case 8: {
                return TextureListener.LightgrayPlanks;
            }
            case 9: {
                return TextureListener.CyanPlanks;
            }
            case 10: {
                return TextureListener.PurplePlanks;
            }
            case 11: {
                return TextureListener.BluePlanks;
            }
            case 12: {
                return TextureListener.BrownPlanks;
            }
            case 13: {
                return TextureListener.GreenPlanks;
            }
            case 14: {
                return TextureListener.RedPlanks;
            }
            case 15: {
                return TextureListener.BlackPlanks;
            }
            default:
                return super.getTextureForSide(side, meta);}

    }

    @Override
    public boolean canUse(Level level, int x, int y, int z, PlayerBase player) {
        if (((BlockStateView) level).getBlockState(x, y, z).get(ColouredPlanks.METASUBSTITUTE) < 15)
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.colouredPlanks.getDefaultState().with(ColouredPlanks.METASUBSTITUTE, ((BlockStateView) level).getBlockState(x, y, z).get(ColouredPlanks.METASUBSTITUTE) + 1));
        else
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.colouredPlanks.getDefaultState().with(ColouredPlanks.METASUBSTITUTE, 0));
        return true;
    }

    @Override
    public void appendProperties(StateManager.Builder<BlockBase, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(METASUBSTITUTE);
    }

    public static final IntProperty METASUBSTITUTE = IntProperty.of("metasubstitute", 0, 15);
}
