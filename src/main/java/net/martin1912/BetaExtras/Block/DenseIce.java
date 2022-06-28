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

    @Override
    public boolean canUse(Level level, int x, int y, int z, PlayerBase player) {
        if (((BlockStateView) level).getBlockState(x, y, z).get(DenseIce.METASUBSTITUTE) < 5)
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.denseIce.getDefaultState().with(DenseIce.METASUBSTITUTE, ((BlockStateView) level).getBlockState(x, y, z).get(DenseIce.METASUBSTITUTE) + 1));
        else
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.denseIce.getDefaultState().with(DenseIce.METASUBSTITUTE, 0));
        return true;
    }

    @Override
    public void appendProperties(StateManager.Builder<BlockBase, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(METASUBSTITUTE);
    }

    public static final IntProperty METASUBSTITUTE = IntProperty.of("metasubstitute", 0, 5);
}
