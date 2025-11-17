package com.lirxowo.carryonextend.network;

import com.lirxowo.carryonextend.Carryonextend;
import dev.architectury.networking.NetworkManager;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.server.level.ServerPlayer;

public class NetworkHandler {

    public static void init() {
        Carryonextend.LOGGER.info("NetworkHandler initialized");
    }

    public static <T extends CustomPacketPayload> void sendToServer(T packet) {
        NetworkManager.sendToServer(packet);
    }

    public static <T extends CustomPacketPayload> void sendToPlayer(ServerPlayer player, T packet) {
        NetworkManager.sendToPlayer(player, packet);
    }
}
