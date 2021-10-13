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
public class ColoredLeatherCubes extends TemplateBlockBase {

    public ColoredLeatherCubes(Identifier identifier, Material material) {
        super(identifier, material);
        setSounds(WOOL.sounds);
    }

    @Override
    public ColoredLeatherCubes setHardness(float Hardness) {
        return (ColoredLeatherCubes) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0: {
                return TextureListener.WhiteLeatherCube;
            }
            case 1: {
                return TextureListener.OrangeLeatherCube;
            }
            case 2: {
                return TextureListener.MagentaLeatherCube;
            }
            case 3: {
                return TextureListener.LightblueLeatherCube;
            }
            case 4: {
                return TextureListener.YellowLeatherCube;
            }
            case 5: {
                return TextureListener.LimeLeatherCube;
            }
            case 6: {
                return TextureListener.PinkLeatherCube;
            }
            case 7: {
                return TextureListener.GrayLeatherCube;
            }
            case 8: {
                return TextureListener.LightgrayLeatherCube;
            }
            case 9: {
                return TextureListener.CyanLeatherCube;
            }
            case 10: {
                return TextureListener.PurpleLeatherCube;
            }
            case 11: {
                return TextureListener.BlueLeatherCube;
            }
            case 12: {
                return TextureListener.BrownLeatherCube;
            }
            case 13: {
                return TextureListener.GreenLeatherCube;
            }
            case 14: {
                return TextureListener.RedLeatherCube;
            }
            case 15: {
                return TextureListener.BlackLeatherCube;
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
