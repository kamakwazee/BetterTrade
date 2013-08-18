package bettertrade.core;

import java.io.File;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import net.minecraft.launchwrapper.IClassTransformer;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.MCVersion;

@MCVersion(value = "1.6.2")
public class BetterTradeClassTransformer implements IClassTransformer {

	@Override
	public byte[] transform(String arg0, String arg1, byte[] arg2) {

		if(arg0.equals("ua") || arg0.equals("net.minecraft.entity.passive.EntityVillager"))
		{
			
			System.out.println("************ INSIDE ENTITY TRANSFORMER ABOUT TO PATCH: " + arg0);
			
			arg2 = patchClassInJar(arg0, arg2, arg0, BetterTradeLoadingPlugin.location);
			
		}
		
		
		return arg2;
	}
	
	
	public byte[] patchClassInJar(String name, byte[] bytes, String ObfName, File location)
	{
		
		try
		{
			
			ZipFile zip = new ZipFile(location);
			
			ZipEntry entry = zip.getEntry(name.replace('.',File.separatorChar) + ".class");
			
			if(entry == null)
			{
				System.out.println(name + " not found in " + location.getName());
			}
			else
			{
				InputStream zin = zip.getInputStream(entry);
				
				bytes = new byte[(int) entry.getSize()];
				zin.read(bytes);
				zin.close();
				
				System.out.println("[BetterTrades]: Class " + name + " patched!");
			}
			
			zip.close();
			
		}
		catch(Exception e)
		{
			throw new RuntimeException("Error overriding " + name + " from " + location.getName(),e);
		}
		
		return bytes;
	}

}
