package lazyalienserver.undertensai.mixins;

import lazyalienserver.undertensai.UnderTensai;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public abstract class MinecraftServerMixin {

    @Inject(method = "loadWorld", at = @At("HEAD"))
    private void serverLoaded(CallbackInfo ci)
    {
        UnderTensai.onServerLoaded((MinecraftServer) (Object) this);
    }

    @Inject(method = "loadWorld", at = @At("HEAD"))
    private void serverClosed(CallbackInfo ci)
    {
        UnderTensai.onServerClosed((MinecraftServer) (Object) this);
    }
    @Inject(method = "tick", at = @At("HEAD"))
    private void tickStart(CallbackInfo ci)
    {
        UnderTensai.tick();
    }
}
