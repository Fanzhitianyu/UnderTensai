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
        LASLogUtils.log("UnderTensai->command run");


        try{
            repulsiveParticle particle=new repulsiveParticle(c.getSource().getPlayer(),c.getSource().getPosition(), c.getSource().getPosition().add(0,0.2,0),false,0,0);
            ParticleManager.add(particle);
            //repulsiveParticle.add(particle);
            //ParticleManager.ParticleList.add(particle);
        }catch (Exception e){
            LASLogUtils.error("UnderTensai: Player?",e);
        }
//        Vec3d pos=c.getSource().getPosition();
//        Vec3d pos2=pos.add(0,0.2,0);
//        ParticleManager.ParticleList.add(new Pair<>(UnderTensaiParticleTypes.CLOUD,new Pair<>(pos,pos2)));
        //Objects.requireNonNull(c.getSource().getClient().particleManager).addParticle(UnderTensaiParticleTypes.CLOUD,pos.x,pos.y,pos.z,pos2.x,pos2.y,pos2.z);
        return 0;
    }
}
