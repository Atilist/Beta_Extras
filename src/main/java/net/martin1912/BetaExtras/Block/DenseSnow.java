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

    @Override
    public boolean canUse(Level level, int x, int y, int z, PlayerBase player) {
        if (((BlockStateView) level).getBlockState(x, y, z).get(DenseSnow.METASUBSTITUTE) < 2)
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.denseSnow.getDefaultState().with(DenseSnow.METASUBSTITUTE, ((BlockStateView) level).getBlockState(x, y, z).get(DenseSnow.METASUBSTITUTE) + 1));
        else
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.denseSnow.getDefaultState().with(DenseSnow.METASUBSTITUTE, 0));
        return true;
    }

    @Override
    public void appendProperties(StateManager.Builder<BlockBase, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(METASUBSTITUTE);
    }

    public static final IntProperty METASUBSTITUTE = IntProperty.of("metasubstitute", 0, 2);
}
