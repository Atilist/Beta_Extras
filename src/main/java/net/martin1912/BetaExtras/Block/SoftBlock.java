package net.martin1912.BetaExtras.Block;

import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityBase;
import net.minecraft.level.Level;
import net.minecraft.util.maths.Box;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

@HasMetaNamedBlockItem
public class SoftBlock extends TemplateBlockBase {

    public SoftBlock(Identifier identifier, Material material) {
        super(identifier, material);
        setSounds(WOOL.sounds);
    }

    @Override
    public SoftBlock setHardness(float Hardness) {
        return (SoftBlock) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0: {
                return TextureListener.Pillow;
            }
            case 1: {
                return TextureListener.LoomedBlock;
            }
            case 2: {
                return TextureListener.LeatherCube;
            }
            default:
                return super.getTextureForSide(side, meta);}
    }

    @Override
    public void onEntityCollision(Level arg, int i, int j, int k, EntityBase arg1) {
        arg1.velocityY *= 0.4D;
    }
    public Box getCollisionShape(Level level, int x, int y, int z) {
        float var5 = 0.35F;
        return Box.create((double)x, (double)y, (double)z, (double)(x + 1), (double)((float)(y + 1) - var5), (double)(z + 1));
    }
}
