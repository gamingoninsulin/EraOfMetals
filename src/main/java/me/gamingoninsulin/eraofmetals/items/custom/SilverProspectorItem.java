package me.gamingoninsulin.eraofmetals.items.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.LiteralText;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;


public class SilverProspectorItem extends Item {
    public SilverProspectorItem(Settings settings) {
        super(settings);
    }

    @Override // checks the block wich it used on.
    public ActionResult useOnBlock(ItemUsageContext context) {
        // checking if its client
        if(context.getWorld().isClient()) {
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;

            for(int i = 0; i <= positionClicked.getY(); i++) {
                Block blockBelow =    context.getWorld().getBlockState(positionClicked.down(i)).getBlock();

                if(isValuebleBlock(blockBelow)){
                    outputValuebleCords(positionClicked, player, blockBelow);
                    foundBlock = true;
                    break;
                }

            }
            if(!foundBlock) {
                player.sendMessage(new TranslatableText("item.eraofmetalsid.prospector.no_valuables"), false);
            }

        }
        context.getStack().damage(1,context.getPlayer(),(player) -> player.sendToolBreakStatus(player.getActiveHand()));
        return super.useOnBlock(context);
    }

    private void outputValuebleCords(BlockPos blockpos, PlayerEntity player, Block blockBelow) {
        player.sendMessage(new LiteralText(" Found " + blockBelow.asItem().getName().getString() + " at "
                + "X" + blockpos.getX() + ", Y" + blockpos.getY() + ", Z"+ blockpos.getZ() ), false);
    }

    private boolean isValuebleBlock(Block block) {
        return  block == Blocks.COPPER_ORE
                || block == Blocks.DEEPSLATE_COPPER_ORE

                || block == Blocks.DEEPSLATE_COAL_ORE
                || block == Blocks.COAL_ORE

                || block == Blocks.DIAMOND_ORE
                || block == Blocks.DEEPSLATE_DIAMOND_ORE

                || block == Blocks.IRON_ORE
                || block == Blocks.DEEPSLATE_IRON_ORE

                || block == Blocks.EMERALD_ORE
                || block == Blocks.DEEPSLATE_EMERALD_ORE

                || block == Blocks.GOLD_ORE
                || block == Blocks.DEEPSLATE_GOLD_ORE

                || block == Blocks.LAPIS_ORE
                || block == Blocks.DEEPSLATE_LAPIS_ORE

                || block == Blocks.REDSTONE_ORE
                || block == Blocks.DEEPSLATE_REDSTONE_ORE; // delete this when the silver ore spawns

                // Era OF Metals Ore
                //|| block == SilverItems.SILVER_ORE
                //|| block == SilverItems.DEEPSLATE_SILVER_ORE;
    }
}
