package net.martin1912.BetaExtras.Block;

import net.martin1912.BetaExtras.Item.ItemListener;
import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.level.Level;
import net.modificationstation.stationapi.api.block.BlockState;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.level.BlockStateView;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.state.StateManager;
import net.modificationstation.stationapi.api.state.property.IntProperty;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

import java.util.Random;

@HasMetaNamedBlockItem
public class AlphiumOre extends TemplateBlockBase {

    public AlphiumOre(Identifier identifier, Material material) {
        super(identifier, material);
    }

    @Override
    public AlphiumOre setHardness(float Hardness) {
        return (AlphiumOre) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0: {
                return TextureListener.AlphiumOre;
            }
            case 1: {
                return TextureListener.AlphiumBlock;
            }
            default:
                return super.getTextureForSide(side, meta);
        }
    }

    @Override
    public boolean canUse(Level level, int x, int y, int z, PlayerBase player) {
        if (((BlockStateView) level).getBlockState(x, y, z).get(AlphiumOre.METASUBSTITUTE) < 1)
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.alphiumOre.getDefaultState().with(AlphiumOre.METASUBSTITUTE, ((BlockStateView) level).getBlockState(x, y, z).get(AlphiumOre.METASUBSTITUTE) + 1));
        else
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.alphiumOre.getDefaultState().with(AlphiumOre.METASUBSTITUTE, 0));
        return true;
    }

    @Override
    public void appendProperties(StateManager.Builder<BlockBase, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(METASUBSTITUTE);
    }

    public static final IntProperty METASUBSTITUTE = IntProperty.of("metasubstitute", 0, 1);
}