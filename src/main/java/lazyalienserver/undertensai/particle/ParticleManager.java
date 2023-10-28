package lazyalienserver.undertensai.particle;

import com.mojang.datafixers.util.Pair;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.util.math.Vec3d;

import java.util.ArrayList;
import java.util.Random;

public class ParticleManager {
    private static final Random random=new Random();
    public static ArrayList<Particles> ParticleList=new ArrayList<>();
    public static void tick(){
        ArrayList<Pair<ParticleEffect,Pair<Vec3d,Vec3d>>> samePairArrayList;
        for (Particles particleEffect:ParticleList){

            particleEffect.player.getWorld().spawnParticles(particleEffect.player, particleEffect.getType().type, particleEffect.force, particleEffect.POS.getX(), particleEffect.POS.getY(), particleEffect.POS.getZ(), particleEffect.count, particleEffect.End.getX(), particleEffect.End.getY(), particleEffect.End.getZ(), particleEffect.speed);
        }


//        for (Pair<ParticleEffect,Pair<Vec3d,Vec3d>> particleEffect:ParticleList){
//            Vec3d first=particleEffect.getSecond().getFirst();
//            //Vec3d second=particleEffect.getSecond().getSecond();
//            if (MinecraftClient.getInstance().world != null) {
//                for (int i = 0; i <= 16; i++) {
//                    MinecraftClient.getInstance().world.addParticle(particleEffect.getFirst(), first.x, first.y, first.z, 0,0.2,0);
//
//                }
//            }
//        }
    }
}