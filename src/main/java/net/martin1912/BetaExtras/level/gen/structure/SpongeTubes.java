package net.martin1912.BetaExtras.level.gen.structure;

import net.minecraft.block.BlockBase;
import net.minecraft.level.Level;
import net.minecraft.level.structure.Structure;

import java.util.Random;

public class SpongeTubes extends Structure {

    @Override
    public boolean generate(Level level, Random rand, int x, int y, int z) {
        int iswater = level.getTileId(x, y, z);
        int issoil1 = level.getTileId(x, y-1, z);
        int issoil2 = level.getTileId(x-1, y-1, z);
        int issoil3 = level.getTileId(x+1, y-1, z);
        int issoil4 = level.getTileId(x-1, y-1, z-1);
        int issoil5 = level.getTileId(x+1, y-1, z+1);
        if (iswater == BlockBase.STILL_WATER.id && y <= 60 && y >= 50 && issoil1 != BlockBase.STILL_WATER.id && issoil2 != BlockBase.STILL_WATER.id && issoil3 != BlockBase.STILL_WATER.id && issoil4 != BlockBase.STILL_WATER.id && issoil5 != BlockBase.STILL_WATER.id) {
            level.placeBlockWithMetaData(x, y, z, BlockBase.SPONGE.id, 0);
            int height = 0;
            for(int i = rand.nextInt(2) + 2; i > 0; i--) {
                level.placeBlockWithMetaData(x-1, y + height, z, BlockBase.SPONGE.id, 0);
                level.placeBlockWithMetaData(x+1, y + height, z, BlockBase.SPONGE.id, 0);
                level.placeBlockWithMetaData(x, y + height, z-1, BlockBase.SPONGE.id, 0);
                level.placeBlockWithMetaData(x, y + height, z+1, BlockBase.SPONGE.id, 0);
                height++;
            }
            return true;
        } else {
            return false;
        }
    }
}

