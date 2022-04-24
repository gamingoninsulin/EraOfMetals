package me.gamingoninsulin.eraofmetals.items;

import me.gamingoninsulin.eraofmetals.items.custom.SilverProspectorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static me.gamingoninsulin.eraofmetals.EraOfMetalsMain.MOD_ID;
import static me.gamingoninsulin.eraofmetals.items.ModItemGroup.metalsTab;

public class SilverItems {

    // ############################### MOD ITEMS SETTINGS ###########################################################

    // helper register ITEMS
    private static Item registerSilverItem(String name, Item item){
     return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }


    // register mod ITEMS to (EraOfMetalsMain.java)
    public static void registerSilverItems() {
        System.out.println("Registering Silver Items for " + MOD_ID);

    }

    // ############################### MOD BLOCK SETTINGS ###########################################################

    // Blocks
    private static Block registerSilverBlock(String name, Block block, ItemGroup group) {
     registerBlockItem(name , block, group);
     return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }

    // helper register BLOCKS (items in hand)
    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    // register mod BLOCKS to (EraOfMetalsMain.java)
    public static void registerSilverBlocks() {
        System.out.println("Registering Silver Blocks for " + MOD_ID);

    }

// ############################### MOD ITEMS AND BLOCK ##############################################################

    // ############################### MOD ITEMS ####################################################################

    // raw silver
    public static final Item RAW_SILVER = registerSilverItem("raw_silver",
            new Item(new FabricItemSettings().group(metalsTab)));

    // silver ingot
    public static final Item SILVER_INGOT = registerSilverItem("silver_ingot",
            new Item(new FabricItemSettings().group(metalsTab)));

    // silver nugget
    public static final Item SILVER_NUGGET = registerSilverItem("silver_nugget",
            new Item(new FabricItemSettings().group(metalsTab)));


    // ############################### MOD TOOLS ####################################################################

    // silver prospector
    public static final Item SILVER_PROSPECTOR = registerSilverItem("silver_prospector",
            new SilverProspectorItem(new FabricItemSettings().group(metalsTab).maxDamage(64)));

    // ############################### MOD BLOCK ####################################################################



    // silver block
    public static final Block SILVER_BLOCK = registerSilverBlock("silver_block",
            new Block(FabricBlockSettings.of(Material.METAL).hardness(5f).sounds(BlockSoundGroup.METAL).requiresTool()), metalsTab);

    // raw silver block
    public static final Block RAW_SILVER_BLOCK = registerSilverBlock("raw_silver_block",
            new Block(FabricBlockSettings.of(Material.METAL).hardness(5f).requiresTool() ), metalsTab);


}
