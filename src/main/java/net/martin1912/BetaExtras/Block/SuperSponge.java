package net.martin1912.BetaExtras.Block;

import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityBase;
import net.minecraft.entity.Item;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.item.ItemBase;
import net.minecraft.item.ItemInstance;
import net.minecraft.level.Level;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

import java.util.Random;

@HasMetaNamedBlockItem
public class SuperSponge extends TemplateBlockBase {

    public SuperSponge(Identifier identifier, Material material) {
        super(identifier, material);
        setSounds(LEAVES.sounds);
    }

    @Override
    public void onAdjacentBlockUpdate(Level level, int x, int y, int z, int id) {
        if (level.getTileMeta(x, y, z) == 0 && level.hasRedstonePower(x, y, z)) {
            drainWater(level, x, y, z);
        }
    }

    private void drainWater(Level level, int x, int y, int z) {
        boolean hasWaterNearby = false;
        for (int xOffset = -1; xOffset <= 1; xOffset++)
            for (int yOffset = -1; yOffset <= 1; yOffset++)
                for (int zOffset = -1; zOffset <= 1; zOffset++)
                    if (level.getTileId(x + xOffset, y + yOffset, z + zOffset) == BlockBase.FLOWING_WATER.id || level.getTileId(x + xOffset, y + yOffset, z + zOffset) == BlockBase.STILL_WATER.id)
                        hasWaterNearby = true;

        if (hasWaterNearby) {
            for (int xOffset = -2; xOffset <= 2; xOffset++)
                for (int yOffset = -2; yOffset <= 2; yOffset++)
                    for (int zOffset = -2; zOffset <= 2; zOffset++)
                        if (level.getTileId(x + xOffset, y + yOffset, z + zOffset) == BlockBase.FLOWING_WATER.id || level.getTileId(x + xOffset, y + yOffset, z + zOffset) == BlockBase.STILL_WATER.id)
                            level.setTile(x + xOffset, y + yOffset, z + zOffset, 0);
            level.placeBlockWithMetaData(x, y, z, BlockListener.superSponge.id, 1);
        }
    }

    @Override
    public SuperSponge setHardness(float Hardness) {
        return (SuperSponge) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0: {
                return TextureListener.DrySuperSponge;
            }
            case 1: {
                return TextureListener.WetSuperSponge;
            }
            default:
                return super.getTextureForSide(side, meta);}
    }

    @Override
    public boolean canUse(Level level, int x, int y, int z, PlayerBase player) {
        if (level.getTileMeta(x, y, z) == 0) {
            drainWater(level, x, y, z);
            return true;
        }
        return false;
    }
}
