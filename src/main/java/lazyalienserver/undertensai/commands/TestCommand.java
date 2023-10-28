package lazyalienserver.undertensai.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import lazyalienserver.undertensai.utils.LASLogUtils;
import net.fabricmc.fabric.api.client.command.v1.FabricClientCommandSource;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.Vec3d;

import java.util.Objects;

import static net.fabricmc.fabric.api.client.command.v1.ClientCommandManager.literal;

public class TestCommand {

    public static void register(CommandDispatcher<FabricClientCommandSource> dispatcher){
        dispatcher.register(literal("UnderTensai").executes(TestCommand::putParticle));
    }

    private static int putParticle(CommandContext<FabricClientCommandSource> c){
        LASLogUtils.log("UnderTensai->command run");
        Vec3d pos=c.getSource().getPosition();
        Vec3d pos2=pos.add(0,3.0,0);
        Objects.requireNonNull(c.getSource().getClient().world).addParticle(ParticleTypes.CLOUD,pos.x,pos.y,pos.z,pos2.x,pos2.y,pos2.z);
        return 0;
    }
}
