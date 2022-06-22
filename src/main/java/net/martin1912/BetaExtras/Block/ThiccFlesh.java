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
public class ThiccFlesh extends TemplateBlockBase {

    public ThiccFlesh(Identifier identifier, Material material) {
        super(identifier, material);
        setSounds(CLAY.sounds);
    }

    @Override
    public ThiccFlesh setHardness(float Hardness) {
        return (ThiccFlesh) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0: {
                switch (side){
                    case 0:
                        return TextureListener.ThiccInkSacBottom;
                    case 1:
                        return TextureListener.ThiccInkSacTop;
                    case 2:
                    case 5:
                    case 4:
                    case 3:
                        return TextureListener.ThiccInkSacSide;
                }
            }
            case 1: {
                switch (side){
                    case 0:
                        return TextureListener.ThiccRawPorkchopBottom;
                    case 1:
                        return TextureListener.ThiccRawPorkchopTop;
                    case 2:
                    case 5:
                    case 4:
                    case 3:
                        return TextureListener.ThiccRawPorkchopSide;
                }
            }
            case 2: {
                switch (side){
                    case 0:
                        return TextureListener.ThiccCookedPorkchopBottom;
                    case 1:
                        return TextureListener.ThiccCookedPorkchopTop;
                    case 2:
                    case 5:
                    case 4:
                    case 3:
                        return TextureListener.ThiccCookedPorkchopSide;
                }
            }
            case 3:
                switch (side){
                    case 0:
                        return TextureListener.ThiccInkSacBottom;
                    case 1:
                        return TextureListener.ThiccInkSans;
                    case 2:
                    case 5:
                    case 4:
                    case 3:
                        return TextureListener.ThiccInkSacSide;
                }
            case 4:
                return TextureListener.DirtBricks;
            case 5:
                return TextureListener.AbominationBricks;
            case 6:
                return TextureListener.Fabricks;
            default:
                return super.getTextureForSide(side, meta);}
    }

    @Override
    public boolean canUse(Level level, int x, int y, int z, PlayerBase player) {
        if (((BlockStateView) level).getBlockState(x, y, z).get(ThiccFlesh.METASUBSTITUTE) < 6)
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.thiccFlesh.getDefaultState().with(ThiccFlesh.METASUBSTITUTE, ((BlockStateView) level).getBlockState(x, y, z).get(ThiccFlesh.METASUBSTITUTE) + 1));
        else
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.thiccFlesh.getDefaultState().with(ThiccFlesh.METASUBSTITUTE, 0));
        return true;
    }

    @Override
    public void appendProperties(StateManager.Builder<BlockBase, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(METASUBSTITUTE);
    }

    public static final IntProperty METASUBSTITUTE = IntProperty.of("metasubstitute", 0, 6);
}
