package net.martin1912.BetaExtras.level.gen;

import net.martin1912.BetaExtras.Block.BlockListener;
import net.martin1912.BetaExtras.level.gen.structure.*;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.level.biome.Biome;
import net.minecraft.level.structure.Mushroom;
import net.minecraft.structure.Ore;
import net.modificationstation.stationapi.api.event.level.gen.LevelGenEvent;

public class ChunkListener {
    @EventListener
    public void populate(LevelGenEvent.ChunkDecoration event) {

        for(int k = 0; k < 1; ++k) {
            int x = event.x + event.random.nextInt(16);
            int y = event.random.nextInt(128);
            int z = event.z + event.random.nextInt(16);
            new Ore(BlockListener.alphiumOre.id, 32).generate(event.level, event.random, x, y, z);
        }
        if (event.biome == Biome.RAINFOREST) {
            for (int k = 0; k < 16; ++k) {
                int x = event.x + event.random.nextInt(16);
                int y = event.random.nextInt(128);
                int z = event.z + event.random.nextInt(16);
                new Mushroom(BlockListener.bigRedMushroom.id).generate(event.level, event.random, x, y, z);
            }
        }
        if (event.biome == Biome.RAINFOREST) {
            for (int k = 0; k < 16; ++k) {
                int x = event.x + event.random.nextInt(16);
                int y = event.random.nextInt(128);
                int z = event.z + event.random.nextInt(16);
                new Mushroom(BlockListener.bigBrownMushroom.id).generate(event.level, event.random, x, y, z);
            }
        }
        if (event.biome == Biome.SWAMPLAND) {
            for (int k = 0; k < 64; ++k) {
                int x = event.x + event.random.nextInt(16);
                int y = event.random.nextInt(128);
                int z = event.z + event.random.nextInt(16);
                new SwampTree().generate(event.level, event.random, x, y, z);
            }
        }
        if (event.biome == Biome.PLAINS || event.biome == Biome.SAVANNA || event.biome == Biome.RAINFOREST || event.biome == Biome.FOREST || event.biome == Biome.DESERT || event.biome == Biome.SEASONAL_FOREST) {
            for (int k = 0; k < 64; ++k) {
                int randomchance =event.random.nextInt(4);
                if (randomchance == 0) {
                    int x = event.x +event.random.nextInt(16);
                    int y =event.random.nextInt(128);
                    int z = event.z +event.random.nextInt(16);
                    new SpongeTubes().generate(event.level,event.random, x, y, z);
                }
            }
        }
        if (event.biome != Biome.NETHER && event.biome != Biome.SKY) {
            for (int k = 0; k < 1; ++k) {
                int randomchance = event.random.nextInt(128);
                if (randomchance == 0) {
                    int x = event.x + event.random.nextInt(16);
                    int y = event.random.nextInt(96);
                    int z = event.z + event.random.nextInt(16);
                    new BetterVolcano().generate(event.level, event.random, x, y, z);
                }
            }
        }
        if (event.biome == Biome.DESERT || event.biome == Biome.RAINFOREST) {
            for (int k = 0; k < 100; ++k) {
                int randomchance =event.random.nextInt(512);
                if (randomchance == 0) {
                    int x = event.x +event.random.nextInt(16);
                    int y =event.random.nextInt(100);
                    int z = event.z +event.random.nextInt(16);
                    new MesaRock().generate(event.level,event.random, x, y, z);
                }
            }
        }

        if (event.biome == Biome.TUNDRA) {
            int randomchance = event.random.nextInt(1024);
            if (randomchance == 0) {
                for (int k = 0; k < 1; ++k) {
                    int x = event.x + event.random.nextInt(16);
                    int y = 64;
                    int z = event.z + event.random.nextInt(16);
                    new IceCave().generate(event.level, event.random, x, y, z);
                }
            }
        }
    }
}