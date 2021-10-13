package net.martin1912.BetaExtras.Block;

import net.martin1912.BetaExtras.Item.ItemListener;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.client.texture.atlas.Atlases;
import net.modificationstation.stationapi.api.client.texture.atlas.ExpandableAtlas;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.registry.ModID;

import static net.modificationstation.stationapi.api.registry.Identifier.of;

public class TextureListener {

    @Entrypoint.ModID
    private ModID modID;

    @EventListener
    public void registerTextures(TextureRegisterEvent event) {
        ExpandableAtlas terrain = Atlases.getStationTerrain();
        ExpandableAtlas gui_items = Atlases.getStationGuiItems();
        String path = "/assets/betaextras/stationapi/textures/";

        ItemListener.rawThiccBricc.setTexture(of(modID, "Items/RawThiccBricc"));
        ItemListener.thiccBricc.setTexture(of(modID, "Items/ThiccBricc"));
        ItemListener.alphium.setTexture(of(modID, "Items/Alphium"));
        ItemListener.colorRemover.setTexture(of(modID, "Items/ColorRemover"));
        ItemListener.rotator.setTexture(of(modID, "Items/Rotator"));
        ItemListener.mushroomFertilizer.setTexture(of(modID, "Items/MushroomFertilizer"));
        ItemListener.cursedEssence.setTexture(of(modID, "CursedThings/CursedEssence"));
        ItemListener.dirtBrick.setTexture(of(modID, "CursedThings/DirtBrick"));
        ItemListener.smolBasaltRock.setTexture(of(modID, "Items/SmolBasaltRock"));
        ItemListener.thiccBasaltRock.setTexture(of(modID, "Items/ThiccBasaltRock"));

        ThiccBriccs = terrain.addTexture(of(modID, "ThiccBriccs/ThiccBriccs")).index;
        CutSupahThiccBricc = terrain.addTexture(of(modID, "ThiccBriccs/CutSupahThiccBricc")).index;
        SupahThiccBricc = terrain.addTexture(of(modID, "ThiccBriccs/SupahThiccBricc")).index;
        SmolBriccs = terrain.addTexture(of(modID, "ThiccBriccs/SmolBriccs")).index;
        ThinnBriccs = terrain.addTexture(of(modID, "ThiccBriccs/ThinnBriccs")).index;
        LeftThiccBricc = terrain.addTexture(of(modID, "ThiccBriccs/LeftThiccBricc")).index;
        RightThiccBricc = terrain.addTexture(of(modID, "ThiccBriccs/RightThiccBricc")).index;
        YesThiccBricc = terrain.addTexture(of(modID, "ThiccBriccs/YesThiccBricc")).index;
        NoThiccBricc = terrain.addTexture(of(modID, "ThiccBriccs/NoThiccBricc")).index;
        LeftSupahThiccBricc = terrain.addTexture(of(modID, "ThiccBriccs/LeftSupahThiccBricc")).index;
        RightSupahThiccBricc = terrain.addTexture(of(modID, "ThiccBriccs/RightSupahThiccBricc")).index;
        YesSupahThiccBricc = terrain.addTexture(of(modID, "ThiccBriccs/YesSupahThiccBricc")).index;
        NoSupahThiccBricc = terrain.addTexture(of(modID, "ThiccBriccs/NoSupahThiccBricc")).index;
        CursedBricks = terrain.addTexture(of(modID, "CursedThings/CursedBricks")).index;
        SuperCursedBricks = terrain.addTexture(of(modID, "CursedThings/SuperCursedBricks")).index;
        HyperCursedBricks = terrain.addTexture(of(modID, "CursedThings/HyperCursedBricks")).index;

        WhiteBricks = terrain.addTexture(of(modID, "ColoredBricks/WhiteBricks")).index;
        OrangeBricks = terrain.addTexture(of(modID, "ColoredBricks/OrangeBricks")).index;
        MagentaBricks = terrain.addTexture(of(modID, "ColoredBricks/MagentaBricks")).index;
        LightblueBricks = terrain.addTexture(of(modID, "ColoredBricks/LightblueBricks")).index;
        YellowBricks = terrain.addTexture(of(modID, "ColoredBricks/YellowBricks")).index;
        LimeBricks = terrain.addTexture(of(modID, "ColoredBricks/LimeBricks")).index;
        PinkBricks = terrain.addTexture(of(modID, "ColoredBricks/PinkBricks")).index;
        GrayBricks = terrain.addTexture(of(modID, "ColoredBricks/GrayBricks")).index;
        LightgrayBricks = terrain.addTexture(of(modID, "ColoredBricks/LightgrayBricks")).index;
        CyanBricks = terrain.addTexture(of(modID, "ColoredBricks/CyanBricks")).index;
        PurpleBricks = terrain.addTexture(of(modID, "ColoredBricks/PurpleBricks")).index;
        BlueBricks = terrain.addTexture(of(modID, "ColoredBricks/BlueBricks")).index;
        BrownBricks = terrain.addTexture(of(modID, "ColoredBricks/BrownBricks")).index;
        GreenBricks = terrain.addTexture(of(modID, "ColoredBricks/GreenBricks")).index;
        RedBricks = terrain.addTexture(of(modID, "ColoredBricks/RedBricks")).index;
        BlackBricks = terrain.addTexture(of(modID, "ColoredBricks/BlackBricks")).index;

        WhitePlanks = terrain.addTexture(of(modID, "ColoredPlanks/WhitePlanks")).index;
        OrangePlanks = terrain.addTexture(of(modID, "ColoredPlanks/OrangePlanks")).index;
        MagentaPlanks = terrain.addTexture(of(modID, "ColoredPlanks/MagentaPlanks")).index;
        LightbluePlanks = terrain.addTexture(of(modID, "ColoredPlanks/LightbluePlanks")).index;
        YellowPlanks = terrain.addTexture(of(modID, "ColoredPlanks/YellowPlanks")).index;
        LimePlanks = terrain.addTexture(of(modID, "ColoredPlanks/LimePlanks")).index;
        PinkPlanks = terrain.addTexture(of(modID, "ColoredPlanks/PinkPlanks")).index;
        GrayPlanks = terrain.addTexture(of(modID, "ColoredPlanks/GrayPlanks")).index;
        LightgrayPlanks = terrain.addTexture(of(modID, "ColoredPlanks/LightgrayPlanks")).index;
        CyanPlanks = terrain.addTexture(of(modID, "ColoredPlanks/CyanPlanks")).index;
        PurplePlanks = terrain.addTexture(of(modID, "ColoredPlanks/PurplePlanks")).index;
        BluePlanks = terrain.addTexture(of(modID, "ColoredPlanks/BluePlanks")).index;
        BrownPlanks = terrain.addTexture(of(modID, "ColoredPlanks/BrownPlanks")).index;
        GreenPlanks = terrain.addTexture(of(modID, "ColoredPlanks/GreenPlanks")).index;
        RedPlanks = terrain.addTexture(of(modID, "ColoredPlanks/RedPlanks")).index;
        BlackPlanks = terrain.addTexture(of(modID, "ColoredPlanks/BlackPlanks")).index;

        WhiteTerracotta = terrain.addTexture(of(modID, "ColoredTerracotta/WhiteTerracotta")).index;
        OrangeTerracotta = terrain.addTexture(of(modID, "ColoredTerracotta/OrangeTerracotta")).index;
        MagentaTerracotta = terrain.addTexture(of(modID, "ColoredTerracotta/MagentaTerracotta")).index;
        LightblueTerracotta = terrain.addTexture(of(modID, "ColoredTerracotta/LightblueTerracotta")).index;
        YellowTerracotta = terrain.addTexture(of(modID, "ColoredTerracotta/YellowTerracotta")).index;
        LimeTerracotta = terrain.addTexture(of(modID, "ColoredTerracotta/LimeTerracotta")).index;
        PinkTerracotta = terrain.addTexture(of(modID, "ColoredTerracotta/PinkTerracotta")).index;
        GrayTerracotta = terrain.addTexture(of(modID, "ColoredTerracotta/GrayTerracotta")).index;
        LightgrayTerracotta = terrain.addTexture(of(modID, "ColoredTerracotta/LightgrayTerracotta")).index;
        CyanTerracotta = terrain.addTexture(of(modID, "ColoredTerracotta/CyanTerracotta")).index;
        PurpleTerracotta = terrain.addTexture(of(modID, "ColoredTerracotta/PurpleTerracotta")).index;
        BlueTerracotta = terrain.addTexture(of(modID, "ColoredTerracotta/BlueTerracotta")).index;
        BrownTerracotta = terrain.addTexture(of(modID, "ColoredTerracotta/BrownTerracotta")).index;
        GreenTerracotta = terrain.addTexture(of(modID, "ColoredTerracotta/GreenTerracotta")).index;
        RedTerracotta = terrain.addTexture(of(modID, "ColoredTerracotta/RedTerracotta")).index;
        BlackTerracotta = terrain.addTexture(of(modID, "ColoredTerracotta/BlackTerracotta")).index;

        WhiteGlazedTerracotta = terrain.addTexture(of(modID, "GlazedTerracotta/WhiteGlazedTerracotta")).index;
        OrangeGlazedTerracotta = terrain.addTexture(of(modID, "GlazedTerracotta/OrangeGlazedTerracotta")).index;
        MagentaGlazedTerracotta = terrain.addTexture(of(modID, "GlazedTerracotta/MagentaGlazedTerracotta")).index;
        LightblueGlazedTerracotta = terrain.addTexture(of(modID, "GlazedTerracotta/LightblueGlazedTerracotta")).index;
        YellowGlazedTerracotta = terrain.addTexture(of(modID, "GlazedTerracotta/YellowGlazedTerracotta")).index;
        LimeGlazedTerracotta = terrain.addTexture(of(modID, "GlazedTerracotta/LimeGlazedTerracotta")).index;
        PinkGlazedTerracotta = terrain.addTexture(of(modID, "GlazedTerracotta/PinkGlazedTerracotta")).index;
        GrayGlazedTerracotta = terrain.addTexture(of(modID, "GlazedTerracotta/GrayGlazedTerracotta")).index;
        LightgrayGlazedTerracotta = terrain.addTexture(of(modID, "GlazedTerracotta/LightgrayGlazedTerracotta")).index;
        CyanGlazedTerracotta = terrain.addTexture(of(modID, "GlazedTerracotta/CyanGlazedTerracotta")).index;
        PurpleGlazedTerracotta = terrain.addTexture(of(modID, "GlazedTerracotta/PurpleGlazedTerracotta")).index;
        BlueGlazedTerracotta = terrain.addTexture(of(modID, "GlazedTerracotta/BlueGlazedTerracotta")).index;
        BrownGlazedTerracotta = terrain.addTexture(of(modID, "GlazedTerracotta/BrownGlazedTerracotta")).index;
        GreenGlazedTerracotta = terrain.addTexture(of(modID, "GlazedTerracotta/GreenGlazedTerracotta")).index;
        RedGlazedTerracotta = terrain.addTexture(of(modID, "GlazedTerracotta/RedGlazedTerracotta")).index;
        BlackGlazedTerracotta = terrain.addTexture(of(modID, "GlazedTerracotta/BlackGlazedTerracotta")).index;

        WhiteThiccBriccs = terrain.addTexture(of(modID, "ColoredThiccBriccs/WhiteThiccBriccs")).index;
        OrangeThiccBriccs = terrain.addTexture(of(modID, "ColoredThiccBriccs/OrangeThiccBriccs")).index;
        MagentaThiccBriccs = terrain.addTexture(of(modID, "ColoredThiccBriccs/MagentaThiccBriccs")).index;
        LightblueThiccBriccs = terrain.addTexture(of(modID, "ColoredThiccBriccs/LightblueThiccBriccs")).index;
        YellowThiccBriccs = terrain.addTexture(of(modID, "ColoredThiccBriccs/YellowThiccBriccs")).index;
        LimeThiccBriccs = terrain.addTexture(of(modID, "ColoredThiccBriccs/LimeThiccBriccs")).index;
        PinkThiccBriccs = terrain.addTexture(of(modID, "ColoredThiccBriccs/PinkThiccBriccs")).index;
        GrayThiccBriccs = terrain.addTexture(of(modID, "ColoredThiccBriccs/GrayThiccBriccs")).index;
        LightgrayThiccBriccs = terrain.addTexture(of(modID, "ColoredThiccBriccs/LightgrayThiccBriccs")).index;
        CyanThiccBriccs = terrain.addTexture(of(modID, "ColoredThiccBriccs/CyanThiccBriccs")).index;
        PurpleThiccBriccs = terrain.addTexture(of(modID, "ColoredThiccBriccs/PurpleThiccBriccs")).index;
        BlueThiccBriccs = terrain.addTexture(of(modID, "ColoredThiccBriccs/BlueThiccBriccs")).index;
        BrownThiccBriccs = terrain.addTexture(of(modID, "ColoredThiccBriccs/BrownThiccBriccs")).index;
        GreenThiccBriccs = terrain.addTexture(of(modID, "ColoredThiccBriccs/GreenThiccBriccs")).index;
        RedThiccBriccs = terrain.addTexture(of(modID, "ColoredThiccBriccs/RedThiccBriccs")).index;
        BlackThiccBriccs = terrain.addTexture(of(modID, "ColoredThiccBriccs/BlackThiccBriccs")).index;

        RawSmolBriccs = terrain.addTexture(of(modID, "RawThiccBriccs/RawSmolBriccs")).index;
        RawCutSupahThiccBricc = terrain.addTexture(of(modID, "RawThiccBriccs/RawCutSupahThiccBricc")).index;
        RawSupahThiccBricc = terrain.addTexture(of(modID, "RawThiccBriccs/RawSupahThiccBricc")).index;
        RawHypaThiccBriccTop = terrain.addTexture(of(modID, "RawThiccBriccs/RawHypaThiccBriccTop")).index;
        RawHypaThiccBriccMiddle = terrain.addTexture(of(modID, "RawThiccBriccs/RawHypaThiccBriccMiddle")).index;
        RawHypaThiccBriccBottom = terrain.addTexture(of(modID, "RawThiccBriccs/RawHypaThiccBriccBottom")).index;
        RawHypaThiccBriccGlue = terrain.addTexture(of(modID, "RawThiccBriccs/RawHypaThiccBriccGlue")).index;
        RawHypaThiccBriccTopTop = terrain.addTexture(of(modID, "RawThiccBriccs/RawHypaThiccBriccTopTop")).index;
        RawHypaThiccBriccBottomBottom = terrain.addTexture(of(modID, "RawThiccBriccs/RawHypaThiccBriccBottomBottom")).index;

        AlphaBricks = terrain.addTexture(of(modID, "AlphaBriccs/AlphaBricks")).index;
        AlphaThiccBriccs = terrain.addTexture(of(modID, "AlphaBriccs/AlphaThiccBriccs")).index;
        AlphaCutSupahThiccBricc = terrain.addTexture(of(modID, "AlphaBriccs/AlphaCutSupahThiccBricc")).index;
        AlphaSupahThiccBricc = terrain.addTexture(of(modID, "AlphaBriccs/AlphaSupahThiccBricc")).index;
        AlphaSmolBriccs = terrain.addTexture(of(modID, "AlphaBriccs/AlphaSmolBriccs")).index;
        AlphaThinnBriccs = terrain.addTexture(of(modID, "AlphaBriccs/AlphaThinnBriccs")).index;
        AlphaLeftThiccBricc = terrain.addTexture(of(modID, "AlphaBriccs/AlphaLeftThiccBricc")).index;
        AlphaRightThiccBricc = terrain.addTexture(of(modID, "AlphaBriccs/AlphaRightThiccBricc")).index;
        YesAlphaThiccBricc = terrain.addTexture(of(modID, "AlphaBriccs/YesAlphaThiccBricc")).index;
        NoAlphaThiccBricc = terrain.addTexture(of(modID, "AlphaBriccs/NoAlphaThiccBricc")).index;
        AlphaLeftSupahThiccBricc = terrain.addTexture(of(modID, "AlphaBriccs/AlphaLeftSupahThiccBricc")).index;
        AlphaRightSupahThiccBricc = terrain.addTexture(of(modID, "AlphaBriccs/AlphaRightSupahThiccBricc")).index;
        YesAlphaSupahThiccBricc = terrain.addTexture(of(modID, "AlphaBriccs/YesAlphaSupahThiccBricc")).index;
        NoAlphaSupahThiccBricc = terrain.addTexture(of(modID, "AlphaBriccs/NoAlphaSupahThiccBricc")).index;

        ThiccInkSacBottom = terrain.addTexture(of(modID, "ThiccFlesh/ThiccInkSacBottom")).index;
        ThiccInkSacSide = terrain.addTexture(of(modID, "ThiccFlesh/ThiccInkSacSide")).index;
        ThiccInkSacTop = terrain.addTexture(of(modID, "ThiccFlesh/ThiccInkSacTop")).index;
        ThiccRawPorkchopBottom = terrain.addTexture(of(modID, "ThiccFlesh/ThiccRawPorkchopBottom")).index;
        ThiccRawPorkchopSide = terrain.addTexture(of(modID, "ThiccFlesh/ThiccRawPorkchopSide")).index;
        ThiccRawPorkchopTop = terrain.addTexture(of(modID, "ThiccFlesh/ThiccRawPorkchopTop")).index;
        ThiccCookedPorkchopBottom = terrain.addTexture(of(modID, "ThiccFlesh/ThiccCookedPorkchopBottom")).index;
        ThiccCookedPorkchopSide = terrain.addTexture(of(modID, "ThiccFlesh/ThiccCookedPorkchopSide")).index;
        ThiccCookedPorkchopTop = terrain.addTexture(of(modID, "ThiccFlesh/ThiccCookedPorkchopTop")).index;
        ThiccInkSans = terrain.addTexture(of(modID, "CursedThings/InkSans")).index;
        DirtBricks = terrain.addTexture(of(modID, "CursedThings/DirtBricks")).index;
        AbominationBricks = terrain.addTexture(of(modID, "CursedThings/AbominationBricks")).index;
        Fabricks = terrain.addTexture(of(modID, "CursedThings/Fabricks")).index;

        Terracotta = terrain.addTexture(of(modID, "UncoloredTerracotta/Terracotta")).index;
        GlazedTerracotta = terrain.addTexture(of(modID, "UncoloredTerracotta/GlazedTerracotta")).index;
        GlazedTerracottaEdge = terrain.addTexture(of(modID, "UncoloredTerracotta/GlazedTerracottaEdge")).index;
        GlazedTerracottaEdge0 = terrain.addTexture(of(modID, "UncoloredTerracotta/GlazedTerracottaEdge0")).index;
        GlazedTerracottaEdge1 = terrain.addTexture(of(modID, "UncoloredTerracotta/GlazedTerracottaEdge1")).index;
        GlazedTerracottaEdge2 = terrain.addTexture(of(modID, "UncoloredTerracotta/GlazedTerracottaEdge2")).index;
        GlazedTerracottaCorner = terrain.addTexture(of(modID, "UncoloredTerracotta/GlazedTerracottaCorner")).index;
        GlazedTerracottaCorner0 = terrain.addTexture(of(modID, "UncoloredTerracotta/GlazedTerracottaCorner0")).index;
        GlazedTerracottaCorner1 = terrain.addTexture(of(modID, "UncoloredTerracotta/GlazedTerracottaCorner1")).index;
        GlazedTerracottaCorner2 = terrain.addTexture(of(modID, "UncoloredTerracotta/GlazedTerracottaCorner2")).index;

        Pillow = terrain.addTexture(of(modID, "SoftBlocks/Pillow")).index;
        LoomedBlock = terrain.addTexture(of(modID, "SoftBlocks/LoomedBlock")).index;
        LeatherCube = terrain.addTexture(of(modID, "SoftBlocks/LeatherCube")).index;

        AlphiumOre = terrain.addTexture(of(modID, "Alphium/AlphiumOre")).index;
        AlphiumBlock = terrain.addTexture(of(modID, "Alphium/AlphiumBlock")).index;
        EnergizedAlphium = terrain.addTexture(of(modID, "Alphium/EnergizedAlphium")).index;
        PureAlphiumCompound = terrain.addTexture(of(modID, "Alphium/PureAlphiumCompound")).index;
        PureAlphiumBlock = terrain.addTexture(of(modID, "Alphium/PureAlphiumBlock")).index;

        WhitePillow = terrain.addTexture(of(modID, "ColoredPillows/WhitePillow")).index;
        OrangePillow = terrain.addTexture(of(modID, "ColoredPillows/OrangePillow")).index;
        MagentaPillow = terrain.addTexture(of(modID, "ColoredPillows/MagentaPillow")).index;
        LightbluePillow = terrain.addTexture(of(modID, "ColoredPillows/LightbluePillow")).index;
        YellowPillow = terrain.addTexture(of(modID, "ColoredPillows/YellowPillow")).index;
        LimePillow = terrain.addTexture(of(modID, "ColoredPillows/LimePillow")).index;
        PinkPillow = terrain.addTexture(of(modID, "ColoredPillows/PinkPillow")).index;
        GrayPillow = terrain.addTexture(of(modID, "ColoredPillows/GrayPillow")).index;
        LightgrayPillow = terrain.addTexture(of(modID, "ColoredPillows/LightgrayPillow")).index;
        CyanPillow = terrain.addTexture(of(modID, "ColoredPillows/CyanPillow")).index;
        PurplePillow = terrain.addTexture(of(modID, "ColoredPillows/PurplePillow")).index;
        BluePillow = terrain.addTexture(of(modID, "ColoredPillows/BluePillow")).index;
        BrownPillow = terrain.addTexture(of(modID, "ColoredPillows/BrownPillow")).index;
        GreenPillow = terrain.addTexture(of(modID, "ColoredPillows/GreenPillow")).index;
        RedPillow = terrain.addTexture(of(modID, "ColoredPillows/RedPillow")).index;
        BlackPillow = terrain.addTexture(of(modID, "ColoredPillows/BlackPillow")).index;

        WhiteLoomedBlock = terrain.addTexture(of(modID, "ColoredLoomedBlocks/WhiteLoomedBlock")).index;
        OrangeLoomedBlock = terrain.addTexture(of(modID, "ColoredLoomedBlocks/OrangeLoomedBlock")).index;
        MagentaLoomedBlock = terrain.addTexture(of(modID, "ColoredLoomedBlocks/MagentaLoomedBlock")).index;
        LightblueLoomedBlock = terrain.addTexture(of(modID, "ColoredLoomedBlocks/LightblueLoomedBlock")).index;
        YellowLoomedBlock = terrain.addTexture(of(modID, "ColoredLoomedBlocks/YellowLoomedBlock")).index;
        LimeLoomedBlock = terrain.addTexture(of(modID, "ColoredLoomedBlocks/LimeLoomedBlock")).index;
        PinkLoomedBlock = terrain.addTexture(of(modID, "ColoredLoomedBlocks/PinkLoomedBlock")).index;
        GrayLoomedBlock = terrain.addTexture(of(modID, "ColoredLoomedBlocks/GrayLoomedBlock")).index;
        LightgrayLoomedBlock = terrain.addTexture(of(modID, "ColoredLoomedBlocks/LightgrayLoomedBlock")).index;
        CyanLoomedBlock = terrain.addTexture(of(modID, "ColoredLoomedBlocks/CyanLoomedBlock")).index;
        PurpleLoomedBlock = terrain.addTexture(of(modID, "ColoredLoomedBlocks/PurpleLoomedBlock")).index;
        BlueLoomedBlock = terrain.addTexture(of(modID, "ColoredLoomedBlocks/BlueLoomedBlock")).index;
        BrownLoomedBlock = terrain.addTexture(of(modID, "ColoredLoomedBlocks/BrownLoomedBlock")).index;
        GreenLoomedBlock = terrain.addTexture(of(modID, "ColoredLoomedBlocks/GreenLoomedBlock")).index;
        RedLoomedBlock = terrain.addTexture(of(modID, "ColoredLoomedBlocks/RedLoomedBlock")).index;
        BlackLoomedBlock = terrain.addTexture(of(modID, "ColoredLoomedBlocks/BlackLoomedBlock")).index;

        WhiteLeatherCube = terrain.addTexture(of(modID, "ColoredLeatherCubes/WhiteLeatherCube")).index;
        OrangeLeatherCube = terrain.addTexture(of(modID, "ColoredLeatherCubes/OrangeLeatherCube")).index;
        MagentaLeatherCube = terrain.addTexture(of(modID, "ColoredLeatherCubes/MagentaLeatherCube")).index;
        LightblueLeatherCube = terrain.addTexture(of(modID, "ColoredLeatherCubes/LightblueLeatherCube")).index;
        YellowLeatherCube = terrain.addTexture(of(modID, "ColoredLeatherCubes/YellowLeatherCube")).index;
        LimeLeatherCube = terrain.addTexture(of(modID, "ColoredLeatherCubes/LimeLeatherCube")).index;
        PinkLeatherCube = terrain.addTexture(of(modID, "ColoredLeatherCubes/PinkLeatherCube")).index;
        GrayLeatherCube = terrain.addTexture(of(modID, "ColoredLeatherCubes/GrayLeatherCube")).index;
        LightgrayLeatherCube = terrain.addTexture(of(modID, "ColoredLeatherCubes/LightgrayLeatherCube")).index;
        CyanLeatherCube = terrain.addTexture(of(modID, "ColoredLeatherCubes/CyanLeatherCube")).index;
        PurpleLeatherCube = terrain.addTexture(of(modID, "ColoredLeatherCubes/PurpleLeatherCube")).index;
        BlueLeatherCube = terrain.addTexture(of(modID, "ColoredLeatherCubes/BlueLeatherCube")).index;
        BrownLeatherCube = terrain.addTexture(of(modID, "ColoredLeatherCubes/BrownLeatherCube")).index;
        GreenLeatherCube = terrain.addTexture(of(modID, "ColoredLeatherCubes/GreenLeatherCube")).index;
        RedLeatherCube = terrain.addTexture(of(modID, "ColoredLeatherCubes/RedLeatherCube")).index;
        BlackLeatherCube = terrain.addTexture(of(modID, "ColoredLeatherCubes/BlackLeatherCube")).index;

        SwampLogSide = terrain.addTexture(of(modID, "SwampFoliage/SwampLogSide")).index;
        SwampLogTopBottom = terrain.addTexture(of(modID, "SwampFoliage/SwampLogTopBottom")).index;
        SwampLeaves = terrain.addTexture(of(modID, "SwampFoliage/SwampLeaves")).index;
        SwampSapling = terrain.addTexture(of(modID, "SwampFoliage/SwampSapling")).index;
        SwampSaplingSmall = terrain.addTexture(of(modID, "SwampFoliage/SwampSaplingSmall")).index;

        DrySuperSponge = terrain.addTexture(of(modID, "SuperSponge/DrySuperSponge")).index;
        WetSuperSponge = terrain.addTexture(of(modID, "SuperSponge/WetSuperSponge")).index;

        OldBricks = terrain.addTexture(of(modID, "OldBriccs/OldBricks")).index;
        OldThiccBriccs = terrain.addTexture(of(modID, "OldBriccs/OldThiccBriccs")).index;
        OldCutSupahThiccBricc = terrain.addTexture(of(modID, "OldBriccs/OldCutSupahThiccBricc")).index;
        OldSupahThiccBricc = terrain.addTexture(of(modID, "OldBriccs/OldSupahThiccBricc")).index;
        OldSmolBriccs = terrain.addTexture(of(modID, "OldBriccs/OldSmolBriccs")).index;
        OldThinnBriccs = terrain.addTexture(of(modID, "OldBriccs/OldThinnBriccs")).index;
        OldLeftThiccBricc = terrain.addTexture(of(modID, "OldBriccs/OldLeftThiccBricc")).index;
        OldRightThiccBricc = terrain.addTexture(of(modID, "OldBriccs/OldRightThiccBricc")).index;
        YesOldThiccBricc = terrain.addTexture(of(modID, "OldBriccs/YesOldThiccBricc")).index;
        NoOldThiccBricc = terrain.addTexture(of(modID, "OldBriccs/NoOldThiccBricc")).index;
        OldLeftSupahThiccBricc = terrain.addTexture(of(modID, "OldBriccs/OldLeftSupahThiccBricc")).index;
        OldRightSupahThiccBricc = terrain.addTexture(of(modID, "OldBriccs/OldRightSupahThiccBricc")).index;
        YesOldSupahThiccBricc = terrain.addTexture(of(modID, "OldBriccs/YesOldSupahThiccBricc")).index;
        NoOldSupahThiccBricc = terrain.addTexture(of(modID, "OldBriccs/NoOldSupahThiccBricc")).index;

        HypaThiccBriccTop = terrain.addTexture(of(modID, "HypaThiccBriccs/HypaThiccBriccTop")).index;
        HypaThiccBriccMiddle = terrain.addTexture(of(modID, "HypaThiccBriccs/HypaThiccBriccMiddle")).index;
        HypaThiccBriccBottom = terrain.addTexture(of(modID, "HypaThiccBriccs/HypaThiccBriccBottom")).index;
        HypaThiccBriccGlue = terrain.addTexture(of(modID, "HypaThiccBriccs/HypaThiccBriccGlue")).index;
        HypaThiccBriccTopTop = terrain.addTexture(of(modID, "HypaThiccBriccs/HypaThiccBriccTopTop")).index;
        HypaThiccBriccBottomBottom = terrain.addTexture(of(modID, "HypaThiccBriccs/HypaThiccBriccBottomBottom")).index;

        OldHypaThiccBriccTop = terrain.addTexture(of(modID, "HypaThiccBriccs/OldHypaThiccBriccTop")).index;
        OldHypaThiccBriccMiddle = terrain.addTexture(of(modID, "HypaThiccBriccs/OldHypaThiccBriccMiddle")).index;
        OldHypaThiccBriccBottom = terrain.addTexture(of(modID, "HypaThiccBriccs/OldHypaThiccBriccBottom")).index;
        OldHypaThiccBriccGlue = terrain.addTexture(of(modID, "HypaThiccBriccs/OldHypaThiccBriccGlue")).index;
        OldHypaThiccBriccTopTop = terrain.addTexture(of(modID, "HypaThiccBriccs/OldHypaThiccBriccTopTop")).index;
        OldHypaThiccBriccBottomBottom = terrain.addTexture(of(modID, "HypaThiccBriccs/OldHypaThiccBriccBottomBottom")).index;

        AlphaHypaThiccBriccTop = terrain.addTexture(of(modID, "HypaThiccBriccs/AlphaHypaThiccBriccTop")).index;
        AlphaHypaThiccBriccMiddle = terrain.addTexture(of(modID, "HypaThiccBriccs/AlphaHypaThiccBriccMiddle")).index;
        AlphaHypaThiccBriccBottom = terrain.addTexture(of(modID, "HypaThiccBriccs/AlphaHypaThiccBriccBottom")).index;
        AlphaHypaThiccBriccGlue = terrain.addTexture(of(modID, "HypaThiccBriccs/AlphaHypaThiccBriccGlue")).index;
        AlphaHypaThiccBriccTopTop = terrain.addTexture(of(modID, "HypaThiccBriccs/AlphaHypaThiccBriccTopTop")).index;
        AlphaHypaThiccBriccBottomBottom = terrain.addTexture(of(modID, "HypaThiccBriccs/AlphaHypaThiccBriccBottomBottom")).index;

        RoughBasalt = terrain.addTexture(of(modID, "VolcanoBlocks/RoughBasalt")).index;
        CarvedRoughBasalt = terrain.addTexture(of(modID, "VolcanoBlocks/CarvedRoughBasalt")).index;
        CleanBasalt = terrain.addTexture(of(modID, "VolcanoBlocks/CleanBasalt")).index;
        CarvedCleanBasalt = terrain.addTexture(of(modID, "VolcanoBlocks/CarvedCleanBasalt")).index;
        SmoothBasalt = terrain.addTexture(of(modID, "VolcanoBlocks/SmoothBasalt")).index;
        CarvedSmoothBasalt = terrain.addTexture(of(modID, "VolcanoBlocks/CarvedSmoothBasalt")).index;
        BasaltThiccBriccs = terrain.addTexture(of(modID, "VolcanoBlocks/BasaltThiccBriccs")).index;
        BasaltBricks = terrain.addTexture(of(modID, "VolcanoBlocks/BasaltBricks")).index;
        Pumice = terrain.addTexture(of(modID, "VolcanoBlocks/Pumice")).index;
        CarvedPumice = terrain.addTexture(of(modID, "VolcanoBlocks/CarvedPumice")).index;
        SmoothPumice = terrain.addTexture(of(modID, "VolcanoBlocks/SmoothPumice")).index;
        DarkPumice = terrain.addTexture(of(modID, "VolcanoBlocks/DarkPumice")).index;
        HotRoughBasalt = terrain.addTexture(of(modID, "VolcanoBlocks/HotRoughBasalt")).index;
        BasaltPebbles = terrain.addTexture(of(modID, "VolcanoBlocks/BasaltPebbles")).index;

        OneOne = terrain.addTexture(of(modID, "VolcanoBlocks/OneOne")).index;
        TwoTwo = terrain.addTexture(of(modID, "VolcanoBlocks/TwoTwo")).index;
        ThreeThree = terrain.addTexture(of(modID, "VolcanoBlocks/ThreeThree")).index;
        FourFour = terrain.addTexture(of(modID, "VolcanoBlocks/FourFour")).index;
        FiveFive = terrain.addTexture(of(modID, "VolcanoBlocks/FiveFive")).index;
        SixSix = terrain.addTexture(of(modID, "VolcanoBlocks/SixSix")).index;
        SevenSeven = terrain.addTexture(of(modID, "VolcanoBlocks/SevenSeven")).index;
        EightEight = terrain.addTexture(of(modID, "VolcanoBlocks/EightEight")).index;
        NineNine = terrain.addTexture(of(modID, "VolcanoBlocks/NineNine")).index;
        TenTen = terrain.addTexture(of(modID, "VolcanoBlocks/TenTen")).index;
        ElevenEleven = terrain.addTexture(of(modID, "VolcanoBlocks/ElevenEleven")).index;
        TwelveTwelve = terrain.addTexture(of(modID, "VolcanoBlocks/TwelveTwelve")).index;
        ThirteenThirteen = terrain.addTexture(of(modID, "VolcanoBlocks/ThirteenThirteen")).index;
        FourteenFourteen = terrain.addTexture(of(modID, "VolcanoBlocks/FourteenFourteen")).index;
        FifteenFifteen = terrain.addTexture(of(modID, "VolcanoBlocks/FifteenFifteen")).index;
        VolcanoHeart = terrain.addTexture(of(modID, "VolcanoBlocks/VolcanoHeart")).index;

        RedSandstoneRough = terrain.addTexture(of(modID, "RedSandstone/RedSandstoneRough")).index;
        RedSandstoneSmooth = terrain.addTexture(of(modID, "RedSandstone/RedSandstoneSmooth")).index;
        RedSandstoneSide = terrain.addTexture(of(modID, "RedSandstone/RedSandstoneSide")).index;
        RedSandstoneStacks = terrain.addTexture(of(modID, "RedSandstone/RedSandstoneStacks")).index;
        RedSandstoneStacksBottom = terrain.addTexture(of(modID, "RedSandstone/RedSandstoneStacksBottom")).index;
        RedSandstoneCut = terrain.addTexture(of(modID, "RedSandstone/RedSandstoneCut")).index;
        RedSandstoneCarved = terrain.addTexture(of(modID, "RedSandstone/RedSandstoneCarved")).index;
        PistonBoi = terrain.addTexture(of(modID, "RedSandstone/PistonBoi")).index;
        PistonBoiSolved = terrain.addTexture(of(modID, "RedSandstone/PistonBoiSolved")).index;

        One = terrain.addTexture(of(modID, "LiquidTest/One")).index;
        Two = terrain.addTexture(of(modID, "LiquidTest/Two")).index;
        Three = terrain.addTexture(of(modID, "LiquidTest/Three")).index;
        Four = terrain.addTexture(of(modID, "LiquidTest/Four")).index;
        Five = terrain.addTexture(of(modID, "LiquidTest/Five")).index;
        Six = terrain.addTexture(of(modID, "LiquidTest/Six")).index;
        Seven = terrain.addTexture(of(modID, "LiquidTest/Seven")).index;
        Eight = terrain.addTexture(of(modID, "LiquidTest/Eight")).index;
        Nine = terrain.addTexture(of(modID, "LiquidTest/Nine")).index;
        Ten = terrain.addTexture(of(modID, "LiquidTest/Ten")).index;
        Eleven = terrain.addTexture(of(modID, "LiquidTest/Eleven")).index;
        Twelve = terrain.addTexture(of(modID, "LiquidTest/Twelve")).index;
        Thirteen = terrain.addTexture(of(modID, "LiquidTest/Thirteen")).index;
        Fourteen = terrain.addTexture(of(modID, "LiquidTest/Fourteen")).index;
        Fifteen = terrain.addTexture(of(modID, "LiquidTest/Fifteen")).index;
        Sixteen = terrain.addTexture(of(modID, "LiquidTest/Sixteen")).index;

        DenseSnow = terrain.addTexture(of(modID, "IceBlocks/DenseSnow")).index;
        VeryDenseSnow = terrain.addTexture(of(modID, "IceBlocks/VeryDenseSnow")).index;
        DenseSlush = terrain.addTexture(of(modID, "IceBlocks/DenseSlush")).index;

        DenseIce = terrain.addTexture(of(modID, "IceBlocks/DenseIce")).index;
        VeryDenseIce = terrain.addTexture(of(modID, "IceBlocks/VeryDenseIce")).index;
        IceIron = terrain.addTexture(of(modID, "IceBlocks/IceIron")).index;
        IceGold = terrain.addTexture(of(modID, "IceBlocks/IceGold")).index;
        IceBricks = terrain.addTexture(of(modID, "IceBlocks/IceBricks")).index;
        IceThiccBriccs = terrain.addTexture(of(modID, "IceBlocks/IceThiccBriccs")).index;
    }

    public static int
            ThiccBriccs,
            CutSupahThiccBricc,
            SupahThiccBricc,
            SmolBriccs,
            ThinnBriccs,
            LeftThiccBricc,
            RightThiccBricc,
            LeftSupahThiccBricc,
            RightSupahThiccBricc,
            CursedBricks,
            SuperCursedBricks,
            HyperCursedBricks,

            WhiteThiccBriccs,
            OrangeThiccBriccs,
            MagentaThiccBriccs,
            LightblueThiccBriccs,
            YellowThiccBriccs,
            LimeThiccBriccs,
            PinkThiccBriccs,
            GrayThiccBriccs,
            LightgrayThiccBriccs,
            CyanThiccBriccs,
            PurpleThiccBriccs,
            BlueThiccBriccs,
            BrownThiccBriccs,
            GreenThiccBriccs,
            RedThiccBriccs,
            BlackThiccBriccs,

            WhiteBricks,
            OrangeBricks,
            MagentaBricks,
            LightblueBricks,
            YellowBricks,
            LimeBricks,
            PinkBricks,
            GrayBricks,
            LightgrayBricks,
            CyanBricks,
            PurpleBricks,
            BlueBricks,
            BrownBricks,
            GreenBricks,
            RedBricks,
            BlackBricks,
            WhitePlanks,
            OrangePlanks,
            MagentaPlanks,
            LightbluePlanks,
            YellowPlanks,
            LimePlanks,
            PinkPlanks,
            GrayPlanks,
            LightgrayPlanks,
            CyanPlanks,
            PurplePlanks,
            BluePlanks,
            BrownPlanks,
            GreenPlanks,
            RedPlanks,
            BlackPlanks,

            WhiteTerracotta,
            OrangeTerracotta,
            MagentaTerracotta,
            LightblueTerracotta,
            YellowTerracotta,
            LimeTerracotta,
            PinkTerracotta,
            GrayTerracotta,
            LightgrayTerracotta,
            CyanTerracotta,
            PurpleTerracotta,
            BlueTerracotta,
            BrownTerracotta,
            GreenTerracotta,
            RedTerracotta,
            BlackTerracotta,

            WhiteGlazedTerracotta,
            OrangeGlazedTerracotta,
            MagentaGlazedTerracotta,
            LightblueGlazedTerracotta,
            YellowGlazedTerracotta,
            LimeGlazedTerracotta,
            PinkGlazedTerracotta,
            GrayGlazedTerracotta,
            LightgrayGlazedTerracotta,
            CyanGlazedTerracotta,
            PurpleGlazedTerracotta,
            BlueGlazedTerracotta,
            BrownGlazedTerracotta,
            GreenGlazedTerracotta,
            RedGlazedTerracotta,
            BlackGlazedTerracotta,

            AlphaBricks,
            AlphaThiccBriccs,
            AlphaCutSupahThiccBricc,
            AlphaSupahThiccBricc,
            AlphaSmolBriccs,
            AlphaThinnBriccs,
            AlphaLeftThiccBricc,
            AlphaRightThiccBricc,
            AlphaLeftSupahThiccBricc,
            AlphaRightSupahThiccBricc,

            RawSmolBriccs,
            RawCutSupahThiccBricc,
            RawSupahThiccBricc,
            RawHypaThiccBriccTop,
            RawHypaThiccBriccMiddle,
            RawHypaThiccBriccBottom,
            RawHypaThiccBriccGlue,
            RawHypaThiccBriccTopTop,
            RawHypaThiccBriccBottomBottom,

            ThiccInkSacBottom,
            ThiccInkSacSide,
            ThiccInkSacTop,
            ThiccRawPorkchopBottom,
            ThiccRawPorkchopSide,
            ThiccRawPorkchopTop,
            ThiccCookedPorkchopBottom,
            ThiccCookedPorkchopSide,
            ThiccCookedPorkchopTop,
            ThiccInkSans,
            DirtBricks,
            AbominationBricks,
            Fabricks,

            Terracotta,
            GlazedTerracotta,
            GlazedTerracottaEdge,
            GlazedTerracottaEdge0,
            GlazedTerracottaEdge1,
            GlazedTerracottaEdge2,
            GlazedTerracottaCorner,
            GlazedTerracottaCorner0,
            GlazedTerracottaCorner1,
            GlazedTerracottaCorner2,

            Pillow,
            LoomedBlock,
            LeatherCube,

            AlphiumOre,
            AlphiumBlock,
            EnergizedAlphium,
            PureAlphiumCompound,
            PureAlphiumBlock,

            WhitePillow,
            OrangePillow,
            MagentaPillow,
            LightbluePillow,
            YellowPillow,
            LimePillow,
            PinkPillow,
            GrayPillow,
            LightgrayPillow,
            CyanPillow,
            PurplePillow,
            BluePillow,
            BrownPillow,
            GreenPillow,
            RedPillow,
            BlackPillow,

            WhiteLoomedBlock,
            OrangeLoomedBlock,
            MagentaLoomedBlock,
            LightblueLoomedBlock,
            YellowLoomedBlock,
            LimeLoomedBlock,
            PinkLoomedBlock,
            GrayLoomedBlock,
            LightgrayLoomedBlock,
            CyanLoomedBlock,
            PurpleLoomedBlock,
            BlueLoomedBlock,
            BrownLoomedBlock,
            GreenLoomedBlock,
            RedLoomedBlock,
            BlackLoomedBlock,

            WhiteLeatherCube,
            OrangeLeatherCube,
            MagentaLeatherCube,
            LightblueLeatherCube,
            YellowLeatherCube,
            LimeLeatherCube,
            PinkLeatherCube,
            GrayLeatherCube,
            LightgrayLeatherCube,
            CyanLeatherCube,
            PurpleLeatherCube,
            BlueLeatherCube,
            BrownLeatherCube,
            GreenLeatherCube,
            RedLeatherCube,
            BlackLeatherCube,

            YesThiccBricc,
            NoThiccBricc,
            YesSupahThiccBricc,
            NoSupahThiccBricc,

            YesAlphaThiccBricc,
            NoAlphaThiccBricc,
            YesAlphaSupahThiccBricc,
            NoAlphaSupahThiccBricc,

            YesOldThiccBricc,
            NoOldThiccBricc,
            YesOldSupahThiccBricc,
            NoOldSupahThiccBricc,

            SwampLogSide,
            SwampLogTopBottom,
            SwampLeaves,
            SwampSapling,
            SwampSaplingSmall,

            DrySuperSponge,
            WetSuperSponge,

            OldBricks,
            OldThiccBriccs,
            OldCutSupahThiccBricc,
            OldSupahThiccBricc,
            OldSmolBriccs,
            OldThinnBriccs,
            OldLeftThiccBricc,
            OldRightThiccBricc,
            OldLeftSupahThiccBricc,
            OldRightSupahThiccBricc,

            HypaThiccBriccTop,
            HypaThiccBriccMiddle,
            HypaThiccBriccBottom,
            HypaThiccBriccGlue,
            HypaThiccBriccTopTop,
            HypaThiccBriccBottomBottom,

            OldHypaThiccBriccTop,
            OldHypaThiccBriccMiddle,
            OldHypaThiccBriccBottom,
            OldHypaThiccBriccGlue,
            OldHypaThiccBriccTopTop,
            OldHypaThiccBriccBottomBottom,

            AlphaHypaThiccBriccTop,
            AlphaHypaThiccBriccMiddle,
            AlphaHypaThiccBriccBottom,
            AlphaHypaThiccBriccGlue,
            AlphaHypaThiccBriccTopTop,
            AlphaHypaThiccBriccBottomBottom,

            SkyLeaves,
            SkyWood,
            SkyWoodTop,
            SkySapling,
            SkySaplingSmall,

            RoughBasalt,
            CarvedRoughBasalt,
            CleanBasalt,
            CarvedCleanBasalt,
            SmoothBasalt,
            CarvedSmoothBasalt,
            BasaltThiccBriccs,
            BasaltBricks,
            Pumice,
            CarvedPumice,
            SmoothPumice,
            DarkPumice,
            HotRoughBasalt,
            BasaltPebbles,

            OneOne,
            TwoTwo,
            ThreeThree,
            FourFour,
            FiveFive,
            SixSix,
            SevenSeven,
            EightEight,
            NineNine,
            TenTen,
            ElevenEleven,
            TwelveTwelve,
            ThirteenThirteen,
            FourteenFourteen,
            FifteenFifteen,
            VolcanoHeart,

            RedSandstoneRough,
            RedSandstoneSmooth,
            RedSandstoneSide,
            RedSandstoneStacks,
            RedSandstoneStacksBottom,
            RedSandstoneCut,
            RedSandstoneCarved,
            PistonBoi,
            PistonBoiSolved,

            One,
            Two,
            Three,
            Four,
            Five,
            Six,
            Seven,
            Eight,
            Nine,
            Ten,
            Eleven,
            Twelve,
            Thirteen,
            Fourteen,
            Fifteen,
            Sixteen,

            DenseSnow,
            VeryDenseSnow,
            DenseSlush,

            DenseIce,
            VeryDenseIce,
            IceIron,
            IceGold,
            IceBricks,
            IceThiccBriccs;

    //White
    //Orange
    //Magenta
    //Lightblue
    //Yellow
    //Lime
    //Pink
    //Gray
    //Lightgray
    //Cyan
    //Purple
    //Blue
    //Brown
    //Green
    //Red
    //Black


}
