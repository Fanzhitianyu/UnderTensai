package lazyalienserver.undertensai;

import com.mojang.brigadier.CommandDispatcher;
import lazyalienserver.undertensai.commands.TestCommand;
import lazyalienserver.undertensai.particle.ParticleManager;
import lazyalienserver.undertensai.utils.UnderTensaiResource;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.command.ServerCommandSource;

public class UnderTensai implements ModInitializer {
    public static MinecraftServer minecraftServer;

    public static final String modId="undertensai";
    @Override
    public void onInitialize() {
        CommandRegistrationCallback.EVENT.register(UnderTensai::registerCommand);
    }

    public static void registerCommand(CommandDispatcher<ServerCommandSource> dispatcher, boolean b){
        TestCommand.register(dispatcher);
    }

    public static void onServerLoaded(MinecraftServer server)
    {
        UnderTensai.minecraftServer = server;
        UnderTensaiResource.loadLASResource();
    }
    public static void onServerClosed(MinecraftServer server)
    {
        UnderTensai.minecraftServer = null;
    }

    public static void tick(){
        ParticleManager.tick();
    }
}
