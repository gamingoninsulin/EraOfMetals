package me.gamingoninsulin.eraofmetals;

import me.gamingoninsulin.eraofmetals.blocks.EraOfMetalsOres;
import me.gamingoninsulin.eraofmetals.items.CopperItems;
import me.gamingoninsulin.eraofmetals.items.MiscItmes;
import me.gamingoninsulin.eraofmetals.items.SilverItems;
import me.gamingoninsulin.eraofmetals.util.ModRegistries;
import net.fabricmc.api.ModInitializer;

public class EraOfMetalsMain implements ModInitializer {

	public static final String MOD_ID = "eraofmetalsid";

	@Override
	public void onInitialize() {
		// ore blocks
		EraOfMetalsOres.registerOreBlocks();

		// silver
		SilverItems.registerSilverItems();
		SilverItems.registerSilverBlocks();

		// copper
		CopperItems.registerCopperItems();
		CopperItems.registerSilverBlocks();

		// misc
		MiscItmes.registerMiscItems();
		MiscItmes.registerMiscBlocks();

		// mod stuff
		ModRegistries.registerModStuff();
	}
}
