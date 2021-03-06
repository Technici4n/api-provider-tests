package technici4n.testmod.client;

import net.fabricmc.fabric.api.client.model.ModelProviderContext;
import net.fabricmc.fabric.api.client.model.ModelResourceProvider;
import net.minecraft.client.render.model.UnbakedModel;
import net.minecraft.util.Identifier;

import java.util.Arrays;
import java.util.List;

public class TestModelProvider implements ModelResourceProvider {
    private static final List<Identifier> TANK_MODELS = Arrays.asList(
            new Identifier("testmod:block/tank"),
            new Identifier("testmod:item/tank")
    );
    private static final TankModel TANK = new TankModel();

    @Override
    public UnbakedModel loadModelResource(Identifier identifier, ModelProviderContext modelProviderContext) {
        return TANK_MODELS.contains(identifier) ? TANK : null;
    }
}
