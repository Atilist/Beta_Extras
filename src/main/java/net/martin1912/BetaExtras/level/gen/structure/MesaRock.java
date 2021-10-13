package net.martin1912.BetaExtras.level.gen.structure;

import net.martin1912.BetaExtras.Block.BlockListener;
import net.minecraft.block.BlockBase;
import net.minecraft.level.Level;
import net.minecraft.level.structure.Structure;

import java.util.Random;

public class MesaRock extends Structure {
    @Override
    public boolean generate(Level level, Random rand, int x, int y, int z) {
        int blockcheck = level.getTileId(x, y, z);
        float skycheck = level.getLightLevel(x, y + 5, z);
        if (blockcheck == BlockBase.SANDSTONE.id && skycheck < 0.9) {
            buildrock(level, rand, x, y, z, 0, 0, 0, 24);
            for (int rockextension = 0; rockextension < rand.nextInt(10); rockextension++) {
                int xoffset = rand.nextInt(8);
                int zoffset = rand.nextInt(8);
                boolean inverter = rand.nextBoolean();
                if (inverter) {
                    xoffset*=-1;
                }
                inverter = rand.nextBoolean();
                if (inverter) {
                    zoffset*=-1;
                }
                buildrock(level, rand, x, y, z, xoffset, -5, zoffset, 8);
            }
            for (int mediumrock = 0; mediumrock < rand.nextInt(20); mediumrock++) {
                int xoffset = rand.nextInt(32);
                int zoffset = rand.nextInt(32);
                boolean inverter = rand.nextBoolean();
                if (inverter) {
                    xoffset*=-1;
                }
                inverter = rand.nextBoolean();
                if (inverter) {
                    zoffset*=-1;
                }
                buildrock(level, rand, x, y, z, xoffset, 0, zoffset, 8);
            }
            for (int smallrock = 0; smallrock < rand.nextInt(100); smallrock++) {
                int xoffset = rand.nextInt(48);
                int zoffset = rand.nextInt(48);
                boolean inverter = rand.nextBoolean();
                if (inverter) {
                    xoffset*=-1;
                }
                inverter = rand.nextBoolean();
                if (inverter) {
                    zoffset*=-1;
                }
                buildrock(level, rand, x, y, z, xoffset, -5, zoffset, 4);
            }
            return true;
        }
        return false;
    }

    public void buildrock(Level level, Random rand, int x, int y, int z, int xoffset, int yoffset, int zoffset, int threshhold) {
        int height = rand.nextInt(threshhold) + 17;
        int xwidth = rand.nextInt(threshhold) + 4;
        int zwidth = rand.nextInt(threshhold) + 4;
        for (int i =-(xwidth)/2; i < (xwidth)/2; i++) {
            for (int j =-(zwidth)/2; j < (zwidth)/2; j++) {
                int gapornot = rand.nextInt(5);
                if (gapornot > 0) {
                    for (int k = 0; k < -(i * i) / (height / 2) + -(j * j) / (height / 2) + height + rand.nextInt(height); k++) {
                        if (y + k - 10 + yoffset < 64) {
                            level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.uncoloredTerracotta.id, 0);
                        }
                        int yeetus = y + k - 10 + yoffset;
                        switch (yeetus) {
                            case 64:
                            case 65:
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.uncoloredTerracotta.id, 0);
                                break;
                            case 70:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.coloredTerracotta.id, 0);
                                break;
                            case 71:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.coloredTerracotta.id, 14);
                                break;
                            case 72:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.coloredTerracotta.id, 0);
                                break;
                            case 73:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.coloredTerracotta.id, 1);
                                break;
                            case 74:
                            case 75:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.uncoloredTerracotta.id, 0);
                                break;
                            case 76:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.coloredTerracotta.id, 2);
                                break;
                            case 77:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.uncoloredTerracotta.id, 0);
                                break;
                            case 78:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.coloredTerracotta.id, 1);
                                break;
                            case 79:
                            case 80:
                            case 81:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.uncoloredTerracotta.id, 0);
                                break;
                            case 82:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.coloredTerracotta.id, 2);
                                break;
                            case 83:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.coloredTerracotta.id, 12);
                                break;
                            case 84:
                            case 85:
                            case 86:
                            case 87:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.uncoloredTerracotta.id, 0);
                                break;
                            case 88:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.coloredTerracotta.id, 7);
                                break;
                            case 89:
                            case 90:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.coloredTerracotta.id, 4);
                                break;
                            case 91:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.coloredTerracotta.id, 7);
                                break;
                            case 92:
                            case 93:
                            case 94:
                            case 95:
                            case 96:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.uncoloredTerracotta.id, 0);
                                break;
                            case 97:
                            case 98:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.coloredTerracotta.id, 1);
                                break;
                            case 99:
                            case 100:
                            case 101:
                            case 102:
                            case 103:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.uncoloredTerracotta.id, 0);
                                break;
                            case 104:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.coloredTerracotta.id, 12);
                                break;
                            case 105:
                            case 106:
                            case 107:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.uncoloredTerracotta.id, 0);
                                break;
                            case 108:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.coloredTerracotta.id, 4);
                                break;
                            case 109:
                            case 110:
                            case 111:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.uncoloredTerracotta.id, 0);
                                break;
                            case 112:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.coloredTerracotta.id, 0);
                                break;
                            case 113:
                            case 114:
                            case 115:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.uncoloredTerracotta.id, 0);
                                break;
                            case 116:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.coloredTerracotta.id, 4);
                                break;
                            case 117:
                            case 118:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.uncoloredTerracotta.id, 0);
                                break;
                            case 119:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.coloredTerracotta.id, 14);
                                break;
                            case 120:
                            case 121:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.uncoloredTerracotta.id, 0);
                                break;
                            case 122:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.coloredTerracotta.id, 4);
                                break;
                            case 123:
                            case 124:
                            case 125:
                            case 126:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.uncoloredTerracotta.id, 0);
                                break;
                            case 127:
                                level.placeBlockWithMetaData(x + i - xwidth / 2 + xoffset, y + k - 10 + yoffset, z + j - zwidth / 2 + zoffset, BlockListener.coloredTerracotta.id, 11);
                                break;
                        }
                    }
                }
            }
        }
        for (int width=-xwidth; width < xwidth * 2; width++) {
            for (int thicc=-zwidth; thicc < zwidth * 2; thicc++) {
                for (int high = 127; high > 32; high--) {
                    int blockcheck = level.getTileId(x + width - xwidth + xoffset, high, z + thicc - zwidth + zoffset);
                    if (blockcheck == BlockBase.GRASS.id || blockcheck == BlockBase.DIRT.id || blockcheck == BlockBase.SANDSTONE.id || blockcheck == BlockBase.SAND.id) {
                        int shouldplace = rand.nextInt((((width/2 * width/2) + (thicc/2 * thicc/2)) + 1)*2);
                        if (shouldplace < (xwidth * zwidth)/8) {
                            level.placeBlockWithMetaData(x + width - xwidth + xoffset, high, z + thicc - zwidth + zoffset, BlockListener.redSandstone.id, 0);
                        }
                        else if (shouldplace < (xwidth * zwidth)/4) {
                            level.placeBlockWithMetaData(x + width - xwidth + xoffset, high, z + thicc - zwidth + zoffset, BlockListener.redSandstone.id, 1);
                        }
                        else if (shouldplace < (xwidth * zwidth)/2) {
                            level.placeBlockWithMetaData(x + width - xwidth + xoffset, high, z + thicc - zwidth + zoffset, BlockListener.redSandstone.id, 2);
                        }
                    }
                }
            }
        }
    }
}
