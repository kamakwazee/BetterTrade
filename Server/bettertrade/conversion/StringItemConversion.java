package bettertrade.conversion;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import bettertrade.trades.ItemTradeIndexes;
import bettertrade.trades.TradeManager;

public class StringItemConversion{

	public static String[] itemStrings;
	
	public Item[] items;
	
	public static String[] blockStrings;
	
	public Block[] blocks;

	public Item stringToItem(String s, int in){
		itemStrings = TradeManager.itemStrings;
		items = TradeManager.items;
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
		blockStrings = TradeManager.blockStrings;
		blocks = TradeManager.blocks;
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
				ItemTradeIndexes.setItem1(-1);
				break;
			case(2):
				ItemTradeIndexes.setItem2(-1);
				break;
			case(3):
				ItemTradeIndexes.setItem3(-1);
		}
		return (Block)null;
	}
	
	
}
