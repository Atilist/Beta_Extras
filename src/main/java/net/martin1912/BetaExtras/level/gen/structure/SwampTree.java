package net.martin1912.BetaExtras.level.gen.structure;

import net.martin1912.BetaExtras.Block.BlockListener;
import net.minecraft.block.BlockBase;
import net.minecraft.level.Level;
import net.minecraft.level.structure.Structure;

import java.util.Random;

public class SwampTree extends Structure {
    public SwampTree() {
    }
    @Override
    public boolean generate(Level level, Random rand, int x, int y, int z) {
        int groundcheck = level.getTileId(x, y - 1, z);
        int watercheck = level.getTileId(x, y, z);
        int aircheck1 = level.getTileId(x, y + 1, z);
        int stemheight = rand.nextInt(6);
        if (groundcheck == BlockBase.GRASS.id && y < 116 || groundcheck == BlockBase.DIRT.id && watercheck == BlockBase.STILL_WATER.id && aircheck1 == 0) {
            level.setTile(x, y-1 ,z, BlockBase.DIRT.id);
            level.placeBlockWithMetaData(x, y ,z, BlockListener.extraLogs.id, 0);
            for (int progress = 0; progress <= stemheight; progress++) {
                level.setTileWithMetadata(x, y + progress, z, BlockListener.extraLogs.id, 0);
            }
            for (int xBox = -4; xBox <= 4; xBox++) {
                for (int yBox = 0; yBox < 5; yBox++) {
                    for (int zBox = -4; zBox <= 4; zBox++) {
                        int aircheck2 = level.getTileId(x + xBox, y + yBox + stemheight, z + zBox);
                        if (aircheck2 == 0) {
                            if (!(xBox == 4 && zBox == 4 || xBox == 4 && zBox == -4 || xBox == -4 && zBox == 4 || xBox == -4 && zBox == -4 || xBox == 0 && zBox == 0 || yBox == 4)) {
                                if (yBox == 0) {
                                    if (xBox == 4 || zBox == 4 || xBox == -4 || zBox == -4) {
                                        level.setTileWithMetadata(x + xBox, y + yBox + stemheight, z + zBox, BlockListener.extraLeaves.id, 0);
                                        if (stemheight > 1) {
                                            boolean hangingLeaves = rand.nextBoolean();
                                            if (hangingLeaves) {
                                                level.setTileWithMetadata(x + xBox, y + yBox + stemheight - 1, z + zBox, BlockListener.extraLeaves.id, 0);
                                                hangingLeaves = rand.nextBoolean();
                                                if (hangingLeaves) {
                                                    level.setTileWithMetadata(x + xBox, y + yBox + stemheight - 2, z + zBox, BlockListener.extraLeaves.id, 0);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    level.setTileWithMetadata(x + xBox, y + yBox + stemheight, z + zBox, BlockListener.extraLeaves.id, 0);
                                }
                            } else if (xBox == 0 && yBox != 4) {
                                level.setTileWithMetadata(x + xBox, y + yBox + stemheight, z + zBox, BlockListener.extraLogs.id, 0);
                            } else if (yBox == 4 && xBox < 4 && xBox > -4 && zBox < 4 && zBox > -4) {
                                level.setTileWithMetadata(x + xBox, y + yBox + stemheight, z + zBox, BlockListener.extraLeaves.id, 0);
                            }
                        }
                    }

                }
            }
            return true;
        }
        return false;
    }
}

