package net.martin1912.BetaExtras.Block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.level.Level;
import net.minecraft.level.TileView;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.client.model.Model;
import net.modificationstation.stationapi.api.client.model.block.BlockInventoryModelProvider;
import net.modificationstation.stationapi.api.client.model.block.BlockWorldModelProvider;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;
import net.modificationstation.stationapi.api.template.block.TemplateMushroom;


@HasMetaNamedBlockItem
public class BigRedMushroom extends TemplateMushroom implements BlockWorldModelProvider, BlockInventoryModelProvider {

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
    public Model getInventoryModel(int meta) {
        switch (meta) {
            case 0:
                return ModelListener.redMushroomBlockModel;
            case 1:
                return ModelListener.biggerRedMushroomBlockModel;
            case 2:
                return ModelListener.biggererRedMushroomBlockModel;
            default:
                return ModelListener.redMushroomBlockModel;
        }
    }

    @Override
    public Model getCustomWorldModel(TileView blockView, int x, int y, int z) {
        switch (blockView.getTileMeta(x, y, z)) {
            case 0:
                return ModelListener.redMushroomBlockModel;
            case 1:
                return ModelListener.biggerRedMushroomBlockModel;
            case 2:
                return ModelListener.biggererRedMushroomBlockModel;
            default:
                return ModelListener.redMushroomBlockModel;
        }
    }
}
