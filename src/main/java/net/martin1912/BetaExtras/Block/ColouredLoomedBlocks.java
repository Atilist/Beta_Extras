package net.martin1912.BetaExtras.Block;


import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityBase;
import net.minecraft.level.Level;
import net.minecraft.util.maths.Box;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

@HasMetaNamedBlockItem
public class ColouredLoomedBlocks extends TemplateBlockBase {

    public ColouredLoomedBlocks(Identifier identifier, Material material) {
        super(identifier, material);
        setSounds(WOOL.sounds);
    }

    @Override
    public ColouredLoomedBlocks setHardness(float Hardness) {
        return (ColouredLoomedBlocks) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0: {
                return TextureListener.WhiteLoomedBlock;
            }
            case 1: {
                return TextureListener.OrangeLoomedBlock;
            }
            case 2: {
                return TextureListener.MagentaLoomedBlock;
            }
            case 3: {
                return TextureListener.LightblueLoomedBlock;
            }
            case 4: {
                return TextureListener.YellowLoomedBlock;
            }
            case 5: {
                return TextureListener.LimeLoomedBlock;
            }
            case 6: {
                return TextureListener.PinkLoomedBlock;
            }
            case 7: {
                return TextureListener.GrayLoomedBlock;
            }
            case 8: {
                return TextureListener.LightgrayLoomedBlock;
            }
            case 9: {
                return TextureListener.CyanLoomedBlock;
            }
            case 10: {
                return TextureListener.PurpleLoomedBlock;
            }
            case 11: {
                return TextureListener.BlueLoomedBlock;
            }
            case 12: {
                return TextureListener.BrownLoomedBlock;
            }
            case 13: {
                return TextureListener.GreenLoomedBlock;
            }
            case 14: {
                return TextureListener.RedLoomedBlock;
            }
            case 15: {
                return TextureListener.BlackLoomedBlock;
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
