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
public class UncolouredTerracotta extends TemplateBlockBase {

    public UncolouredTerracotta(Identifier identifier, Material material) {
        super(identifier, material);
    }

    @Override
    public UncolouredTerracotta setHardness(float Hardness) {
        return (UncolouredTerracotta) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        if (i > 1 && i < 6) {
            return 2;
        }
        else if (i > 5) {
            return 6;
        }
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0:
                return TextureListener.Terracotta;
            case 1:
                return TextureListener.GlazedTerracotta;
            case 2:
                return TextureListener.GlazedTerracottaEdge;
            case 3:
                return TextureListener.GlazedTerracottaEdge0;
            case 4:
                return TextureListener.GlazedTerracottaEdge1;
            case 5:
                return TextureListener.GlazedTerracottaEdge2;
            case 6:
                return TextureListener.GlazedTerracottaCorner;
            case 7:
                return TextureListener.GlazedTerracottaCorner0;
            case 8:
                return TextureListener.GlazedTerracottaCorner1;
            case 9:
                return TextureListener.GlazedTerracottaCorner2;
            default:
                return super.getTextureForSide(side, meta);}

    }

    @Override
    public boolean canUse(Level level, int x, int y, int z, PlayerBase player) {
        if (((BlockStateView) level).getBlockState(x, y, z).get(UncolouredTerracotta.METASUBSTITUTE) < 9)
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.uncolouredTerracotta.getDefaultState().with(UncolouredTerracotta.METASUBSTITUTE, ((BlockStateView) level).getBlockState(x, y, z).get(UncolouredTerracotta.METASUBSTITUTE) + 1));
        else
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.uncolouredTerracotta.getDefaultState().with(UncolouredTerracotta.METASUBSTITUTE, 0));
        return true;
    }

    @Override
    public void appendProperties(StateManager.Builder<BlockBase, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(METASUBSTITUTE);
    }

    public static final IntProperty METASUBSTITUTE = IntProperty.of("metasubstitute", 0, 9);
}
