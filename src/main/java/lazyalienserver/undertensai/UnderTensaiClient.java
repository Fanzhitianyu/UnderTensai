package lazyalienserver.undertensai;

import com.mojang.brigadier.CommandDispatcher;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v1.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v1.FabricClientCommandSource;

public class UnderTensaiClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        registerCommand(ClientCommandManager.DISPATCHER);
    }
    public static void registerCommand(CommandDispatcher<FabricClientCommandSource> dispatcher){
        //TestCommand.register(dispatcher);
    }

    public static void tick(){
        //ParticleManager.tick();
    }
}
