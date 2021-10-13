package net.martin1912.BetaExtras.Block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.level.Level;
import net.minecraft.level.TileView;
import net.modificationstation.stationapi.api.client.model.Model;
import net.modificationstation.stationapi.api.client.model.block.BlockInventoryModelProvider;
import net.modificationstation.stationapi.api.client.model.block.BlockWorldModelProvider;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateMushroom;

import javax.swing.text.html.BlockView;

@HasMetaNamedBlockItem
public class BigBrownMushroom extends TemplateMushroom implements BlockWorldModelProvider, BlockInventoryModelProvider {

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

    @Override
    public Model getCustomWorldModel(TileView blockView, int x, int y, int z) {
        switch (blockView.getTileMeta(x, y, z)) {
            case 0:
                return ModelListener.brownMushroomBlockModel;
            case 1:
                return ModelListener.biggerBrownMushroomBlockModel;
            case 2:
                return ModelListener.biggererBrownMushroomBlockModel;
            default:
                return ModelListener.brownMushroomBlockModel;
        }
    }

    @Override
    public Model getInventoryModel(int meta) {
        switch (meta) {
            case 0:
                return ModelListener.brownMushroomBlockModel;
            case 1:
                return ModelListener.biggerBrownMushroomBlockModel;
            case 2:
                return ModelListener.biggererBrownMushroomBlockModel;
            default:
                return ModelListener.brownMushroomBlockModel;
        }
    }
}