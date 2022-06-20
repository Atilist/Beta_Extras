package net.martin1912.BetaExtras.Item;

import net.martin1912.BetaExtras.Block.BlockListener;
import net.minecraft.entity.player.PlayerBase;

import net.minecraft.item.ItemInstance;
import net.minecraft.level.Level;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.item.TemplateItemBase;

public class DyeRemover extends TemplateItemBase {


    public DyeRemover(Identifier identifier) {
        super(identifier);
        this.maxStackSize = 1;
    }

    @Override
    public boolean useOnTile(ItemInstance item, PlayerBase player, Level level, int x, int y, int z, int facing) {
        int var8 = level.getTileId(x, y, z);
        int[] brickToUse = BlockListener.colouredToNonColoured.get(var8);
        if (brickToUse == null) {
            return true;
        }
        level.placeBlockWithMetaData(x, y, z, brickToUse[0], brickToUse[1]);
        return true;
    }
}
