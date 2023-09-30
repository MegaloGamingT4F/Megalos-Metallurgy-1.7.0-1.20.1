package io.github.megalogaminguk.megalosmetallurgy.init;

import io.github.megalogaminguk.megalosmetallurgy.MegalosMetallurgy;
import io.github.megalogaminguk.megalosmetallurgy.init.tiers.ModToolTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems{
public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MegalosMetallurgy.MOD_ID);

//Ingots
public static final RegistryObject<Item> ALUMINIUM_INGOT = ITEMS.register("aluminium_ingot",
        () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANTIMONY_INGOT = ITEMS.register("antimony_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARSENIC_INGOT = ITEMS.register("arsenic_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BARIUM_INGOT = ITEMS.register("barium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BERYLLIUM_INGOT = ITEMS.register("beryllium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BISMUTH_INGOT = ITEMS.register("bismuth_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CADMIUM_INGOT = ITEMS.register("cadmium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAESIUM_INGOT = ITEMS.register("caesium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CALCIUM_INGOT = ITEMS.register("calcium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHROMIUM_INGOT = ITEMS.register("chromium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CINNABAR_INGOT = ITEMS.register("cinnabar_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GERMANIUM_INGOT = ITEMS.register("germanium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GALLIUM_INGOT = ITEMS.register("gallium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HAFNIUM_INGOT = ITEMS.register("hafnium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INDIUM_INGOT = ITEMS.register("indium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_INGOT = ITEMS.register("iridium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LITHIUM_INGOT = ITEMS.register("lithium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGNESIUM_INGOT = ITEMS.register("magnesium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MANGANESE_INGOT = ITEMS.register("manganese_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOLYBDENUM_INGOT = ITEMS.register("molybdenum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NIOBIUM_INGOT = ITEMS.register("niobium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PALLADIUM_INGOT = ITEMS.register("palladium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PHOSPHORUS_INGOT = ITEMS.register("phosphorus_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POTASSIUM_INGOT = ITEMS.register("potassium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RHENIUM_INGOT = ITEMS.register("rhenium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RHODIUM_INGOT = ITEMS.register("rhodium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBIDIUM_INGOT = ITEMS.register("rubidium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUTHENIUM_INGOT = ITEMS.register("ruthenium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCANDIUM_INGOT = ITEMS.register("scandium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SELENIUM_INGOT = ITEMS.register("selenium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILICON_INGOT = ITEMS.register("silicon_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SODIUM_INGOT = ITEMS.register("sodium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STRONTIUM_INGOT = ITEMS.register("strontium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TANTALUM_INGOT = ITEMS.register("tantalum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TECHNETIUM_INGOT = ITEMS.register("technetium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TELLURIUM_INGOT = ITEMS.register("tellurium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THALLIUM_INGOT = ITEMS.register("thallium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VANADIUM_INGOT = ITEMS.register("vanadium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YTTRIUM_INGOT = ITEMS.register("yttrium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZIRCONIUM_INGOT = ITEMS.register("zirconium_ingot",
            ()-> new Item(new Item.Properties()));

//Nugget
    public static final RegistryObject<Item> ALUMINIUM_NUGGET = ITEMS.register("aluminium_nugget",
        ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANTIMONY_NUGGET = ITEMS.register("antimony_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARSENIC_NUGGET = ITEMS.register("arsenic_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BARIUM_NUGGET = ITEMS.register("barium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BERYLLIUM_NUGGET = ITEMS.register("beryllium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BISMUTH_NUGGET = ITEMS.register("bismuth_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CADMIUM_NUGGET = ITEMS.register("cadmium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAESIUM_NUGGET = ITEMS.register("caesium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CALCIUM_NUGGET = ITEMS.register("calcium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHROMIUM_NUGGET = ITEMS.register("chromium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CINNABAR_NUGGET = ITEMS.register("cinnabar_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COBALT_NUGGET = ITEMS.register("cobalt_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GERMANIUM_NUGGET = ITEMS.register("germanium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GALLIUM_NUGGET = ITEMS.register("gallium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HAFNIUM_NUGGET = ITEMS.register("hafnium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INDIUM_NUGGET = ITEMS.register("indium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_NUGGET = ITEMS.register("iridium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LITHIUM_NUGGET = ITEMS.register("lithium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGNESIUM_NUGGET = ITEMS.register("magnesium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MANGANESE_NUGGET = ITEMS.register("manganese_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOLYBDENUM_NUGGET = ITEMS.register("molybdenum_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_NUGGET = ITEMS.register("nickel_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NIOBIUM_NUGGET = ITEMS.register("niobium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OSMIUM_NUGGET = ITEMS.register("osmium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PALLADIUM_NUGGET = ITEMS.register("palladium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PHOSPHORUS_NUGGET = ITEMS.register("phosphorus_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_NUGGET = ITEMS.register("platinum_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POTASSIUM_NUGGET = ITEMS.register("potassium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RHENIUM_NUGGET = ITEMS.register("rhenium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RHODIUM_NUGGET = ITEMS.register("rhodium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBIDIUM_NUGGET = ITEMS.register("rubidium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUTHENIUM_NUGGET = ITEMS.register("ruthenium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCANDIUM_NUGGET = ITEMS.register("scandium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SELENIUM_NUGGET = ITEMS.register("selenium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILICON_NUGGET = ITEMS.register("silicon_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_NUGGET = ITEMS.register("silver_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SODIUM_NUGGET = ITEMS.register("sodium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STRONTIUM_NUGGET = ITEMS.register("strontium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TANTALUM_NUGGET = ITEMS.register("tantalum_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TECHNETIUM_NUGGET = ITEMS.register("technetium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TELLURIUM_NUGGET = ITEMS.register("tellurium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THALLIUM_NUGGET = ITEMS.register("thallium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_NUGGET = ITEMS.register("tungsten_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VANADIUM_NUGGET = ITEMS.register("vanadium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YTTRIUM_NUGGET = ITEMS.register("yttrium_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_NUGGET = ITEMS.register("zinc_nugget",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZIRCONIUM_NUGGET = ITEMS.register("zirconium_nugget",
            () -> new Item(new Item.Properties()));
// Dust
public static final RegistryObject<Item> ALUMINIUM_DUST = ITEMS.register("aluminium_dust",
        ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ANTIMONY_DUST = ITEMS.register("antimony_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARSENIC_DUST = ITEMS.register("arsenic_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BARIUM_DUST = ITEMS.register("barium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BERYLLIUM_DUST = ITEMS.register("beryllium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BISMUTH_DUST = ITEMS.register("bismuth_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CADMIUM_DUST = ITEMS.register("cadmium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CAESIUM_DUST = ITEMS.register("caesium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CALCIUM_DUST = ITEMS.register("calcium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHROMIUM_DUST = ITEMS.register("chromium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CINNABAR_DUST = ITEMS.register("cinnabar_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COBALT_DUST = ITEMS.register("cobalt_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GERMANIUM_DUST = ITEMS.register("germanium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GALLIUM_DUST = ITEMS.register("gallium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HAFNIUM_DUST = ITEMS.register("hafnium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INDIUM_DUST = ITEMS.register("indium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRIDIUM_DUST = ITEMS.register("iridium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_DUST = ITEMS.register("lead_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LITHIUM_DUST = ITEMS.register("lithium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MAGNESIUM_DUST = ITEMS.register("magnesium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MANGANESE_DUST = ITEMS.register("manganese_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOLYBDENUM_DUST = ITEMS.register("molybdenum_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NICKEL_DUST = ITEMS.register("nickel_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NIOBIUM_DUST = ITEMS.register("niobium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OSMIUM_DUST = ITEMS.register("osmium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PALLADIUM_DUST = ITEMS.register("palladium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PHOSPHORUS_DUST = ITEMS.register("phosphorus_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PLATINUM_DUST = ITEMS.register("platinum_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> POTASSIUM_DUST = ITEMS.register("potassium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RHENIUM_DUST = ITEMS.register("rhenium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RHODIUM_DUST = ITEMS.register("rhodium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBIDIUM_DUST = ITEMS.register("rubidium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUTHENIUM_DUST = ITEMS.register("ruthenium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCANDIUM_DUST = ITEMS.register("scandium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SELENIUM_DUST = ITEMS.register("selenium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILICON_DUST = ITEMS.register("silicon_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_DUST = ITEMS.register("silver_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SODIUM_DUST = ITEMS.register("sodium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STRONTIUM_DUST = ITEMS.register("strontium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TANTALUM_DUST = ITEMS.register("tantalum_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TECHNETIUM_DUST = ITEMS.register("technetium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TELLURIUM_DUST = ITEMS.register("tellurium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> THALLIUM_DUST = ITEMS.register("thallium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_DUST = ITEMS.register("tin_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_DUST = ITEMS.register("titanium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_DUST = ITEMS.register("tungsten_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VANADIUM_DUST = ITEMS.register("vanadium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YTTRIUM_DUST = ITEMS.register("yttrium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZINC_DUST = ITEMS.register("zinc_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ZIRCONIUM_DUST = ITEMS.register("zirconium_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COAL_DUST = ITEMS.register("coal_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHARCOAL_DUST = ITEMS.register("charcoal_dust",
            () -> new Item(new Item.Properties()));
//Raw
public static final RegistryObject<Item> RAW_ALUMINIUM = ITEMS.register("raw_aluminium",
        ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ANTIMONY = ITEMS.register("raw_antimony",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ARSENIC = ITEMS.register("raw_arsenic",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_BARIUM = ITEMS.register("raw_barium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_BERYLLIUM = ITEMS.register("raw_beryllium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_BISMUTH = ITEMS.register("raw_bismuth",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CADMIUM = ITEMS.register("raw_cadmium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CAESIUM = ITEMS.register("raw_caesium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CALCIUM = ITEMS.register("raw_calcium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CHROMIUM = ITEMS.register("raw_chromium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CINNABAR = ITEMS.register("raw_cinnabar",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_COBALT = ITEMS.register("raw_cobalt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_GERMANIUM = ITEMS.register("raw_germanium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_GALLIUM = ITEMS.register("raw_gallium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_HAFNIUM = ITEMS.register("raw_hafnium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_INDIUM = ITEMS.register("raw_indium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_IRIDIUM = ITEMS.register("raw_iridium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_LITHIUM = ITEMS.register("raw_lithium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_MAGNESIUM = ITEMS.register("raw_magnesium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_MANGANESE = ITEMS.register("raw_manganese",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_MOLYBDENUM = ITEMS.register("raw_molybdenum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_NICKEL = ITEMS.register("raw_nickel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_NIOBIUM = ITEMS.register("raw_niobium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_OSMIUM = ITEMS.register("raw_osmium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PALLADIUM = ITEMS.register("raw_palladium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PHOSPHORUS = ITEMS.register("raw_phosphorus",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PLATINUM = ITEMS.register("raw_platinum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_POTASSIUM = ITEMS.register("raw_potassium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RHENIUM = ITEMS.register("raw_rhenium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RHODIUM = ITEMS.register("raw_rhodium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RUBIDIUM = ITEMS.register("raw_rubidium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RUTHENIUM = ITEMS.register("raw_ruthenium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SCANDIUM = ITEMS.register("raw_scandium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SELENIUM = ITEMS.register("raw_selenium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILICON = ITEMS.register("raw_silicon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SODIUM = ITEMS.register("raw_sodium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_STRONTIUM = ITEMS.register("raw_strontium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TANTALUM = ITEMS.register("raw_tantalum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TECHNETIUM = ITEMS.register("raw_technetium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TELLURIUM = ITEMS.register("raw_tellurium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_THALLIUM = ITEMS.register("raw_thallium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_VANADIUM = ITEMS.register("raw_vanadium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_YTTRIUM = ITEMS.register("raw_yttrium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ZINC = ITEMS.register("raw_zinc",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ZIRCONIUM = ITEMS.register("raw_zirconium",
            () -> new Item(new Item.Properties()));

    //Parts
    public static final RegistryObject<Item> LEATHER_GRIP = ITEMS.register("leather_grip",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEATHER_STRAP = ITEMS.register("leather_strap",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FABRIC_GRIP = ITEMS.register("fabric_grip",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FABRIC_STRAP = ITEMS.register("fabric_strap",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ARMOUR_PADDING = ITEMS.register("armour_padding",
            () -> new Item(new Item.Properties()));

    //Aluminium
    public static final RegistryObject<Item> ALUMINIUM_BLADE = ITEMS.register("aluminium_blade",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINIUM_AXEHEAD = ITEMS.register("aluminium_axehead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINIUM_GUARD = ITEMS.register("aluminium_guard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINIUM_SHOVELHEAD = ITEMS.register("aluminium_shovelhead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINIUM_PICK = ITEMS.register("aluminium_pick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINIUM_POMMEL = ITEMS.register("aluminium_pommel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINIUM_PLATE = ITEMS.register("aluminium_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINIUM_HILT = ITEMS.register("aluminium_hilt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_BLADE = ITEMS.register("silver_blade",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_AXEHEAD = ITEMS.register("silver_axehead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_GUARD = ITEMS.register("silver_guard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_SHOVELHEAD = ITEMS.register("silver_shovelhead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_PICK = ITEMS.register("silver_pick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_POMMEL = ITEMS.register("silver_pommel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_PLATE = ITEMS.register("silver_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SILVER_HILT = ITEMS.register("silver_hilt",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_BLADE = ITEMS.register("titanium_blade",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_AXEHEAD = ITEMS.register("titanium_axehead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_GUARD = ITEMS.register("titanium_guard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_SHOVELHEAD = ITEMS.register("titanium_shovelhead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_PICK = ITEMS.register("titanium_pick",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_POMMEL = ITEMS.register("titanium_pommel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_PLATE = ITEMS.register("titanium_plate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_HILT = ITEMS.register("titanium_hilt",
            () -> new Item(new Item.Properties()));

//Block Items - Ore
    public static final RegistryObject<BlockItem> ALUMINIUM_ORE_ITEM = ITEMS.register("aluminium_ore",() -> new BlockItem(ModBlocks.ALUMINIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_ANTIMONY_ORE_ITEM = ITEMS.register("deepslate_antimony_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_ANTIMONY_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_ARSENIC_ORE_ITEM = ITEMS.register("netherrack_arsenic_ore",() -> new BlockItem(ModBlocks.NETHERRACK_ARSENIC_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_BARIUM_ORE_ITEM = ITEMS.register("netherrack_barium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_BARIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_BERYLLIUM_ORE_ITEM = ITEMS.register("netherrack_beryllium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_BERYLLIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_BISMUTH_ORE_ITEM = ITEMS.register("deepslate_bismuth_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_BISMUTH_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_CADMIUM_ORE_ITEM = ITEMS.register("deepslate_cadmium_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_CADMIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_CAESIUM_ORE_ITEM = ITEMS.register("netherrack_caesium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_CAESIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> CALCIUM_ORE_ITEM = ITEMS.register("calcium_ore",() -> new BlockItem(ModBlocks.CALCIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_CHROMIUM_ORE_ITEM = ITEMS.register("deepslate_chromium_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_CHROMIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> CINNABAR_ORE_ITEM = ITEMS.register("cinnabar_ore",() -> new BlockItem(ModBlocks.CINNABAR_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_COBALT_ORE_ITEM = ITEMS.register("deepslate_cobalt_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_COBALT_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_GERMANIUM_ORE_ITEM = ITEMS.register("netherrack_germanium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_GERMANIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_GALLIUM_ORE_ITEM = ITEMS.register("deepslate_gallium_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_GALLIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_HAFNIUM_ORE_ITEM = ITEMS.register("netherrack_hafnium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_HAFNIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_INDIUM_ORE_ITEM = ITEMS.register("netherrack_indium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_INDIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_IRIDIUM_ORE_ITEM = ITEMS.register("deepslate_iridium_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_IRIDIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> LEAD_ORE_ITEM = ITEMS.register("lead_ore",() -> new BlockItem(ModBlocks.LEAD_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> END_STONE_LITHIUM_ORE_ITEM = ITEMS.register("end_stone_lithium_ore",() -> new BlockItem(ModBlocks.END_STONE_LITHIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> MAGNESIUM_ORE_ITEM = ITEMS.register("magnesium_ore",() -> new BlockItem(ModBlocks.MAGNESIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_MANGANESE_ORE_ITEM = ITEMS.register("deepslate_manganese_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_MANGANESE_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_MOLYBDENUM_ORE_ITEM = ITEMS.register("deepslate_molybdenum_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_MOLYBDENUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NICKEL_ORE_ITEM = ITEMS.register("nickel_ore",() -> new BlockItem(ModBlocks.NICKEL_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_NIOBIUM_ORE_ITEM = ITEMS.register("netherrack_niobium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_NIOBIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> OSMIUM_ORE_ITEM = ITEMS.register("osmium_ore",() -> new BlockItem(ModBlocks.OSMIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_PALLADIUM_ORE_ITEM = ITEMS.register("deepslate_palladium_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_PALLADIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_PHOSPHORUS_ORE_ITEM = ITEMS.register("netherrack_phosphorus_ore",() -> new BlockItem(ModBlocks.NETHERRACK_PHOSPHORUS_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> PLATINUM_ORE_ITEM = ITEMS.register("platinum_ore",() -> new BlockItem(ModBlocks.PLATINUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_POTASSIUM_ORE_ITEM = ITEMS.register("deepslate_potassium_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_POTASSIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_RHENIUM_ORE_ITEM = ITEMS.register("netherrack_rhenium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_RHENIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_RHODIUM_ORE_ITEM = ITEMS.register("netherrack_rhodium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_RHODIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> END_STONE_RUBIDIUM_ORE_ITEM = ITEMS.register("end_stone_rubidium_ore",() -> new BlockItem(ModBlocks.END_STONE_RUBIDIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_RUTHENIUM_ORE_ITEM = ITEMS.register("deepslate_ruthenium_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_RUTHENIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> END_STONE_SCANDIUM_ORE_ITEM = ITEMS.register("end_stone_scandium_ore",() -> new BlockItem(ModBlocks.END_STONE_SCANDIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_SELENIUM_ORE_ITEM = ITEMS.register("netherrack_selenium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_SELENIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> SILICON_ORE_ITEM = ITEMS.register("silicon_ore",() -> new BlockItem(ModBlocks.SILICON_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> SILVER_ORE_ITEM = ITEMS.register("silver_ore",() -> new BlockItem(ModBlocks.SILVER_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> SODIUM_ORE_ITEM = ITEMS.register("sodium_ore",() -> new BlockItem(ModBlocks.SODIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> END_STONE_STRONTIUM_ORE_ITEM = ITEMS.register("end_stone_strontium_ore",() -> new BlockItem(ModBlocks.END_STONE_STRONTIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> END_STONE_TANTALUM_ORE_ITEM = ITEMS.register("end_stone_tantalum_ore",() -> new BlockItem(ModBlocks.END_STONE_TANTALUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_TECHNETIUM_ORE_ITEM = ITEMS.register("netherrack_technetium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_TECHNETIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NETHERRACK_TELLURIUM_ORE_ITEM = ITEMS.register("netherrack_tellurium_ore",() -> new BlockItem(ModBlocks.NETHERRACK_TELLURIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_THALLIUM_ORE_ITEM = ITEMS.register("deepslate_thallium_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_THALLIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> TIN_ORE_ITEM = ITEMS.register("tin_ore",() -> new BlockItem(ModBlocks.TIN_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> TITANIUM_ORE_ITEM = ITEMS.register("titanium_ore",() -> new BlockItem(ModBlocks.TITANIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> DEEPSLATE_TUNGSTEN_ORE_ITEM = ITEMS.register("deepslate_tungsten_ore",() -> new BlockItem(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> END_STONE_VANADIUM_ORE_ITEM = ITEMS.register("end_stone_vanadium_ore",() -> new BlockItem(ModBlocks.END_STONE_VANADIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> END_STONE_YTTRIUM_ORE_ITEM = ITEMS.register("end_stone_yttrium_ore",() -> new BlockItem(ModBlocks.END_STONE_YTTRIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> ZINC_ORE_ITEM = ITEMS.register("zinc_ore",() -> new BlockItem(ModBlocks.ZINC_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> ZIRCONIUM_ORE_ITEM = ITEMS.register("zirconium_ore",() -> new BlockItem(ModBlocks.ZIRCONIUM_ORE.get(), new Item.Properties().rarity(Rarity.COMMON)));

    //Block Item - Blocks
    public static final RegistryObject<BlockItem> ALUMINIUM_BLOCK_ITEM = ITEMS.register("aluminium_block",() -> new BlockItem(ModBlocks.ALUMINIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> ANTIMONY_BLOCK_ITEM = ITEMS.register("antimony_block",() -> new BlockItem(ModBlocks.ANTIMONY_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> ARSENIC_BLOCK_ITEM = ITEMS.register("arsenic_block",() -> new BlockItem(ModBlocks.ARSENIC_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> BARIUM_BLOCK_ITEM = ITEMS.register("barium_block",() -> new BlockItem(ModBlocks.BARIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> BERYLLIUM_BLOCK_ITEM = ITEMS.register("beryllium_block",() -> new BlockItem(ModBlocks.BERYLLIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> BISMUTH_BLOCK_ITEM = ITEMS.register("bismuth_block",() -> new BlockItem(ModBlocks.BISMUTH_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> CADMIUM_BLOCK_ITEM = ITEMS.register("cadmium_block",() -> new BlockItem(ModBlocks.CADMIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> CAESIUM_BLOCK_ITEM = ITEMS.register("caesium_block",() -> new BlockItem(ModBlocks.CAESIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> CALCIUM_BLOCK_ITEM = ITEMS.register("calcium_block",() -> new BlockItem(ModBlocks.CALCIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> CHROMIUM_BLOCK_ITEM = ITEMS.register("chromium_block",() -> new BlockItem(ModBlocks.CHROMIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> CINNABAR_BLOCK_ITEM = ITEMS.register("cinnabar_block",() -> new BlockItem(ModBlocks.CINNABAR_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> COBALT_BLOCK_ITEM = ITEMS.register("cobalt_block",() -> new BlockItem(ModBlocks.COBALT_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> GERMANIUM_BLOCK_ITEM = ITEMS.register("germanium_block",() -> new BlockItem(ModBlocks.GERMANIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> GALLIUM_BLOCK_ITEM = ITEMS.register("gallium_block",() -> new BlockItem(ModBlocks.GALLIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> HAFNIUM_BLOCK_ITEM = ITEMS.register("hafnium_block",() -> new BlockItem(ModBlocks.HAFNIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> INDIUM_BLOCK_ITEM = ITEMS.register("indium_block",() -> new BlockItem(ModBlocks.INDIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> IRIDIUM_BLOCK_ITEM = ITEMS.register("iridium_block",() -> new BlockItem(ModBlocks.IRIDIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> LEAD_BLOCK_ITEM = ITEMS.register("lead_block",() -> new BlockItem(ModBlocks.LEAD_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> LITHIUM_BLOCK_ITEM = ITEMS.register("lithium_block",() -> new BlockItem(ModBlocks.LITHIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> MAGNESIUM_BLOCK_ITEM = ITEMS.register("magnesium_block",() -> new BlockItem(ModBlocks.MAGNESIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> MANGANESE_BLOCK_ITEM = ITEMS.register("manganese_block",() -> new BlockItem(ModBlocks.MANGANESE_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> MOLYBDENUM_BLOCK_ITEM = ITEMS.register("molybdenum_block",() -> new BlockItem(ModBlocks.MOLYBDENUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NICKEL_BLOCK_ITEM = ITEMS.register("nickel_block",() -> new BlockItem(ModBlocks.NICKEL_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> NIOBIUM_BLOCK_ITEM = ITEMS.register("niobium_block",() -> new BlockItem(ModBlocks.NIOBIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> OSMIUM_BLOCK_ITEM = ITEMS.register("osmium_block",() -> new BlockItem(ModBlocks.OSMIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> PALLADIUM_BLOCK_ITEM = ITEMS.register("palladium_block",() -> new BlockItem(ModBlocks.PALLADIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> PHOSPHORUS_BLOCK_ITEM = ITEMS.register("phosphorus_block",() -> new BlockItem(ModBlocks.PHOSPHORUS_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> PLATINUM_BLOCK_ITEM = ITEMS.register("platinum_block",() -> new BlockItem(ModBlocks.PLATINUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> POTASSIUM_BLOCK_ITEM = ITEMS.register("potassium_block",() -> new BlockItem(ModBlocks.POTASSIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RHENIUM_BLOCK_ITEM = ITEMS.register("rhenium_block",() -> new BlockItem(ModBlocks.RHENIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RHODIUM_BLOCK_ITEM = ITEMS.register("rhodium_block",() -> new BlockItem(ModBlocks.RHODIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RUBIDIUM_BLOCK_ITEM = ITEMS.register("rubidium_block",() -> new BlockItem(ModBlocks.RUBIDIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RUTHENIUM_BLOCK_ITEM = ITEMS.register("ruthenium_block",() -> new BlockItem(ModBlocks.RUTHENIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> SCANDIUM_BLOCK_ITEM = ITEMS.register("scandium_block",() -> new BlockItem(ModBlocks.SCANDIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> SELENIUM_BLOCK_ITEM = ITEMS.register("selenium_block",() -> new BlockItem(ModBlocks.SELENIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> SILICON_BLOCK_ITEM = ITEMS.register("silicon_block",() -> new BlockItem(ModBlocks.SILICON_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> SILVER_BLOCK_ITEM = ITEMS.register("silver_block",() -> new BlockItem(ModBlocks.SILVER_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> SODIUM_BLOCK_ITEM = ITEMS.register("sodium_block",() -> new BlockItem(ModBlocks.SODIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> STRONTIUM_BLOCK_ITEM = ITEMS.register("strontium_block",() -> new BlockItem(ModBlocks.STRONTIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> TANTALUM_BLOCK_ITEM = ITEMS.register("tantalum_block",() -> new BlockItem(ModBlocks.TANTALUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> TECHNETIUM_BLOCK_ITEM = ITEMS.register("technetium_block",() -> new BlockItem(ModBlocks.TECHNETIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> TELLURIUM_BLOCK_ITEM = ITEMS.register("tellurium_block",() -> new BlockItem(ModBlocks.TELLURIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> THALLIUM_BLOCK_ITEM = ITEMS.register("thallium_block",() -> new BlockItem(ModBlocks.THALLIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> TIN_BLOCK_ITEM = ITEMS.register("tin_block",() -> new BlockItem(ModBlocks.TIN_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> TITANIUM_BLOCK_ITEM = ITEMS.register("titanium_block",() -> new BlockItem(ModBlocks.TITANIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> TUNGSTEN_BLOCK_ITEM = ITEMS.register("tungsten_block",() -> new BlockItem(ModBlocks.TUNGSTEN_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> VANADIUM_BLOCK_ITEM = ITEMS.register("vanadium_block",() -> new BlockItem(ModBlocks.VANADIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> YTTRIUM_BLOCK_ITEM = ITEMS.register("yttrium_block",() -> new BlockItem(ModBlocks.YTTRIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> ZINC_BLOCK_ITEM = ITEMS.register("zinc_block",() -> new BlockItem(ModBlocks.ZINC_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> ZIRCONIUM_BLOCK_ITEM = ITEMS.register("zirconium_block",() -> new BlockItem(ModBlocks.ZIRCONIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));

    //Block Item - Raw
    public static final RegistryObject<BlockItem> RAW_ALUMINIUM_BLOCK_ITEM = ITEMS.register("raw_aluminium_block",() -> new BlockItem(ModBlocks.RAW_ALUMINIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_ANTIMONY_BLOCK_ITEM = ITEMS.register("raw_antimony_block",() -> new BlockItem(ModBlocks.RAW_ANTIMONY_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_ARSENIC_BLOCK_ITEM = ITEMS.register("raw_arsenic_block",() -> new BlockItem(ModBlocks.RAW_ARSENIC_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_BARIUM_BLOCK_ITEM = ITEMS.register("raw_barium_block",() -> new BlockItem(ModBlocks.RAW_BARIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_BERYLLIUM_BLOCK_ITEM = ITEMS.register("raw_beryllium_block",() -> new BlockItem(ModBlocks.RAW_BERYLLIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_BISMUTH_BLOCK_ITEM = ITEMS.register("raw_bismuth_block",() -> new BlockItem(ModBlocks.RAW_BISMUTH_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_CADMIUM_BLOCK_ITEM = ITEMS.register("raw_cadmium_block",() -> new BlockItem(ModBlocks.RAW_CADMIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_CAESIUM_BLOCK_ITEM = ITEMS.register("raw_caesium_block",() -> new BlockItem(ModBlocks.RAW_CAESIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_CALCIUM_BLOCK_ITEM = ITEMS.register("raw_calcium_block",() -> new BlockItem(ModBlocks.RAW_CALCIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_CHROMIUM_BLOCK_ITEM = ITEMS.register("raw_chromium_block",() -> new BlockItem(ModBlocks.RAW_CHROMIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_CINNABAR_BLOCK_ITEM = ITEMS.register("raw_cinnabar_block",() -> new BlockItem(ModBlocks.RAW_CINNABAR_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_COBALT_BLOCK_ITEM = ITEMS.register("raw_cobalt_block",() -> new BlockItem(ModBlocks.RAW_COBALT_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_GERMANIUM_BLOCK_ITEM = ITEMS.register("raw_germanium_block",() -> new BlockItem(ModBlocks.RAW_GERMANIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_GALLIUM_BLOCK_ITEM = ITEMS.register("raw_gallium_block",() -> new BlockItem(ModBlocks.RAW_GALLIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_HAFNIUM_BLOCK_ITEM = ITEMS.register("raw_hafnium_block",() -> new BlockItem(ModBlocks.RAW_HAFNIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_INDIUM_BLOCK_ITEM = ITEMS.register("raw_indium_block",() -> new BlockItem(ModBlocks.RAW_INDIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_IRIDIUM_BLOCK_ITEM = ITEMS.register("raw_iridium_block",() -> new BlockItem(ModBlocks.RAW_IRIDIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_LEAD_BLOCK_ITEM = ITEMS.register("raw_lead_block",() -> new BlockItem(ModBlocks.RAW_LEAD_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_LITHIUM_BLOCK_ITEM = ITEMS.register("raw_lithium_block",() -> new BlockItem(ModBlocks.RAW_LITHIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_MAGNESIUM_BLOCK_ITEM = ITEMS.register("raw_magnesium_block",() -> new BlockItem(ModBlocks.RAW_MAGNESIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_MANGANESE_BLOCK_ITEM = ITEMS.register("raw_manganese_block",() -> new BlockItem(ModBlocks.RAW_MANGANESE_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_MOLYBDENUM_BLOCK_ITEM = ITEMS.register("raw_molybdenum_block",() -> new BlockItem(ModBlocks.RAW_MOLYBDENUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_NICKEL_BLOCK_ITEM = ITEMS.register("raw_nickel_block",() -> new BlockItem(ModBlocks.RAW_NICKEL_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_NIOBIUM_BLOCK_ITEM = ITEMS.register("raw_niobium_block",() -> new BlockItem(ModBlocks.RAW_NIOBIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_OSMIUM_BLOCK_ITEM = ITEMS.register("raw_osmium_block",() -> new BlockItem(ModBlocks.RAW_OSMIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_PALLADIUM_BLOCK_ITEM = ITEMS.register("raw_palladium_block",() -> new BlockItem(ModBlocks.RAW_PALLADIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_PHOSPHORUS_BLOCK_ITEM = ITEMS.register("raw_phosphorus_block",() -> new BlockItem(ModBlocks.RAW_PHOSPHORUS_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_PLATINUM_BLOCK_ITEM = ITEMS.register("raw_platinum_block",() -> new BlockItem(ModBlocks.RAW_PLATINUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_POTASSIUM_BLOCK_ITEM = ITEMS.register("raw_potassium_block",() -> new BlockItem(ModBlocks.RAW_POTASSIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_RHENIUM_BLOCK_ITEM = ITEMS.register("raw_rhenium_block",() -> new BlockItem(ModBlocks.RAW_RHENIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_RHODIUM_BLOCK_ITEM = ITEMS.register("raw_rhodium_block",() -> new BlockItem(ModBlocks.RAW_RHODIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_RUBIDIUM_BLOCK_ITEM = ITEMS.register("raw_rubidium_block",() -> new BlockItem(ModBlocks.RAW_RUBIDIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_RUTHENIUM_BLOCK_ITEM = ITEMS.register("raw_ruthenium_block",() -> new BlockItem(ModBlocks.RAW_RUTHENIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_SCANDIUM_BLOCK_ITEM = ITEMS.register("raw_scandium_block",() -> new BlockItem(ModBlocks.RAW_SCANDIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_SELENIUM_BLOCK_ITEM = ITEMS.register("raw_selenium_block",() -> new BlockItem(ModBlocks.RAW_SELENIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_SILICON_BLOCK_ITEM = ITEMS.register("raw_silicon_block",() -> new BlockItem(ModBlocks.RAW_SILICON_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_SILVER_BLOCK_ITEM = ITEMS.register("raw_silver_block",() -> new BlockItem(ModBlocks.RAW_SILVER_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_SODIUM_BLOCK_ITEM = ITEMS.register("raw_sodium_block",() -> new BlockItem(ModBlocks.RAW_SODIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_STRONTIUM_BLOCK_ITEM = ITEMS.register("raw_strontium_block",() -> new BlockItem(ModBlocks.RAW_STRONTIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_TANTALUM_BLOCK_ITEM = ITEMS.register("raw_tantalum_block",() -> new BlockItem(ModBlocks.RAW_TANTALUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_TECHNETIUM_BLOCK_ITEM = ITEMS.register("raw_technetium_block",() -> new BlockItem(ModBlocks.RAW_TECHNETIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_TELLURIUM_BLOCK_ITEM = ITEMS.register("raw_tellurium_block",() -> new BlockItem(ModBlocks.RAW_TELLURIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_THALLIUM_BLOCK_ITEM = ITEMS.register("raw_thallium_block",() -> new BlockItem(ModBlocks.RAW_THALLIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_TIN_BLOCK_ITEM = ITEMS.register("raw_tin_block",() -> new BlockItem(ModBlocks.RAW_TIN_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_TITANIUM_BLOCK_ITEM = ITEMS.register("raw_titanium_block",() -> new BlockItem(ModBlocks.RAW_TITANIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_TUNGSTEN_BLOCK_ITEM = ITEMS.register("raw_tungsten_block",() -> new BlockItem(ModBlocks.RAW_TUNGSTEN_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_VANADIUM_BLOCK_ITEM = ITEMS.register("raw_vanadium_block",() -> new BlockItem(ModBlocks.RAW_VANADIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_YTTRIUM_BLOCK_ITEM = ITEMS.register("raw_yttrium_block",() -> new BlockItem(ModBlocks.RAW_YTTRIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_ZINC_BLOCK_ITEM = ITEMS.register("raw_zinc_block",() -> new BlockItem(ModBlocks.RAW_ZINC_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
    public static final RegistryObject<BlockItem> RAW_ZIRCONIUM_BLOCK_ITEM = ITEMS.register("raw_zirconium_block",() -> new BlockItem(ModBlocks.RAW_ZIRCONIUM_BLOCK.get(), new Item.Properties().rarity(Rarity.COMMON)));
//Tools
    // Aluminium Tools
    public static final RegistryObject<SwordItem> ALUMINIUM_SWORD = ITEMS.register("aluminium_sword", () -> new SwordItem(ModToolTiers.ALUMINIUM,7,2.5f,new Item.Properties()));
    public static final RegistryObject<PickaxeItem> ALUMINIUM_PICKAXE = ITEMS.register("aluminium_pickaxe", () -> new PickaxeItem(ModToolTiers.ALUMINIUM,7,2.5f,new Item.Properties()));
    public static final RegistryObject<ShovelItem> ALUMINIUM_SHOVEL = ITEMS.register("aluminium_shovel", () -> new ShovelItem(ModToolTiers.ALUMINIUM,7,2.5f,new Item.Properties()));
    public static final RegistryObject<AxeItem> ALUMINIUM_AXE = ITEMS.register("aluminium_axe", () -> new AxeItem(ModToolTiers.ALUMINIUM,7,2.5f,new Item.Properties()));
    public static final RegistryObject<HoeItem> ALUMINIUM_HOE = ITEMS.register("aluminium_hoe", () -> new HoeItem(ModToolTiers.ALUMINIUM,7,2.5f,new Item.Properties()));

    //Titanium Tools
    public static final RegistryObject<SwordItem> TITANIUM_SWORD = ITEMS.register("titanium_sword", () -> new SwordItem(ModToolTiers.TITANIUM,7,2.5f,new Item.Properties()));
    public static final RegistryObject<PickaxeItem> TITANIUM_PICKAXE = ITEMS.register("titanium_pickaxe", () -> new PickaxeItem(ModToolTiers.TITANIUM,7,2.5f,new Item.Properties()));
    public static final RegistryObject<ShovelItem> TITANIUM_SHOVEL = ITEMS.register("titanium_shovel", () -> new ShovelItem(ModToolTiers.TITANIUM,7,2.5f,new Item.Properties()));
    public static final RegistryObject<AxeItem> TITANIUM_AXE = ITEMS.register("titanium_axe", () -> new AxeItem(ModToolTiers.TITANIUM,7,2.5f,new Item.Properties()));
    public static final RegistryObject<HoeItem> TITANIUM_HOE = ITEMS.register("titanium_hoe", () -> new HoeItem(ModToolTiers.TITANIUM,7,2.5f,new Item.Properties()));

    //Silver Tools
    public static final RegistryObject<SwordItem> SILVER_SWORD = ITEMS.register("silver_sword", () -> new SwordItem(ModToolTiers.SILVER,7,2.5f,new Item.Properties()));
    public static final RegistryObject<PickaxeItem> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () -> new PickaxeItem(ModToolTiers.SILVER,7,2.5f,new Item.Properties()));
    public static final RegistryObject<ShovelItem> SILVER_SHOVEL = ITEMS.register("silver_shovel", () -> new ShovelItem(ModToolTiers.SILVER,7,2.5f,new Item.Properties()));
    public static final RegistryObject<AxeItem> SILVER_AXE = ITEMS.register("silver_axe", () -> new AxeItem(ModToolTiers.SILVER,7,2.5f,new Item.Properties()));
    public static final RegistryObject<HoeItem> SILVER_HOE = ITEMS.register("silver_hoe", () -> new HoeItem(ModToolTiers.SILVER,7,2.5f,new Item.Properties()));

//Armour
    //Aluminium Armour
    public static final RegistryObject<ArmorItem> ALUMINIUM_HELMET = ITEMS.register("aluminium_helmet",
        () -> new ArmorItem(ModArmorMaterials.ALUMINIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<ArmorItem> ALUMINIUM_CHESTPLATE = ITEMS.register("aluminium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ALUMINIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<ArmorItem> ALUMINIUM_LEGGINGS = ITEMS.register("aluminium_leggings",
            () -> new ArmorItem(ModArmorMaterials.ALUMINIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<ArmorItem> ALUMINIUM_BOOTS = ITEMS.register("aluminium_boots",
            () -> new ArmorItem(ModArmorMaterials.ALUMINIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Titanium Armour
    public static final RegistryObject<ArmorItem> TITANIUM_HELMET = ITEMS.register("titanium_helmet",
            () -> new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<ArmorItem> TITANIUM_CHESTPLATE = ITEMS.register("titanium_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<ArmorItem> TITANIUM_LEGGINGS = ITEMS.register("titanium_leggings",
        () -> new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<ArmorItem> TITANIUM_BOOTS = ITEMS.register("titanium_boots",
            () -> new ArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    //Silver Armour
    public static final RegistryObject<ArmorItem> SILVER_HELMET = ITEMS.register("silver_helmet",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<ArmorItem> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<ArmorItem> SILVER_LEGGINGS = ITEMS.register("silver_leggings",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<ArmorItem> SILVER_BOOTS = ITEMS.register("silver_boots",
            () -> new ArmorItem(ModArmorMaterials.SILVER, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}