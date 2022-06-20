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
public class ColouredBricks extends TemplateBlockBase {

    public ColouredBricks(Identifier identifier, Material material) {
        super(identifier, material);
    }

    @Override
    public ColouredBricks setHardness(float Hardness) {
        return (ColouredBricks) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public boolean canUse(Level level, int x, int y, int z, PlayerBase player) {
        if (((BlockStateView) level).getBlockState(x, y, z).get(ColouredBricks.METASUBSTITUTE) < 15)
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.colouredBricks.getDefaultState().with(ColouredBricks.METASUBSTITUTE, ((BlockStateView) level).getBlockState(x, y, z).get(ColouredBricks.METASUBSTITUTE) + 1));
        else
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.colouredBricks.getDefaultState().with(ColouredBricks.METASUBSTITUTE, 0));
        return true;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0: {
                return TextureListener.WhiteBricks;
            }
            case 1: {
                return TextureListener.OrangeBricks;
            }
            case 2: {
                return TextureListener.MagentaBricks;
            }
            case 3: {
                return TextureListener.LightblueBricks;
            }
            case 4: {
                return TextureListener.YellowBricks;
            }
            case 5: {
                return TextureListener.LimeBricks;
            }
            case 6: {
                return TextureListener.PinkBricks;
            }
            case 7: {
                return TextureListener.GrayBricks;
            }
            case 8: {
                return TextureListener.LightgrayBricks;
            }
            case 9: {
                return TextureListener.CyanBricks;
            }
            case 10: {
                return TextureListener.PurpleBricks;
            }
            case 11: {
                return TextureListener.BlueBricks;
            }
            case 12: {
                return TextureListener.BrownBricks;
            }
            case 13: {
                return TextureListener.GreenBricks;
            }
            case 14: {
                return TextureListener.RedBricks;
            }
            case 15: {
                return TextureListener.BlackBricks;
            }
            default:
                return super.getTextureForSide(side, meta);}
    }

    @Override
    public void appendProperties(StateManager.Builder<BlockBase, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(METASUBSTITUTE);
    }

    public static final IntProperty METASUBSTITUTE = IntProperty.of("metasubstitute", 0, 15);
}
