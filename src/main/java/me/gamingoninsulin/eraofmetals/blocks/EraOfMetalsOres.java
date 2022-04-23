package me.gamingoninsulin.eraofmetals.blocks;

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

public class EraOfMetalsOres {
    // ############################### MOD BLOCK SETTINGS ###########################################################

    // Blocks
    private static Block registerEraOfMetalsOres(String name, Block block, ItemGroup group) {
        registerBlockItem(name , block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }

    // helper register BLOCKS (items in hand)
    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    // register mod BLOCKS to (EraOfMetalsMain.java)
    public static void registerOreBlocks() {
        System.out.println("Registering Copper Blocks for " + MOD_ID);

    }
// ############################### MOD BLOCK ########################################################################

    // ############################### NORMAL ORE ###################################################################

    // silver ore
    public static final Block SILVER_ORE = registerEraOfMetalsOres("silver_ore",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(3f).requiresTool()), metalsTab);

    // ############################### DEEPSLATE ORE ################################################################

    // deepslate silver ore
    public static final Block DEEPSLATE_SILVER_ORE = registerEraOfMetalsOres("deepslate_silver_ore",
            new Block(FabricBlockSettings.of(Material.STONE).hardness(4.5f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)), metalsTab);

}
