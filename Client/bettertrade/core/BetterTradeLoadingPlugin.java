package bettertrade.core;

import java.io.File;
import java.util.Map;

import bettertrade.BetterTrade;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.MCVersion;

@MCVersion(value = "1.5.2")
public class BetterTradeLoadingPlugin implements IFMLLoadingPlugin {
	
	public static File location;

	@Override
	public String[] getASMTransformerClass() {
		return new String[]{BetterTradeClassTransformer.class.getName()};
	}

	@Override
	public String getModContainerClass() {
		return BetterTradeDummyContainer.class.getName();
	}

	@Override
	public void injectData(Map<String, Object> data) {

		location = (File) data.get("coremodLocation");
		
	}

	
	//Unused methods
	
	@Override
	public String[] getLibraryRequestClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSetupClass() {
		// TODO Auto-generated method stub
		return null;
	}

}
