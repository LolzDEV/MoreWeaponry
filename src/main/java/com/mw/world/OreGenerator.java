package com.mw.world;

import com.mw.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OreGenerator {

    public static ConfiguredFeature<?, ?> ORE_COPPER_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    Blocks.COPPER_ORE.getDefaultState(),
                    4)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    56)))
            .spreadHorizontally()
            .repeat(15);

    public static ConfiguredFeature<?, ?> ORE_TIN_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    Blocks.TIN_ORE.getDefaultState(),
                    4)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    50)))
            .spreadHorizontally()
            .repeat(10);

    public static ConfiguredFeature<?, ?> ORE_TITANIUM_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    Blocks.TITANIUM_ORE.getDefaultState(),
                    4)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    50)))
            .spreadHorizontally()
            .repeat(10);

    public static ConfiguredFeature<?, ?> ORE_SILVER_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    Blocks.SILVER_ORE.getDefaultState(),
                    4)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    20)))
            .spreadHorizontally()
            .repeat(8);

    public static ConfiguredFeature<?, ?> ORE_PLATINUM_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    Blocks.PLATINUM_ORE.getDefaultState(),
                    4)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    12)))
            .spreadHorizontally()
            .repeat(4);

    public static ConfiguredFeature<?, ?> ORE_NICKEL_OVERWORLD = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    Blocks.NICKEL_ORE.getDefaultState(),
                    4)) // vein size
            .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
                    0,
                    0,
                    15)))
            .spreadHorizontally()
            .repeat(6);

    public static void registerFeatures() {
        RegistryKey<ConfiguredFeature<?, ?>> oreCopperOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("mw", "ore_copper_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreCopperOverworld.getValue(), ORE_COPPER_OVERWORLD);

        RegistryKey<ConfiguredFeature<?, ?>> oreTinOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("mw", "ore_tin_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTinOverworld.getValue(), ORE_TIN_OVERWORLD);

        RegistryKey<ConfiguredFeature<?, ?>> oreTitaniumOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("mw", "ore_titanium_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreTitaniumOverworld.getValue(), ORE_TITANIUM_OVERWORLD);

        RegistryKey<ConfiguredFeature<?, ?>> oreSilverOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("mw", "ore_silver_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreSilverOverworld.getValue(), ORE_SILVER_OVERWORLD);

        RegistryKey<ConfiguredFeature<?, ?>> orePlatinumOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("mw", "ore_platinum_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orePlatinumOverworld.getValue(), ORE_PLATINUM_OVERWORLD);

        RegistryKey<ConfiguredFeature<?, ?>> oreNickelOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("mw", "ore_nickel_overworld"));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oreNickelOverworld.getValue(), ORE_NICKEL_OVERWORLD);

    }

}
