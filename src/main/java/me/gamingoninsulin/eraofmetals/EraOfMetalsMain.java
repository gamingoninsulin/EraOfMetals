package me.gamingoninsulin.eraofmetals;

import me.gamingoninsulin.eraofmetals.items.CopperItems;
import me.gamingoninsulin.eraofmetals.items.MiscItmes;
import me.gamingoninsulin.eraofmetals.items.SilverItems;
import net.fabricmc.api.ModInitializer;

public class EraOfMetalsMain implements ModInitializer {

	public static final String MOD_ID = "eraofmetalsid";

	@Override
	public void onInitialize() {
		// silver
		SilverItems.registerSilverItems();
		SilverItems.registerSilverBlocks();

		// copper
		CopperItems.registerCopperItems();
		CopperItems.registerSilverBlocks();

		// misc
		MiscItmes.registerMiscItems();
		MiscItmes.registerSilverBlocks();
	}
}
