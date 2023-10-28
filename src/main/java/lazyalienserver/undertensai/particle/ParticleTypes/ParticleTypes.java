package lazyalienserver.undertensai.particle.ParticleTypes;

import net.minecraft.particle.DefaultParticleType;

public enum ParticleTypes {
    RepulsiveParticle(net.minecraft.particle.ParticleTypes.CLOUD);
    public final DefaultParticleType type;
    ParticleTypes(DefaultParticleType type){
        this.type=type;
    }
    public String toString(){
      return this.name();
    }
}
