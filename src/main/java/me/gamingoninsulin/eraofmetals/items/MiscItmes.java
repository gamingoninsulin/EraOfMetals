package me.gamingoninsulin.eraofmetals.items;

import me.gamingoninsulin.eraofmetals.blocks.custom.CustomBlock;
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
import static me.gamingoninsulin.eraofmetals.items.ModFoodComponents.*;
import static me.gamingoninsulin.eraofmetals.items.ModItemGroup.metalsTab;

public class MiscItmes {

    // ############################### MOD ITEMS SETTINGS ###########################################################

    // helper register ITEMS
    private static Item registerMiscItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }


    // register mod ITEMS to (EraOfMetalsMain.java)
    public static void registerMiscItems() {
        System.out.println("Registering Silver Items for " + MOD_ID);

    }

    // ############################### MOD BLOCK ####################################################################

    // Blocks
    private static Block registerMiscBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name , block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }

    // helper register BLOCKS (items in hand)
    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    // register mod BLOCKS to (EraOfMetalsMain.java)
    public static void registerMiscBlocks() {
        System.out.println("Registering Silver Blocks for " + MOD_ID);

    }

// ############################### MOD ITEMS AND BLOCK ##############################################################

    // ############################### MOD ITEMS ####################################################################

    // raw turnip
    public static final Item RAW_TURNIP = registerMiscItem("raw_turnip",
            new Item(new FabricItemSettings().group(metalsTab).food(R_TURNIP)));

    // cooked turnip
    public static final Item COOKED_TURNIP = registerMiscItem("cooked_turnip",
            new Item(new FabricItemSettings().group(metalsTab).food(C_TURNIP)));

    // pressure coal chunk
    public static final Item PRESSURE_COAL_CHUNK = registerMiscItem("pressure_coal_chunk",
            new Item(new FabricItemSettings().group(metalsTab)));

    // pressure coal
    public static final Item PRESSURE_COAL = registerMiscItem("pressure_coal",
            new Item(new FabricItemSettings().group(metalsTab)));

    // pressure coal
    public static final Item PRESSURE_COAL_BLOCK = registerMiscItem("pressure_coal_block",
            new Item(new FabricItemSettings().group(metalsTab)));

    // ############################### MOD TOOLS ####################################################################

    // ############################### MOD BLOCK ####################################################################
    // Speedy Block
    public static final Block SPEEDY_BLOCK = registerMiscBlock("speedy_block",
            new CustomBlock(FabricBlockSettings.of(Material.SOIL).hardness(0.6f).requiresTool() ), metalsTab);

}
