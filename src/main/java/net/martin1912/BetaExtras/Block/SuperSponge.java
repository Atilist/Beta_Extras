package net.martin1912.BetaExtras.Block;

import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityBase;
import net.minecraft.entity.Item;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.item.ItemBase;
import net.minecraft.item.ItemInstance;
import net.minecraft.level.Level;
import net.modificationstation.stationapi.api.block.HasMetaNamedBlockItem;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;

@HasMetaNamedBlockItem
public class SuperSponge extends TemplateBlockBase {

    public SuperSponge(Identifier identifier, Material material) {
        super(identifier, material);
        setSounds(LEAVES.sounds);
    }

    @Override
    public void onAdjacentBlockUpdate(Level level, int x, int y, int z, int id) {

    }

    @Override
    public SuperSponge setHardness(float Hardness) {
        return (SuperSponge) super.setHardness(Hardness);
    }

    @Override
    public int droppedMeta(int i) {
        return i;
    }

    @Override
    public int getTextureForSide(int side, int meta) {
        switch (meta) {
            case 0: {
                return TextureListener.DrySuperSponge;
            }
            case 1: {
                return TextureListener.WetSuperSponge;
            }
            default:
                return super.getTextureForSide(side, meta);}
    }

    @Override
    public boolean canUse(Level level, int x, int y, int z, PlayerBase player) {
       int meta = level.getTileMeta(x, y, z);
       switch (meta) {
           case 0:
               int heightoffset = 2;
               while (heightoffset != -3) {
                   int xoffset = 0;
                   while (xoffset < 7) {
                       int line = 0;
                       while (line < 7) {
                           int watercheck = level.getTileId(x - 3 + xoffset, y + heightoffset, z - 3 + line);
                           if (watercheck == BlockBase.FLOWING_WATER.id || watercheck == BlockBase.STILL_WATER.id) {
                               level.placeBlockWithMetaData(x - 3 + xoffset, y + heightoffset, z - 3 + line, 0, 0);
                           }
                           line++;
                       }
                       xoffset++;
                   }
                   heightoffset--;
               }
               level.placeBlockWithMetaData(x, y, z, BlockBase.SPONGE.id, 0);
               level.placeBlockWithMetaData(x, y, z, BlockListener.superSponge.id, 1);
               return true;
           case 1:
               return false;
       }
       return true;
    }
}
