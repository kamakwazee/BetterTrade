package mod.bettertrade;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Formatter;

import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class BetterTradePacketHandler implements IPacketHandler{

	@Override
	public void onPacketData(INetworkManager manager,
			Packet250CustomPayload packet, Player player) {
		
		if(packet.channel.equals("BetterTrade")){
			System.out.println("Received packet");
			String appdata = System.getenv("appdata");
			String dir = appdata + "\\.minecraft\\config";
			File ff;
			try {
				Formatter f = new Formatter(ff = new File(dir + "\\BetterTrade.txt"));
				System.out.println(ff.getAbsolutePath());
				DataInputStream dis = new DataInputStream(new ByteArrayInputStream(packet.data));
				int firstItemIndex = dis.readInt();
				int firstItemAmount = dis.readInt();
				int secondItemIndex = dis.readInt();
				int secondItemAmount = dis.readInt();
				int buyingItemIndex = dis.readInt();
				int buyingItemAmount = dis.readInt();
				String[] items = StringItemConversion.itemStrings;
				String[] blocks = StringItemConversion.blockStrings;
				String i1, i2, b;
				if(firstItemIndex > items.length){
					firstItemIndex -= items.length;
					i1 = blocks[firstItemIndex];
				}
				else{
					i1 = items[firstItemIndex];
				}
				if(buyingItemIndex > items.length){
					buyingItemIndex -= items.length;
					b = blocks[buyingItemIndex];
				}
				else{
					b = items[buyingItemIndex];
				}
				String l;
				if (secondItemAmount == 0){
					l = i1 + "[" + Integer.toString(firstItemAmount) + "]:" + b + "[" + Integer.toString(buyingItemAmount) + "]";
				}
				else{
					if(secondItemIndex > items.length){
						secondItemIndex -= items.length;
						i2 = blocks[secondItemIndex];
					}
					else{
						i2 = items[secondItemIndex];
					}
					l = i1 + "[" + Integer.toString(firstItemAmount) + "] " + i2 + "[" + Integer.toString(secondItemAmount) + "]:" + b + "[" + Integer.toString(buyingItemAmount) + "]";
				}
				System.out.println(l);
				f.format("%s", l);
				f.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
