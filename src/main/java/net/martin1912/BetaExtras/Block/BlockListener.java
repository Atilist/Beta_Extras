package net.martin1912.BetaExtras.Block;


import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.BlockBase;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.registry.ModID;
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase;
import net.modificationstation.stationapi.api.template.block.TemplateMushroom;
import net.modificationstation.stationapi.api.template.block.TemplateSapling;
import net.modificationstation.stationapi.api.template.block.*;

import java.util.HashMap;

import static net.modificationstation.stationapi.api.registry.Identifier.of;

public class BlockListener {
    @Entrypoint.ModID
    private ModID modID;

    @EventListener
    public void registerBlocks(BlockRegistryEvent event) {
        thiccBriccs = new ThiccBriccs(of(modID,"ThiccBriccs"), Material.STONE).setHardness(1.5F).setTranslationKey(modID,"thicc_briccs");
        coloredBricks = new ColoredBricks(of(modID,"ColoredBricks"), Material.STONE).setHardness(1.5F).setTranslationKey(modID,"colored_bricks");
        rawThiccBriccs = new RawThiccBriccs(of(modID,"RawThiccBriccs"), Material.CLAY).setHardness(0.5F).setTranslationKey(modID,"raw_thicc_briccs");
        coloredPlanks = new ColoredPlanks(of(modID,"ColoredPlanks"), Material.WOOD).setHardness(1.5F).setTranslationKey(modID,"colored_planks");
        coloredTerracotta = new ColoredTerracotta(of(modID,"ColoredTerracotta"), Material.STONE).setHardness(1.5F).setTranslationKey(modID,"colored_terracotta");
        uncoloredTerracotta = new UncoloredTerracotta(of(modID,"UncoloredTerracotta"), Material.STONE).setHardness(1.5F).setTranslationKey(modID,"uncolored_terracotta");
        glazedTerracotta = new GlazedTerracotta(of(modID,"GlazedTerracotta"), Material.STONE).setHardness(1.5F).setTranslationKey(modID,"glazed_terracotta");
        coloredThiccBriccs = new ColoredThiccBriccs(of(modID,"ColoredThiccBriccs"), Material.STONE).setHardness(1.5F).setTranslationKey(modID,"colored_thicc_briccs");
        alphaBriccs = new AlphaBriccs(of(modID,"AlphaBriccs"), Material.STONE).setHardness(1.5F).setTranslationKey(modID,"alpha_briccs");
        thiccFlesh = new ThiccFlesh(of(modID,"ThiccFlesh"), Material.DIRT).setHardness(0.5F).setTranslationKey(modID,"thicc_flesh");
        softBlock = new SoftBlock(of(modID,"SoftBlock"), Material.WOOL).setHardness(0.5F).setTranslationKey(modID,"soft_block");
        coloredPillows = new ColoredPillows(of(modID,"ColoredPillows"), Material.WOOL).setHardness(0.5F).setTranslationKey(modID,"colored_pillows");
        alphiumOre = new AlphiumOre(of(modID,"AlphiumOre"), Material.STONE).setHardness(1.5F).setTranslationKey(modID,"alphium_ore");
        coloredLoomedBlocks = new ColoredLoomedBlocks(of(modID,"ColoredLoomedBlocks"), Material.WOOL).setHardness(0.5F).setTranslationKey(modID,"colored_loomed_blocks");
        coloredLeatherCubes = new ColoredLeatherCubes(of(modID,"ColoredLeatherCubes"), Material.WOOL).setHardness(0.5F).setTranslationKey(modID,"colored_leather_cubes");
        bigBrownMushroom = new BigBrownMushroom(of(modID,"BigBrownMushroom")).setHardness(0.1F).setTranslationKey(modID,"big_brown_mushroom");
        bigRedMushroom = new BigRedMushroom(of(modID,"BigRedMushroom")).setHardness(0.1F).setTranslationKey(modID,"big_red_mushroom");
        extraLogs = new ExtraLogs(of(modID,"ExtraLogs"), Material.WOOD).setHardness(1.5F).setTranslationKey(modID,"extra_logs");
        extraLeaves = new ExtraLeaves(of(modID,"ExtraLeaves"), Material.LEAVES).setHardness(0.25F).setTranslationKey(modID,"extra_leaves");
        extraSaplings = new ExtraSaplings(of(modID,"ExtraSaplings")).setHardness(0.0F).setTranslationKey(modID,"extra_saplings");
        superSponge = new SuperSponge(of(modID,"SuperSponge"), Material.SPONGE).setHardness(0.5F).setTranslationKey(modID,"super_sponge");
        oldBriccs = new OldBriccs(of(modID,"OldBriccs"), Material.STONE).setHardness(1.5F).setTranslationKey(modID,"old_briccs");
        hypaThiccBriccs = new HypaThiccBriccs(of("modID,HypaThiccBriccs"), Material.STONE).setHardness(1.5F).setTranslationKey(modID,"hypa_thicc_briccs");
        volcanoBlocks = new VolcanoBlocks(of(modID,"VolcanoBlocks"), Material.STONE).setHardness(1.5F).setBlastResistance(20.0F).setTranslationKey(modID,"volcano_blocks");
        redSandstone = new RedSandstone(of(modID,"RedSandstone"), Material.STONE).setHardness(1.0F).setTranslationKey(modID,"red_sandstone");
        finiteLiquid = new FiniteLiquid(of(modID,"FiniteLiquid"), Material.LAVA).setHardness(1.0F).setLightEmittance(1.0F).setTranslationKey(modID,"finite_liquid");
        dynamicBasalt = new DynamicBasalt(of(modID,"DynamicBasalt"), Material.STONE).setHardness(1.5F).setLightEmittance(0.2F).setTranslationKey(modID,"dynamic_basalt");
        staticBasalt = new StaticBasalt(of(modID,"StaticBasalt"), Material.STONE).setHardness(1.5F).setTranslationKey(modID,"static_basalt");

        denseSnow = new DenseSnow(of(modID,"DenseSnow"), Material.SNOW).setHardness(0.75F).setTranslationKey(modID,"dense_snow");
        denseIce = new DenseIce(of(modID,"DenseIce"), Material.STONE).setHardness(1.0F).setTranslationKey(modID,"dense_ice");


        coloredToNonColored.put(coloredThiccBriccs.id, new int[]{thiccBriccs.id, 0});
        coloredToNonColored.put(coloredTerracotta.id, new int[]{uncoloredTerracotta.id, 0});
        coloredToNonColored.put(coloredPlanks.id, new int[]{BlockBase.WOOD.id, 0});
        coloredToNonColored.put(coloredBricks.id, new int[]{BlockBase.BRICKS.id, 0});
        coloredToNonColored.put(coloredPillows.id, new int[]{softBlock.id, 0});
        coloredToNonColored.put(coloredLoomedBlocks.id, new int[]{softBlock.id, 1});
        coloredToNonColored.put(coloredLeatherCubes.id, new int[]{softBlock.id, 2});
        coloredToNonColored.put(BlockBase.WOOL.id, new int[]{BlockBase.WOOL.id, 0});
    }

    public static TemplateBlockBase
            thiccBriccs,
            coloredBricks,
            rawThiccBriccs,
            coloredPlanks,
            coloredTerracotta,
            uncoloredTerracotta,
            glazedTerracotta,
            coloredThiccBriccs,
            alphaBriccs,
            thiccFlesh,
            softBlock,
            coloredPillows,
            alphiumOre,
            coloredLoomedBlocks,
            coloredLeatherCubes,
            extraLogs,
            extraLeaves,
            superSponge,
            oldBriccs,
            hypaThiccBriccs,
            volcanoBlocks,
            redSandstone,
            unbreakableSkyBricks,
            finiteLiquid,
            dynamicBasalt,
            staticBasalt,
            denseSnow,
            denseIce;

    public static TemplateMushroom
            bigBrownMushroom,
            bigRedMushroom;

    public static TemplateSapling
            extraSaplings;

    public static HashMap<Integer, int[]> coloredToNonColored = new HashMap<>();
}

