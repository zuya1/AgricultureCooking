package AgricultureCooking;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import GundamWeapons.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "AgricultureCooking", name="AgricultureCooking", version="dev1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class Core {
    @Instance("AgricultureCooking")
	public static Core instance;

	@SidedProxy(clientSide = "AgricultureCooking.ClientProxy", serverSide = "AgricultureCooking.CommonProxy")
	public static CommonProxy proxy;

	private ACConfig itemIDConfig;

	private ACConfig blockIDConfig;

	public static Item Vegetable;
	public int VegetableID;

	public static Item Fruit;
	public int FruitID;

	public static Item Spice;
	public int SpiceID;

	public int baseItemID;

	public int baseBlockID;


	public  CreativeTabs tabAgricultureCooking ;


@EventHandler
public void preInit(FMLPreInitializationEvent event) {
	this.tabAgricultureCooking = new CreativeTabAgricultureCooking();

	Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
	cfg.load();
	baseBlockID = cfg.get("ID", "BaseBlockID", 4000).getInt();
	VegetableID = cfg.get("ID","VegetableID",17500).getInt();
	FruitID = cfg.get("ID","FruitID",17501 ).getInt();
	SpiceID = cfg.get("ID", "SpiceID",17502).getInt();



	cfg.save();
}

@EventHandler
public void init(FMLInitializationEvent event) {
	itemIDConfig = new ACConfig(baseItemID);
	blockIDConfig = new ACConfig(baseBlockID);

	String[] Veg = {"Eggplant", "Tomato","RedPepper","Pepino","GreenPepper","Paprika",
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
			"Matsutake",};
	for (int meta = 0; meta< Veg.length; meta++) {
	  registerItem(new ItemStack(Vegetable, 1, meta ), Veg[meta]);};

String[] Fru = {"Karin","Pear","WesternPear",
		"Apricot","Ume","Cherry","Plum","Peach",
		"Almond","Chestnut","Ginkgo","Walnut",
		"Orange","BloodOrange","Grapefruit","Citron","Shikuwasa","Lemon","Lime",
		"Dorian", "CashewNuts", "Mango","StarFruit", "Avocado","DragonFruit", "PassionFruit" ,"Pineapple","Banana" ,
		"Papaya","Lychee","Coconut",
		"ChocolateVine","Fig","Persimmon","Cassis","Kiwi","Gummy","Hoe","Cranberry","Pomegranate",",grape",
		"Blueberry","Raspberry","Loquat",};
for (int meta = 0; meta< Fru.length; meta++) {
  registerItem(new ItemStack(Fruit, 1, meta ), Fru[meta]);};

  String[] Spi = {"Cumin","Pepper","Saffron","SunShaw","Perilla","Cinnamon","Ginger","Turmeric","Nutmeg","Vanilla",
			"Mint","Laurier","Lemon balm","aloe","olive","Jasmine","basil",};
	for (int meta = 0; meta< Spi.length; meta++) {
	  registerItem(new ItemStack(Fruit, 1, meta ), Spi[meta]);};
}

private void registerItem(ItemStack itemStack, String s) {


}

}

