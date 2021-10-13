package net.martin1912.BetaExtras.Block;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent;
import net.modificationstation.stationapi.api.client.model.Model;
import net.modificationstation.stationapi.api.client.model.json.JsonModel;
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint;
import net.modificationstation.stationapi.api.registry.Identifier;
import net.modificationstation.stationapi.api.registry.ModID;

import static net.modificationstation.stationapi.api.client.model.json.JsonModel.get;
import static net.modificationstation.stationapi.api.registry.Identifier.of;

public class ModelListener {

    @EventListener
    public void registerModels(TextureRegisterEvent event) {
        brownMushroomBlockModel = get(of(modID, "BigBrownMushroom"));
        biggerBrownMushroomBlockModel = get(of(modID, "BiggerBrownMushroom"));
        biggererBrownMushroomBlockModel = get(of(modID, "BiggererBrownMushroom"));

        redMushroomBlockModel = get(of(modID, "BigRedMushroom"));
        biggerRedMushroomBlockModel = get(of(modID, "BiggerRedMushroom"));
        biggererRedMushroomBlockModel = get(of(modID, "BiggererRedMushroom"));
    }


    public static Model
            brownMushroomBlockModel,
            biggerBrownMushroomBlockModel,
            biggererBrownMushroomBlockModel,
            redMushroomBlockModel,
            biggerRedMushroomBlockModel,
            biggererRedMushroomBlockModel;

    @Entrypoint.ModID
    private ModID modID;
}
