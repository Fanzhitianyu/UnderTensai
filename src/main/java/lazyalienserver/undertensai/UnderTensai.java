package lazyalienserver.undertensai;

import lazyalienserver.undertensai.utils.UnderTensaiResource;
import net.fabricmc.api.ModInitializer;
import net.minecraft.server.MinecraftServer;

public class UnderTensai implements ModInitializer {
    public static MinecraftServer minecraftServer;

    public static final String modId="undertensai";
    @Override
    public void onInitialize() {
        UnderTensaiResource.loadLASResource();
    }

    public static void onServerLoaded(MinecraftServer server)
    {
        UnderTensai.minecraftServer = server;
    }
    public static void onServerClosed(MinecraftServer server)
    {
        UnderTensai.minecraftServer = null;
    }
}
