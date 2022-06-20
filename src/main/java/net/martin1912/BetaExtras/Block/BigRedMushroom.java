package net.martin1912.BetaExtras.Block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockBase;
import net.modificationstation.stationapi.api.block.BlockState;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.state.StateManager;
import net.modificationstation.stationapi.api.state.property.IntProperty;
import net.modificationstation.stationapi.api.template.block.TemplateMushroom;


@HasMetaNamedBlockItem
public class BigRedMushroom extends TemplateMushroom {

    public BigRedMushroom(Identifier identifier) {
        super(identifier, 0);
        setSounds(WOOD.sounds);
    }

    @Environment(EnvType.CLIENT)


    @Override
    public BigRedMushroom setHardness(float Hardness) {
        return (BigRedMushroom) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    @Environment(EnvType.CLIENT)
    public int getRenderType() {
        return 0;
    }

    @Override
    public boolean isFullOpaque() {
        return false;
    }

    @Override
    public void appendProperties(StateManager.Builder<BlockBase, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(SIZE);
    }

    public static final IntProperty SIZE = IntProperty.of("size", 0, 2);
}
