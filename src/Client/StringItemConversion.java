package net.minecraft.src;

public class StringItemConversion {

	public Item stringToItem(String s){
		if(s.equals("stick")){
			return Item.stick;
		}
		else if(s.equals("swordDiamond")){
			return Item.swordDiamond;
		}
		else if(s.equals("emerald")){
			return Item.emerald;
		}
		return Item.emerald;
		
	}
	
	
}
