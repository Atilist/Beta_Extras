package net.martin1912.BetaExtras.Block;

import net.martin1912.BetaExtras.Item.ItemListener;
import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Item;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.item.ItemInstance;
import net.minecraft.level.Level;
import net.modificationstation.stationapi.api.block.BlockState;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.level.BlockStateView;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.state.StateManager;
import net.modificationstation.stationapi.api.state.property.IntProperty;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

@HasMetaNamedBlockItem
public class RedSandstone extends TemplateBlockBase {

    public RedSandstone(Identifier identifier, Material material) {
        super(identifier, material);
    }

    @Override
    public RedSandstone setHardness(float Hardness) { return (RedSandstone) super.setHardness(Hardness); }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0:
                return TextureListener.RedSandstoneSmooth;
            case 1:
                switch (side) {
                    case 0:
                        return TextureListener.RedSandstoneRough;
                    case 1:
                        return TextureListener.RedSandstoneSmooth;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return TextureListener.RedSandstoneSide;
                }
            case 2:
                return TextureListener.RedSandstoneRough;
            case 3:
                switch (side) {
                    case 0:
                        return TextureListener.RedSandstoneStacksBottom;
                    case 1:
                        return TextureListener.RedSandstoneSmooth;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return TextureListener.RedSandstoneStacks;
                }
            case 4:
                switch (side) {
                    case 0:
                    case 1:
                        return TextureListener.RedSandstoneSmooth;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return TextureListener.RedSandstoneCut;
                }
            case 5:
                switch (side) {
                    case 0:
                    case 1:
                        return TextureListener.RedSandstoneSmooth;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return TextureListener.RedSandstoneCarved;
                }
            default:
                return super.getTextureForSide(side, meta);
        }
    }

    @Override
    public void onAdjacentBlockUpdate(Level level, int x, int y, int z, int id) {
        int meta = level.getTileMeta(x, y, z);
        int blockBelow = level.getTileId(x, y - 1, z);
        int metaBelow = level.getTileMeta(x, y - 1, z);
        if (meta == 6 && blockBelow == BlockListener.unbreakableSkyBricks.id && metaBelow == 1) {
            level.placeBlockWithMetaData(x, y, z, BlockListener.redSandstone.id, 7);
            level.spawnEntity(new Item(level, x, y + 2, z, new ItemInstance(ItemListener.skyKey)));
        }
    }

    @Override
    public boolean canUse(Level level, int x, int y, int z, PlayerBase player) {
        if (((BlockStateView) level).getBlockState(x, y, z).get(RedSandstone.METASUBSTITUTE) < 5)
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.redSandstone.getDefaultState().with(RedSandstone.METASUBSTITUTE, ((BlockStateView) level).getBlockState(x, y, z).get(RedSandstone.METASUBSTITUTE) + 1));
        else
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.redSandstone.getDefaultState().with(RedSandstone.METASUBSTITUTE, 0));
        return true;
    }

    @Override
    public void appendProperties(StateManager.Builder<BlockBase, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(METASUBSTITUTE);
    }

    public static final IntProperty METASUBSTITUTE = IntProperty.of("metasubstitute", 0, 5);
}
