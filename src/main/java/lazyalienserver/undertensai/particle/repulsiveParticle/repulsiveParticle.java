package lazyalienserver.undertensai.particle.repulsiveParticle;

import lazyalienserver.undertensai.particle.ParticleTypes.ParticleTypes;
import lazyalienserver.undertensai.particle.Particles;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.Vec3d;

public class repulsiveParticle extends Particles {
    public static ParticleTypes type= ParticleTypes.RepulsiveParticle;
    public repulsiveParticle(ServerPlayerEntity player, Vec3d POS, Vec3d End, boolean force, int count, double speed){
        super(player,POS,End,force,count,speed);
    }
    public ParticleTypes getType(){
        return type;
    }

}
