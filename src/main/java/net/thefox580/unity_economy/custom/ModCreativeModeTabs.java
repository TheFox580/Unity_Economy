package net.thefox580.unity_economy.custom;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.thefox580.unity_economy.UnityEconomy;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UnityEconomy.MODID);

    public static final RegistryObject<CreativeModeTab> UNITY_ECONOMY_TAB = CREATIVE_MODE_TABS.register("unity_economy_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.UNITY_CASH.get()))
                    .title(Component.translatable("creativetab.unity_economy_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.UNITY_CASH.get());
                        output.accept(ModBlocks.CASH_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
