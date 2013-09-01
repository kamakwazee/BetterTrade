package bettertrade;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

import bettertrade.common.CommonProxy;
import bettertrade.packets.BetterTradePacketHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="bettertrade", name="Better Villager Trades", version="1.2.2")
@NetworkMod(clientSideRequired=true, serverSideRequired=false,
channels={"BetterTrade"}, packetHandler = BetterTradePacketHandler.class)	
public class BetterTrade {
	
	//The instance of your mod that Forge uses.
	@Instance("BetterTrade")
	public static BetterTrade instance;
	
	//Says where the client and server 'proxy' code is loaded
	@SidedProxy(clientSide="bettertrade.client.ClientProxy", serverSide="bettertrade.common.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		
		proxy.registerRenderers();
		
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	public static String getConfigDirectory()
	{
		String configdir = cpw.mods.fml.common.Loader.instance().getConfigDir().getAbsolutePath();
		Formatter f;
		try {
			f = new Formatter(new File("/home/kamakwazee/Desktop/testDirectory.txt"));
			f.format(configdir);
			f.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return configdir;
	}
	
}
