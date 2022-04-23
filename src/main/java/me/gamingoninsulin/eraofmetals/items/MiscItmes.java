package me.gamingoninsulin.eraofmetals.items;

import me.gamingoninsulin.eraofmetals.items.custom.CustomBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static me.gamingoninsulin.eraofmetals.EraOfMetalsMain.MOD_ID;
import static me.gamingoninsulin.eraofmetals.items.ModItemGroup.metalsTab;

public class MiscItmes {

    // ############################### MOD ITEMS ####################################################################

    // helper register ITEMS
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }


    // register mod ITEMS
    public static void registerMiscItems() {
        System.out.println("Registering Silver Items for " + MOD_ID);

    }

    // ############################### MOD BLOCK ####################################################################

    // Blocks
    private static Block registerMiscBlock(String name, Block block, ItemGroup group) {
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
        System.out.println("Registering Silver Blocks for " + MOD_ID);

    }

// ############################### MOD ITEMS AND BLOCK ##############################################################

    // ############################### MOD ITEMS ####################################################################

    // Speedy Block
    public static final Block SPEEDY_BLOCK = registerMiscBlock("speedy_block",
            new CustomBlock(FabricBlockSettings.of(Material.SOIL).hardness(0.6f).requiresTool() ), metalsTab);

    // ############################### MOD TOOLS ####################################################################

    // ############################### MOD BLOCK ####################################################################


}
