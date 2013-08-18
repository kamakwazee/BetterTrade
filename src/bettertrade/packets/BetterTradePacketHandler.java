package bettertrade.packets;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import net.minecraft.item.Item;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import bettertrade.BetterTrade;
import bettertrade.trades.TradeManager;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class BetterTradePacketHandler implements IPacketHandler{
	
	public Item[] items;

	@Override
	public void onPacketData(INetworkManager manager,Packet250CustomPayload packet, Player player) 
	{
		
		if(packet.channel.equals("BetterTrade"))
		{
			BetterTrade.connected = true;
			items = TradeManager.items;
			try
			{
				DataInputStream dis = new DataInputStream(new ByteArrayInputStream(packet.data));
				BetterTrade.i1ID = dis.readInt();
				BetterTrade.i1amt = dis.readInt();
				BetterTrade.i2ID = dis.readInt();
				BetterTrade.i2amt = dis.readInt();
				BetterTrade.bID = dis.readInt();
				BetterTrade.bamt = dis.readInt();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
