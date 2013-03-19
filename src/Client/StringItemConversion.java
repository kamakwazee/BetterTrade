package net.minecraft.src;

public class StringItemConversion{

	public String[] itemStrings = {"shovelSteel", "picaxeSteel", "axeSteel", "flintAndSteel", "appleRed", "bow", "arrow", "coal", "diamond", "ingotIron", "ingotGold", "swordSteel", "swordWood",
			"shovelWood", "pickaxeWood", "axeWood", "swordStone", "shovelStone", "pickaxeStone", "axeStone", "swordDiamond", "shovelDiamond", "pickaxeDiamond", "axeDiamond", "stick", "bowlEmpty",
			"bowlSoup", "swordGold", "shovelGold", "pickaxeGold", "axeGold", "silk", "feather", "gunpowder", "hoeWood", "hoeStone", "hoeSteel", "hoeDiamond", "hoeGold", "seeds", "wheat", "bread",
			"helmetLeather", "plateLeather", "legsLeather", "bootsLeather", "helmetChain", "plateChain", "plateChain", "legsChain", "bootsChain", "helmetSteel", "plateSteel", "legsSteel", "bootsSteel",
			"helmetDiamond", "plateDiamond", "legsDiamond", "bootsDiamond", "helmetGold", "plateGold", "legsGold", "bootsGold", "flint", "porkRaw", "porkCooked", "painting", "appleGold", "sign",
			"doorWood", "bucketEmpty", "bucketWater", "bucketLava", "minecartEmpty", "saddle", "saddle", "doorSteel", "redstone", "snowball", "boat", "leather", "bucketMilk", "brick", "clay", "reed",
			"paper", "book", "slimeBall", "minecraftCrate", "minecraftPowered", "egg", "compass", "fishingRod", "clock", "lightStoneDust", "fishRaw", "fishCooked", "dyePowder", "bone", "sugar",
			"cake", "bed", "redstoneRepeater", "cookie", "map", "shears", "melon", "pumpkinSeeds", "melonSeeds", "beefRaw", "beefCooked", "chickenRaw", "chickenCooked", "rottenFlesh", "enderPearl",
			"blazeRod", "ghastTear", "goldNugget", "netherStalkSeeds", "potion", "glassBottle", "spiderEye", "fermentedSpiderEye", "blazePowder", "magmaCream", "brewingStand", "cauldron", "eyeOfEnder",
			"speckledMelon", "monsterPlacer", "expBottle", "fireballCharge", "writableBook", "writtenBook", "emerald", "itemFrame", "flowerPot", "carrot", "potato", "bakedPotato", "poisonousPotato",
			"emptyMap", "goldenCarrot", "skull", "carrotOnAStick", "netherStar", "pumpkinPie", "firework", "fireworkCharge", "enchantedBook", "comparator", "netherBrick", "netherQuartz", "minecraftTnt",
			"minecraftHopper", "record13", "recordCat", "recordBlocks", "recordChirp", "recordFar", "recordMall", "recordMellohi", "recordStal", "recordStrad", "recordWard", "record11", "recordWait"};
	
	public Item[] items;
	
	public String[] blockStrings = {"stone", "dirt", "cobblestone", "planks", "sapling", "bedrock", "sand", "gravel", "wood", "leaves", "sponge", "glass", "blockLapis", "dispenser", "sandStone", "bed",
			"railPowered", "railDetector", "pistonSticky", "web", "tallGrass", "deadBush", "piston", "wool", "flowerYellow", "flowerRed", "mushroomBrown", "mushroomRed", "blockGold", "blockSteel",
			"stoneSlab", "brick", "tnt", "bookShelf", "cobblestoneMossy", "obsidian", "torchWood", "stairsWood", "chest", "blockDiamond", "workbench", "crops", "furnace", "sign", "doorWood", "ladder", 
			"rail", "stairCobblestone", "lever", "pressurePlateStone", "doorSteel", "pressurePlateWood", "torchRedstone", "stoneButton", "snow", "ice", "blockSnow", "cactus", "blockClay", "reed", 
			"jukebox", "fence", "pumpkin", "netherrack", "slowSand", "glowStone", "pumpkinLantern", "cake", "redstoneRepeater", "lockedChest", "trapdoor", "silverfish", "stoneBrick", "mushroomCapBrown",
			"mushroomCapRed", "fenceIron", "thinGlass", "melon", "gate", "stairsBrick", "stairsStoneBrickSmooth", "mycelium", "waterlily", "netherBrick", "netherFence", "stairsNetherBrick",
			"enchantmentTable", "brewingStand", "cauldron", "whiteStone", "dragonEgg", "redstoneLamp", "woodSlab", "cocoaPlant", "stairsSandStone", "enderChest", "tripWireSource", "tripWire", "blockEmerald", 
			"stairsWoodSpruce", "stairsWoodBirch", "stairsWoodJungle", "beacon", "cobblestoneWall", "flowerPot", "carrot", "potato", "woodenButton", "skull", "anvil", "chestTrap", "weightedPlateLight",
			"weightedPlateHeavy", "comparator", "daylightDetector", "blockRedstone", "netherquartz", "hopper", "quartzBlock", "stairsQuartz", "activatorRail", "dropper"};
	
	public Block[] blocks;
	
	public ItemInitialization il = new ItemInitialization();
	
	public BlockInitialization bl = new BlockInitialization();

	public Item stringToItem(String s){
		items = il.returnItemArray();
		blocks = bl.returnBlockArray();
		for(int i = 0; i < itemStrings.length; i++){
			if(s.equals(itemStrings[i])){
				return items[i];
			}
		}
		return (Item)null;
		
	}
	
	public Block stringToBlock(String s){
		for(int i = 0; i < blockStrings.length; i++){
			if(s.equals(blockStrings[i])){
				return blocks[i];
			}
		}
		return (Block)null;
	}
	
	
}
