package net.martin1912.BetaExtras.Block;

import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.level.Level;
import net.minecraft.level.TileView;
import net.minecraft.util.maths.Box;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

import java.util.Random;

@HasMetaNamedBlockItem
public class FiniteLiquid extends TemplateBlockBase {
    public FiniteLiquid(Identifier identifier, Material material) {
        super(identifier, material);
        this.setTicksRandomly(true);
    }

    @Override
    public FiniteLiquid setHardness(float Hardness) {
        return (FiniteLiquid) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        return BlockBase.FLOWING_LAVA.texture;
    }

    @Override
    public void onBlockPlaced(Level level, int x, int y, int z) {
        if (level.getTileId(x, y - 1, z) == BlockBase.FLOWING_LAVA.id || level.getTileId(x, y - 1, z) == BlockBase.STILL_LAVA.id) {
            level.placeBlockWithMetaData(x, y, z, BlockListener.volcanoBlocks.id, 13);
        }
        else {
            level.method_216(x, y, z, BlockListener.finiteLiquid.id, 10);
        }
    }

    @Override
    public void onAdjacentBlockUpdate(Level level, int x, int y, int z, int id) {
        Random random = new Random();
        if (level.getTileId(x, y + 1, z) == BlockBase.FLOWING_WATER.id || level.getTileId(x, y + 1, z) == BlockBase.STILL_WATER.id || level.getTileId(x, y + 1, z) == BlockBase.ICE.id) {
            level.placeBlockWithMetaData(x, y, z, BlockListener.volcanoBlocks.id, 8);
            level.playSound((double)((float)1 + 0.5F), (double)((float)1 + 0.5F), (double)((float)1 + 0.5F), "random.fizz", 0.5F, 2.6F + (level.rand.nextFloat() - level.rand.nextFloat()) * 0.8F);
        } else if (level.getTileId(x, y + 1, z) == BlockListener.dynamicBasalt.id) {
            if (random.nextInt(10) == 0) { //This mitigates the StackOverflow problem
                level.placeBlockWithMetaData(x, y + 1, z, BlockListener.finiteLiquid.id, level.getTileMeta(x, y + 1, z));
            }
        } else if (level.getTileId(x, y + 1, z) == BlockBase.FLOWING_LAVA.id || level.getTileId(x, y + 1, z) == BlockBase.STILL_LAVA.id) {
            level.placeBlockWithMetaData(x, y + 1, z, BlockListener.volcanoBlocks.id, 13);
        } else if (level.getTileId(x, y - 1, z) == BlockBase.FLOWING_LAVA.id || level.getTileId(x, y - 1, z) == BlockBase.STILL_LAVA.id) {
            level.placeBlockWithMetaData(x, y, z, BlockListener.volcanoBlocks.id, 13);
        }
    }

    @Override
    public void onScheduledTick(Level level, int x, int y, int z, Random rand) {
        level.method_216(x, y, z, BlockListener.finiteLiquid.id, 10);
        int belowMeta = level.getTileMeta(x, y - 1, z);
        if (level.getTileId(x, y - 1, z) == BlockListener.denseIce.id || level.getTileId(x, y - 1, z) == 0 || level.getMaterial(x, y - 1, z) == Material.SNOW_BLOCK || level.getMaterial(x, y - 1, z) == Material.SNOW || level.getMaterial(x, y - 1, z) == Material.WOOD || level.getMaterial(x, y - 1, z) == Material.WOOL || level.getMaterial(x, y - 1, z) == Material.ICE || level.getMaterial(x, y - 1, z) == Material.LEAVES || level.getMaterial(x, y - 1, z) == Material.PLANT) {
            if (level.getTileId(x, y - 1, z) != 0)
            level.playSound(x, y, z, "random.fizz", 0.1F, 0.5F);
            level.placeBlockWithMetaData(x, y - 1, z, BlockListener.finiteLiquid.id, level.getTileMeta(x, y, z));
            level.setTile(x, y, z, 0);
        } else if (level.getTileId(x, y - 1, z) == BlockListener.finiteLiquid.id && belowMeta != 15) {
            coldness = -100;
            int selfMeta = level.getTileMeta(x, y, z);
            int metaResult = selfMeta + belowMeta;
            if (metaResult < 15) {
                level.placeBlockWithMetaData(x, y - 1, z, BlockListener.finiteLiquid.id, metaResult + 1);
                level.setTile(x, y, z, 0);
            }
            else {
                level.placeBlockWithMetaData(x, y - 1, z, BlockListener.finiteLiquid.id, 15);
                level.placeBlockWithMetaData(x, y, z, BlockListener.finiteLiquid.id, metaResult - 15);
            }
        }
        else if (level.getTileId(x, y - 1, z) == BlockListener.dynamicBasalt.id && belowMeta != 15) {
            if (rand.nextBoolean()) {
                int selfMeta = level.getTileMeta(x, y, z);
                int metaResult = selfMeta + belowMeta;
                if (metaResult < 15) {
                    level.placeBlockWithMetaData(x, y - 1, z, BlockListener.dynamicBasalt.id, metaResult + 1);
                    level.setTile(x, y, z, 0);
                } else {
                    level.placeBlockWithMetaData(x, y - 1, z, BlockListener.dynamicBasalt.id, 15);
                    level.placeBlockWithMetaData(x, y, z, BlockListener.finiteLiquid.id, metaResult - 15);
                }
            }
            else {
                level.placeBlockWithMetaData(x, y - 1, z, BlockListener.finiteLiquid.id, belowMeta);
            }
        } else if (level.getTileId(x, y - 1, z) == BlockListener.staticBasalt.id && belowMeta != 15) {
            if (rand.nextBoolean()) {
                level.placeBlockWithMetaData(x, y - 1, z, BlockListener.dynamicBasalt.id, belowMeta);
            }
        } else {
            if (level.getTileId(x, y - 1, z) == BlockBase.GRASS.id) {
                level.placeBlockWithMetaData(x, y - 1, z, BlockBase.DIRT.id, 0);
            } else if (level.getMaterial(x, y - 1, z) == Material.WATER) {
                level.placeBlockWithMetaData(x, y - 1, z, BlockBase.STONE.id, 0);
            }
            boolean positiveX = false;
            boolean negativeX = false;
            boolean positiveZ = false;
            boolean negativeZ = false;
            short openSides = 0;
            int metaPositiveX = level.getTileMeta(x + 1, y, z);
            int metaNegativeX = level.getTileMeta(x - 1, y, z);
            int metaPositiveZ = level.getTileMeta(x, y, z + 1);
            int metaNegativeZ = level.getTileMeta(x, y, z - 1);
            int selfMeta = level.getTileMeta(x, y, z);
            if (level.getTileId(x + 1, y, z) == BlockListener.denseIce.id || level.getTileId(x + 1, y, z) == 0 || level.getMaterial(x + 1, y, z) == Material.SNOW_BLOCK || level.getMaterial(x + 1, y, z) == Material.SNOW || level.getMaterial(x + 1, y, z) == Material.WOOD || level.getMaterial(x + 1, y, z) == Material.WOOL || level.getMaterial(x + 1, y, z) == Material.ICE || level.getMaterial(x + 1, y, z) == Material.LEAVES || level.getMaterial(x + 1, y, z) == Material.PLANT || level.getTileId(x + 1, y, z) == BlockListener.finiteLiquid.id) {
                if (selfMeta > metaPositiveX && metaPositiveX < 15) {
                    positiveX = true;
                    openSides++;
                    if (level.getTileId(x + 1, y, z) == BlockListener.finiteLiquid.id) {
                        metaPositiveX++;
                    }
                }
            }
            if (level.getTileId(x - 1, y, z) == BlockListener.denseIce.id || level.getTileId(x - 1, y, z) == 0 || level.getMaterial(x - 1, y, z) == Material.SNOW_BLOCK || level.getMaterial(x - 1, y, z) == Material.SNOW || level.getMaterial(x - 1, y, z) == Material.WOOD || level.getMaterial(x - 1, y, z) == Material.WOOL || level.getMaterial(x - 1, y, z) == Material.ICE || level.getMaterial(x - 1, y, z) == Material.LEAVES || level.getMaterial(x - 1, y, z) == Material.PLANT || level.getTileId(x - 1, y, z) == BlockListener.finiteLiquid.id) {
                if (selfMeta > metaNegativeX && metaNegativeX < 15) {
                    negativeX = true;
                    openSides++;
                    if (level.getTileId(x - 1, y, z) == BlockListener.finiteLiquid.id) {
                        metaNegativeX++;
                    }
                }
            }
            if (level.getTileId(x, y, z + 1) == BlockListener.denseIce.id || level.getTileId(x, y, z + 1) == 0 || level.getMaterial(x, y, z + 1) == Material.SNOW_BLOCK || level.getMaterial(x, y, z + 1) == Material.SNOW || level.getMaterial(x, y, z + 1) == Material.WOOD || level.getMaterial(x, y, z + 1) == Material.WOOL || level.getMaterial(x, y, z + 1) == Material.ICE || level.getMaterial(x, y, z + 1) == Material.LEAVES || level.getMaterial(x, y, z + 1) == Material.PLANT || level.getTileId(x, y, z + 1) == BlockListener.finiteLiquid.id) {
                if (selfMeta > metaPositiveZ && metaPositiveZ < 15) {
                    positiveZ = true;
                    openSides++;
                    if (level.getTileId(x, y, z + 1) == BlockListener.finiteLiquid.id) {
                        metaPositiveZ++;
                    }
                }
            }
            if (level.getTileId(x, y, z - 1) == BlockListener.denseIce.id || level.getTileId(x, y, z - 1) == 0 || level.getMaterial(x, y, z - 1) == Material.SNOW_BLOCK || level.getMaterial(x, y, z - 1) == Material.SNOW || level.getMaterial(x, y, z - 1) == Material.WOOD || level.getMaterial(x, y, z - 1) == Material.WOOL || level.getMaterial(x, y, z - 1) == Material.ICE || level.getMaterial(x, y, z - 1) == Material.LEAVES || level.getMaterial(x, y, z - 1) == Material.PLANT || level.getTileId(x, y, z - 1) == BlockListener.finiteLiquid.id) {
                if (selfMeta > metaNegativeZ && metaNegativeZ < 15) {
                    negativeZ = true;
                    openSides++;
                    if (level.getTileId(x, y, z - 1) == BlockListener.finiteLiquid.id) {
                        metaNegativeZ++;
                    }
                }
            }
            if (openSides > 0) {
                selfMeta++;
                int result = selfMeta / (openSides + 1);
                int remnant = selfMeta - result * (openSides + 1);
                if (result != 0) {
                    if (positiveX) {
                        if (result + metaPositiveX - 1 < 15) {
                            level.placeBlockWithMetaData(x + 1, y, z, BlockListener.finiteLiquid.id, result + metaPositiveX - 1);
                        } else {
                            int ultraResult = result + metaPositiveX - 1;
                            remnant += ultraResult - 15;
                            level.placeBlockWithMetaData(x + 1, y, z, BlockListener.finiteLiquid.id, 15);
                        }
                    }
                    if (negativeX) {
                        if (result + metaNegativeX - 1 < 15) {
                            level.placeBlockWithMetaData(x - 1, y, z, BlockListener.finiteLiquid.id, result + metaNegativeX - 1);
                        } else {
                            int ultraResult = result + metaNegativeX - 1;
                            remnant += ultraResult - 15;
                            level.placeBlockWithMetaData(x - 1, y, z, BlockListener.finiteLiquid.id, 15);
                        }
                    }
                    if (positiveZ) {
                        if (result + metaPositiveZ - 1 < 15) {
                            level.placeBlockWithMetaData(x, y, z + 1, BlockListener.finiteLiquid.id, result + metaPositiveZ - 1);
                        } else {
                            int ultraResult = result + metaPositiveZ - 1;
                            remnant += ultraResult - 15;
                            level.placeBlockWithMetaData(x, y, z + 1, BlockListener.finiteLiquid.id, 15);
                        }
                    }
                    if (negativeZ) {
                        if (result + metaNegativeZ - 1 < 15) {
                            level.placeBlockWithMetaData(x, y, z - 1, BlockListener.finiteLiquid.id, result + metaNegativeZ - 1);
                        } else {
                            int ultraResult = result + metaNegativeZ - 1;
                            remnant += ultraResult - 15;
                            level.placeBlockWithMetaData(x, y, z - 1, BlockListener.finiteLiquid.id, 15);
                        }
                    }
                    level.placeBlockWithMetaData(x, y, z, BlockListener.finiteLiquid.id, result + remnant - 1);
                } else {
                    if (coldness < 5) {
                        coldness++;
                    } else {
                        level.placeBlockWithMetaData(x, y, z, BlockListener.dynamicBasalt.id, level.getTileMeta(x, y, z));
                    }
                }
            } else {
                if (coldness < 5) {
                    coldness++;
                } else {
                    level.placeBlockWithMetaData(x, y, z, BlockListener.dynamicBasalt.id, level.getTileMeta(x, y, z));
                }
            }
        }
    }

    @Override
    public Box getCollisionShape(Level level, int x, int y, int z) {
        return null;
    }

    @Override
    public boolean isFullOpaque() {
        return false;
    }

    @Override
    public boolean isCollidable(int meta, boolean flag) {
        return flag && meta == 0;
    }

    @Override
    public boolean isSolid(TileView tileView, int x, int y, int z, int meta) {
        Material var6 = tileView.getMaterial(x, y, z);
        if (var6 == this.material) {
            return false;
        } else if (var6 == Material.ICE) {
            return false;
        } else {
            return meta == 1 || super.isSolid(tileView, x, y, z, meta);
        }
    }

    @Override
    public void updateBoundingBox(TileView tileView, int x, int y, int z) {
        switch (tileView.getTileMeta(x, y, z)) {
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
    int coldness = -500;

    @Override
    public int getDropCount(Random rand) {
        return 0;
    }
}
