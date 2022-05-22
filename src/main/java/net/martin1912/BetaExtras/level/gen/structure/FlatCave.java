package net.martin1912.BetaExtras.level.gen.structure;

import net.minecraft.block.BlockBase;
import net.minecraft.level.Level;

import java.util.Random;

public class FlatCave {
    public void generate(Level level, Random rand, int x, int y, int z) {
        int maximum = rand.nextInt(35) + 5;
        for (int xWidth = -maximum; xWidth <= maximum; xWidth++) {
            int convertedWidth = 25 - (xWidth*xWidth)/50;
            for (int height = -5; height <= 5; height++) {
                for (int zWidth = -convertedWidth + rand.nextInt(4) + height*height; zWidth <= convertedWidth - rand.nextInt(4) - height*height; zWidth++) {
                    int compactHeight = y + height + (int) (level.getBiomeSource().getTemperature(x + xWidth, z + zWidth) * 3);
                    if (level.getTileId(x + xWidth, compactHeight, z + zWidth) < 90 && level.getTileId(x + xWidth, compactHeight, z + zWidth) != BlockBase.BEDROCK.id) {
                        level.setTile(x + xWidth, compactHeight, z + zWidth, 0);
                    }
                }
            }
        }
    }
}
