package me.gamingoninsulin.eraofmetals.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

import static me.gamingoninsulin.eraofmetals.EraOfMetalsMain.MOD_ID;

public class ModItemGroup {
    public static final ItemGroup metalsTab = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "metalstab"),
            () -> new ItemStack(SilverItems.SILVER_INGOT));
}
