package net.martin1912.BetaExtras.mixin;

import net.minecraft.level.Level;
import net.minecraft.level.LevelProperties;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(Level.class)
public class MixinDimension {
    @Shadow protected LevelProperties properties;

    @ModifyConstant(method = "<init>(Lnet/minecraft/level/dimension/DimensionData;Ljava/lang/String;JLnet/minecraft/level/dimension/Dimension;)V", constant = @Constant(intValue = 0))
    private int yeet(int dimension) {
        return properties == null ? dimension : properties.getDimensionId();
    }
}
