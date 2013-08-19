BetterTrade
===========

Minecraft mod for the villagers to give better trade. It is now available for Singleplayer and Multiplayer, and it is compatible with minecraft forge.

Error
===========

Currently, there is a game-breaking error in the source.

If you are here to help me figure out the error, I have some notes:

* The coremode package is bettertrade.core
* I compile the coremod and normal mod together, then separate them when packaging. (possibly creating errors?)
* The class I want to replace is net.minecraft.entity.passive.EntityVillager (ua when obfuscated)

My Build Process
===========

* I first run recompile.bat. 
* Then I run reobfuscate.bat. 
* I then copy all of those files over to a build directory I have set up which contains the META-INF.
* I then package all of that into a zip file using 7-zip. 
* Finally, I rename it to be a jar file, and I test it in minecraft.

Requirements
===========

Minecraft Forge -- http://minecraftforge.net
