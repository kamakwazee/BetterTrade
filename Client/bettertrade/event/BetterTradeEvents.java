package bettertrade.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import bettertrade.BetterTrade;

public class BetterTradeEvents {

	@ForgeSubscribe
	public void onLoadComplete(EntityJoinWorldEvent event)
	{
		if (event.entity instanceof EntityPlayer)
		{
			BetterTrade.connected = false;
		}
	}
	
	
}
