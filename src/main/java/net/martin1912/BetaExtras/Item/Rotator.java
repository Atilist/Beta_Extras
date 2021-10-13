package net.martin1912.BetaExtras.Item;

import net.martin1912.BetaExtras.Block.BlockListener;
import net.minecraft.block.BlockBase;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.item.ItemBase;
import net.minecraft.item.ItemInstance;
import net.minecraft.level.Level;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.item.TemplateItemBase;

public class Rotator extends TemplateItemBase {
    public Rotator(Identifier identifier) {
        super(identifier);
        this.maxStackSize = 1;
    }

    @Override
    public boolean useOnTile(ItemInstance item, PlayerBase player, Level level, int x, int y, int z, int facing) {
        int var8 = level.getTileId(x, y, z);
        int var9 = level.getTileMeta(x, y, z);
    if (var8 == BlockListener.thiccBriccs.id) {
        if (var9 > 4) {
            switch (var9) {
                case 5:
                    level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                    level.placeBlockWithMetaData(x, y, z, BlockListener.thiccBriccs.id, 6);
                    return true;
                case 6:
                    level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                    level.placeBlockWithMetaData(x, y, z, BlockListener.thiccBriccs.id, 9);
                    return true;
                case 7:
                    level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                    level.placeBlockWithMetaData(x, y, z, BlockListener.thiccBriccs.id, 8);
                    return true;
                case 8:
                    level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                    level.placeBlockWithMetaData(x, y, z, BlockListener.thiccBriccs.id, 11);
                    return true;
                case 9:
                    level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                    level.placeBlockWithMetaData(x, y, z, BlockListener.thiccBriccs.id, 10);
                    return true;
                case 10:
                    level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                    level.placeBlockWithMetaData(x, y, z, BlockListener.thiccBriccs.id, 5);
                    return true;
                case 11:
                    level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                    level.placeBlockWithMetaData(x, y, z, BlockListener.thiccBriccs.id, 12);
                    return true;
                case 12:
                    level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                    level.placeBlockWithMetaData(x, y, z, BlockListener.thiccBriccs.id, 7);
                    return true;
            }
        }
        else {
            return false;
        }
    }
        else if (var8 == BlockListener.alphaBriccs.id) {
            if (var9 > 5) {
                switch (var9) {
                    case 6:
                        level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                        level.placeBlockWithMetaData(x, y, z, BlockListener.alphaBriccs.id, 7);
                        return true;
                    case 7:
                        level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                        level.placeBlockWithMetaData(x, y, z, BlockListener.alphaBriccs.id, 10);
                        return true;
                    case 8:
                        level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                        level.placeBlockWithMetaData(x, y, z, BlockListener.alphaBriccs.id, 9);
                        return true;
                    case 9:
                        level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                        level.placeBlockWithMetaData(x, y, z, BlockListener.alphaBriccs.id, 12);
                        return true;
                    case 10:
                        level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                        level.placeBlockWithMetaData(x, y, z, BlockListener.alphaBriccs.id, 11);
                        return true;
                    case 11:
                        level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                        level.placeBlockWithMetaData(x, y, z, BlockListener.alphaBriccs.id, 6);
                        return true;
                    case 12:
                        level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                        level.placeBlockWithMetaData(x, y, z, BlockListener.alphaBriccs.id, 13);
                        return true;
                    case 13:
                        level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                        level.placeBlockWithMetaData(x, y, z, BlockListener.alphaBriccs.id, 8);
                        return true;
                }
            }
            else {
                return false;
            }
        }
    else if (var8 == BlockListener.oldBriccs.id) {
        if (var9 > 5) {
            switch (var9) {
                case 6:
                    level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                    level.placeBlockWithMetaData(x, y, z, BlockListener.oldBriccs.id, 7);
                    return true;
                case 7:
                    level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                    level.placeBlockWithMetaData(x, y, z, BlockListener.oldBriccs.id, 10);
                    return true;
                case 8:
                    level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                    level.placeBlockWithMetaData(x, y, z, BlockListener.oldBriccs.id, 9);
                    return true;
                case 9:
                    level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                    level.placeBlockWithMetaData(x, y, z, BlockListener.oldBriccs.id, 12);
                    return true;
                case 10:
                    level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                    level.placeBlockWithMetaData(x, y, z, BlockListener.oldBriccs.id, 11);
                    return true;
                case 11:
                    level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                    level.placeBlockWithMetaData(x, y, z, BlockListener.oldBriccs.id, 6);
                    return true;
                case 12:
                    level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                    level.placeBlockWithMetaData(x, y, z, BlockListener.oldBriccs.id, 13);
                    return true;
                case 13:
                    level.placeBlockWithMetaData(x, y ,z, BlockBase.BRICKS.id, 0);
                    level.placeBlockWithMetaData(x, y, z, BlockListener.oldBriccs.id, 8);
                    return true;
            }
        }
        else {
            return false;
        }
    }
    else if (var8 == BlockListener.uncoloredTerracotta.id) {
        switch (var9) {
            case 0:
            case 1:
                return false;
            case 2:
                level.placeBlockWithMetaData(x, y, z, BlockListener.uncoloredTerracotta.id, 3);
                return true;
            case 3:
                level.placeBlockWithMetaData(x, y, z, BlockListener.uncoloredTerracotta.id, 4);
                return true;
            case 4:
                level.placeBlockWithMetaData(x, y, z, BlockListener.uncoloredTerracotta.id, 5);
                return true;
            case 5:
                level.placeBlockWithMetaData(x, y, z, BlockListener.uncoloredTerracotta.id, 2);
                return true;
            case 6:
                level.placeBlockWithMetaData(x, y, z, BlockListener.uncoloredTerracotta.id, 7);
                return true;
            case 7:
                level.placeBlockWithMetaData(x, y, z, BlockListener.uncoloredTerracotta.id, 8);
                return true;
            case 8:
                level.placeBlockWithMetaData(x, y, z, BlockListener.uncoloredTerracotta.id, 9);
                return true;
            case 9:
                level.placeBlockWithMetaData(x, y, z, BlockListener.uncoloredTerracotta.id, 6);
                return true;
        }
    }
    return false;
    }
}
