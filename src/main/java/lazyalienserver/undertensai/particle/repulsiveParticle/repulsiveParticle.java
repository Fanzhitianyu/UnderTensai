package lazyalienserver.undertensai.particle.repulsiveParticle;

import lazyalienserver.undertensai.particle.ParticleTypes.UnderTensaiParticleTypes;
import lazyalienserver.undertensai.particle.Particles;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.Vec3d;

public class repulsiveParticle extends Particles {
    public static UnderTensaiParticleTypes type= UnderTensaiParticleTypes.RepulsiveParticle;
    public repulsiveParticle(ServerPlayerEntity player, Vec3d POS, Vec3d End, boolean force, int count, double speed){
        super(player,POS,End,force,count,speed);
    }
    @Override
    public UnderTensaiParticleTypes getChildType(){
        return type;
    }
}
