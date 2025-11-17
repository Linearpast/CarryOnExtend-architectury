package com.lirxowo.carryonextend.neoforge;

import com.lirxowo.carryonextend.Carryonextend;
import com.lirxowo.carryonextend.client.ClientSetup;
import com.lirxowo.carryonextend.client.renderer.CustomFallingBlockRenderer;
import com.lirxowo.carryonextend.neoforge.network.NeoForgeNetworkHandler;
import com.lirxowo.carryonextend.registry.EntityRegistry;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@Mod(Carryonextend.MOD_ID)
public final class CarryonextendNeoForge {
    public CarryonextendNeoForge(IEventBus modEventBus) {

        Carryonextend.init();

        NeoForgeNetworkHandler.registerServerReceivers();

        if (FMLEnvironment.dist == Dist.CLIENT) {
            modEventBus.addListener(this::onClientSetup);
            modEventBus.addListener(this::onRegisterEntityRenderers);
        }
    }

    private void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            ClientSetup.init();
            NeoForgeNetworkHandler.registerClientReceivers();
        });
    }

    private void onRegisterEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {

        Carryonextend.LOGGER.info("Registering entity renderer for CUSTOM_FALLING_BLOCK via NeoForge event");
        event.registerEntityRenderer(EntityRegistry.CUSTOM_FALLING_BLOCK.get(), CustomFallingBlockRenderer::new);
    }
}
