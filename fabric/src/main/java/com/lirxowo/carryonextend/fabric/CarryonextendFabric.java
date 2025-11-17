package com.lirxowo.carryonextend.fabric;

import com.lirxowo.carryonextend.Carryonextend;
import com.lirxowo.carryonextend.fabric.network.FabricNetworkHandler;
import net.fabricmc.api.ModInitializer;

public final class CarryonextendFabric implements ModInitializer {
    @Override
    public void onInitialize() {

        Carryonextend.init();

        FabricNetworkHandler.registerServerReceivers();
    }
}
