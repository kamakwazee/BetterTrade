package bettertrade.trades;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class TradeManager {

	public static String[] itemStrings = {"shovelIron", "pickaxeIron", "axeIron", "flintAndSteel", "appleRed", "bow", "arrow", "coal", "diamond", "ingotIron", "ingotGold", "swordIron", "swordWood",
		"shovelWood", "pickaxeWood", "axeWood", "swordStone", "shovelStone", "pickaxeStone", "axeStone", "swordDiamond", "shovelDiamond", "pickaxeDiamond", "axeDiamond", "stick", "bowlEmpty",
		"bowlSoup", "swordGold", "shovelGold", "pickaxeGold", "axeGold", "silk", "feather", "gunpowder", "hoeWood", "hoeStone", "hoeIron", "hoeDiamond", "hoeGold", "seeds", "wheat", "bread",
		"helmetLeather", "plateLeather", "legsLeather", "bootsLeather", "helmetChain", "plateChain", "legsChain", "bootsChain", "helmetIron", "plateIron", "legsIron", "bootsIron",
		"helmetDiamond", "plateDiamond", "legsDiamond", "bootsDiamond", "helmetGold", "plateGold", "legsGold", "bootsGold", "flint", "porkRaw", "porkCooked", "painting", "appleGold", "sign",
		"doorWood", "bucketEmpty", "bucketWater", "bucketLava", "minecartEmpty", "saddle", "doorIron", "redstone", "snowball", "boat", "leather", "bucketMilk", "brick", "clay", "reed",
		"paper", "book", "slimeBall", "minecartCrate", "minecartPowered", "egg", "compass", "fishingRod", "clock", "glowStoneDust", "fishRaw", "fishCooked", "dyePowder", "bone", "sugar",
		"cake", "bed", "redstoneRepeater", "cookie", "map", "shears", "melon", "pumpkinSeeds", "melonSeeds", "beefRaw", "beefCooked", "chickenRaw", "chickenCooked", "rottenFlesh", "enderPearl",
		"blazeRod", "ghastTear", "goldNugget", "netherStalkSeeds", "potion", "glassBottle", "spiderEye", "fermentedSpiderEye", "blazePowder", "magmaCream", "brewingStand", "cauldron", "eyeOfEnder",
		"speckledMelon", "expBottle", "fireballCharge", "writableBook", "writtenBook", "emerald", "itemFrame", "flowerPot", "carrot", "potato", "bakedPotato", "poisonousPotato",
		"emptyMap", "goldenCarrot", "skull", "carrotOnAStick", "netherStar", "pumpkinPie", "firework", "fireworkCharge", "enchantedBook", "comparator", "netherBrick", "netherQuartz", "minecartTnt",
		"minecartHopper", "record13", "recordCat", "recordBlocks", "recordChirp", "recordFar", "recordMall", "recordMellohi", "recordStal", "recordStrad", "recordWard", "record11", "recordWait",
		"horseArmorMetal", "horseArmorGold", "horseArmorDiamond", "leash", "nameTag"};
	
	public static String[] blockStrings = {"stone", "dirt", "cobblestone", "planks", "sapling", "bedrock", "sand", "gravel", "wood", "leaves", "sponge", "glass", "blockLapis", "dispenser", "sandStone", "bed",
			"railPowered", "railDetector", "pistonSticky", "web", "tallGrass", "deadBush", "piston", "wool", "flowerYellow", "flowerRed", "mushroomBrown", "mushroomRed", "blockGold", "blockIron",
			"stoneSlab", "brick", "tnt", "bookShelf", "cobblestoneMossy", "obsidian", "torch", "stairsWoodOak", "chest", "blockDiamond", "workbench", "crops", "furnace", "sign", "doorWood", "ladder", 
			"rail", "stairsCobblestone", "lever", "pressurePlateStone", "doorIron", "pressurePlateWood", "torchRedstone", "stoneButton", "snow", "ice", "blockSnow", "cactus", "blockClay", "reed", 
			"jukebox", "fence", "pumpkin", "netherrack", "slowSand", "glowStone", "pumpkinLantern", "cake", "redstoneRepeater", "lockedChest", "trapdoor", "silverfish", "stoneBrick", "mushroomCapBrown",
			"mushroomCapRed", "fenceIron", "thinGlass", "melon", "gate", "stairsBrick", "stairsStoneBrickSmooth", "mycelium", "waterlily", "netherBrick", "netherFence", "stairsNetherBrick",
			"enchantmentTable", "brewingStand", "cauldron", "whiteStone", "dragonEgg", "redstoneLamp", "woodSlab", "cocoaPlant", "stairsSandStone", "enderChest", "tripWireSource", "tripWire", "blockEmerald", 
			"stairsWoodSpruce", "stairsWoodBirch", "stairsWoodJungle", "beacon", "cobblestoneWall", "flowerPot", "carrot", "potato", "woodenButton", "skull", "anvil", "chestTrapped", "pressurePlateGold",
			"pressurePlateIron", "comparator", "daylightSensor", "blockRedstone", "hopper", "quartzBlock", "stairsQuartz", "activatorRail", "dropper", "clayHardenedStained", "hayBlock", "woolCarpet",
			"clayHardened", "blockCoal"};
	
    public static Item[] items = {Item.shovelIron, Item.pickaxeIron, Item.axeIron, Item.flintAndSteel, Item.appleRed, Item.bow, Item.arrow, Item.coal, Item.diamond, Item.ingotIron, Item.ingotGold, 
    	Item.swordIron, Item.swordWood, Item.shovelWood, Item.pickaxeWood, Item.axeWood, Item.swordStone, Item.shovelStone, Item.pickaxeStone, Item.axeStone, Item.swordDiamond, Item.shovelDiamond,
    	Item.pickaxeDiamond, Item.axeDiamond, Item.stick, Item.bowlEmpty, Item.bowlSoup, Item.swordGold, Item.shovelGold, Item.pickaxeGold, Item.axeGold, Item.silk, Item.feather, Item.gunpowder,
    	Item.hoeWood, Item.hoeStone, Item.hoeIron, Item.hoeDiamond, Item.hoeGold, Item.seeds, Item.wheat, Item.bread, Item.helmetLeather, Item.plateLeather, Item.legsLeather, Item.bootsLeather, 
    	Item.helmetChain, Item.plateChain, Item.legsChain, Item.bootsChain, Item.helmetIron, Item.plateIron, Item.legsIron, Item.bootsIron, Item.helmetDiamond, Item.plateDiamond, 
    	Item.legsDiamond, Item.bootsDiamond, Item.helmetGold, Item.plateGold, Item.legsGold, Item.bootsGold, Item.flint, Item.porkRaw, Item.porkCooked, Item.painting, Item.appleGold, Item.sign, 
    	Item.doorWood, Item.bucketEmpty, Item.bucketWater, Item.bucketLava, Item.minecartEmpty, Item.saddle, Item.doorIron, Item.redstone, Item.snowball, Item.boat, Item.leather, Item.bucketMilk, 
    	Item.brick, Item.clay, Item.reed, Item.paper, Item.book, Item.slimeBall, Item.minecartCrate, Item.minecartPowered, Item.egg, Item.compass, Item.fishingRod, Item.pocketSundial, Item.glowstone, 
    	Item.fishRaw, Item.fishCooked, Item.dyePowder, Item.bone, Item.sugar, Item.cake, Item.bed, Item.redstoneRepeater, Item.cookie, Item.map, Item.shears, Item.melon, Item.pumpkinSeeds, Item.melonSeeds, 
    	Item.beefRaw, Item.beefCooked, Item.chickenRaw, Item.chickenCooked, Item.rottenFlesh, Item.enderPearl, Item.blazeRod, Item.ghastTear, Item.goldNugget, Item.netherStalkSeeds, Item.potion, 
    	Item.glassBottle, Item.spiderEye, Item.fermentedSpiderEye, Item.blazePowder, Item.magmaCream, Item.brewingStand, Item.cauldron, Item.eyeOfEnder, Item.speckledMelon, 
    	Item.expBottle, Item.fireballCharge, Item.writableBook, Item.writtenBook, Item.emerald, Item.itemFrame, Item.flowerPot, Item.carrot, Item.potato, Item.bakedPotato, Item.poisonousPotato, 
    	Item.emptyMap, Item.goldenCarrot, Item.skull, Item.carrotOnAStick, Item.netherStar, Item.pumpkinPie, Item.firework, Item.fireworkCharge, Item.enchantedBook, Item.comparator, Item.netherrackBrick, 
    	Item.netherQuartz, Item.minecartTnt, Item.minecartHopper, Item.record13, Item.recordCat, Item.recordBlocks, Item.recordChirp, Item.recordFar, Item.recordMall, Item.recordMellohi, 
    	Item.recordStal, Item.recordStrad, Item.recordWard, Item.record11, Item.recordWait, Item.field_111215_ce, Item.field_111216_cf, Item.field_111213_cg, Item.field_111214_ch,
    	Item.field_111212_ci};
    
    public static Block[] blocks = {Block.stone, Block.dirt, Block.cobblestone, Block.planks, Block.sapling, Block.bedrock, Block.sand, Block.gravel, Block.wood, Block.leaves, Block.sponge, Block.glass, 
		Block.blockLapis, Block.dispenser, Block.sandStone, Block.bed, Block.railPowered, Block.railDetector, Block.pistonStickyBase, Block.web, Block.tallGrass, Block.deadBush, Block.pistonBase,
		Block.cloth, Block.plantYellow, Block.plantRed, Block.mushroomBrown, Block.mushroomRed, Block.blockGold, Block.blockIron, Block.stoneSingleSlab, Block.brick, Block.tnt, Block.bookShelf,
		Block.cobblestoneMossy, Block.obsidian, Block.torchWood, Block.stairsWoodOak, Block.chest, Block.blockDiamond, Block.workbench, Block.crops, Block.furnaceIdle, Block.signPost, 
		Block.doorWood, Block.ladder, Block.rail, Block.stairsCobblestone, Block.lever, Block.pressurePlateStone, Block.doorIron, Block.pressurePlatePlanks, Block.torchRedstoneActive,
		Block.stoneButton, Block.snow, Block.ice, Block.blockSnow, Block.cactus, Block.blockClay, Block.reed, Block.jukebox, Block.fence, Block.pumpkin, Block.netherrack, Block.slowSand, Block.glowStone,
		Block.pumpkinLantern, Block.cake, Block.redstoneRepeaterActive, Block.lockedChest, Block.trapdoor, Block.silverfish, Block.stoneBrick, Block.mushroomCapBrown, Block.mushroomCapRed,
		Block.fenceIron, Block.thinGlass, Block.melon, Block.fenceGate, Block.stairsBrick, Block.stairsStoneBrick, Block.mycelium, Block.waterlily, Block.netherBrick, Block.netherFence,
		Block.stairsNetherBrick, Block.enchantmentTable, Block.brewingStand, Block.cauldron, Block.whiteStone, Block.dragonEgg, Block.redstoneLampActive, Block.woodSingleSlab, Block.cocoaPlant,
		Block.stairsSandStone, Block.enderChest, Block.tripWireSource, Block.tripWire, Block.blockEmerald, Block.stairsWoodSpruce, Block.stairsWoodBirch, Block.stairsWoodJungle, Block.beacon,
		Block.cobblestoneWall, Block.flowerPot, Block.carrot, Block.potato, Block.woodenButton, Block.skull, Block.anvil, Block.chestTrapped, Block.pressurePlateGold, Block.pressurePlateIron,
		Block.redstoneComparatorIdle, Block.daylightSensor, Block.blockRedstone, Block.hopperBlock, Block.blockNetherQuartz, Block.stairsNetherQuartz, Block.railActivator, Block.dropper,
		Block.field_111039_cA, Block.field_111038_cB, Block.field_111031_cC, Block.field_111032_cD, Block.field_111034_cE};
    
    /**
     *  Removes all default item trades
     */
    public static void removeDefaultItemTrades()
    {
    	itemStrings = new String[]{};
    	items = new Item[]{};
    	System.out.println("Default Item Trades removed");
    }
    
    /**
     *  Removes all default block trades 
     */
    public static void removeDefaultBlockTrades()
    {
    	blockStrings = new String[]{};
    	blocks = new Block[]{};
    	System.out.println("Default Block Trades removed");
    }
    
    /**
     *  Removes all default trades
     */
    public static void removeDefaultTrades()
    {
    	removeDefaultItemTrades();
    	removeDefaultBlockTrades();
    }
    
    /**
     *  Removes selected default trade item by Item
     */
    public static void removeDefaultTradeItem(Item item)
    {
    	System.out.println("Trying to delete item " + item.getUnlocalizedName());
    	String[] ts = itemStrings;
    	Item[] ti = items;
    	ArrayList<String> itemStringsL = new ArrayList<String>();
    	ArrayList<Item> itemsL = new ArrayList<Item>();
    	boolean existing = false;
    	for(Item it : ti)
    	{
    		if (it == item)
    		{
    			existing = true;
    		}
    	}
    	if (existing)
    	{
    		for(int i = 0; i < ti.length; i++)
    		{
    			if(item != ti[i])
    			{
    				itemsL.add(ti[i]);
    				itemStringsL.add(ts[i]);
    			}
    		}
    		items = itemsL.toArray(new Item[itemsL.size()]);
    		itemStrings = itemStringsL.toArray(new String[itemStringsL.size()]);
    		System.out.println("Item " + item.getUnlocalizedName() + " was successfully removed.");
    	}
    	else
    	{
    		System.out.println("Unable to find item " + item.getUnlocalizedName());
    	}
    }
    
    /**
     *  Removes selected default trade item by Name
     */
    public static void removeDefaultTradeItem(String itemname)
    {
    	System.out.println("Trying to delete item " + itemname);
    	String[] ts = itemStrings;
    	Item[] ti = items;
    	ArrayList<String> itemStringsL = new ArrayList<String>();
    	ArrayList<Item> itemsL = new ArrayList<Item>();
    	boolean existing = false;
    	for(String it : ts)
    	{
    		if (it == itemname)
    		{
    			existing = true;
    		}
    	}
    	if (existing)
    	{
    		for(int i = 0; i < ti.length; i++)
    		{
    			if(itemname != ts[i])
    			{
    				itemStringsL.add(ts[i]);
    				itemsL.add(ti[i]);
    			}
    		}
    		items = itemsL.toArray(new Item[itemsL.size()]);
    		itemStrings = itemStringsL.toArray(new String[itemStringsL.size()]);
    		System.out.println("Item " + itemname + " was successfully removed.");
    	}
    	else
    	{
    		System.out.println("Unable to find item " + itemname);
    	}
    }
    
    /**
     *  Removes selected default trade block by Block
     */
    public static void removeDefaultTradeBlock(Block block)
    {
    	System.out.println("Trying to delete block " + block.getUnlocalizedName());
    	String[] ts = blockStrings;
    	Block[] ti = blocks;
    	ArrayList<String> blockStringsL = new ArrayList<String>();
    	ArrayList<Block> blocksL = new ArrayList<Block>();
    	boolean existing = false;
    	for(Block it : ti)
    	{
    		if (it == block)
    		{
    			existing = true;
    		}
    	}
    	if (existing)
    	{
    		for(int i = 0; i < ti.length; i++)
    		{
    			if(block != ti[i])
    			{
    				blocksL.add(ti[i]);
    				blockStringsL.add(ts[i]);
    			}
    		}
    		blocks = blocksL.toArray(new Block[blocksL.size()]);
    		blockStrings = blockStringsL.toArray(new String[blockStringsL.size()]);
    		System.out.println("Block " + block.getUnlocalizedName() + " was successfully removed.");
    	}
    	else
    	{
    		System.out.println("Unable to find block " + block.getUnlocalizedName());
    	}
    }
    
    /**
     *  Removes default trade block by Name
     */
    public static void removeDefaultTradeBlock(String blockname)
    {
    	System.out.println("Trying to delete block " + blockname);
    	String[] ts = blockStrings;
    	Block[] ti = blocks;
    	ArrayList<String> blockStringsL = new ArrayList<String>();
    	ArrayList<Block> blocksL = new ArrayList<Block>();
    	boolean existing = false;
    	for(String it : ts)
    	{
    		if (it == blockname)
    		{
    			existing = true;
    		}
    	}
    	if (existing)
    	{
    		for(int i = 0; i < ti.length; i++)
    		{
    			if(blockname != ts[i])
    			{
    				blockStringsL.add(ts[i]);
    				blocksL.add(ti[i]);
    			}
    		}
    		blocks = blocksL.toArray(new Block[blocksL.size()]);
    		blockStrings = blockStringsL.toArray(new String[blockStringsL.size()]);
    		System.out.println("Block " + blockname + " was successfully removed.");
    	}
    	else
    	{
    		System.out.println("Unable to find block " + blockname);
    	}
    }
    
    /**
     *  Adds an item trade, params are the Item you want to add and its name in config file
     *  Example: Item.stick, stick
     */
    public static void addItemTrade(Item item, String itemname)
    {
    	System.out.println("Trying to add item " + itemname);
    	String[] ts = itemStrings;
    	Item[] ti = items;
    	itemStrings = new String[ts.length+1];
    	items = new Item[ti.length+1];
    	for (int i = 0; i < ts.length && i < ti.length; i++)
    	{
    		itemStrings[i] = ts[i];
    		items[i] = ti[i];
    	}
    	itemStrings[ts.length] = itemname;
    	items[ti.length] = item;
    	System.out.println("Item " + itemname + " successfully added to trades.");
    }
    
    /**
     *  Adds a block trade, params are the Block you want to add and its name in config file
     *  Example: Block.stone, stone
     */
    public static void addBlockTrade(Block block, String blockname)
    {
    	System.out.println("Trying to add block " + blockname);
    	String[] ts = blockStrings;
    	Block[] ti = blocks;
    	blockStrings = new String[ts.length+1];
    	blocks = new Block[ti.length+1];
    	for (int i = 0; i < ts.length && i < ti.length; i++)
    	{
    		blockStrings[i] = ts[i];
    		blocks[i] = ti[i];
    	}
    	blockStrings[ts.length] = blockname;
    	blocks[ti.length] = block;
    	System.out.println("Block " + blockname + " was successfully added to trades.");
    }
    
    /**
     *  Replaces item config name with entered name
     */
    public static void replaceItemName(String replaceItemName, String newItemName)
    {
    	boolean foundName = false;
    	System.out.println("Searching for config item named " + replaceItemName);
    	for (int i = 0; i < itemStrings.length; i++)
    	{
    		if (itemStrings[i] == replaceItemName)
    		{
    			itemStrings[i] = newItemName;
    			foundName = true;
    		}
    	}
    	if (foundName)
    	{
    		System.out.println("Replaced " + replaceItemName + " with " + newItemName);
    	}
    	else
    	{
    		System.out.println("Could not find config item named " + replaceItemName);
    	}
    }
    
    /**
     *  Replaces block config name with entered name
     */
    public static void replaceBlockName(String replaceBlockName, String newBlockName)
    {
    	boolean foundName = false;
    	System.out.println("Searching for config block named " + replaceBlockName);
    	for (int i = 0; i < blockStrings.length; i++)
    	{
    		if (blockStrings[i] == replaceBlockName)
    		{
    			blockStrings[i] = newBlockName;
    			foundName = true;
    		}
    	}
    	if (foundName)
    	{
    		System.out.println("Replaced " + replaceBlockName + " with " + newBlockName);
    	}
    	else
    	{
    		System.out.println("Could not find config block named " + replaceBlockName);
    	}
    }
    
}
