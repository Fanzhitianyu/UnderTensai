package lazyalienserver.undertensai.particle.ParticleTypes;

import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleTypes;

import java.util.ArrayList;
public class UnderTensaiParticleTypeList {
    private static final ArrayList<UnderTensaiParticleType> particleTypes=new ArrayList<>();

    public static final UnderTensaiParticleType repulsiveParticle=register(ParticleTypes.CLOUD);


    public static UnderTensaiParticleType register(DefaultParticleType defaultParticleType){
        UnderTensaiParticleType type=new UnderTensaiParticleType(defaultParticleType);
        particleTypes.add(type);
        return type;
    }

    public static ArrayList<UnderTensaiParticleType> values(){
        return particleTypes;
    }
}
