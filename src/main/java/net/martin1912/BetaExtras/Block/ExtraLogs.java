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
public class ExtraLogs extends TemplateBlockBase {

    public ExtraLogs(Identifier identifier, Material material) {
        super(identifier, material);
        setSounds(WOOD.sounds);
    }

    @Override
    public ExtraLogs setHardness(float Hardness) {
        return (ExtraLogs) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0:
                switch (side){
                    case 0:
                    case 1:
                        return TextureListener.SwampLogTopBottom;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return TextureListener.SwampLogSide;
                }
            case 1:
                switch (side){
                    case 0:
                    case 1:
                        return TextureListener.SkyWoodTop;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return TextureListener.SkyWood;
            }
            default:
                return super.getTextureForSide(side, meta);}
    }

    @Override
    public void afterBreak(Level level, PlayerBase playerBase, int x, int y, int z, int meta) {
        switch (meta) {
            case 0:
                Item item = new Item(level, x + 0.5, y + 0.5, z + 0.5, new ItemInstance(BlockListener.extraLogs, 1, 0));
                item.pickupDelay = 10;
                level.spawnEntity(item);
                for (int xWidth = -4; xWidth <= 4; xWidth++) {
                    for (int height = -10; height <= 10; height++) {
                        for (int zWidth = -4; zWidth <= 4; zWidth++) {
                            int leafCheck = level.getTileId(x + xWidth, y + height, z + zWidth);
                            int leafCheck0 = level.getTileMeta(x + xWidth, y + height, z + zWidth);
                            if (leafCheck == BlockListener.extraLeaves.id && leafCheck0 == 0) {
                                level.placeBlockWithMetaData(x + xWidth, y + height, z + zWidth, BlockListener.extraLeaves.id, 8);
                            }
                        }
                    }
                }
                break;
            case 1:
                for (int xWidth = -8; xWidth <= 8; xWidth++) {
                    for (int height = -40; height <= 40; height++) {
                        for (int zWidth = -8; zWidth <= 8; zWidth++) {
                            int leafCheck = level.getTileId(x + xWidth, y + height, z + zWidth);
                            int leafCheck0 = level.getTileMeta(x + xWidth, y + height, z + zWidth);
                            if (leafCheck == BlockListener.extraLeaves.id && leafCheck0 == 1) {
                                level.placeBlockWithMetaData(x + xWidth, y + height, z + zWidth, BlockListener.extraLeaves.id, 9);
                            }
                        }
                    }
                }
                item = new Item(level, x + 0.5, y + 0.5, z + 0.5, new ItemInstance(BlockListener.extraLogs, 1, 1));
                item.pickupDelay = 10;
                level.spawnEntity(item);
                break;
        }
    }

    @Override
    public boolean canUse(Level level, int x, int y, int z, PlayerBase player) {
        if (((BlockStateView) level).getBlockState(x, y, z).get(ExtraLogs.METASUBSTITUTE) < 1)
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.extraLogs.getDefaultState().with(ExtraLogs.METASUBSTITUTE, ((BlockStateView) level).getBlockState(x, y, z).get(ExtraLogs.METASUBSTITUTE) + 1));
        else
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.extraLogs.getDefaultState().with(ExtraLogs.METASUBSTITUTE, 0));
        return true;
    }

    @Override
    public void appendProperties(StateManager.Builder<BlockBase, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(METASUBSTITUTE);
    }

    public static final IntProperty METASUBSTITUTE = IntProperty.of("metasubstitute", 0, 1);
}
