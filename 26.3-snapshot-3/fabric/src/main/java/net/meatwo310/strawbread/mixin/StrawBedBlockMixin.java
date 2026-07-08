package net.meatwo310.strawbread.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StrawBedBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(StrawBedBlock.class)
public class StrawBedBlockMixin {
    @Inject(method = "destroyOnUse", at = @At("HEAD"))
    private void strawbread$dropCharcoalBreadInNether(BlockState state, Level level, BlockPos pos, Player player, CallbackInfoReturnable<InteractionResult> cir) {
        if (level.dimension() == Level.NETHER) {
            Block.popResource(level, pos, createCharcoalBread());
        }
    }

    @Inject(method = "destroyOnLeave", at = @At("HEAD"))
    private void strawbread$dropBreadAfterSleeping(Level level, BlockPos pos, CallbackInfo ci) {
        Block.popResource(level, pos, new ItemStack(Items.BREAD, 2));
    }

    private static ItemStack createCharcoalBread() {
        ItemStack stack = new ItemStack(Items.CHARCOAL);
        stack.set(DataComponents.ITEM_NAME, Component.translatable("item.minecraft.bread"));
        stack.set(DataComponents.FOOD, Foods.DRIED_KELP);
        stack.set(DataComponents.CONSUMABLE, Consumables.DEFAULT_FOOD);
        return stack;
    }
}
