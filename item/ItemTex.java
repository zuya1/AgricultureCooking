package AgricultureCooking.item;


<<<<<<< HEAD
import net.minecraft.item.Item;
=======
import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
>>>>>>> a7c7472313298c1b99bebd76f12fb12c6aaabd8a
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemTex extends Item {

<<<<<<< HEAD



=======
>>>>>>> a7c7472313298c1b99bebd76f12fb12c6aaabd8a
	public ItemTex(int par1) {
		super(par1);
		// TODO 自動生成されたコンストラクター・スタブ
	}

<<<<<<< HEAD
=======

>>>>>>> a7c7472313298c1b99bebd76f12fb12c6aaabd8a
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



	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int metadata) {
		  return ItemTextures[metadata];
		 }

<<<<<<< HEAD
=======
	@Override
	public int getItemStackLimit(ItemStack stack) {
		return stack.getItemDamage() == this.ItemNamesStrings.length - 1 ? 64 : 1;
	}
>>>>>>> a7c7472313298c1b99bebd76f12fb12c6aaabd8a
}
