package net.martin1912.BetaExtras.Block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.render.block.FoliageColour;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.level.BlockView;
import net.minecraft.level.Level;
import net.modificationstation.stationapi.api.block.BlockState;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.level.BlockStateView;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.state.StateManager;
import net.modificationstation.stationapi.api.state.property.IntProperty;
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
        if (!level.isServerSide) {
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
        return switch (meta) {
            case 0 -> TextureListener.SwampLeaves;
            case 1 -> TextureListener.SkyLeaves;
            case 2, 3, 4, 5, 6, 7, 8 -> TextureListener.SwampLeaves;
            case 9 -> TextureListener.SkyLeaves;
            default -> super.getTextureForSide(side, meta);
        };

    }

    @Override
    public int getDropCount(Random rand) {
        return rand.nextInt(20) == 0 ? 1 : 0;
    }

    @Override
    @Environment(EnvType.CLIENT)
    public int getBaseColour(int i) {
        return FoliageColour.method_1079();
    }

    @Override
    @Environment(EnvType.CLIENT)
    public int getColourMultiplier(BlockView arg, int x, int y, int z) {
        return FoliageColour.method_1079();
    }

    @Override
    public int getDropId(int meta, Random rand) {
        return BlockListener.extraSaplings.id;
    }

    @Override
    public boolean isFullOpaque() {
        return false;
    }

    @Override
    public boolean canUse(Level level, int x, int y, int z, PlayerBase player) {
        if (((BlockStateView) level).getBlockState(x, y, z).get(ExtraLeaves.METASUBSTITUTE) < 1)
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.extraLeaves.getDefaultState().with(ExtraLeaves.METASUBSTITUTE, ((BlockStateView) level).getBlockState(x, y, z).get(ExtraLeaves.METASUBSTITUTE) + 1));
        else
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.extraLeaves.getDefaultState().with(ExtraLeaves.METASUBSTITUTE, 0));
        return true;
    }

    @Override
    public void appendProperties(StateManager.Builder<BlockBase, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(METASUBSTITUTE);
    }

    public static final IntProperty METASUBSTITUTE = IntProperty.of("metasubstitute", 0, 1);
}
