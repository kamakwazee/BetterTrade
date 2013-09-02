package bettertrade.core;

import java.util.Arrays;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

import cpw.mods.fml.common.DummyModContainer;
import cpw.mods.fml.common.LoadController;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.event.FMLConstructionEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class BetterTradeDummyContainer extends DummyModContainer{

	public BetterTradeDummyContainer() {

		super(new ModMetadata());
		ModMetadata meta = getMetadata();
		
		meta.modId = "bettertradecore";
		meta.name = "Better Trades Core";
		meta.version = "1.1.2";
		meta.authorList = Arrays.asList("kamakwazee");
		meta.description = "Better Trades Core";
		meta.url = "http://www.minecraftforum.net/topic/1733683-162-spmp-better-trades-122/";
		meta.updateUrl = "";
		meta.screenshots = new String[0];
		meta.logoFile = "";
		
	}
	
	@Override
	public boolean registerBus(EventBus bus, LoadController controller) {
		bus.register(this);
		return true;
	}

	@Subscribe
	public void modConstruction(FMLConstructionEvent evt){

	}

	@Subscribe
	public void preInit(FMLPreInitializationEvent evt) {

	}

	@Subscribe
	public void init(FMLInitializationEvent evt) {

	}


	@Subscribe
	public void postInit(FMLPostInitializationEvent evt) {

	}

}
