package dev.anvilcraft.rg.spp.mixin;

import dev.anvilcraft.rg.spp.ServerPlusPlusServerRules;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.world.level.material.PushReaction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ShulkerBoxBlockEntity.class)
public class ShulkerBoxBlockEntityCreativeNoClipMixin {
    @Redirect(method = "moveCollidedEntities", at = @At(
        value = "INVOKE",
        target = "Lnet/minecraft/world/entity/Entity;getPistonPushReaction()Lnet/minecraft/world/level/material/PushReaction;"
    ))
    private PushReaction getPistonBehaviourOfNoClipPlayers(Entity entity) {
        if (ServerPlusPlusServerRules.creativeNoClip && entity instanceof Player && (((Player) entity).isCreative()) && ((Player) entity).getAbilities().flying)
            return PushReaction.IGNORE;
        return entity.getPistonPushReaction();
    }
}