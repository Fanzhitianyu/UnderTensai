package lazyalienserver.undertensai.particle;


import lazyalienserver.undertensai.particle.ParticleTypes.UnderTensaiParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.Vec3d;

public abstract class Particles {
    public ServerPlayerEntity player;

    public Vec3d POS;

    public Vec3d End;

    public boolean force;

    public int count;

    public double speed;
    public Particles(ServerPlayerEntity player, Vec3d POS, Vec3d End, boolean force, int count, double speed){
        this.player=player;
        this.POS=POS;
        this.End=End;
        this.force=force;
        this.count=count;
        this.speed=speed;
    }

    public abstract UnderTensaiParticleTypes getType();


}
