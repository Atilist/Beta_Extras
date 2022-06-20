package net.martin1912.BetaExtras.Block;

import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.level.Level;
import net.modificationstation.stationapi.api.block.BlockState;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.level.BlockStateView;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.state.StateManager;
import net.modificationstation.stationapi.api.state.property.IntProperty;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

@HasMetaNamedBlockItem
public class GlazedTerracotta extends TemplateBlockBase {

    public GlazedTerracotta(Identifier identifier, Material material) {
        super(identifier, material);
    }

    @Override
    public GlazedTerracotta setHardness(float Hardness) {
        return (GlazedTerracotta) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0: {
                return TextureListener.WhiteGlazedTerracotta;
            }
            case 1: {
                return TextureListener.OrangeGlazedTerracotta;
            }
            case 2: {
                return TextureListener.MagentaGlazedTerracotta;
            }
            case 3: {
                return TextureListener.LightblueGlazedTerracotta;
            }
            case 4: {
                return TextureListener.YellowGlazedTerracotta;
            }
            case 5: {
                return TextureListener.LimeGlazedTerracotta;
            }
            case 6: {
                return TextureListener.PinkGlazedTerracotta;
            }
            case 7: {
                return TextureListener.GrayGlazedTerracotta;
            }
            case 8: {
                return TextureListener.LightgrayGlazedTerracotta;
            }
            case 9: {
                return TextureListener.CyanGlazedTerracotta;
            }
            case 10: {
                return TextureListener.PurpleGlazedTerracotta;
            }
            case 11: {
                return TextureListener.BlueGlazedTerracotta;
            }
            case 12: {
                return TextureListener.BrownGlazedTerracotta;
            }
            case 13: {
                return TextureListener.GreenGlazedTerracotta;
            }
            case 14: {
                return TextureListener.RedGlazedTerracotta;
            }
            case 15: {
                return TextureListener.BlackGlazedTerracotta;
            }
            default:
                return super.getTextureForSide(side, meta);}
    }

    @Override
    public boolean canUse(Level level, int x, int y, int z, PlayerBase player) {
        if (((BlockStateView) level).getBlockState(x, y, z).get(GlazedTerracotta.METASUBSTITUTE) < 15)
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.glazedTerracotta.getDefaultState().with(GlazedTerracotta.METASUBSTITUTE, ((BlockStateView) level).getBlockState(x, y, z).get(GlazedTerracotta.METASUBSTITUTE) + 1));
        else
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.glazedTerracotta.getDefaultState().with(GlazedTerracotta.METASUBSTITUTE, 0));
        return true;
    }

    @Override
    public void appendProperties(StateManager.Builder<BlockBase, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(METASUBSTITUTE);
    }

    public static final IntProperty METASUBSTITUTE = IntProperty.of("metasubstitute", 0, 15);
}
