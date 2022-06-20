package net.martin1912.BetaExtras.Recipes;

import net.martin1912.BetaExtras.Block.BlockListener;
import net.martin1912.BetaExtras.Item.ItemListener;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.BlockBase;
import net.minecraft.item.ItemBase;
import net.minecraft.item.ItemInstance;
import net.modificationstation.stationapi.api.event.recipe.RecipeRegisterEvent;
import net.modificationstation.stationapi.api.recipe.CraftingRegistry;
import net.modificationstation.stationapi.api.recipe.SmeltingRegistry;

public class RecipeListener {
    @EventListener
    public void registerRecipes(RecipeRegisterEvent event) {
        RecipeRegisterEvent.Vanilla type = RecipeRegisterEvent.Vanilla.fromType(event.recipeId);
        switch (type) {
            case CRAFTING_SHAPED: {
            //Shaped Recipes
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.thiccFlesh, 1, 4), "XXX", "XYX", "XXX", 'X', new ItemInstance(ItemListener.dirtBrick), 'Y', new ItemInstance(ItemListener.cursedEssence));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.thiccBriccs, 1, 13), " X ", "XYX", " X ", 'X', new ItemInstance(ItemListener.cursedEssence), 'Y', new ItemInstance(BlockBase.BRICKS));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.thiccBriccs, 1, 14), " X ", "XYX", " X ", 'X', new ItemInstance(ItemListener.cursedEssence), 'Y', new ItemInstance(BlockListener.thiccBriccs, 1, 13));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.thiccBriccs, 1, 15), " X ", "XYX", " X ", 'X', new ItemInstance(ItemListener.cursedEssence), 'Y', new ItemInstance(BlockListener.thiccBriccs, 1, 14));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.thiccFlesh, 1, 3), "XYX", " X ", "XZX", 'X', new ItemInstance(ItemBase.bone), 'Y', new ItemInstance(BlockListener.thiccFlesh, 1, 0), 'Z', new ItemInstance(ItemBase.dyePowder, 1, 0));

                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.alphiumOre, 1, 1), "XXX", "XXX", "XXX", 'X', new ItemInstance(ItemListener.alphium));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.thiccBriccs, 1, 0), "XX", 'X', new ItemInstance(ItemListener.thiccBricc));

                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredBricks, 8, 0), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.BRICKS), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 15));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredBricks, 8, 1), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.BRICKS), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 14));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredBricks, 8, 2), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.BRICKS), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 13));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredBricks, 8, 3), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.BRICKS), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 12));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredBricks, 8, 4), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.BRICKS), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 11));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredBricks, 8, 5), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.BRICKS), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 10));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredBricks, 8, 6), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.BRICKS), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 9));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredBricks, 8, 7), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.BRICKS), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 8));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredBricks, 8, 8), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.BRICKS), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 7));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredBricks, 8, 9), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.BRICKS), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 6));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredBricks, 8, 10), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.BRICKS), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 5));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredBricks, 8, 11), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.BRICKS), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 4));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredBricks, 8, 12), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.BRICKS), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 3));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredBricks, 8, 13), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.BRICKS), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 2));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredBricks, 8, 14), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.BRICKS), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 1));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredBricks, 8, 15), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.BRICKS), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 0));

                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPlanks, 8, 0), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.WOOD), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 15));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPlanks, 8, 1), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.WOOD), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 14));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPlanks, 8, 2), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.WOOD), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 13));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPlanks, 8, 3), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.WOOD), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 12));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPlanks, 8, 4), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.WOOD), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 11));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPlanks, 8, 5), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.WOOD), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 10));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPlanks, 8, 6), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.WOOD), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 9));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPlanks, 8, 7), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.WOOD), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 8));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPlanks, 8, 8), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.WOOD), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 7));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPlanks, 8, 9), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.WOOD), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 6));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPlanks, 8, 10), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.WOOD), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 5));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPlanks, 8, 11), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.WOOD), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 4));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPlanks, 8, 12), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.WOOD), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 3));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPlanks, 8, 13), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.WOOD), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 2));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPlanks, 8, 14), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.WOOD), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 1));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPlanks, 8, 15), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockBase.WOOD), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 0));

                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 0), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.uncolouredTerracotta, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 15));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 1), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.uncolouredTerracotta, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 14));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 2), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.uncolouredTerracotta, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 13));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 3), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.uncolouredTerracotta, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 12));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 4), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.uncolouredTerracotta, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 11));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 5), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.uncolouredTerracotta, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 10));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 6), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.uncolouredTerracotta, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 9));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 7), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.uncolouredTerracotta, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 8));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 8), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.uncolouredTerracotta, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 7));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 9), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.uncolouredTerracotta, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 6));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 10), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.uncolouredTerracotta, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 5));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 11), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.uncolouredTerracotta, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 4));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 12), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.uncolouredTerracotta, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 3));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 13), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.uncolouredTerracotta, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 2));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 14), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.uncolouredTerracotta, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 1));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 15), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.uncolouredTerracotta, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 0));

                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.rawThiccBriccs, 2, 0), " X ", "XYX", " X ", 'X', new ItemInstance(ItemBase.clay, 1, 0), 'Y', new ItemInstance(BlockBase.GRAVEL, 1, 0));
                CraftingRegistry.addShapedRecipe(new ItemInstance(ItemListener.dyeRemover, 1, 0), " X ", " YX", "Y  ", 'X', new ItemInstance(ItemBase.ironIngot  ), 'Y', new ItemInstance(ItemBase.stick, 1, 0));

                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredThiccBriccs, 8, 0), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.thiccBriccs, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 15));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredThiccBriccs, 8, 1), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.thiccBriccs, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 14));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredThiccBriccs, 8, 2), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.thiccBriccs, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 13));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredThiccBriccs, 8, 3), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.thiccBriccs, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 12));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredThiccBriccs, 8, 4), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.thiccBriccs, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 11));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredThiccBriccs, 8, 5), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.thiccBriccs, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 10));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredThiccBriccs, 8, 6), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.thiccBriccs, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 9));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredThiccBriccs, 8, 7), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.thiccBriccs, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 8));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredThiccBriccs, 8, 8), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.thiccBriccs, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 7));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredThiccBriccs, 8, 9), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.thiccBriccs, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 6));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredThiccBriccs, 8, 10), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.thiccBriccs, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 5));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredThiccBriccs, 8, 11), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.thiccBriccs, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 4));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredThiccBriccs, 8, 12), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.thiccBriccs, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 3));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredThiccBriccs, 8, 13), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.thiccBriccs, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 2));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredThiccBriccs, 8, 14), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.thiccBriccs, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 1));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredThiccBriccs, 8, 15), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.thiccBriccs, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 0));

                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.rawThiccBriccs, 1, 1), "XX", 'X', new ItemInstance(ItemListener.rawThiccBricc));

                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.thiccFlesh, 1, 0), "XXX", "XXX", "XXX", 'X', new ItemInstance(ItemBase.dyePowder, 1, 0));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.thiccFlesh, 1, 1), "XXX", "XXX", "XXX", 'X', new ItemInstance(ItemBase.rawPorkchop, 1, 0));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.thiccFlesh, 1, 2), "XXX", "XXX", "XXX", 'X', new ItemInstance(ItemBase.cookedPorkchop, 1, 0));

                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.softBlock, 1, 0), "XXX", "XXX", "XXX", 'X', new ItemInstance(ItemBase.feather));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.softBlock, 1, 1), "XXX", "XXX", "XXX", 'X', new ItemInstance(ItemBase.string));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.softBlock, 1, 2), "XXX", "XXX", "XXX", 'X', new ItemInstance(ItemBase.leather));

                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPillows, 8, 0), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 15));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPillows, 8, 1), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 14));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPillows, 8, 2), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 13));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPillows, 8, 3), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 12));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPillows, 8, 4), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 11));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPillows, 8, 5), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 10));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPillows, 8, 6), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 9));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPillows, 8, 7), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 8));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPillows, 8, 8), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 7));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPillows, 8, 9), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 6));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPillows, 8, 10), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 5));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPillows, 8, 11), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 4));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPillows, 8, 12), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 3));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPillows, 8, 13), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 2));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPillows, 8, 14), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 1));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredPillows, 8, 15), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 0));

                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLoomedBlocks, 8, 0), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 1), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 15));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLoomedBlocks, 8, 1), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 1), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 14));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLoomedBlocks, 8, 2), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 1), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 13));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLoomedBlocks, 8, 3), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 1), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 12));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLoomedBlocks, 8, 4), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 1), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 11));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLoomedBlocks, 8, 5), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 1), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 10));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLoomedBlocks, 8, 6), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 1), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 9));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLoomedBlocks, 8, 7), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 1), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 8));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLoomedBlocks, 8, 8), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 1), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 7));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLoomedBlocks, 8, 9), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 1), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 6));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLoomedBlocks, 8, 10), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 1), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 5));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLoomedBlocks, 8, 11), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 1), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 4));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLoomedBlocks, 8, 12), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 1), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 3));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLoomedBlocks, 8, 13), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 1), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 2));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLoomedBlocks, 8, 14), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 1), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 1));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLoomedBlocks, 8, 15), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 1), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 0));

                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLeatherCubes, 8, 0), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 2), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 15));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLeatherCubes, 8, 1), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 2), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 14));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLeatherCubes, 8, 2), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 2), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 13));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLeatherCubes, 8, 3), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 2), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 12));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLeatherCubes, 8, 4), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 2), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 11));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLeatherCubes, 8, 5), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 2), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 10));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLeatherCubes, 8, 6), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 2), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 9));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLeatherCubes, 8, 7), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 2), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 8));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLeatherCubes, 8, 8), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 2), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 7));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLeatherCubes, 8, 9), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 2), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 6));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLeatherCubes, 8, 10), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 2), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 5));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLeatherCubes, 8, 11), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 2), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 4));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLeatherCubes, 8, 12), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 2), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 3));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLeatherCubes, 8, 13), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 2), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 2));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLeatherCubes, 8, 14), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 2), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 1));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.colouredLeatherCubes, 8, 15), "XXX", "XYX", "XXX", 'X', new ItemInstance(BlockListener.softBlock, 1, 2), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 0));

                CraftingRegistry.addShapedRecipe(new ItemInstance(ItemListener.rawThiccBricc), "XX", 'X', new ItemInstance(ItemBase.clay, 1, 1));

                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.superSponge), "YZY", "ZXZ", "YZY", 'X', new ItemInstance(BlockBase.SPONGE), 'Y', new ItemInstance(ItemBase.redstoneDust), 'Z', new ItemInstance(ItemBase.ironIngot));

                //CraftingRegistry.addShapedRecipe(new ItemInstance(ItemListener.rodOfDreams), " YZ", " XY", "X  ", 'X', new ItemInstance(ItemListener.pureAlphium), 'Y', new ItemInstance(ItemBase.goldIngot), 'Z', new ItemInstance(ItemBase.diamond));

                //CraftingRegistry.addShapedRecipe(new ItemInstance(ItemListener.alphiumHoe), " ZZ", " X ", " Y ", 'X', new ItemInstance(ItemListener.pureAlphium), 'Y', new ItemInstance(ItemBase.stick), 'Z', new ItemInstance(ItemBase.ironIngot));
                //CraftingRegistry.addShapedRecipe(new ItemInstance(ItemListener.alphiumHoe), "ZZ ", " X ", " Y ", 'X', new ItemInstance(ItemListener.pureAlphium), 'Y', new ItemInstance(ItemBase.stick), 'Z', new ItemInstance(ItemBase.ironIngot));

                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.rawThiccBriccs, 1, 3), " X ", "XYX", " X ", 'X', new ItemInstance(ItemBase.clay, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 7));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.rawThiccBriccs, 1, 4), " X ", "XYX", " X ", 'X', new ItemInstance(ItemBase.clay, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 8));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.rawThiccBriccs, 1, 5), " X ", "XYX", " X ", 'X', new ItemInstance(ItemBase.clay, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 0));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.rawThiccBriccs, 1, 6), " X ", "XYX", " X ", 'X', new ItemInstance(ItemBase.clay, 1, 0), 'Y', new ItemInstance(ItemBase.dyePowder, 1, 15));

                //CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.alphiumOre, 1, 4), "XXX", "XXX", "XXX", 'X', new ItemInstance(ItemListener.pureAlphium));

                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.uncolouredTerracotta, 2, 2), "XX", 'X', new ItemInstance(BlockListener.uncolouredTerracotta, 1, 1));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.uncolouredTerracotta, 2, 2), "X", "X", 'X', new ItemInstance(BlockListener.uncolouredTerracotta, 1, 1));

                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.uncolouredTerracotta, 3, 6), "XX", " X", 'X', new ItemInstance(BlockListener.uncolouredTerracotta, 1, 1));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.uncolouredTerracotta, 3, 6), "X ", "XX", 'X', new ItemInstance(BlockListener.uncolouredTerracotta, 1, 1));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.uncolouredTerracotta, 3, 6), " X", "XX", 'X', new ItemInstance(BlockListener.uncolouredTerracotta, 1, 1));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.uncolouredTerracotta, 3, 6), "XX", "X ", 'X', new ItemInstance(BlockListener.uncolouredTerracotta, 1, 1));

                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.volcanoBlocks, 1, 12), "XX", "XX", 'X', new ItemInstance(ItemListener.thiccBasaltRock));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.volcanoBlocks, 2, 1), " X ", "XYX", " X ", 'X', new ItemInstance(ItemBase.flint), 'Y', new ItemInstance(BlockListener.volcanoBlocks.id, 1, 12));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.volcanoBlocks, 4, 6), "XX", "XX", 'X', new ItemInstance(BlockListener.volcanoBlocks.id, 1, 2));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.volcanoBlocks, 4, 7), "XX", "XX", 'X', new ItemInstance(BlockListener.volcanoBlocks.id, 1, 4));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.volcanoBlocks, 2, 4), " X ", "XYX", " X ", 'X', new ItemInstance(ItemListener.smolBasaltRock), 'Y', new ItemInstance(BlockListener.volcanoBlocks.id, 1, 8));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.volcanoBlocks, 4, 9), "XY", "YX", 'X', new ItemInstance(BlockListener.volcanoBlocks.id, 1, 8), 'Y', new ItemInstance(ItemListener.smolBasaltRock));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.volcanoBlocks, 4, 9), "YX", "XY", 'X', new ItemInstance(BlockListener.volcanoBlocks.id, 1, 8), 'Y', new ItemInstance(ItemListener.smolBasaltRock));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.volcanoBlocks, 6, 11), "YXY", "XYX", "YXY", 'X', new ItemInstance(ItemListener.smolBasaltRock), 'Y', new ItemInstance(BlockListener.volcanoBlocks.id, 1, 10));

                CraftingRegistry.addShapedRecipe(new ItemInstance(ItemListener.dirtBrick, 4, 0), "XY", "YX", 'X', new ItemInstance(ItemBase.brick), 'Y', new ItemInstance(BlockBase.DIRT, 1, 0));
                CraftingRegistry.addShapedRecipe(new ItemInstance(ItemListener.dirtBrick, 4, 0), "YX", "XY", 'X', new ItemInstance(ItemBase.brick), 'Y', new ItemInstance(BlockBase.DIRT, 1, 0));

                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.redSandstone, 9, 3), "XXX", "YYY", "XXX", 'X', new ItemInstance(BlockListener.redSandstone, 1, 0), 'Y', new ItemInstance(BlockListener.redSandstone, 1, 1));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.redSandstone, 9, 4), "XX", "YY", 'X', new ItemInstance(BlockListener.redSandstone, 1, 0), 'Y', new ItemInstance(BlockListener.redSandstone, 1, 1));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.redSandstone, 9, 5), "XX", "YY", 'X', new ItemInstance(BlockListener.redSandstone, 1, 0), 'Y', new ItemInstance(BlockListener.redSandstone, 1, 2));

                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.denseIce, 4, 4), "XX", "XX", 'X', new ItemInstance(BlockListener.denseIce, 1, 0));
                CraftingRegistry.addShapedRecipe(new ItemInstance(BlockListener.denseIce, 4, 5), "XX", "XX", 'X', new ItemInstance(BlockListener.denseIce, 1, 1));
                break;
            }

            case CRAFTING_SHAPELESS: {
            //Shapeless Recipes
                CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemBase.dyePowder, 9, 0), new ItemInstance(BlockListener.thiccFlesh, 1, 0));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemBase.rawPorkchop, 9), new ItemInstance(BlockListener.thiccFlesh, 1, 1));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemBase.cookedPorkchop, 9), new ItemInstance(BlockListener.thiccFlesh, 1, 2));

                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.rawThiccBriccs, 1, 2), new ItemInstance(BlockListener.rawThiccBriccs, 1, 1));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.rawThiccBriccs, 1, 1), new ItemInstance(BlockListener.rawThiccBriccs, 1, 2));

                CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemListener.rotator), new ItemInstance(ItemListener.dyeRemover));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemListener.dyeRemover), new ItemInstance(ItemListener.rotator));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.thiccBriccs, 2, 5), new ItemInstance(BlockListener.thiccBriccs, 1, 0), new ItemInstance(BlockBase.BRICKS));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.thiccBriccs, 2, 7), new ItemInstance(BlockListener.thiccBriccs, 1, 0), new ItemInstance(BlockListener.thiccBriccs, 1, 1));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.thiccBriccs, 2, 7), new ItemInstance(BlockListener.thiccBriccs, 1, 0), new ItemInstance(BlockListener.thiccBriccs, 1, 2));

                CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemListener.alphium, 9), new ItemInstance(BlockListener.alphiumOre, 1, 1));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemBase.feather, 9), new ItemInstance(BlockListener.softBlock, 1, 0));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemBase.string, 9), new ItemInstance(BlockListener.softBlock, 1, 1));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemBase.leather, 9), new ItemInstance(BlockListener.softBlock, 1, 2));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemListener.mushroomFertilizer, 3), new ItemInstance(ItemBase.stick), new ItemInstance(ItemBase.seeds), new ItemInstance(ItemBase.dyePowder, 1, 15));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockBase.BROWN_MUSHROOM, 2), new ItemInstance(BlockListener.bigBrownMushroom, 1, 0));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockBase.BROWN_MUSHROOM, 4), new ItemInstance(BlockListener.bigBrownMushroom, 1, 1));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockBase.BROWN_MUSHROOM, 8), new ItemInstance(BlockListener.bigBrownMushroom, 1, 2));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockBase.RED_MUSHROOM, 2), new ItemInstance(BlockListener.bigRedMushroom, 1, 0));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockBase.RED_MUSHROOM, 4), new ItemInstance(BlockListener.bigRedMushroom, 1, 1));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockBase.RED_MUSHROOM, 8), new ItemInstance(BlockListener.bigRedMushroom, 1, 2));

                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.alphaBriccs, 1, 0), new ItemInstance(ItemListener.alphium), new ItemInstance(BlockBase.BRICKS, 1, 0));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.alphaBriccs, 1, 1), new ItemInstance(ItemListener.alphium), new ItemInstance(BlockListener.thiccBriccs, 1, 0));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.alphaBriccs, 1, 2), new ItemInstance(ItemListener.alphium), new ItemInstance(BlockListener.thiccBriccs, 1, 1));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.alphaBriccs, 1, 3), new ItemInstance(ItemListener.alphium), new ItemInstance(BlockListener.thiccBriccs, 1, 2));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.alphaBriccs, 1, 4), new ItemInstance(ItemListener.alphium), new ItemInstance(BlockListener.thiccBriccs, 1, 3));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.alphaBriccs, 1, 5), new ItemInstance(ItemListener.alphium), new ItemInstance(BlockListener.thiccBriccs, 1, 4));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.alphaBriccs, 1, 6), new ItemInstance(ItemListener.alphium), new ItemInstance(BlockListener.thiccBriccs, 1, 5));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.alphaBriccs, 1, 8), new ItemInstance(ItemListener.alphium), new ItemInstance(BlockListener.thiccBriccs, 1, 7));

                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.thiccBriccs, 2, 4), new ItemInstance(BlockBase.BRICKS), new ItemInstance(BlockListener.thiccBriccs, 1, 3));

                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockBase.WOOD, 4), new ItemInstance(BlockListener.extraLogs, 1, 0));

                //CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemListener.dungeonKey), new ItemInstance(ItemListener.dungeonKeyBody), new ItemInstance(ItemListener.dungeonKeyHead));

                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.oldBriccs, 2, 0), new ItemInstance(BlockListener.alphaBriccs, 1, 0), new ItemInstance(BlockBase.BRICKS));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.oldBriccs, 2, 1), new ItemInstance(BlockListener.alphaBriccs, 1, 1), new ItemInstance(BlockListener.thiccBriccs, 1, 0));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.oldBriccs, 2, 2), new ItemInstance(BlockListener.alphaBriccs, 1, 2), new ItemInstance(BlockListener.thiccBriccs, 1, 1));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.oldBriccs, 2, 3), new ItemInstance(BlockListener.alphaBriccs, 1, 3), new ItemInstance(BlockListener.thiccBriccs, 1, 2));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.oldBriccs, 2, 4), new ItemInstance(BlockListener.alphaBriccs, 1, 4), new ItemInstance(BlockListener.thiccBriccs, 1, 3));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.oldBriccs, 2, 5), new ItemInstance(BlockListener.alphaBriccs, 1, 5), new ItemInstance(BlockListener.thiccBriccs, 1, 4));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.oldBriccs, 2, 6), new ItemInstance(BlockListener.alphaBriccs, 1, 6), new ItemInstance(BlockListener.thiccBriccs, 1, 5));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.oldBriccs, 2, 8), new ItemInstance(BlockListener.alphaBriccs, 1, 8), new ItemInstance(BlockListener.thiccBriccs, 1, 7));

                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.hypaThiccBriccs, 1, 8), new ItemInstance(BlockListener.hypaThiccBriccs, 1, 0), new ItemInstance(ItemListener.alphium));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.hypaThiccBriccs, 1, 9), new ItemInstance(BlockListener.hypaThiccBriccs, 1, 1), new ItemInstance(ItemListener.alphium));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.hypaThiccBriccs, 1, 10), new ItemInstance(BlockListener.hypaThiccBriccs, 1, 2), new ItemInstance(ItemListener.alphium));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.hypaThiccBriccs, 1, 11), new ItemInstance(BlockListener.hypaThiccBriccs, 1, 3), new ItemInstance(ItemListener.alphium));

                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.hypaThiccBriccs, 2, 4), new ItemInstance(BlockListener.hypaThiccBriccs, 1, 0), new ItemInstance(BlockListener.hypaThiccBriccs, 1, 8));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.hypaThiccBriccs, 2, 5), new ItemInstance(BlockListener.hypaThiccBriccs, 1, 1), new ItemInstance(BlockListener.hypaThiccBriccs, 1, 9));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.hypaThiccBriccs, 2, 6), new ItemInstance(BlockListener.hypaThiccBriccs, 1, 2), new ItemInstance(BlockListener.hypaThiccBriccs, 1, 10));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.hypaThiccBriccs, 2, 7), new ItemInstance(BlockListener.hypaThiccBriccs, 1, 3), new ItemInstance(BlockListener.hypaThiccBriccs, 1, 11));

                //CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemListener.skyBedItem), new ItemInstance(ItemListener.rodOfDreams), new ItemInstance(ItemBase.bed));

                //CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.thiccBriccs, 1, 13), new ItemInstance(ItemListener.rodOfDreams), new ItemInstance(BlockBase.BRICKS));

                CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemListener.thiccBasaltRock), new ItemInstance(ItemListener.smolBasaltRock), new ItemInstance(ItemListener.smolBasaltRock), new ItemInstance(ItemListener.smolBasaltRock), new ItemInstance(ItemListener.smolBasaltRock));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(ItemListener.smolBasaltRock, 4), new ItemInstance(ItemListener.thiccBasaltRock));

                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.thiccFlesh, 1, 5), new ItemInstance(BlockListener.thiccFlesh, 1, 4), new ItemInstance(ItemListener.cursedEssence, 1, 0));
                CraftingRegistry.addShapelessRecipe(new ItemInstance(BlockListener.thiccFlesh, 1, 6), new ItemInstance(BlockListener.thiccFlesh, 1, 5), new ItemInstance(ItemListener.cursedEssence, 1, 0));
                break;
            }

            case SMELTING: {
            //Smelt stuff
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.rawThiccBriccs, 1, 2), new ItemInstance(BlockListener.thiccBriccs, 1, 2));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.rawThiccBriccs, 1, 1), new ItemInstance(BlockListener.thiccBriccs, 1, 1));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.rawThiccBriccs, 1, 0), new ItemInstance(BlockListener.thiccBriccs, 1, 3));

                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(ItemListener.rawThiccBricc), new ItemInstance(ItemListener.thiccBricc));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.alphiumOre), new ItemInstance(ItemListener.alphium));

                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 1 ,0), new ItemInstance(BlockListener.glazedTerracotta, 1, 0));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 1 ,1), new ItemInstance(BlockListener.glazedTerracotta, 1, 1));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 1 ,2), new ItemInstance(BlockListener.glazedTerracotta, 1, 2));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 1 ,3), new ItemInstance(BlockListener.glazedTerracotta, 1, 3));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 1 ,4), new ItemInstance(BlockListener.glazedTerracotta, 1, 4));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 1 ,5), new ItemInstance(BlockListener.glazedTerracotta, 1, 5));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 1 ,6), new ItemInstance(BlockListener.glazedTerracotta, 1, 6));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 1 ,7), new ItemInstance(BlockListener.glazedTerracotta, 1, 7));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 1 ,8), new ItemInstance(BlockListener.glazedTerracotta, 1, 8));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 1 ,9), new ItemInstance(BlockListener.glazedTerracotta, 1, 9));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 1 ,10), new ItemInstance(BlockListener.glazedTerracotta, 1, 10));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 1 ,11), new ItemInstance(BlockListener.glazedTerracotta, 1, 11));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 1 ,12), new ItemInstance(BlockListener.glazedTerracotta, 1, 12));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 1 ,13), new ItemInstance(BlockListener.glazedTerracotta, 1, 13));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 1 ,14), new ItemInstance(BlockListener.glazedTerracotta, 1, 14));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 1 ,15), new ItemInstance(BlockListener.glazedTerracotta, 1, 15));

                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 0), new ItemInstance(BlockListener.glazedTerracotta, 1, 0));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 1), new ItemInstance(BlockListener.glazedTerracotta, 1, 1));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 2), new ItemInstance(BlockListener.glazedTerracotta, 1, 2));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 3), new ItemInstance(BlockListener.glazedTerracotta, 1, 3));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 4), new ItemInstance(BlockListener.glazedTerracotta, 1, 4));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 5), new ItemInstance(BlockListener.glazedTerracotta, 1, 5));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 6), new ItemInstance(BlockListener.glazedTerracotta, 1, 6));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 7), new ItemInstance(BlockListener.glazedTerracotta, 1, 7));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 8), new ItemInstance(BlockListener.glazedTerracotta, 1, 8));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 9), new ItemInstance(BlockListener.glazedTerracotta, 1, 9));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 10), new ItemInstance(BlockListener.glazedTerracotta, 1, 10));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 11), new ItemInstance(BlockListener.glazedTerracotta, 1, 11));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 12), new ItemInstance(BlockListener.glazedTerracotta, 1, 12));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 13), new ItemInstance(BlockListener.glazedTerracotta, 1, 13));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 14), new ItemInstance(BlockListener.glazedTerracotta, 1, 14));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.colouredTerracotta, 8, 15), new ItemInstance(BlockListener.glazedTerracotta, 1, 15));

                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockBase.CLAY), new ItemInstance(BlockListener.uncolouredTerracotta, 1, 0));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.uncolouredTerracotta, 1 , 0), new ItemInstance(BlockListener.uncolouredTerracotta, 1, 1));

                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.superSponge, 1 , 1), new ItemInstance(BlockListener.superSponge, 1, 0));

                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.rawThiccBriccs, 1 , 3), new ItemInstance(BlockListener.hypaThiccBriccs, 1, 0));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.rawThiccBriccs, 1 , 4), new ItemInstance(BlockListener.hypaThiccBriccs, 1, 1));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.rawThiccBriccs, 1 , 5), new ItemInstance(BlockListener.hypaThiccBriccs, 1, 2));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.rawThiccBriccs, 1 , 6), new ItemInstance(BlockListener.hypaThiccBriccs, 1, 3));

                //SmeltingRegistry.addSmeltingRecipe(new ItemInstance(ItemListener.coldEnergiumite, 1), new ItemInstance(ItemListener.energiumite));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.thiccFlesh, 1, 3), new ItemInstance(ItemListener.cursedEssence));

                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.volcanoBlocks, 1, 12), new ItemInstance(BlockListener.volcanoBlocks, 1, 2));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.volcanoBlocks, 1, 4), new ItemInstance(BlockListener.volcanoBlocks, 1, 5));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.volcanoBlocks, 1, 2), new ItemInstance(BlockListener.volcanoBlocks, 1, 3));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.volcanoBlocks, 1, 8), new ItemInstance(BlockListener.volcanoBlocks, 1, 10));

                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.denseIce, 1, 2), new ItemInstance(ItemBase.ironIngot));
                SmeltingRegistry.addSmeltingRecipe(new ItemInstance(BlockListener.denseIce, 1, 3), new ItemInstance(ItemBase.goldIngot));
                break;
            }
        }
    }
}