package lazyalienserver.undertensai.particle.ParticleTypes;

import lazyalienserver.undertensai.particle.Particles;
import net.minecraft.particle.DefaultParticleType;

import java.util.ArrayList;

public class UnderTensaiParticleType {
    public final DefaultParticleType type;
    public final ArrayList<Particles> particlesList;
    UnderTensaiParticleType(DefaultParticleType type){
        this.type=type;
        this.particlesList=new ArrayList<>();
    }

}
