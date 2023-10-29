package lazyalienserver.undertensai.particle;

import lazyalienserver.undertensai.particle.ParticleTypes.UnderTensaiParticleTypes;

public class ParticleManager {

    public static void tick(){
        for (UnderTensaiParticleTypes type: UnderTensaiParticleTypes.values()){
            for (Particles particleEffect: type.particlesList){
                particleEffect.player.getWorld().spawnParticles(particleEffect.player, type.type, particleEffect.force, particleEffect.POS.getX(), particleEffect.POS.getY(), particleEffect.POS.getZ(), particleEffect.count, particleEffect.End.getX(), particleEffect.End.getY(), particleEffect.End.getZ(), particleEffect.speed);
            }
        }
    }
    public static void add(Particles particle){
        particle.getChildType().particlesList.add(particle);
    }
}