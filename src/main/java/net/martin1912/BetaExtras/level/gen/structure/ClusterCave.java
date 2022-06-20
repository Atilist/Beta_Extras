package net.martin1912.BetaExtras.level.gen.structure;

import net.minecraft.block.BlockBase;
import net.minecraft.level.Level;

import java.util.Random;

public class ClusterCave {
    public void generate(Level level, Random random, int x, int y, int z) {
        int xShift = 0;
        int yShift = 0;
        int zShift = 0;
        float xBias = random.nextFloat(0.8F);
        float yBias = random.nextFloat(0.8F);
        float zBias = random.nextFloat(0.8F);
        for (int iteration = 0; iteration <= random.nextInt(256) + 32; iteration++) {
            if (random.nextFloat(xBias) <= 0.75F)
                xShift += 1 - random.nextInt(2) * 2;
            if (random.nextFloat(yBias) <= 0.75F)
                yShift += 1 - random.nextInt(2) * 2;
            if (random.nextFloat(zBias) <= 0.75F)
                zShift += 1 - random.nextInt(2) * 2;
            for (int xOffset = -1; xOffset <= 1; xOffset++) {
                for (int yOffset = -1; yOffset <= 1; yOffset++) {
                    for (int zOffset = -1; zOffset <= 1; zOffset++) {
                        if (level.getTileId(x + xOffset + xShift, y + yOffset + yShift, z + zOffset + zShift) < 90 && level.getTileId(x + xOffset + xShift, y + yOffset + yShift, z + zOffset + zShift) != BlockBase.BEDROCK.id && level.getTileId(x + xOffset + xShift, y + yOffset + yShift, z + zOffset + zShift) != 0) {
                            level.setTile(x + xOffset + xShift, y + yOffset + yShift, z + zOffset + zShift, 0);
                        }
                    }
                }
            }
        }
    }
}
