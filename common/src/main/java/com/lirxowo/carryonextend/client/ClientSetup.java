package com.lirxowo.carryonextend.client;

import com.lirxowo.carryonextend.client.renderer.CustomFallingBlockRenderer;
import com.lirxowo.carryonextend.registry.EntityRegistry;
import dev.architectury.registry.client.level.entity.EntityRendererRegistry;

public class ClientSetup {

    public static void init() {
        try {
            EntityRendererRegistry.register(EntityRegistry.CUSTOM_FALLING_BLOCK, CustomFallingBlockRenderer::new);
        } catch (Exception e) {
        }
    }
}
