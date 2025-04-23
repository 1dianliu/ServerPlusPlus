package dev.anvilcraft.rg.spp.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import dev.anvilcraft.rg.spp.ServerPlusPlusServerRules;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(Player.class)
public abstract class PlayerCreativeNoClipMixin {
    @ModifyExpressionValue(
        method = {
            "tick()V",
            "aiStep()V",
            "updatePlayerPose()V"
        },
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/world/entity/player/Player;isSpectator()Z",
            ordinal = 0
        )
    )
    private boolean modifyAllSpectatorChecks(boolean original) {
        Player player = (Player) (Object) this;
        if (ServerPlusPlusServerRules.creativeNoClip && player.isCreative() && player.getAbilities().flying)
            return true;
        return original;
    }
}