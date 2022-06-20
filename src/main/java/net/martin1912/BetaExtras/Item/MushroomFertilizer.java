package net.martin1912.BetaExtras.Item;

import net.martin1912.BetaExtras.Block.BigBrownMushroom;
import net.martin1912.BetaExtras.Block.BigRedMushroom;
import net.martin1912.BetaExtras.Block.BlockListener;
import net.minecraft.block.BlockBase;
import net.minecraft.client.level.ClientLevel;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.item.ItemBase;
import net.minecraft.item.ItemInstance;
import net.minecraft.level.Level;
import net.modificationstation.stationapi.api.level.BlockStateView;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.item.TemplateItemBase;

public class MushroomFertilizer extends TemplateItemBase {


    public MushroomFertilizer(Identifier identifier) {
        super(identifier);
    }

    @Override
    public boolean useOnTile(ItemInstance item, PlayerBase player, Level level, int x, int y, int z, int facing) {
        int idCheck = level.getTileId(x, y, z);
        if (idCheck == BlockListener.bigRedMushroom.id) {
            switch (((BlockStateView) level).getBlockState(x, y, z).get(BigRedMushroom.SIZE)) {
                case 0 -> {
                    --item.count;
                    ((BlockStateView) level).setBlockState(x, y, z, BlockListener.bigRedMushroom.getDefaultState().with(BigBrownMushroom.SIZE, 1));
                    return true;
                }
                case 1 -> {
                    --item.count;
                    ((BlockStateView) level).setBlockState(x, y, z, BlockListener.bigRedMushroom.getDefaultState().with(BigBrownMushroom.SIZE, 2));
                    return true;
                }
            }
        }
        if (idCheck == BlockListener.bigBrownMushroom.id) {
            switch (((BlockStateView) level).getBlockState(x, y, z).get(BigBrownMushroom.SIZE)) {
                case 0 -> {
                    --item.count;
                    ((BlockStateView) level).setBlockState(x, y, z, BlockListener.bigBrownMushroom.getDefaultState().with(BigBrownMushroom.SIZE, 1));
                    return true;
                }
                case 1 -> {
                    --item.count;
                    ((BlockStateView) level).setBlockState(x, y, z, BlockListener.bigBrownMushroom.getDefaultState().with(BigBrownMushroom.SIZE, 2));
                    return true;
                }
            }
        }
        if (idCheck == BlockBase.BROWN_MUSHROOM.id) {
            --item.count;
            level.setTile(x, y, z, BlockListener.bigBrownMushroom.id);
            return true;
        }
        if (idCheck == BlockBase.RED_MUSHROOM.id) {
            --item.count;
            level.setTile(x, y, z, BlockListener.bigRedMushroom.id);
            return true;
        }
        return false;
    }
}
