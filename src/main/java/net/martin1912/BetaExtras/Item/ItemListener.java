package net.martin1912.BetaExtras.Item;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.item.ItemBase;

import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.registry.ModID;
import net.modificationstation.stationapi.api.template.item.TemplateItemBase;

import static net.modificationstation.stationapi.api.registry.Identifier.of;

public class ItemListener {
    @Entrypoint.ModID
    private ModID modID;

    @EventListener
    public void registerItems(ItemRegistryEvent event) {
        rawThiccBricc = new RawThiccBricc(of(modID, "RawThiccBricc")).setTranslationKey(modID, "raw_thicc_bricc");
        thiccBricc = new ThiccBricc(of(modID, "ThiccBricc")).setTranslationKey(modID, "thicc_bricc");
        alphium = new Alphium(of(modID, "Alphium")).setTranslationKey(modID, "alphium");
        colorRemover = new ColorRemover(of(modID, "ColorRemover")).setTranslationKey(modID, "color_remover");
        rotator = new Rotator(of(modID, "Rotator")).setTranslationKey(modID, "rotator");
        mushroomFertilizer = new MushroomFertilizer(of(modID, "MushroomFertilizer")).setTranslationKey(modID, "mushroom_fertilizer");
        cursedEssence = new CursedEssence(of(modID, "CursedEssence")).setTranslationKey(modID, "cursed_essence");
        dirtBrick = new DirtBrick(of(modID, "DirtBrick")).setTranslationKey(modID, "dirt_brick");
        smolBasaltRock = new SmolBasaltRock(of(modID, "SmolBasaltRock")).setTranslationKey(modID, "smol_basalt_rock");
        thiccBasaltRock = new ThiccBasaltRock(of(modID, "ThiccBasaltRock")).setTranslationKey(modID, "thicc_basalt_rock");
    }

    public static TemplateItemBase
            rawThiccBricc,
            thiccBricc,
            alphium,
            colorRemover,
            rotator,
            mushroomFertilizer,
            pureAlphium,
            cursedEssence,
            dirtBrick,
            skyKey,
            smolBasaltRock,
            thiccBasaltRock;
}
