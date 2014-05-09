package AgricultureCooking;

import GundamWeapons.EntityBeam;
import GundamWeapons.RenderBeam;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void proxy() {
		RenderingRegistry.registerEntityRenderingHandler(EntityBeam.class, new RenderBeam());
	}

}
