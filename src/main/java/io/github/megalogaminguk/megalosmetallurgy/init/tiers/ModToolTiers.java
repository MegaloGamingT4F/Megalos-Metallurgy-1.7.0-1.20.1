package io.github.megalogaminguk.megalosmetallurgy.init.tiers;

import io.github.megalogaminguk.megalosmetallurgy.MegalosMetallurgy;
import io.github.megalogaminguk.megalosmetallurgy.init.ModItems;
import io.github.megalogaminguk.megalosmetallurgy.init.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier ALUMINIUM = TierSortingRegistry.registerTier(
            new ForgeTier(2,100,1.5f,7,20,
                    ModTags.Blocks.NEEDS_ALUMINIUM_TOOL,()-> Ingredient.of(ModItems.ALUMINIUM_INGOT.get())),
            new ResourceLocation(MegalosMetallurgy.MOD_ID, "aluminium"), List.of(Tiers.STONE),List.of());
    public static final Tier SILVER = TierSortingRegistry.registerTier(
            new ForgeTier(2,300,1.5f,7,20,
                    ModTags.Blocks.NEEDS_SILVER_TOOL,()-> Ingredient.of(ModItems.SILVER_INGOT.get())),
            new ResourceLocation(MegalosMetallurgy.MOD_ID, "silver"), List.of(Tiers.IRON),List.of());
    public static final Tier TITANIUM = TierSortingRegistry.registerTier(
            new ForgeTier(2,600,1.5f,7,20,
                    ModTags.Blocks.NEEDS_TITANIUM_TOOL,()-> Ingredient.of(ModItems.TITANIUM_INGOT.get())),
            new ResourceLocation(MegalosMetallurgy.MOD_ID, "titanium"), List.of(Tiers.DIAMOND),List.of());
}
