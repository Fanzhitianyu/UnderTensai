package lazyalienserver.undertensai.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import lazyalienserver.undertensai.particle.ParticleManager;
import lazyalienserver.undertensai.particle.repulsiveParticle.repulsiveParticle;
import lazyalienserver.undertensai.utils.LASLogUtils;
import net.minecraft.server.command.ServerCommandSource;

import static net.minecraft.server.command.CommandManager.literal;

public class TestCommand {

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher){
        dispatcher.register(literal("UnderTensai").executes(TestCommand::putParticle));
    }

    private static int putParticle(CommandContext<ServerCommandSource> c){
        try{
            repulsiveParticle particle=new repulsiveParticle(c.getSource().getPlayer(),c.getSource().getPosition(), c.getSource().getPosition().add(0,0.2,0),true,0,0);
            ParticleManager.add(particle);

        }catch (Exception e){
            LASLogUtils.error("UnderTensai: Player?",e);
        }
        return 0;
    }
}
