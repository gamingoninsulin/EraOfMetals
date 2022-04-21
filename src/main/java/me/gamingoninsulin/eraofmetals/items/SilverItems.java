package me.gamingoninsulin.eraofmetals.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static me.gamingoninsulin.eraofmetals.EraOfMetalsMain.MOD_ID;

public class SilverItems {

    // helps with register items
    private static Item registerItem(String name, Item item){
     return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }

    // sets the MOD_ID
    public static void registerSilverItems() {
        System.out.println("Registering Copper Items for " + MOD_ID);

    }

    // silver ingot
    public static final Item SILVER_INGOT = registerItem("silver_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MISC))); // misc group for now !

    // silver nugget
    public static final Item SILVER_NUGGET = registerItem("silver_nugget",
            new Item(new FabricItemSettings().group(ItemGroup.MISC))); // misc group for now !


    // silver block
    /*public static final Item SILVER_BLOCK = registerItem("silver_block",
            new Block(new FabricBlockSettings().group(ItemGroup.MISC))); // misc group for now !
    */
}
