package lazyalienserver.undertensai.particle.ParticleTypes;

import lazyalienserver.undertensai.particle.Particles;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleTypes;

import java.util.ArrayList;

public enum UnderTensaiParticleTypes {
    RepulsiveParticle(ParticleTypes.CLOUD);

    public final DefaultParticleType type;
    public final ArrayList<Particles> particlesList;
    UnderTensaiParticleTypes(DefaultParticleType type){
        this.type=type;
        this.particlesList=new ArrayList<>();
    }
    public String toString(){
      return this.name();
    }

}
