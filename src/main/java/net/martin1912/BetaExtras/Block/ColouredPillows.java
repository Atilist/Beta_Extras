package net.martin1912.BetaExtras.Block;

import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityBase;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.level.Level;
import net.minecraft.util.maths.Box;
import net.modificationstation.stationapi.api.block.BlockState;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.level.BlockStateView;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.state.StateManager;
import net.modificationstation.stationapi.api.state.property.IntProperty;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

@HasMetaNamedBlockItem
public class ColouredPillows extends TemplateBlockBase {

    public ColouredPillows(Identifier identifier, Material material) {
        super(identifier, material);
        setSounds(WOOL.sounds);
    }

    @Override
    public ColouredPillows setHardness(float Hardness) {
        return (ColouredPillows) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
        case 0: {
            return TextureListener.WhitePillow;
        }
        case 1: {
            return TextureListener.OrangePillow;
        }
        case 2: {
            return TextureListener.MagentaPillow;
        }
        case 3: {
            return TextureListener.LightbluePillow;
        }
        case 4: {
            return TextureListener.YellowPillow;
        }
        case 5: {
            return TextureListener.LimePillow;
        }
        case 6: {
            return TextureListener.PinkPillow;
        }
        case 7: {
            return TextureListener.GrayPillow;
        }
        case 8: {
            return TextureListener.LightgrayPillow;
        }
        case 9: {
            return TextureListener.CyanPillow;
        }
        case 10: {
            return TextureListener.PurplePillow;
        }
        case 11: {
            return TextureListener.BluePillow;
        }
        case 12: {
            return TextureListener.BrownPillow;
        }
        case 13: {
            return TextureListener.GreenPillow;
        }
        case 14: {
            return TextureListener.RedPillow;
        }
        case 15: {
            return TextureListener.BlackPillow;
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

    @Override
    public boolean canUse(Level level, int x, int y, int z, PlayerBase player) {
        if (((BlockStateView) level).getBlockState(x, y, z).get(ColouredPillows.METASUBSTITUTE) < 15)
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.colouredPillows.getDefaultState().with(ColouredPillows.METASUBSTITUTE, ((BlockStateView) level).getBlockState(x, y, z).get(ColouredPillows.METASUBSTITUTE) + 1));
        else
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.colouredPillows.getDefaultState().with(ColouredPillows.METASUBSTITUTE, 0));
        return true;
    }

    @Override
    public void appendProperties(StateManager.Builder<BlockBase, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(METASUBSTITUTE);
    }

    public static final IntProperty METASUBSTITUTE = IntProperty.of("metasubstitute", 0, 15);
}
