package bettertrade;

import net.minecraftforge.common.MinecraftForge;
import bettertrade.common.CommonProxy;
import bettertrade.event.BetterTradeEvents;
import bettertrade.packets.BetterTradePacketHandler;
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

@Mod(modid="bettertrade", name="Better Trades", version="1.1.2")
@NetworkMod(clientSideRequired=true, serverSideRequired=false,
channels={"BetterTrade"}, packetHandler = BetterTradePacketHandler.class)
public class BetterTrade {
	
	@Instance("BetterTrade")
	public static BetterTrade instance;
	
	@SidedProxy(clientSide="bettertrade.client.ClientProxy", serverSide="bettertrade.common.CommonProxy")
	public static CommonProxy proxy;
	
	//Only used when connected to server
	public static int i1ID = 0;                //Item 1 ID
	public static int i1amt = 0;               //Item 1 Amount
	public static int i2ID = 0;                //Item 2 ID
	public static int i2amt = 0;               //Item 2 Amount
	public static int bID = 0;                 //Buying Item ID
	public static int bamt = 0;                //Buying Amount
	public static boolean connected = false;   //Connected to Server
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@Init
	public void load(FMLInitializationEvent event)
	{
		
		proxy.registerRenderers();
		
		MinecraftForge.EVENT_BUS.register(new BetterTradeEvents());


	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	public static String getConfigDirectory()
	{
		String configdir = cpw.mods.fml.common.Loader.instance().getConfigDir().getAbsolutePath();
		return configdir;
	}
	
}
