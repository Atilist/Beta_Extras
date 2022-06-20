package net.martin1912.BetaExtras.Block;


import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.level.Level;
import net.modificationstation.stationapi.api.block.BlockState;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.item.tool.Pickaxe;
import net.modificationstation.stationapi.api.item.tool.ToolLevel;
import net.modificationstation.stationapi.api.level.BlockStateView;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.state.StateManager;
import net.modificationstation.stationapi.api.state.property.IntProperty;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

@HasMetaNamedBlockItem
public class ThiccBriccs extends TemplateBlockBase {
    public ThiccBriccs(Identifier identifier, Material material) {
        super(identifier, material);
    }

    @Override
    public ThiccBriccs setHardness(float Hardness) {
        return (ThiccBriccs) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        if(i <= 5) {
            return i;
        }
        else {
            switch (i) {
                case 6:
                    return 5;
                case 7:
                    return 7;
                case 8:
                    return 7;
                case 9:
                    return 5;
                case 10:
                    return 5;
                case 11:
                    return 7;
                case 12:
                    return 7;
            }
        }
        return i;
    }

    @Override
    public boolean canUse(Level level, int x, int y, int z, PlayerBase player) {
        if (((BlockStateView) level).getBlockState(x, y, z).get(ThiccBriccs.METASUBSTITUTE) < 15)
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.thiccBriccs.getDefaultState().with(ThiccBriccs.METASUBSTITUTE, ((BlockStateView) level).getBlockState(x, y, z).get(ThiccBriccs.METASUBSTITUTE) + 1));
        else
            ((BlockStateView) level).setBlockState(x, y, z, BlockListener.thiccBriccs.getDefaultState().with(ThiccBriccs.METASUBSTITUTE, 0));
        return true;
    }

    @Override
    public void appendProperties(StateManager.Builder<BlockBase, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(METASUBSTITUTE);
    }

    public static final IntProperty METASUBSTITUTE = IntProperty.of("metasubstitute", 0, 15);

    /*
    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0:
                return TextureListener.ThiccBriccs; DONE
            case 1:
                return TextureListener.CutSupahThiccBricc; DONE
            case 2:
                return TextureListener.SupahThiccBricc; DONE
            case 3:
                return TextureListener.SmolBriccs; DONE
            case 4:
                return TextureListener.ThinnBriccs; DONE
            case 5:
                switch (side){
                    case 0:
                        return TextureListener.YesThiccBricc;
                    case 1:
                        return TextureListener.YesThiccBricc;
                    case 2:
                        return TextureListener.ThiccBriccs;
                    case 3:
                        return BRICKS.texture;
                    case 4:
                        return TextureListener.LeftThiccBricc;
                    case 5:
                        return TextureListener.RightThiccBricc;
                } DONE
            case 6:
                switch (side){
                    case 0:
                        return TextureListener.RightThiccBricc;
                    case 1:
                        return TextureListener.RightThiccBricc;
                    case 2:
                        return TextureListener.LeftThiccBricc;
                    case 3:
                        return TextureListener.RightThiccBricc;
                    case 4:
                        return BRICKS.texture;
                    case 5:
                        return TextureListener.ThiccBriccs;
                }  DONE
            case 7:
                switch (side){
                    case 0:
                        return TextureListener.YesSupahThiccBricc;
                    case 1:
                        return TextureListener.YesSupahThiccBricc;
                    case 2:
                        return TextureListener.SupahThiccBricc;
                    case 3:
                        return TextureListener.ThiccBriccs;
                    case 4:
                        return TextureListener.LeftSupahThiccBricc;
                    case 5:
                        return TextureListener.RightSupahThiccBricc;
                } DONE
            case 8:
                switch (side){
                    case 0:
                        return TextureListener.RightSupahThiccBricc;
                    case 1:
                        return TextureListener.RightSupahThiccBricc;
                    case 2:
                        return TextureListener.LeftSupahThiccBricc;
                    case 3:
                        return TextureListener.RightSupahThiccBricc;
                    case 4:
                        return TextureListener.ThiccBriccs;
                    case 5:
                        return TextureListener.SupahThiccBricc;
                } DONE
            case 9:
                switch (side){
                    case 0:
                        return TextureListener.NoThiccBricc;
                    case 1:
                        return TextureListener.NoThiccBricc;
                    case 2:
                        return BRICKS.texture;
                    case 3:
                        return TextureListener.ThiccBriccs;
                    case 4:
                        return TextureListener.RightThiccBricc;
                    case 5:
                        return TextureListener.LeftThiccBricc;
                } DONE
            case 10:
                switch (side){
                    case 0:
                        return TextureListener.LeftThiccBricc;
                    case 1:
                        return TextureListener.LeftThiccBricc;
                    case 2:
                        return TextureListener.RightThiccBricc;
                    case 3:
                        return TextureListener.LeftThiccBricc;
                    case 4:
                        return TextureListener.ThiccBriccs;
                    case 5:
                        return BRICKS.texture;
                } DONE
            case 11:
                switch (side){
                    case 0:
                        return TextureListener.NoSupahThiccBricc;
                    case 1:
                        return TextureListener.NoSupahThiccBricc;
                    case 2:
                        return TextureListener.ThiccBriccs;
                    case 3:
                        return TextureListener.SupahThiccBricc;
                    case 4:
                        return TextureListener.RightSupahThiccBricc;
                    case 5:
                        return TextureListener.LeftSupahThiccBricc;
                } DONE
            case 12:
                switch (side){
                    case 0:
                        return TextureListener.LeftSupahThiccBricc;
                    case 1:
                        return TextureListener.LeftSupahThiccBricc;
                    case 2:
                        return TextureListener.RightSupahThiccBricc;
                    case 3:
                        return TextureListener.LeftSupahThiccBricc;
                    case 4:
                        return TextureListener.SupahThiccBricc;
                    case 5:
                        return TextureListener.ThiccBriccs;
                } DONE
            case 13:
                return TextureListener.CursedBricks; DONE?
            case 14:
                return TextureListener.SuperCursedBricks; DONE?
            case 15:
                return TextureListener.HyperCursedBricks; DONE?
            default:
                return super.getTextureForSide(side, meta);
        }
    }

     */
}