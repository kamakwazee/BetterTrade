package bettertrade.core;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import cpw.mods.fml.relauncher.IClassTransformer;
import cpw.mods.fml.relauncher.IFMLLoadingPlugin.MCVersion;

@MCVersion(value = "1.5.2")
public class BetterTradeClassTransformer implements IClassTransformer {

	@Override
	public byte[] transform(String arg0, String arg1, byte[] arg2) {

		if(arg0.equals("sm"))
		{
			
			System.out.println("************ INSIDE BETTER TRADES TRANSFORMER ABOUT TO PATCH: " + arg0);
			
			arg2 = patchClassInJar(arg0, arg2, arg0, BetterTradeLoadingPlugin.location);
			
		}
		
		
		return arg2;
	}
	
	
	public byte[] patchClassInJar(String name, byte[] bytes, String ObfName, File location)
	{
		
		try
		{
			
			ZipFile zip = new ZipFile(location);
			
			ZipEntry entry = zip.getEntry(name.replace('.', '/') + ".class");
			
			if(entry == null)
			{
				System.out.println(name + " not found in " + location.getName());
			}
			else
			{
				InputStream zin = zip.getInputStream(entry);
				int size = (int) entry.getSize();
				bytes = new byte[size];
				int pos = 0;
				while (pos < size) {
				        int len = zin.read(bytes,pos,size-pos);
				        if (len == 0)
				                throw new IOException();
				        pos += len;
				}
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
