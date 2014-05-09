package AgricultureCooking;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import chemicraft.ChemiCraft;

public class CreativeTabAgricultureCooking extends CreativeTabs {

	public CreativeTabAgricultureCooking() {
		super("Core");
	}

	@Override
	public ItemStack getIconItemStack() {
		return ChemiCraft.instance.materialItems.getItemStack("");
	}

}
