package mod.bettertrade;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="BetterTrade", name="BetterTrade", version="0.1.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false,
channels={"BetterTrade"}, packetHandler = BetterTradePacketHandler.class)
public class BetterTrade {
	
	//The instance of your mod that Forge uses.
	@Instance("BetterTrade")
	public static BetterTrade instance;
	
	//Says where the client and server 'proxy' code is loaded
	@SidedProxy(clientSide="mod.bettertrade.client.ClientProxy", serverSide="mod.bettertrade.CommonProxy")
	public static CommonProxy proxy;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event){}
	
	@Init
	public void load(FMLInitializationEvent event){
		
		proxy.registerRenderers();
		
		
		
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event){}
	
}
