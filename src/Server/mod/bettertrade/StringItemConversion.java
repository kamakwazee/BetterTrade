package mod.bettertrade;

import mod.bettertrade.init.BlockInitialization;
import mod.bettertrade.init.ItemInitialization;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class StringItemConversion{

	public String[] itemStrings = {"shovelSteel", "picaxeSteel", "axeSteel", "flintAndSteel", "appleRed", "bow", "arrow", "coal", "diamond", "ingotIron", "ingotGold", "swordSteel", "swordWood",
			"shovelWood", "pickaxeWood", "axeWood", "swordStone", "shovelStone", "pickaxeStone", "axeStone", "swordDiamond", "shovelDiamond", "pickaxeDiamond", "axeDiamond", "stick", "bowlEmpty",
			"bowlSoup", "swordGold", "shovelGold", "pickaxeGold", "axeGold", "silk", "feather", "gunpowder", "hoeWood", "hoeStone", "hoeSteel", "hoeDiamond", "hoeGold", "seeds", "wheat", "bread",
			"helmetLeather", "plateLeather", "legsLeather", "bootsLeather", "helmetChain", "plateChain", "legsChain", "bootsChain", "helmetSteel", "plateSteel", "legsSteel", "bootsSteel",
			"helmetDiamond", "plateDiamond", "legsDiamond", "bootsDiamond", "helmetGold", "plateGold", "legsGold", "bootsGold", "flint", "porkRaw", "porkCooked", "painting", "appleGold", "sign",
			"doorWood", "bucketEmpty", "bucketWater", "bucketLava", "minecartEmpty", "saddle", "doorSteel", "redstone", "snowball", "boat", "leather", "bucketMilk", "brick", "clay", "reed",
			"paper", "book", "slimeBall", "minecartCrate", "minecartPowered", "egg", "compass", "fishingRod", "clock", "lightStoneDust", "fishRaw", "fishCooked", "dyePowder", "bone", "sugar",
			"cake", "bed", "redstoneRepeater", "cookie", "map", "shears", "melon", "pumpkinSeeds", "melonSeeds", "beefRaw", "beefCooked", "chickenRaw", "chickenCooked", "rottenFlesh", "enderPearl",
			"blazeRod", "ghastTear", "goldNugget", "netherStalkSeeds", "potion", "glassBottle", "spiderEye", "fermentedSpiderEye", "blazePowder", "magmaCream", "brewingStand", "cauldron", "eyeOfEnder",
			"speckledMelon", "expBottle", "fireballCharge", "writableBook", "writtenBook", "emerald", "itemFrame", "flowerPot", "carrot", "potato", "bakedPotato", "poisonousPotato",
			"emptyMap", "goldenCarrot", "skull", "carrotOnAStick", "netherStar", "pumpkinPie", "firework", "fireworkCharge", "enchantedBook", "comparator", "netherBrick", "netherQuartz", "minecartTnt",
			"minecartHopper", "record13", "recordCat", "recordBlocks", "recordChirp", "recordFar", "recordMall", "recordMellohi", "recordStal", "recordStrad", "recordWard", "record11", "recordWait"};
	
	public Item[] items;
	
	public String[] blockStrings = {"stone", "dirt", "cobblestone", "planks", "sapling", "bedrock", "sand", "gravel", "wood", "leaves", "sponge", "glass", "blockLapis", "dispenser", "sandStone", "bed",
			"railPowered", "railDetector", "pistonSticky", "web", "tallGrass", "deadBush", "piston", "wool", "flowerYellow", "flowerRed", "mushroomBrown", "mushroomRed", "blockGold", "blockSteel",
			"stoneSlab", "brick", "tnt", "bookShelf", "cobblestoneMossy", "obsidian", "torch", "stairsWoodOak", "chest", "blockDiamond", "workbench", "crops", "furnace", "sign", "doorWood", "ladder", 
			"rail", "stairsCobblestone", "lever", "pressurePlateStone", "doorSteel", "pressurePlateWood", "torchRedstone", "stoneButton", "snow", "ice", "blockSnow", "cactus", "blockClay", "reed", 
			"jukebox", "fence", "pumpkin", "netherrack", "slowSand", "glowStone", "pumpkinLantern", "cake", "redstoneRepeater", "lockedChest", "trapdoor", "silverfish", "stoneBrick", "mushroomCapBrown",
			"mushroomCapRed", "fenceIron", "thinGlass", "melon", "gate", "stairsBrick", "stairsStoneBrickSmooth", "mycelium", "waterlily", "netherBrick", "netherFence", "stairsNetherBrick",
			"enchantmentTable", "brewingStand", "cauldron", "whiteStone", "dragonEgg", "redstoneLamp", "woodSlab", "cocoaPlant", "stairsSandStone", "enderChest", "tripWireSource", "tripWire", "blockEmerald", 
			"stairsWoodSpruce", "stairsWoodBirch", "stairsWoodJungle", "beacon", "cobblestoneWall", "flowerPot", "carrot", "potato", "woodenButton", "skull", "anvil", "chestTrapped", "pressurePlateGold",
			"pressurePlateIron", "comparator", "daylightSensor", "blockRedstone", "hopper", "quartzBlock", "stairsQuartz", "activatorRail", "dropper"};
	
	public Block[] blocks;
	
	public ItemInitialization il = new ItemInitialization();
	
	public BlockInitialization bl = new BlockInitialization();

	public Item stringToItem(String s, int in){
		items = il.returnItemArray();
		blocks = bl.returnBlockArray();
		for(int i = 0; i < itemStrings.length; i++){
			if(s.equals(itemStrings[i])){
				switch(in){
				case(1):
					ItemTradeIndexes.setItem1(i);
					break;
				case(2):
					ItemTradeIndexes.setItem2(i);
					break;
				case(3):
					ItemTradeIndexes.setItem3(i);
				}
				return items[i];
			}
		}
		return (Item)null;
		
	}
	
	public Block stringToBlock(String s, int in){
		for(int i = 0; i < blockStrings.length; i++){
			if(s.equals(blockStrings[i])){
				switch(in){
				case(1):
					ItemTradeIndexes.setItem1(i+itemStrings.length);
					break;
				case(2):
					ItemTradeIndexes.setItem2(i+itemStrings.length);
					break;
				case(3):
					ItemTradeIndexes.setItem3(i+itemStrings.length);
				}
				return blocks[i];
			}
		}
		switch(in){
		case(1):
			ItemTradeIndexes.setItem1(0);
			break;
		case(2):
			ItemTradeIndexes.setItem2(0);
			break;
		case(3):
			ItemTradeIndexes.setItem3(0);
		}
		return (Block)null;
	}
	
	
}
