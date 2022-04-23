package me.gamingoninsulin.eraofmetals.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static me.gamingoninsulin.eraofmetals.EraOfMetalsMain.MOD_ID;
import static me.gamingoninsulin.eraofmetals.items.ModItemGroup.metalsTab;

public class CopperItems {

    // ############################### MOD ITEMS ####################################################################

    // helper register ITEMS
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }


    // register mod ITEMS
    public static void registerCopperItems() {
        System.out.println("Registering Copper Items for " + MOD_ID);

    }

    // ############################### MOD BLOCK ####################################################################

    // Blocks
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name , block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }

    // helper register BLOCKS
    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    // register mod BLOCKS
    public static void registerSilverBlocks() {
        System.out.println("Registering Copper Blocks for " + MOD_ID);

    }
// ############################### MOD ITEMS AND BLOCK ##############################################################

    // ############################### MOD ITEMS ####################################################################

    // copper nugget
    public static final Item COPPER_NUGGET = registerItem("copper_nugget",
            new Item(new FabricItemSettings().group(metalsTab)));


    // ############################### MOD BLOCK ####################################################################

}
