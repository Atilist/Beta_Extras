package net.martin1912.BetaExtras.mixin;

import net.martin1912.BetaExtras.Block.BlockListener;
import net.martin1912.BetaExtras.Item.ItemListener;
import net.minecraft.entity.Item;
import net.minecraft.entity.player.PlayerBase;
import net.minecraft.item.ItemInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Item.class)
public class MixinItem {
    /*
    @Shadow public ItemInstance item;
    @Inject(method = "onPlayerCollision(Lnet/minecraft/entity/player/PlayerBase;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/level/Level;playSound(Lnet/minecraft/entity/EntityBase;Ljava/lang/String;FF)V", shift = At.Shift.BEFORE))
    private void OnItemPickup(PlayerBase arg, CallbackInfo ci) {
        if (item.itemId == BlockListener.alphiumOre.id) {
            arg.incrementStat(AchievementListener.FirstAlphium);
        }
        else if (item.itemId == ItemListener.alphium.id) {
            arg.incrementStat(AchievementListener.SmeltedAlphium);
        }
        /*
        else if (item.itemId == ItemListener.pureAlphium.id) {
            arg.incrementStat(AchievementListener.PureAlphium);
        }
    }
     */
}
