package net.martin1912.BetaExtras.Block;

import net.martin1912.BetaExtras.level.gen.structure.SwampTree;
import net.minecraft.level.Level;
import net.minecraft.level.structure.*;
import net.modificationstation.stationapi.api.block.HasCustomBlockItemFactory;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateSapling;


import java.util.Random;
@HasCustomBlockItemFactory(ItemBlockExtraSaplings.class)
public class ExtraSaplings extends TemplateSapling {

    public ExtraSaplings(Identifier identifier) {
        super(identifier, 15);
        setSounds(LEAVES.sounds);
    }

    @Override
    public ExtraSaplings setHardness(float Hardness) {
        return (ExtraSaplings) super.setHardness(Hardness);
    }

    @Override
    protected int droppedMeta(int i) {
        if (i > 7) {
            return i - 8;
        }
        return i;
    }

    @Override
    public void growTree(Level arg, int i, int j, int k, Random random) {
        int var6 = arg.getTileMeta(i, j, k) & 3;
        arg.setTileInChunk(i, j, k, 0);
        Structure var7 = null;
        if (var6 == 0) {
            var7 = new SwampTree();
        }
        assert var7 != null;
        if (!var7.generate(arg, random, i, j, k)) {
            arg.setTileWithMetadata(i, j, k, this.id, var6);
        }
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0:
                return TextureListener.SwampSaplingSmall;
            case 8:
                return TextureListener.SwampSapling;
            default:
                return super.getTextureForSide(side, meta);}
    }

    @Override
    public boolean isFullOpaque() {
        return false;
    }
}