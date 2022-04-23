package me.gamingoninsulin.eraofmetals.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;

import static me.gamingoninsulin.eraofmetals.EraOfMetalsMain.MOD_ID;
import static me.gamingoninsulin.eraofmetals.items.MiscItmes.*;

public class ModRegistries {
    public static void registerModStuff() {
        registerFuels();
    }

    private static void registerFuels() {
        System.out.println("Registering Fuels for " + MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        // pressure coal chunk
        registry.add(PRESSURE_COAL_CHUNK,200);

        // pressure coal
        registry.add(PRESSURE_COAL, 2000);

        // pressure coal block
        registry.add(PRESSURE_COAL_BLOCK,18000);

    }

}
