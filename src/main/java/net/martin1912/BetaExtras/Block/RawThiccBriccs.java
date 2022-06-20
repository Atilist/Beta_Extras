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
public class RawThiccBriccs extends TemplateBlockBase {

    public RawThiccBriccs(Identifier identifier, Material material) {
        super(identifier, material);
        setSounds(CLAY.sounds);
    }

    @Override
    public RawThiccBriccs setHardness(float Hardness) { return (RawThiccBriccs) super.setHardness(Hardness); }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0:
                return TextureListener.RawSmolBriccs;
            case 1:
                return TextureListener.RawCutSupahThiccBricc;
            case 2:
                return TextureListener.RawSupahThiccBricc;
            case 3:
                switch (side) {
                    case 0:
                        return TextureListener.RawHypaThiccBriccMiddle;
                    case 1:
                        return TextureListener.RawHypaThiccBriccTopTop;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return TextureListener.RawHypaThiccBriccTop;
                }
            case 4:
                return TextureListener.RawHypaThiccBriccMiddle;
            case 5:
                switch (side) {
                    case 0:
                        return TextureListener.RawHypaThiccBriccBottomBottom;
                    case 1:
                        return TextureListener.RawHypaThiccBriccMiddle;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return TextureListener.RawHypaThiccBriccBottom;
                }
            case 6:
                return TextureListener.RawHypaThiccBriccGlue;
            default:
                return super.getTextureForSide(side, meta);}
        }

    @Override
    public boolean canUse(Level level, int x, int y, int z, PlayerBase player) {
        if (((BlockStateView) level).getBlockState(x, y, z).get(RawThiccBriccs.METASUBSTITUTE) < 6)
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.rawThiccBriccs.getDefaultState().with(RawThiccBriccs.METASUBSTITUTE, ((BlockStateView) level).getBlockState(x, y, z).get(RawThiccBriccs.METASUBSTITUTE) + 1));
        else
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.rawThiccBriccs.getDefaultState().with(RawThiccBriccs.METASUBSTITUTE, 0));
        return true;
    }

    @Override
    public void appendProperties(StateManager.Builder<BlockBase, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(METASUBSTITUTE);
    }

    public static final IntProperty METASUBSTITUTE = IntProperty.of("metasubstitute", 0, 6);
}