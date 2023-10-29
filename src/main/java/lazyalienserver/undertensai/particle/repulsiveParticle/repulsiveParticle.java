package lazyalienserver.undertensai.particle.repulsiveParticle;

import lazyalienserver.undertensai.particle.ParticleTypes.UnderTensaiParticleType;
import lazyalienserver.undertensai.particle.ParticleTypes.UnderTensaiParticleTypeList;
import lazyalienserver.undertensai.particle.Particles;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.Vec3d;

public class repulsiveParticle extends Particles {
    public static UnderTensaiParticleType type= UnderTensaiParticleTypeList.repulsiveParticle;
    public repulsiveParticle(ServerPlayerEntity player, Vec3d POS, Vec3d End, boolean force, int count, double speed){
        super(player,POS,End,force,count,speed);
    }
    @Override
    public UnderTensaiParticleType getType(){
        return type;
    }
}
