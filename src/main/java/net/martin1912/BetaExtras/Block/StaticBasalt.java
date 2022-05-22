package net.martin1912.BetaExtras.Block;

import net.martin1912.BetaExtras.Item.ItemListener;
import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.level.BlockView;
import net.minecraft.level.Level;
import net.minecraft.util.maths.Box;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

import java.util.Random;

@HasMetaNamedBlockItem
public class StaticBasalt extends TemplateBlockBase {
    public StaticBasalt(Identifier identifier, Material material) {
        super(identifier, material);
        this.setTicksRandomly(true);
    }

    @Override
    public StaticBasalt setHardness(float Hardness) {
        return (StaticBasalt) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        return 0;
    }

    @Override
    public int getDropCount(Random rand) {
        return rand.nextInt(4) + 1;
    }

    @Override
    public int getDropId(int meta, Random rand) {
        if (meta < 8)
            return ItemListener.smolBasaltRock.id;
        return ItemListener.thiccBasaltRock.id;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        return TextureListener.RoughBasalt;
    }

    public void method_1060(int i) {
        switch (i) {
            case 0 -> setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
            case 1 -> setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);
            case 2 -> setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.1875F, 1.0F);
            case 3 -> setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
            case 4 -> setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.3125F, 1.0F);
            case 5 -> setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.375F, 1.0F);
            case 6 -> setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.4375F, 1.0F);
            case 7 -> setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
            case 8 -> setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
            case 9 -> setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.625F, 1.0F);
            case 10 -> setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.6875F, 1.0F);
            case 11 -> setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.75F, 1.0F);
            case 12 -> setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.8125F, 1.0F);
            case 13 -> setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.875F, 1.0F);
            case 14 -> setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
            case 15 -> setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
        }

    }

    @Override
    public void onScheduledTick(Level level, int x, int y, int z, Random rand) {
        if (level.getTileId(x, y - 1, z) == BlockBase.GRASS.id) {
            level.placeBlockWithMetaData(x, y - 1, z, BlockBase.DIRT.id, 0);
        }
    }

    @Override
    public Box getCollisionShape(Level level, int x, int y, int z) {
        if (level.getTileMeta(x, y, z) > 6) {
            double height = 0.0625 * (level.getTileMeta(x, y, z) + 1);
            return Box.create((double) x, (double) y, (double) z, (double) (x + 1), (double) ((float) (y + height)), (double) (z + 1));
        }
        return Box.create((double) x, (double) y, (double) z, (double) (x + 1), (double) ((float) (y + 0.5)), (double) (z + 1));
    }

    @Override
    public void updateBoundingBox(BlockView tileView, int x, int y, int z) {
        this.method_1060(tileView.getTileMeta(x, y, z));
    }

    @Override
    public boolean isFullOpaque() {
        return false;
    }

    @Override
    public void onAdjacentBlockUpdate(Level level, int x, int y, int z, int id) {
        if (level.getTileId(x, y + 1, z) == BlockBase.FLOWING_LAVA.id || level.getTileId(x, y + 1, z) == BlockBase.STILL_LAVA.id) {
            level.placeBlockWithMetaData(x, y + 1, z, BlockListener.volcanoBlocks.id, 13);
        }
    }
}
