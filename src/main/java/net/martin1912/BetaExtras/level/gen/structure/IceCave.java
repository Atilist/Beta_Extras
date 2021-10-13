package net.martin1912.BetaExtras.level.gen.structure;

import net.martin1912.BetaExtras.Block.BlockListener;
import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.level.Level;
import net.minecraft.level.structure.Structure;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.util.maths.Box;

import java.util.Random;

public class IceCave extends Structure {
    @Override
    public boolean generate(Level level, Random rand, int x, int y, int z) {
        for (int zOffset = -128; zOffset <= 128; zOffset++) {
            for (int xOffset = -128; xOffset <= 128; xOffset++) {
                for (int i = 127; i > 32; i--) {
                    double pythagorasThing = Math.sqrt(xOffset * xOffset + zOffset * zOffset);
                    if (pythagorasThing < (41 - i/4) + rand.nextInt(3)) {
                        if (i > 48) {
                            if (level.getTileId(x + xOffset, i, z + zOffset) == BlockBase.GRASS.id) {
                                level.setTileWithMetadata(x + xOffset, i, z + zOffset, BlockBase.SNOW_BLOCK.id, 0);
                            } else if (level.getMaterial(x + xOffset, i, z + zOffset) == Material.DIRT) {
                                level.setTileWithMetadata(x + xOffset, i, z + zOffset, BlockListener.denseSnow.id, 0);
                            } else if (level.getMaterial(x + xOffset, i, z + zOffset) == Material.STONE) {
                                level.setTileWithMetadata(x + xOffset, i, z + zOffset, BlockListener.denseIce.id, 0);
                            } else if (level.getTileId(x + xOffset, i, z + zOffset) == BlockBase.GRAVEL.id) {
                                level.setTileWithMetadata(x + xOffset, i, z + zOffset, BlockBase.SNOW_BLOCK.id, 0);
                            }
                        } else {
                            if (level.getTileId(x + xOffset, i, z + zOffset) == BlockBase.GRASS.id) {
                                level.setTileWithMetadata(x + xOffset, i, z + zOffset, BlockBase.SNOW_BLOCK.id, 0);
                            } else if (level.getMaterial(x + xOffset, i, z + zOffset) == Material.DIRT) {
                                level.setTileWithMetadata(x + xOffset, i, z + zOffset, BlockListener.denseSnow.id, 1);
                            } else if (level.getMaterial(x + xOffset, i, z + zOffset) == Material.STONE) {
                                if (rand.nextInt(10) == 0) {
                                    level.setTileWithMetadata(x + xOffset, i, z + zOffset, BlockListener.denseIce.id, 2);
                                } else {
                                    level.setTileWithMetadata(x + xOffset, i, z + zOffset, BlockListener.denseIce.id, 1);
                                }
                            } else if (level.getTileId(x + xOffset, i, z + zOffset) == BlockBase.GRAVEL.id) {
                                level.setTileWithMetadata(x + xOffset, i, z + zOffset, BlockBase.SNOW_BLOCK.id, 0);
                            }
                        }
                    }
                    if (pythagorasThing < 3 - rand.nextInt(2) && i > 56) {
                        if (level.getTileId(x + xOffset, i, z + zOffset) != 0) {
                            level.setTileWithMetadata(x + xOffset, i, z + zOffset, BlockListener.denseSnow.id, 2);
                        } else {
                            level.setTile(x + xOffset, i, z + zOffset, 0);
                        }
                    }
                }
            }
        }
        buildDungeon0(level, rand, x + 2, z, rand.nextInt(2));
        buildDungeon1(level, rand, x - 2, z, rand.nextInt(2));
        buildDungeon2(level, rand, x, z + 2, rand.nextInt(2));
        buildDungeon3(level, rand, x, z - 2, rand.nextInt(2));
        return true;
    }

    private void buildDungeon0(Level level, Random rand, int x, int z, int input) {
        switch (input) {
            case 0:
                int cobweb = BlockBase.COBWEB.id;
                for (int i = 0; i < 11; i++) {
                    if (i > 8) {
                        cobweb = 0;
                    }
                    level.setTile(x + i, 57, z + 1, rand.nextInt(2) * cobweb);
                    level.setTile(x + i, 57, z, rand.nextInt(2) * cobweb);
                    level.setTile(x + i, 57, z - 1, rand.nextInt(2) * cobweb);

                    level.setTile(x + i, 58, z + 1, rand.nextInt(2) * cobweb);
                    level.setTile(x + i, 58, z, rand.nextInt(2) * cobweb);
                    level.setTile(x + i, 58, z - 1, rand.nextInt(2) * cobweb);

                    level.setTile(x + i, 59, z + 1, rand.nextInt(2) * cobweb);
                    level.setTile(x + i, 59, z, rand.nextInt(2) * cobweb);
                    level.setTile(x + i, 59, z - 1, rand.nextInt(2) * cobweb);
                }
                level.setTileWithMetadata(x + 12, 57, z + 1, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x + 12, 57, z, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x + 12, 57, z - 1, BlockListener.denseIce.id, 3);

                level.setTileWithMetadata(x + 12, 58, z + 1, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x + 12, 58, z, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x + 12, 58, z - 1, BlockListener.denseIce.id, 3);

                level.setTileWithMetadata(x + 12, 59, z + 1, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x + 12, 59, z, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x + 12, 59, z - 1, BlockListener.denseIce.id, 3);

                level.setTile(x + 6, 57, z, net.minecraft.block.BlockBase.MOB_SPAWNER.id);
                TileEntityMobSpawner var19 = (TileEntityMobSpawner)level.getTileEntity(x + 6, 57, z);
                var19.setEntityId("Spider");
                break;
            case 1:
                for (int i = 0; i < 15; i++) {
                    level.setTile(x + i, 57 - i, z + 1, 0);
                    level.setTile(x + i, 57 - i, z, 0);
                    level.setTile(x + i, 57 - i, z - 1, 0);

                    level.setTile(x + i, 58 - i, z + 1, 0);
                    level.setTile(x + i, 58 - i, z, 0);
                    level.setTile(x + i, 58 - i, z - 1, 0);

                    level.setTile(x + i, 59 - i, z + 1, 0);
                    level.setTile(x + i, 59 - i, z, 0);
                    level.setTile(x + i, 59 - i, z - 1, 0);

                    level.setTile(x + i, 60 - i, z + 1, 0);
                    level.setTile(x + i, 60 - i, z, 0);
                    level.setTile(x + i, 60 - i, z - 1, 0);
                }
                break;
        }
    }

    private void buildDungeon1(Level level, Random rand, int x, int z, int input) {
        switch (input) {
            case 0:
                int cobweb = BlockBase.COBWEB.id;
                for (int i = 0; i > -11; i--) {
                    if (i < -8) {
                        cobweb = 0;
                    }
                    level.setTile(x + i, 57, z + 1, rand.nextInt(2) * cobweb);
                    level.setTile(x + i, 57, z, rand.nextInt(2) * cobweb);
                    level.setTile(x + i, 57, z - 1, rand.nextInt(2) * cobweb);

                    level.setTile(x + i, 58, z + 1, rand.nextInt(2) * cobweb);
                    level.setTile(x + i, 58, z, rand.nextInt(2) * cobweb);
                    level.setTile(x + i, 58, z - 1, rand.nextInt(2) * cobweb);

                    level.setTile(x + i, 59, z + 1, rand.nextInt(2) * cobweb);
                    level.setTile(x + i, 59, z, rand.nextInt(2) * cobweb);
                    level.setTile(x + i, 59, z - 1, rand.nextInt(2) * cobweb);
                }
                level.setTileWithMetadata(x - 12, 57, z + 1, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x - 12, 57, z, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x - 12, 57, z - 1, BlockListener.denseIce.id, 3);

                level.setTileWithMetadata(x - 12, 58, z + 1, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x - 12, 58, z, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x - 12, 58, z - 1, BlockListener.denseIce.id, 3);

                level.setTileWithMetadata(x - 12, 59, z + 1, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x - 12, 59, z, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x - 12, 59, z - 1, BlockListener.denseIce.id, 3);

                level.setTile(x - 6, 57, z, net.minecraft.block.BlockBase.MOB_SPAWNER.id);
                TileEntityMobSpawner var19 = (TileEntityMobSpawner)level.getTileEntity(x - 6, 57, z);
                var19.setEntityId("Spider");
                break;
            case 1:
                for (int i = 0; i > -15; i--) {
                    level.setTile(x + i, 57 + i, z + 1, 0);
                    level.setTile(x + i, 57 + i, z, 0);
                    level.setTile(x + i, 57 + i, z - 1, 0);

                    level.setTile(x + i, 58 + i, z + 1, 0);
                    level.setTile(x + i, 58 + i, z, 0);
                    level.setTile(x + i, 58 + i, z - 1, 0);

                    level.setTile(x + i, 59 + i, z + 1, 0);
                    level.setTile(x + i, 59 + i, z, 0);
                    level.setTile(x + i, 59 + i, z - 1, 0);

                    level.setTile(x + i, 60 + i, z + 1, 0);
                    level.setTile(x + i, 60 + i, z, 0);
                    level.setTile(x + i, 60 + i, z - 1, 0);
                }
                break;
        }
    }

    private void buildDungeon2(Level level, Random rand, int x, int z, int input) {
        switch (input) {
            case 0:
                int cobweb = BlockBase.COBWEB.id;
                for (int i = 0; i < 11; i++) {
                    if (i > 8) {
                        cobweb = 0;
                    }
                    level.setTile(x + 1, 57, z + i, rand.nextInt(2) * cobweb);
                    level.setTile(x, 57, z + i, rand.nextInt(2) * cobweb);
                    level.setTile(x - 1, 57, z + i, rand.nextInt(2) * cobweb);

                    level.setTile(x + 1, 58, z + i, rand.nextInt(2) * cobweb);
                    level.setTile(x, 58, z + i, rand.nextInt(2) * cobweb);
                    level.setTile(x - 1, 58, z + i, rand.nextInt(2) * cobweb);

                    level.setTile(x + 1, 59, z + i, rand.nextInt(2) * cobweb);
                    level.setTile(x, 59, z + i, rand.nextInt(2) * cobweb);
                    level.setTile(x - 1, 59, z + i, rand.nextInt(2) * cobweb);
                }
                level.setTileWithMetadata(x + 1, 57, z + 12, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x, 57, z + 12, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x - 1, 57, z + 12, BlockListener.denseIce.id, 3);

                level.setTileWithMetadata(x + 1, 58, z + 12, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x, 58, z + 12, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x - 1, 58, z + 12, BlockListener.denseIce.id, 3);

                level.setTileWithMetadata(x + 1, 59, z + 12, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x, 59, z + 12, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x - 1, 59, z + 12, BlockListener.denseIce.id, 3);

                level.setTile(x, 57, z + 6, net.minecraft.block.BlockBase.MOB_SPAWNER.id);
                TileEntityMobSpawner var19 = (TileEntityMobSpawner)level.getTileEntity(x, 57, z + 6);
                var19.setEntityId("Spider");
                break;
            case 1:
                for (int i = 0; i < 15; i++) {
                    level.setTile(x + 1, 57 - i, z + i, 0);
                    level.setTile(x, 57 - i, z + i, 0);
                    level.setTile(x - 1, 57 - i, z + i, 0);

                    level.setTile(x + 1, 58 - i, z + i, 0);
                    level.setTile(x, 58 - i, z + i, 0);
                    level.setTile(x - 1, 58 - i, z + i, 0);

                    level.setTile(x + 1, 59 - i, z + i, 0);
                    level.setTile(x, 59 - i, z + i, 0);
                    level.setTile(x - 1, 59 - i, z + i, 0);

                    level.setTile(x + 1, 60 - i, z + i, 0);
                    level.setTile(x, 60 - i, z + i, 0);
                    level.setTile(x - 1, 60 - i, z + i, 0);
                }
                break;
        }
    }

    private void buildDungeon3(Level level, Random rand, int x, int z, int input) {
        switch (input) {
            case 0:
                int cobweb = BlockBase.COBWEB.id;
                for (int i = 0; i > -11; i--) {
                    if (i < -8) {
                        cobweb = 0;
                    }
                    level.setTile(x + 1, 57, z + i, rand.nextInt(2) * cobweb);
                    level.setTile(x, 57, z + i, rand.nextInt(2) * cobweb);
                    level.setTile(x - 1, 57, z + i, rand.nextInt(2) * cobweb);

                    level.setTile(x + 1, 58, z + i, rand.nextInt(2) * cobweb);
                    level.setTile(x, 58, z + i, rand.nextInt(2) * cobweb);
                    level.setTile(x - 1, 58, z + i, rand.nextInt(2) * cobweb);

                    level.setTile(x + 1, 59, z + i, rand.nextInt(2) * cobweb);
                    level.setTile(x, 59, z + i, rand.nextInt(2) * cobweb);
                    level.setTile(x - 1, 59, z + i, rand.nextInt(2) * cobweb);
                }
                level.setTileWithMetadata(x + 1, 57, z - 12, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x, 57, z - 12, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x - 1, 57, z - 12, BlockListener.denseIce.id, 3);

                level.setTileWithMetadata(x + 1, 58, z - 12, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x, 58, z - 12, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x - 1, 58, z - 12, BlockListener.denseIce.id, 3);

                level.setTileWithMetadata(x + 1, 59, z - 12, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x, 59, z - 12, BlockListener.denseIce.id, 3);
                level.setTileWithMetadata(x - 1, 59, z - 12, BlockListener.denseIce.id, 3);

                level.setTile(x, 57, z - 6, net.minecraft.block.BlockBase.MOB_SPAWNER.id);
                TileEntityMobSpawner var19 = (TileEntityMobSpawner)level.getTileEntity(x, 57, z - 6);
                var19.setEntityId("Spider");
                break;
            case 1:
                for (int i = 0; i > -15; i--) {
                    level.setTile(x + 1, 57 + i, z + i, 0);
                    level.setTile(x, 57 + i, z + i, 0);
                    level.setTile(x - 1, 57 + i, z + i, 0);

                    level.setTile(x + 1, 58 + i, z + i, 0);
                    level.setTile(x, 58 + i, z + i, 0);
                    level.setTile(x - 1, 58 + i, z + i, 0);

                    level.setTile(x + 1, 59 + i, z + i, 0);
                    level.setTile(x, 59 + i, z + i, 0);
                    level.setTile(x - 1, 59 + i, z + i, 0);

                    level.setTile(x + 1, 60 + i, z + i, 0);
                    level.setTile(x, 60 + i, z + i, 0);
                    level.setTile(x - 1, 60 + i, z + i, 0);
                }
                break;
        }
    }
}
