package net.martin1912.BetaExtras.Block;

import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityBase;
import net.minecraft.entity.player.PlayerBase;
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
public class VolcanoBlocks extends TemplateBlockBase {
    public VolcanoBlocks(Identifier identifier, Material material) {
        super(identifier, material);
        this.setTicksRandomly(true);
    }

    @Override
    public VolcanoBlocks setHardness(float Hardness) {
        return (VolcanoBlocks) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0:
                return TextureListener.VolcanoHeart;
            case 1:
                return TextureListener.CarvedRoughBasalt;
            case 2:
                return TextureListener.CleanBasalt;
            case 3:
                return TextureListener.CarvedCleanBasalt;
            case 4:
                return TextureListener.SmoothBasalt;
            case 5:
                return TextureListener.CarvedSmoothBasalt;
            case 6:
                return TextureListener.BasaltThiccBriccs;
            case 7:
                return TextureListener.BasaltBricks;
            case 8:
                return TextureListener.Pumice;
            case 9:
                return TextureListener.CarvedPumice;
            case 10:
                return TextureListener.SmoothPumice;
            case 11:
                return TextureListener.DarkPumice;
            case 12:
                return TextureListener.RoughBasalt;
            case 13:
                return TextureListener.BasaltPebbles;
            default:
                return super.getTextureForSide(side, meta);}
    }

    @Override
    public void onScheduledTick(Level level, int x, int y, int z, Random rand) {
        /*
        if (level.getTileMeta(x, y, z) == 0) {
            level.method_216(x, y, z, BlockListener.volcanoBlocks.id, 10);
            for (int height = y; height < 127; height++) {
                if (level.getTileId(x, height, z) == BlockListener.dynamicBasalt.id || level.getTileId(x, height, z) == BlockListener.staticBasalt.id) {
                    level.placeBlockWithMetaData(x , height ,z , BlockListener.finiteLiquid.id, level.getTileMeta(x, height, z));
                }
            }
            switch (mode) {
                case 0:
                    timer++;
                    if (timer > 1024) {
                        mode = 1;
                    }
                    break;
                case 1:
                    timer++;
                    if (timer == 1152) {
                        level.playSound(x, y + 20, z, "random.fuse", 2.0F, 0.02F);
                        mode = 2;
                    }
                    break;
                case 2:
                    timer++;
                    if (timer == 1280)
                        level.playSound(x, y + 20, z, "random.explode", 2.0F, 0.5F);
                        erupt(level, x, y, z, rand);
                    mode = 3;
                    break;
                case 3:
                    timer++;
                    if (timer > 1408) {
                        timer = rand.nextInt(512);
                        mode = 0;
                    }
                    break;
            }
        }

         */
    }

    private void erupt(Level level, int x, int y, int z, Random rand) {
        for (int height = y; height <= 127; height++) {
            if (level.getTileId(x, height + 1, z) == 0) {
                level.playSound(x, height, z, "random.explode", 2.0F, 0.5F);
                for (int i = 0; i < rand.nextInt(20) + 25; i++) {
                    int randomizer1 = rand.nextInt(11) - 5;
                    int randomizer2 = rand.nextInt(11) - 5;
                    int randomizer3 = rand.nextInt(5);
                    if (level.getTileId(x + randomizer1, height + randomizer2, z + randomizer3) == 0) {
                        level.placeBlockWithMetaData(x + randomizer1, height + 1 + randomizer2, z + randomizer3, BlockListener.finiteLiquid.id, 15);
                    }
                }
                level.placeBlockWithMetaData(x, height + 1, z, BlockListener.finiteLiquid.id, 15);
                break;
            } else if (level.getTileId(x, height + 1, z) != BlockListener.finiteLiquid.id && level.getTileId(x, height + 1, z) != BlockListener.dynamicBasalt.id) {
                float var1 = 2.5F;
                level.createExplosion(null, x, height + 1, z, var1);
                break;
            }
        }
    }

    int timer = 32;
    short mode = 0;

    @Override
    public boolean canUse(Level level, int x, int y, int z, PlayerBase player) {
        if (((BlockStateView) level).getBlockState(x, y, z).get(VolcanoBlocks.METASUBSTITUTE) < 13)
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.volcanoBlocks.getDefaultState().with(VolcanoBlocks.METASUBSTITUTE, ((BlockStateView) level).getBlockState(x, y, z).get(VolcanoBlocks.METASUBSTITUTE) + 1));
        else
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.volcanoBlocks.getDefaultState().with(VolcanoBlocks.METASUBSTITUTE, 0));
        return true;
    }

    @Override
    public void appendProperties(StateManager.Builder<BlockBase, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(METASUBSTITUTE);
    }

    public static final IntProperty METASUBSTITUTE = IntProperty.of("metasubstitute", 0, 13);
}
