package net.martin1912.BetaExtras.Block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.render.block.FoliageColour;
import net.minecraft.level.Level;
import net.minecraft.level.TileView;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;


import java.util.Random;
@HasMetaNamedBlockItem
public class ExtraLeaves extends TemplateBlockBase {
    public ExtraLeaves(Identifier identifier, Material material) {
        super(identifier, material);
        setSounds(LEAVES.sounds);
        this.setTicksRandomly(true);
    }
    int[] field_1171;


    @Override
    public void onScheduledTick(Level level, int x, int y, int z, Random rand) {
        if (!level.isClient) {
            int var6 = level.getTileMeta(x, y, z);
            if ((var6 & 8) != 0) {
                byte var7 = 4;
                int var8 = var7 + 1;
                byte var9 = 32;
                int var10 = var9 * var9;
                int var11 = var9 / 2;
                if (this.field_1171 == null) {
                    this.field_1171 = new int[var9 * var9 * var9];
                }

                int var12;
                if (level.method_155(x - var8, y - var8, z - var8, x + var8, y + var8, z + var8)) {
                    var12 = -var7;

                    label111:
                    while(true) {
                        int var13;
                        int var14;
                        int var15;
                        if (var12 > var7) {
                            var12 = 1;

                            while(true) {
                                if (var12 > 4) {
                                    break label111;
                                }

                                for(var13 = -var7; var13 <= var7; ++var13) {
                                    for(var14 = -var7; var14 <= var7; ++var14) {
                                        for(var15 = -var7; var15 <= var7; ++var15) {
                                            if (this.field_1171[(var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11] == var12 - 1) {
                                                int i = (var13 + var11 - 1) * var10 + (var14 + var11) * var9 + var15 + var11;
                                                if (this.field_1171[i] == -2) {
                                                    this.field_1171[i] = var12;
                                                }

                                                int i1 = (var13 + var11 + 1) * var10 + (var14 + var11) * var9 + var15 + var11;
                                                if (this.field_1171[i1] == -2) {
                                                    this.field_1171[i1] = var12;
                                                }

                                                int i2 = (var13 + var11) * var10 + (var14 + var11 - 1) * var9 + var15 + var11;
                                                if (this.field_1171[i2] == -2) {
                                                    this.field_1171[i2] = var12;
                                                }

                                                int i3 = (var13 + var11) * var10 + (var14 + var11 + 1) * var9 + var15 + var11;
                                                if (this.field_1171[i3] == -2) {
                                                    this.field_1171[i3] = var12;
                                                }

                                                int i4 = (var13 + var11) * var10 + (var14 + var11) * var9 + (var15 + var11 - 1);
                                                if (this.field_1171[i4] == -2) {
                                                    this.field_1171[i4] = var12;
                                                }

                                                int i5 = (var13 + var11) * var10 + (var14 + var11) * var9 + var15 + var11 + 1;
                                                if (this.field_1171[i5] == -2) {
                                                    this.field_1171[i5] = var12;
                                                }
                                            }
                                        }
                                    }
                                }

                                ++var12;
                            }
                        }

                        for(var13 = -var7; var13 <= var7; ++var13) {
                            for(var14 = -var7; var14 <= var7; ++var14) {
                                var15 = level.getTileId(x + var12, y + var13, z + var14);
                                int i = (var12 + var11) * var10 + (var13 + var11) * var9 + var14 + var11;
                                if (var15 == BlockListener.extraLogs.id) {
                                    this.field_1171[i] = 0;
                                } else if (var15 == BlockListener.extraLeaves.id) {
                                    this.field_1171[i] = -2;
                                } else {
                                    this.field_1171[i] = -1;
                                }
                            }
                        }

                        ++var12;
                    }
                }

                var12 = this.field_1171[var11 * var10 + var11 * var9 + var11];
                if (var12 >= 0) {
                    level.method_223(x, y, z, var6 & -9);
                } else {
                    this.method_990(level, x, y, z);
                }
            }

        }
    }

    private void method_990(Level arg, int i, int j, int k) {
        this.drop(arg, i, j, k, arg.getTileMeta(i, j, k));
        arg.setTile(i, j, k, 0);
    }


    @Override
    public ExtraLeaves setHardness(float Hardness) {
        return (ExtraLeaves) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        if (i > 7) {
            return i - 8;
        }
        return i;
    }

    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0:
                return TextureListener.SwampLeaves;
            case 1:
                return TextureListener.SkyLeaves;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return TextureListener.SwampLeaves;
            case 9:
                return TextureListener.SkyLeaves;
            default:
                return super.getTextureForSide(side, meta);}

    }

    @Override
    public int getDropCount(Random rand) {
        return rand.nextInt(20) == 0 ? 1 : 0;
    }

    @Override
    @Environment(EnvType.CLIENT)
    public int getBaseColour(int i) {
        if ((i & 1) == 1) {
            return FoliageColour.method_1079();
        } else {
            return (i & 2) == 2 ? FoliageColour.method_1082() : FoliageColour.method_1083();
        }
    }

    @Override
    @Environment(EnvType.CLIENT)
    public int getColourMultiplier(TileView arg, int x, int y, int z) {
        int var5 = arg.getTileMeta(x, y, z);
        if ((var5 & 1) == 1) {
            return FoliageColour.method_1079();
        } else if ((var5 & 2) == 2) {
            return FoliageColour.method_1082();
        } else {
            arg.getBiomeSource().getBiomes(x, z, 1, 1);
            double var6 = arg.getBiomeSource().temperatureNoises[0];
            double var8 = arg.getBiomeSource().rainfallNoises[0];
            return FoliageColour.method_1080(var6, var8);
        }
    }

    @Override
    public int getDropId(int meta, Random rand) {
        return BlockListener.extraSaplings.id;
    }

    @Override
    public boolean isFullOpaque() {
        return false;
    }
}
