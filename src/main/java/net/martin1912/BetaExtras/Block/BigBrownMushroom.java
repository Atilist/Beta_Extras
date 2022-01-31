package net.martin1912.BetaExtras.Block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateMushroom;

@HasMetaNamedBlockItem
public class BigBrownMushroom extends TemplateMushroom {

    public BigBrownMushroom(Identifier identifier) {
        super(identifier, 0);
        setSounds(WOOD.sounds);
    }

    @Environment(EnvType.CLIENT)
    @Override
    public BigBrownMushroom setHardness(float Hardness) {
        return (BigBrownMushroom) super.setHardness(Hardness);
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
}