package lazyalienserver.undertensai.mixins;

import lazyalienserver.undertensai.UnderTensaiClient;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {
    @Inject(at=@At("HEAD"),method = "tick")
    public void tick(CallbackInfo ci){
        UnderTensaiClient.tick();
    }
}
