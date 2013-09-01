package bettertrade.packets;

import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class BetterTradePacketHandler implements IPacketHandler{

	@Override
	public void onPacketData(INetworkManager manager,
							 Packet250CustomPayload packet,
							 Player player) {
		
		//Server shouldn't receive data
		
	}

}
