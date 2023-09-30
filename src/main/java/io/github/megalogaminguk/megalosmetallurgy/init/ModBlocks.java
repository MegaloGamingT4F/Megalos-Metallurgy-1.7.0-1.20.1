package io.github.megalogaminguk.megalosmetallurgy.init;

import io.github.megalogaminguk.megalosmetallurgy.MegalosMetallurgy;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MegalosMetallurgy.MOD_ID);

    //Ore
    public static final RegistryObject<Block> ALUMINIUM_ORE = BLOCKS.register("aluminium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));
    public static final RegistryObject<Block> CALCIUM_ORE = BLOCKS.register("calcium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));
    public static final RegistryObject<Block> CINNABAR_ORE = BLOCKS.register("cinnabar_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));
    public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));
    public static final RegistryObject<Block> MAGNESIUM_ORE = BLOCKS.register("magnesium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));
    public static final RegistryObject<Block> NICKEL_ORE = BLOCKS.register("nickel_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));
    public static final RegistryObject<Block> OSMIUM_ORE = BLOCKS.register("osmium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));
    public static final RegistryObject<Block> PLATINUM_ORE = BLOCKS.register("platinum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));
    public static final RegistryObject<Block> SILICON_ORE = BLOCKS.register("silicon_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));
    public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));
    public static final RegistryObject<Block> SODIUM_ORE = BLOCKS.register("sodium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));
    public static final RegistryObject<Block> TITANIUM_ORE = BLOCKS.register("titanium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));
    public static final RegistryObject<Block> ZINC_ORE = BLOCKS.register("zinc_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));
    public static final RegistryObject<Block> ZIRCONIUM_ORE = BLOCKS.register("zirconium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));

    //Deepslate
    public static final RegistryObject<Block> DEEPSLATE_ANTIMONY_ORE = BLOCKS.register("deepslate_antimony_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> DEEPSLATE_BISMUTH_ORE = BLOCKS.register("deepslate_bismuth_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> DEEPSLATE_CADMIUM_ORE = BLOCKS.register("deepslate_cadmium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> DEEPSLATE_CHROMIUM_ORE = BLOCKS.register("deepslate_chromium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> DEEPSLATE_COBALT_ORE = BLOCKS.register("deepslate_cobalt_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> DEEPSLATE_GALLIUM_ORE = BLOCKS.register("deepslate_gallium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> DEEPSLATE_IRIDIUM_ORE = BLOCKS.register("deepslate_iridium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> DEEPSLATE_MANGANESE_ORE = BLOCKS.register("deepslate_manganese_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> DEEPSLATE_MOLYBDENUM_ORE = BLOCKS.register("deepslate_molybdenum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> DEEPSLATE_PALLADIUM_ORE = BLOCKS.register("deepslate_palladium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> DEEPSLATE_POTASSIUM_ORE = BLOCKS.register("deepslate_potassium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> DEEPSLATE_RUTHENIUM_ORE = BLOCKS.register("deepslate_ruthenium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> DEEPSLATE_THALLIUM_ORE = BLOCKS.register("deepslate_thallium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> DEEPSLATE_TUNGSTEN_ORE = BLOCKS.register("deepslate_tungsten_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));

    //Netherrack
    public static final RegistryObject<Block> NETHERRACK_ARSENIC_ORE = BLOCKS.register("netherrack_arsenic_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(1f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHERRACK_BARIUM_ORE = BLOCKS.register("netherrack_barium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(1f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHERRACK_BERYLLIUM_ORE = BLOCKS.register("netherrack_beryllium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(1f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHERRACK_CAESIUM_ORE = BLOCKS.register("netherrack_caesium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(1f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHERRACK_GERMANIUM_ORE = BLOCKS.register("netherrack_germanium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(1f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHERRACK_HAFNIUM_ORE = BLOCKS.register("netherrack_hafnium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(1f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHERRACK_INDIUM_ORE = BLOCKS.register("netherrack_indium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(1f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHERRACK_NIOBIUM_ORE = BLOCKS.register("netherrack_niobium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(1f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHERRACK_PHOSPHORUS_ORE = BLOCKS.register("netherrack_phosphorus_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(1f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHERRACK_RHENIUM_ORE = BLOCKS.register("netherrack_rhenium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(1f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHERRACK_RHODIUM_ORE = BLOCKS.register("netherrack_rhodium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(1f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHERRACK_SELENIUM_ORE = BLOCKS.register("netherrack_selenium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(1f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHERRACK_TECHNETIUM_ORE = BLOCKS.register("netherrack_technetium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(1f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));
    public static final RegistryObject<Block> NETHERRACK_TELLURIUM_ORE = BLOCKS.register("netherrack_tellurium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(1f).requiresCorrectToolForDrops(),UniformInt.of(3,7)));

    //End_Stone
    public static final RegistryObject<Block> END_STONE_LITHIUM_ORE = BLOCKS.register("end_stone_lithium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(2f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));
    public static final RegistryObject<Block> END_STONE_RUBIDIUM_ORE = BLOCKS.register("end_stone_rubidium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(2f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));
    public static final RegistryObject<Block> END_STONE_SCANDIUM_ORE = BLOCKS.register("end_stone_scandium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(2f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));
    public static final RegistryObject<Block> END_STONE_STRONTIUM_ORE = BLOCKS.register("end_stone_strontium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(2f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));
    public static final RegistryObject<Block> END_STONE_TANTALUM_ORE = BLOCKS.register("end_stone_tantalum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(2f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));
    public static final RegistryObject<Block> END_STONE_VANADIUM_ORE = BLOCKS.register("end_stone_vanadium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(2f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));
    public static final RegistryObject<Block> END_STONE_YTTRIUM_ORE = BLOCKS.register("end_stone_yttrium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).strength(2f).requiresCorrectToolForDrops(),UniformInt.of(3,6)));

    //Block
    public static final RegistryObject<Block> ALUMINIUM_BLOCK = BLOCKS.register("aluminium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> ANTIMONY_BLOCK = BLOCKS.register("antimony_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> ARSENIC_BLOCK = BLOCKS.register("arsenic_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> BARIUM_BLOCK = BLOCKS.register("barium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> BERYLLIUM_BLOCK = BLOCKS.register("beryllium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> BISMUTH_BLOCK = BLOCKS.register("bismuth_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> CADMIUM_BLOCK = BLOCKS.register("cadmium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> CALCIUM_BLOCK = BLOCKS.register("calcium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> CAESIUM_BLOCK = BLOCKS.register("caesium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> CHROMIUM_BLOCK = BLOCKS.register("chromium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> CINNABAR_BLOCK = BLOCKS.register("cinnabar_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> COBALT_BLOCK = BLOCKS.register("cobalt_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> GALLIUM_BLOCK = BLOCKS.register("gallium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> GERMANIUM_BLOCK = BLOCKS.register("germanium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> HAFNIUM_BLOCK = BLOCKS.register("hafnium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> INDIUM_BLOCK = BLOCKS.register("indium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> IRIDIUM_BLOCK = BLOCKS.register("iridium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> LITHIUM_BLOCK = BLOCKS.register("lithium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> MAGNESIUM_BLOCK = BLOCKS.register("magnesium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> MANGANESE_BLOCK = BLOCKS.register("manganese_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> MOLYBDENUM_BLOCK = BLOCKS.register("molybdenum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> NICKEL_BLOCK = BLOCKS.register("nickel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> NIOBIUM_BLOCK = BLOCKS.register("niobium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> OSMIUM_BLOCK = BLOCKS.register("osmium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> PALLADIUM_BLOCK = BLOCKS.register("palladium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> PHOSPHORUS_BLOCK = BLOCKS.register("phosphorus_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> PLATINUM_BLOCK = BLOCKS.register("platinum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> POTASSIUM_BLOCK = BLOCKS.register("potassium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RHENIUM_BLOCK = BLOCKS.register("rhenium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RHODIUM_BLOCK = BLOCKS.register("rhodium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RUBIDIUM_BLOCK = BLOCKS.register("rubidium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RUTHENIUM_BLOCK = BLOCKS.register("ruthenium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> SCANDIUM_BLOCK = BLOCKS.register("scandium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> SELENIUM_BLOCK = BLOCKS.register("selenium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> SILICON_BLOCK = BLOCKS.register("silicon_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> SODIUM_BLOCK = BLOCKS.register("sodium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> STRONTIUM_BLOCK = BLOCKS.register("strontium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> TANTALUM_BLOCK = BLOCKS.register("tantalum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> TECHNETIUM_BLOCK = BLOCKS.register("technetium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> TELLURIUM_BLOCK = BLOCKS.register("tellurium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> THALLIUM_BLOCK = BLOCKS.register("thallium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register("tin_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> TITANIUM_BLOCK = BLOCKS.register("titanium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> TUNGSTEN_BLOCK = BLOCKS.register("tungsten_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> VANADIUM_BLOCK = BLOCKS.register("vanadium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> YTTRIUM_BLOCK = BLOCKS.register("yttrium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> ZINC_BLOCK = BLOCKS.register("zinc_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> ZIRCONIUM_BLOCK = BLOCKS.register("zirconium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));

    //Raw Block
    public static final RegistryObject<Block> RAW_ALUMINIUM_BLOCK = BLOCKS.register("raw_aluminium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_ANTIMONY_BLOCK = BLOCKS.register("raw_antimony_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_ARSENIC_BLOCK = BLOCKS.register("raw_arsenic_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_BARIUM_BLOCK = BLOCKS.register("raw_barium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_BERYLLIUM_BLOCK = BLOCKS.register("raw_beryllium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_BISMUTH_BLOCK = BLOCKS.register("raw_bismuth_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_CADMIUM_BLOCK = BLOCKS.register("raw_cadmium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_CALCIUM_BLOCK = BLOCKS.register("raw_calcium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_CAESIUM_BLOCK = BLOCKS.register("raw_caesium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_CHROMIUM_BLOCK = BLOCKS.register("raw_chromium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_CINNABAR_BLOCK = BLOCKS.register("raw_cinnabar_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_COBALT_BLOCK = BLOCKS.register("raw_cobalt_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_GALLIUM_BLOCK = BLOCKS.register("raw_gallium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_GERMANIUM_BLOCK = BLOCKS.register("raw_germanium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_HAFNIUM_BLOCK = BLOCKS.register("raw_hafnium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_INDIUM_BLOCK = BLOCKS.register("raw_indium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_IRIDIUM_BLOCK = BLOCKS.register("raw_iridium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_LEAD_BLOCK = BLOCKS.register("raw_lead_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_LITHIUM_BLOCK = BLOCKS.register("raw_lithium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_MAGNESIUM_BLOCK = BLOCKS.register("raw_magnesium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_MANGANESE_BLOCK = BLOCKS.register("raw_manganese_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_MOLYBDENUM_BLOCK = BLOCKS.register("raw_molybdenum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_NICKEL_BLOCK = BLOCKS.register("raw_nickel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_NIOBIUM_BLOCK = BLOCKS.register("raw_niobium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_OSMIUM_BLOCK = BLOCKS.register("raw_osmium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_PALLADIUM_BLOCK = BLOCKS.register("raw_palladium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_PHOSPHORUS_BLOCK = BLOCKS.register("raw_phosphorus_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_PLATINUM_BLOCK = BLOCKS.register("raw_platinum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_POTASSIUM_BLOCK = BLOCKS.register("raw_potassium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_RHENIUM_BLOCK = BLOCKS.register("raw_rhenium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_RHODIUM_BLOCK = BLOCKS.register("raw_rhodium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_RUBIDIUM_BLOCK = BLOCKS.register("raw_rubidium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_RUTHENIUM_BLOCK = BLOCKS.register("raw_ruthenium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_SCANDIUM_BLOCK = BLOCKS.register("raw_scandium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_SELENIUM_BLOCK = BLOCKS.register("raw_selenium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_SILICON_BLOCK = BLOCKS.register("raw_silicon_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = BLOCKS.register("raw_silver_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_SODIUM_BLOCK = BLOCKS.register("raw_sodium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_STRONTIUM_BLOCK = BLOCKS.register("raw_strontium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_TANTALUM_BLOCK = BLOCKS.register("raw_tantalum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_TECHNETIUM_BLOCK = BLOCKS.register("raw_technetium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_TELLURIUM_BLOCK = BLOCKS.register("raw_tellurium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_THALLIUM_BLOCK = BLOCKS.register("raw_thallium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_TIN_BLOCK = BLOCKS.register("raw_tin_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_TITANIUM_BLOCK = BLOCKS.register("raw_titanium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_TUNGSTEN_BLOCK = BLOCKS.register("raw_tungsten_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_VANADIUM_BLOCK = BLOCKS.register("raw_vanadium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_YTTRIUM_BLOCK = BLOCKS.register("raw_yttrium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_ZINC_BLOCK = BLOCKS.register("raw_zinc_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));
    public static final RegistryObject<Block> RAW_ZIRCONIUM_BLOCK = BLOCKS.register("raw_zirconium_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
