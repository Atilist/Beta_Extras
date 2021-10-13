package net.martin1912.BetaExtras.Block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.level.Level;
import net.minecraft.level.TileView;
import net.minecraft.util.maths.Box;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

import java.util.Random;

@HasMetaNamedBlockItem
public class DynamicBasalt extends TemplateBlockBase {
    public DynamicBasalt(Identifier identifier, Material material) {
        super(identifier, material);
        this.setTicksRandomly(true);
    }

    @Override
    public DynamicBasalt setHardness(float Hardness) {
        return (DynamicBasalt) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        return TextureListener.HotRoughBasalt;
    }

    @Override
    public void onScheduledTick(Level level, int x, int y, int z, Random rand) {
        int belowMeta = level.getTileMeta(x, y - 1, z);
        if (level.getTileId(x, y - 1, z) == 0) {
            level.placeBlockWithMetaData(x, y - 1, z, BlockListener.dynamicBasalt.id, level.getTileMeta(x, y, z));
            level.setTile(x, y, z, 0);
        } else if (level.getTileId(x, y - 1, z) == BlockListener.dynamicBasalt.id && belowMeta != 15) {
            int selfMeta = level.getTileMeta(x, y, z);
            int metaResult = selfMeta + belowMeta;
            if (metaResult < 15) {
                level.placeBlockWithMetaData(x, y - 1, z, BlockListener.dynamicBasalt.id, metaResult + 1);
                level.setTile(x, y, z, 0);
            }
            else {
                level.placeBlockWithMetaData(x, y - 1, z, BlockListener.dynamicBasalt.id, 15);
                level.placeBlockWithMetaData(x, y, z, BlockListener.dynamicBasalt.id, metaResult - 15);
            }
        } else if (level.getTileId(x, y - 1, z) == BlockListener.finiteLiquid.id) {
            level.placeBlockWithMetaData(x, y, z, BlockListener.finiteLiquid.id, level.getTileMeta(x, y, z));
        }
        else if (level.getTileId(x, y - 1, z) == BlockListener.staticBasalt.id && belowMeta != 15) {
            int selfMeta = level.getTileMeta(x, y, z);
            int metaResult = selfMeta + belowMeta;
            if (metaResult < 15) {
                level.placeBlockWithMetaData(x, y - 1, z, BlockListener.staticBasalt.id, metaResult + 1);
                level.setTile(x, y, z, 0);
            } else {
                level.placeBlockWithMetaData(x, y - 1, z, BlockListener.staticBasalt.id, 15);
                level.placeBlockWithMetaData(x, y, z, BlockListener.dynamicBasalt.id, metaResult - 15);
            }
        } else if (level.getTileId(x, y - 1, z) == BlockListener.volcanoBlocks.id && level.getTileMeta(x, y - 1, z) == 0) {
            level.placeBlockWithMetaData(x, y, z, BlockListener.finiteLiquid.id, level.getTileMeta(x, y, z));
        } else {
            if (level.getTileId(x, y - 1, z) == BlockBase.GRASS.id) {
                level.placeBlockWithMetaData(x, y - 1, z, BlockBase.DIRT.id, 0);
            }
            temperature--;
            if (temperature < 0) {
                temperature = 100;
                level.placeBlockWithMetaData(x, y, z, BlockListener.staticBasalt.id, level.getTileMeta(x, y, z));
            }
        }
    }

    @Override
    public void onBlockPlaced(Level level, int x, int y, int z) {
        level.method_216(x, y, z, BlockListener.dynamicBasalt.id, 4);
    }

    public void method_1060(int i) {
        switch (i) {
            case 0:
                setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
                break;
            case 1:
                setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
                break;
            case 2:
                setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.1875F, 1.0F);
                break;
            case 3:
                setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
                break;
            case 4:
                setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.3125F, 1.0F);
                break;
            case 5:
                setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
                break;
            case 6:
                setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.4375F, 1.0F);
                break;
            case 7:
                setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
                break;
            case 8:
                setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
                break;
            case 9:
                setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
                break;
            case 10:
                setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.6875F, 1.0F);
                break;
            case 11:
                setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
                break;
            case 12:
                setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
                break;
            case 13:
                setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.875F, 1.0F);
                break;
            case 14:
                setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
                break;
            case 15:
                setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
                break;
        }

    }

    public void updateBoundingBox(TileView tileView, int x, int y, int z) {
        this.method_1060(tileView.getTileMeta(x, y, z));
    }

    public Box getCollisionShape(Level level, int x, int y, int z) {
        if (level.getTileMeta(x, y, z) > 6) {
            double height = 0.0625 * (level.getTileMeta(x, y, z) + 1);
            return Box.create((double) x, (double) y, (double) z, (double) (x + 1), (double) ((float) (y + height)), (double) (z + 1));
        }
        return Box.create((double) x, (double) y, (double) z, (double) (x + 1), (double) ((float) (y + 0.5)), (double) (z + 1));
    }

    @Override
    public void afterBreak(Level level, PlayerBase playerBase, int x, int y, int z, int meta) {
        Random rand = new Random();
        for (int i = 0; i < rand.nextInt(5) + 1; i++) {
            double var12 = (double) ((float) x + rand.nextFloat());
            double var8 = (double) y + this.maxY;
            double var10 = (double) ((float) z + rand.nextFloat());
            level.addParticle("lava", var12, var8, var10, 0.0D, 0.0D, 0.0D);
        }
    }

    @Override
    public boolean isFullOpaque() {
        return false;
    }

    @Override
    public void onAdjacentBlockUpdate(Level level, int x, int y, int z, int id) {
        if (level.getTileId(x, y + 1, z) == BlockBase.FLOWING_LAVA.id || level.getTileId(x, y + 1, z) == BlockBase.STILL_LAVA.id) {
            level.placeBlockWithMetaData(x, y + 1, z, BlockListener.volcanoBlocks.id, 13);
        }
    }

    int temperature = 5;

    public int getDropCount(Random rand) {
        return 0;
    }
}
