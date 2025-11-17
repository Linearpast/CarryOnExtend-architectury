package com.lirxowo.carryonextend.fabric.mixin;

import com.lirxowo.carryonextend.client.PowerThrowHandler;
import net.minecraft.client.MouseHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MouseHandler.class)
public class MouseHandlerMixin {

    @Inject(method = "onScroll", at = @At("HEAD"), cancellable = true)
    private void onMouseScroll(long window, double xOffset, double yOffset, CallbackInfo ci) {

        boolean handled = PowerThrowHandler.onMouseScroll(yOffset);

        if (handled) {
            ci.cancel();
        }
    }
}
