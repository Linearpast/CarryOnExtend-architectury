package com.lirxowo.carryonextend;

import com.lirxowo.carryonextend.network.NetworkHandler;
import com.lirxowo.carryonextend.registry.EntityRegistry;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public final class Carryonextend {
    public static final String MOD_ID = "carryonextend";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static void init() {
        LOGGER.info("CarryOnExtend initializing...");

        EntityRegistry.init();
        NetworkHandler.init();

        LOGGER.info("CarryOnExtend initialized!");
    }
}
