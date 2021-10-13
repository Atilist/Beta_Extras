package net.martin1912.BetaExtras.level.gen.structure;

import net.martin1912.BetaExtras.Block.BlockListener;
import net.minecraft.block.BlockBase;
import net.minecraft.level.Level;
import net.minecraft.level.structure.Structure;

import java.util.Random;

public class BetterVolcano extends Structure {
    @Override
    public boolean generate(Level level, Random rand, int x, int y, int z) {
        if (level.getTileId(x, y, z) == BlockBase.DIRT.id && level.getTileId(x, y - 1, z) == BlockBase.STONE.id) {
            boolean tallOrFlat = rand.nextBoolean();
            int steps = 0;
            int stepper;
            int radius;
            if (tallOrFlat) {
                radius = 25 + rand.nextInt(10);
                stepper = rand.nextInt(3);
                steps = stepper;
            }
            else {
                radius = 60 + rand.nextInt(50);
                stepper = rand.nextInt(4) + 4;
            }
            int randomizerX = rand.nextInt(10);
            int randomizerZ = rand.nextInt(10);
            int randomizerMonoX = rand.nextInt(4);
            int randomizerMonoZ = rand.nextInt(4);
            short inverterX = 1;
            short inverterZ = 1;
            if (rand.nextBoolean()) {
                inverterX = -1;
            }
            if (rand.nextBoolean()) {
                inverterZ = -1;
            }
            for (int yOffset = y; yOffset <= 127; yOffset++) {
                if (tallOrFlat) {
                    if (steps == 0) {
                        steps = stepper;
                        radius--;
                    } else {
                        steps--;
                    }
                }
                else {
                    radius=-stepper;
                }
                for (int xOffset = -radius; xOffset <= radius; xOffset++) {
                    for (int zOffset = -radius; zOffset <= radius; zOffset++) {
                        double SymmetricalX = Math.sqrt(xOffset * xOffset) / (randomizerX + 1);
                        double SymmetricalZ = Math.sqrt(zOffset * zOffset) / (randomizerZ + 1);
                        double asymmetricalX = xOffset / (randomizerMonoX + 2.0) * inverterX;
                        double asymmetricalZ = zOffset / (randomizerMonoZ + 2.0) * inverterZ;
                        double pythagorasThing = Math.sqrt(xOffset * xOffset + zOffset * zOffset);
                        if (pythagorasThing < radius / 2.0 - SymmetricalX - SymmetricalZ + rand.nextInt(2) + asymmetricalX + asymmetricalZ) {
                            level.placeBlockWithMetaData(x + xOffset, -20 + yOffset, z + zOffset, BlockListener.staticBasalt.id, 15);
                        }
                    }
                }
            }
            for (int xOffset = -100; xOffset <= 100; xOffset++) {
                for (int zOffset = -100; zOffset <= 100; zOffset++) {
                    for (int yOffset = 48; yOffset <= 127; yOffset++) {
                        if (level.getTileId(x + xOffset, yOffset, z + zOffset) == BlockListener.staticBasalt.id && level.getTileId(x + xOffset, yOffset -1, z + zOffset) == 0 && xOffset != 0 && zOffset != 0) {
                            level.setTile(x + xOffset, yOffset, z + zOffset, 0);
                        }
                    }
                }
            }
            for (int height = 127; height > 2; height--) {
                if (level.getTileId(x, height, z) != 0) {
                    level.placeBlockWithMetaData(x, height, z, BlockListener.finiteLiquid.id, 15);
                }
                if (level.getTileId(x, height + 1, z) == 0) {
                    break;
                }
            }
            level.placeBlockWithMetaData(x, 2, z, BlockListener.volcanoBlocks.id, 0);
            return true;
        }
        return false;
    }
}
