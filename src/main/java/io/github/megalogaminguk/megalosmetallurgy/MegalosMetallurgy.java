package io.github.megalogaminguk.megalosmetallurgy;

import com.mojang.logging.LogUtils;
import io.github.megalogaminguk.megalosmetallurgy.init.ModBlocks;
import io.github.megalogaminguk.megalosmetallurgy.init.ModItems;
import io.github.megalogaminguk.megalosmetallurgy.init.ModTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MegalosMetallurgy.MOD_ID)
public class MegalosMetallurgy {
    public static final String MOD_ID = "megalosmetallurgy";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MegalosMetallurgy(){
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModTabs.register(modEventBus);

        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        }
        private void commonSetup(final FMLCommonSetupEvent event){

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartedEvent event){

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents{
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event){

        }
    }
}
