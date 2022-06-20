package net.martin1912.BetaExtras.level.gen.structure;

import net.minecraft.block.BlockBase;
import net.minecraft.level.Level;

import java.util.Random;

public class SpikeRavine {
    public void generate(Level level, Random rand, int x, int y, int z) {
        int zWidth = rand.nextInt(8) + 3;
        int depth = rand.nextInt(7) + 2;
        int randomSideOffset = 0;
        int randomHeightOffset = 0;
        int randomSpikeDepth = rand.nextInt(17) + 4;
        int inverter = 1;
        if (rand.nextBoolean()) {
            inverter = 0;
        }
        for (int xLength = 0; xLength <= rand.nextInt(128) + 128; xLength++) {
            for (int zLength = -zWidth; zLength <= zWidth; zLength++) {
                for (int height = 0; height >= -depth - randomSpikeDepth + Math.sqrt(zLength*zLength)*(rand.nextInt(6) + 2) - 3; height--) {
                    int compactX = x + (xLength * inverter) + ((zLength + randomSideOffset) * (1 - inverter));
                    int compactY = y + height + randomHeightOffset;
                    int compactZ = z + ((zLength + randomSideOffset) * inverter) + (xLength * (1 - inverter));
                    if (level.getTileId(compactX, compactY, compactZ) < 90 && level.getTileId(compactX, compactY, compactZ) != BlockBase.BEDROCK.id && level.getTileId(compactX, compactY, compactZ) != BlockBase.STILL_WATER.id && level.getTileId(compactX, compactY, compactZ) != BlockBase.FLOWING_WATER.id) {
                        level.setTile(compactX, compactY, compactZ, 0);
                    }
                }
            }
            randomSideOffset += rand.nextInt(2) * -rand.nextInt(2);
            if (rand.nextInt(4) == 0) {
                randomHeightOffset += rand.nextInt(2) * -rand.nextInt(2);
            }
        }
    }
}
