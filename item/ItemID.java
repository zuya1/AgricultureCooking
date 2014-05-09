package AgricultureCooking.item;


import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemID extends Item {


	protected String[] ItemNamesStrings = {
			/*	Vegetable*/"Eggplant", "Tomato","RedPepper","Pepino","GreenPepper","Paprika",
			"courgette","Cucumber","Bittergourd","Okra","Wintermelon",
			"Corn","Adzukibean","ThePea","Cowpea","Broad Beans","Soybean","Peanut","Sesame",
			"Sprout","Radish sprouts",
			"strawberry","MeLon","Oriental melon",
			"Mustard","Cabbage","Type_of_Rape","Lettuce","GarlandChrysanthemum","JapaneseParsley",
			"Celery","root vegetables","Qing-geng-cai","Chinese chive","Nozawana","Chinese cabbage",
			"Parsley","Spinach","Mizuna","Honewort","Brussels sprouts","Arugula",
			"Chive","Asparagus","Udo","Pickles","BrassicaJunceaVar","BambooShoot","Garlic",
			"GreenOnion","Onion",
			"Broccoli","Cauliflower","Chrysanthemum","ButterburSprout","Myoga",
			"Turnip","JapaneseRadish","Radish","Wasabi","Burdock","Chinese artichoke","Ginger","Shallots",
			"LotusRoot","SugarBeet",
			"SweetPotato","Taro","Yam",
			"KingOysterMushrooms","CloudEar","Shiitake","Shimeji","Nameko","Bunashimeji","Maitake",
			"MatsutakeMushroom",
			/*Fruit*/"Karin","Pear","WesternPear",
			"Apricot","Ume","Cherry","Plum","Peach",
			"Almond","Chestnut","Ginkgo","Walnut",
			"Orange","BloodOrange","Grapefruit","Citron","Shikuwasa","Lemon","Lime",
			"Dorian", "CashewNuts", "Mango","StarFruit", "Avocado","DragonFruit", "PassionFruit" ,"Pineapple","Banana" ,
			"Papaya","Lychee","Coconut",
			"ChocolateVine","Fig","Persimmon","Cassis","Kiwi","Gummy","Hoe","Cranberry","Pomegranate",",grape",
			"Blueberry","Raspberry","Loquat",
			/*Spice*/"Cumin","Pepper","Saffron","SunShaw","Perilla","Cinnamon","Ginger","Turmeric","Nutmeg","Vanilla",
			"Mint","Laurier","Lemon balm","aloe","olive","Jasmine","basil",
			};


	protected String[] ItemTextureStrings = {
			/*	Vegetable*/"Eggplant", "Tomato","RedPepper","Pepino","GreenPepper","Paprika",
			"courgette","Cucumber","Bittergourd","Okra","Wintermelon",
			"Corn","Adzukibean","ThePea","Cowpea","Broad Beans","Soybean","Peanut","Sesame",
			"Sprout","Radish sprouts",
			"strawberry","MeLon","Oriental melon",
			"Mustard","Cabbage","Type_of_Rape","Lettuce","GarlandChrysanthemum","JapaneseParsley",
			"Celery","root vegetables","Qing-geng-cai","Chinese chive","Nozawana","Chinese cabbage",
			"Parsley","Spinach","Mizuna","Honewort","Brussels sprouts","Arugula",
			"Chive","Asparagus","Udo","Pickles","BrassicaJunceaVar","BambooShoot","Garlic",
			"GreenOnion","Onion",
			"Broccoli","Cauliflower","Chrysanthemum","ButterburSprout","Myoga",
			"Turnip","JapaneseRadish","Radish","Wasabi","Burdock","Chinese artichoke","Ginger","Shallots",
			"LotusRoot","SugarBeet",
			"SweetPotato","Taro","Yam",
			"KingOysterMushrooms","CloudEar","Shiitake","Shimeji","Nameko","Bunashimeji","Maitake",
			"MatsutakeMushroom",
			/*Fruit*/"Karin","Pear","WesternPear",
			"Apricot","Ume","Cherry","Plum","Peach",
			"Almond","Chestnut","Ginkgo","Walnut",
			"Orange","BloodOrange","Grapefruit","Citron","Shikuwasa","Lemon","Lime",
			"Dorian", "CashewNuts", "Mango","StarFruit", "Avocado","DragonFruit", "PassionFruit" ,"Pineapple","Banana" ,
			"Papaya","Lychee","Coconut",
			"ChocolateVine","Fig","Persimmon","Cassis","Kiwi","Gummy","Hoe","Cranberry","Pomegranate",",grape",
			"Blueberry","Raspberry","Loquat",
			/*Spice*/"Cumin","Pepper","Saffron","SunShaw","Perilla","Cinnamon","Ginger","Turmeric","Nutmeg","Vanilla",
			"Mint","Laurier","Lemon balm","aloe","olive","Jasmine","basil",
			};

	protected Icon[] ItemTextures = new Icon[ItemTextureStrings.length];


	protected String textureDomain = "AgricultureCooking.item";

	public ItemID(int par1) {
		super(par1);
		setHasSubtypes(true);
        setMaxDamage(0);
		setCreativeTab(CreativeTabs.tabFood);
		rangeCheck();
	}

	private void rangeCheck() {
		if (ItemNamesStrings.length != ItemTextureStrings.length) {
			System.err.println("ItemNamesStringsとItemTextureStringsの大きさが違います!!");
			System.exit(-1);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		for (int i = 0; i < ItemTextureStrings.length; i++) {
			ItemTextures[i] = par1IconRegister.registerIcon(textureDomain + ":" + ItemTextureStrings[i]);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List) {
		int itemNum = ItemNamesStrings.length;
		for (int i = 0; i < itemNum; i++) {
			par3List.add(new ItemStack(par1, 1, i));
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getUnlocalizedName(ItemStack par1ItemStack) {
		String[] names = ItemNamesStrings;
		return super.getUnlocalizedName() + "." + names[par1ItemStack.getItemDamage()];
	}

	@Override
	public String getItemDisplayName(ItemStack par1ItemStack) {
		String[] names = ItemNamesStrings;
		return names[par1ItemStack.getItemDamage()];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int metadata) {
		  return ItemTextures[metadata];
		 }

	@Override
	public int getItemStackLimit(ItemStack stack) {
		return stack.getItemDamage() == this.ItemNamesStrings.length - 1 ? 64 : 1;
	}
}