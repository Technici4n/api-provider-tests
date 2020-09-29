package technici4n.testmod;

import alexiil.mc.lib.attributes.fluid.FluidInsertable;
import alexiil.mc.lib.attributes.fluid.impl.EmptyFluidTransferable;
import net.fabricmc.fabric.api.provider.v1.ApiProvider;
import net.minecraft.util.math.Direction;

/**
 * PROVIDER-API
 * The Provider for FluidInsertable
 */
public interface FluidInsertableProvider extends ApiProvider<FluidInsertableProvider, FluidInsertable> {
    FluidInsertable getFluidInsertable(Direction side);

    @Override
    default FluidInsertable getApi() {
        return EmptyFluidTransferable.NULL;
    }
}
