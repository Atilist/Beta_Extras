package net.martin1912.BetaExtras.Item;

import net.martin1912.BetaExtras.Block.BlockListener;
import net.minecraft.block.BlockBase;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.item.ItemBase;
import net.minecraft.item.ItemInstance;
import net.minecraft.level.Level;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.item.TemplateItemBase;

public class MushroomFertilizer extends TemplateItemBase {


    public MushroomFertilizer(Identifier identifier) {
        super(identifier);
    }

    @Override
    public boolean useOnTile(ItemInstance item, PlayerBase player, Level level, int x, int y, int z, int facing) {
        int var8 = level.getTileId(x, y, z);
        int var9 = level.getTileMeta(x, y, z);
        if (var8 == BlockListener.bigRedMushroom.id) {
            switch (var9) {
                case 0:
                    --item.count;
                    level.placeBlockWithMetaData(x, y, z, BlockListener.bigRedMushroom.id, 1);
                    return true;
                case 1:
                    --item.count;
                    level.placeBlockWithMetaData(x, y, z, BlockListener.bigRedMushroom.id, 2);
                    return true;
            }
        }
        if (var8 == BlockListener.bigBrownMushroom.id) {
            switch (var9) {
                case 0:
                    --item.count;
                    level.placeBlockWithMetaData(x, y, z, BlockListener.bigBrownMushroom.id, 1);
                    return true;
                case 1:
                    --item.count;
                    level.placeBlockWithMetaData(x, y, z, BlockListener.bigBrownMushroom.id, 2);
                    return true;
            }
        }
        if (var8 == BlockBase.BROWN_MUSHROOM.id) {
            --item.count;
            level.placeBlockWithMetaData(x, y, z, BlockListener.bigBrownMushroom.id, 0);
            return true;
        }
        if (var8 == BlockBase.RED_MUSHROOM.id) {
            --item.count;
            level.placeBlockWithMetaData(x, y, z, BlockListener.bigRedMushroom.id, 0);
            return true;
        }
        return false;
    }
}
