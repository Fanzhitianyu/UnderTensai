package lazyalienserver.undertensai.particle;

import lazyalienserver.undertensai.particle.ParticleTypes.UnderTensaiParticleType;
import lazyalienserver.undertensai.particle.ParticleTypes.UnderTensaiParticleTypeList;
import lazyalienserver.undertensai.utils.LASLogUtils;

public class ParticleManager {

    public static void tick(){
        for (Object type: UnderTensaiParticleTypeList.values().toArray()){
            if(type instanceof UnderTensaiParticleType){
                for (Particles particleEffect: ((UnderTensaiParticleType)type).particlesList){
                    particleEffect.player.getWorld().spawnParticles(particleEffect.player, ((UnderTensaiParticleType)type).type, particleEffect.force, particleEffect.POS.getX(), particleEffect.POS.getY(), particleEffect.POS.getZ(), particleEffect.count, particleEffect.End.getX(), particleEffect.End.getY(), particleEffect.End.getZ(), particleEffect.speed);
                }
            }
            else LASLogUtils.warn("[UnderTensai:the obejct isn't instanceof UnderTensaiParticleType]");
        }
    }
    public static void add(Particles particle){
        particle.getType().particlesList.add(particle);
    }
}