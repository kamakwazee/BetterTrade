package bettertrade.conversion;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import bettertrade.trades.TradeManager;

public class StringItemConversion{

	public static String[] itemStrings;
	
	public Item[] items;
	
	public static String[] blockStrings;
	
	public Block[] blocks;

	public Item stringToItem(String s)
	{
		itemStrings = TradeManager.itemStrings;
		items = TradeManager.items;
		for(int i = 0; i < itemStrings.length; i++)
		{
			if(s.equals(itemStrings[i]))
			{
				return items[i];
			}
		}
		return (Item)null;
		
	}
	
	public Block stringToBlock(String s)
	{
		blockStrings = TradeManager.blockStrings;
		blocks = TradeManager.blocks;
		for(int i = 0; i < blockStrings.length; i++)
		{
			if(s.equals(blockStrings[i]))
			{
				return blocks[i];
			}
		}
		return (Block)null;
	}
	
	
}
