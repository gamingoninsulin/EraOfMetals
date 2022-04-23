package me.gamingoninsulin.eraofmetals.blocks.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.LiteralText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CustomBlock extends Block {
    public CustomBlock(Settings settings) {
        super(settings);
    }

    /*
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {

        // happens 2 time for CLIENT and 2 time for SERVER
        if(world.isClient()){
            if(hand == hand.MAIN_HAND){
                player.sendMessage(new LiteralText("CLIENT: This is THE CLIENT! Main Hand"), false);
            } else {
                player.sendMessage(new LiteralText("CLIENT: This is THE CLIENT! Main Hand"), false);
            }
        }


        return ActionResult.SUCCESS;
    }
    */

    // step on (status effect)
    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if(!world.isClient){
            if(entity instanceof LivingEntity) {
                LivingEntity livingEntity = ((LivingEntity) entity);
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200));
            }
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
