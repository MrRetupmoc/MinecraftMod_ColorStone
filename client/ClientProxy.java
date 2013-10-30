package MrRetupmoc42.Chatman.client;

import net.minecraftforge.client.MinecraftForgeClient;
import MrRetupmoc42.Chatman.CommonProxy;

public class ClientProxy extends CommonProxy {
       
        @Override
        public void registerRenderers() {
			MinecraftForgeClient.preloadTexture(GreenstoneDust);
			MinecraftForgeClient.preloadTexture(GreenstoneOre);
			MinecraftForgeClient.preloadTexture(GreenstoneTorchIdle);
			MinecraftForgeClient.preloadTexture(GreenstoneTorchActive);
			MinecraftForgeClient.preloadTexture(BluestoneDust);
			MinecraftForgeClient.preloadTexture(BluestoneOre);
			MinecraftForgeClient.preloadTexture(BluestoneTorchIdle);
			MinecraftForgeClient.preloadTexture(BluestoneTorchActive);
			MinecraftForgeClient.preloadTexture(YellowstoneDust);
			MinecraftForgeClient.preloadTexture(YellowstoneTorchIdle);
			MinecraftForgeClient.preloadTexture(YellowstoneTorchActive);
			MinecraftForgeClient.preloadTexture(CyanstoneDust);
			MinecraftForgeClient.preloadTexture(CyanstoneTorchIdle);
			MinecraftForgeClient.preloadTexture(CyanstoneTorchActive);
			MinecraftForgeClient.preloadTexture(PinkstoneDust);
			MinecraftForgeClient.preloadTexture(PinkstoneTorchIdle);
			MinecraftForgeClient.preloadTexture(PinkstoneTorchActive);
        }
       
}