package lazyalienserver.undertensai.particle;


import lazyalienserver.undertensai.particle.ParticleTypes.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.Vec3d;

public abstract class Particles {
    public static ParticleTypes type;
    protected ServerPlayerEntity player;
    protected Vec3d POS;
    protected Vec3d End;

    protected boolean force;

    protected int count;

    protected double speed;
    public Particles(ServerPlayerEntity player, Vec3d POS, Vec3d End, boolean force, int count, double speed){
        this.player=player;
        this.POS=POS;
        this.End=End;
        this.force=force;
        this.count=count;
        this.speed=speed;
    }

    public ParticleTypes getType(){
        return type;
    }
}
