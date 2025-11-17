package com.lirxowo.carryonextend.client;

import com.lirxowo.carryonextend.Carryonextend;
import com.lirxowo.carryonextend.client.renderer.CustomFallingBlockRenderer;
import com.lirxowo.carryonextend.registry.EntityRegistry;
import dev.architectury.registry.client.level.entity.EntityRendererRegistry;

public class ClientSetup {

    public static void init() {
        Carryonextend.LOGGER.info("Client setup initializing...");

        try {
            EntityRendererRegistry.register(EntityRegistry.CUSTOM_FALLING_BLOCK, CustomFallingBlockRenderer::new);
            Carryonextend.LOGGER.info("Successfully registered CustomFallingBlockRenderer via Architectury");
        } catch (Exception e) {

            Carryonextend.LOGGER.warn("Could not register renderer via Architectury (this is normal for NeoForge): " + e.getMessage());
        }

        Carryonextend.LOGGER.info("Client setup initialized!");
    }
}
