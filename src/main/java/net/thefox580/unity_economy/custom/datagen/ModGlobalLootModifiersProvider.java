package net.thefox580.unity_economy.custom.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.thefox580.unity_economy.UnityEconomy;
import net.thefox580.unity_economy.custom.ModItems;
import net.thefox580.unity_economy.custom.loot.AddItemModifier;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, UnityEconomy.MODID);
    }

    @Override
    protected void start() {
        add("unity_cash_from_abandoned_mineshaft_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/abandoned_mineshaft")).build(),
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_ancient_city_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ancient_city")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_ancient_city_ice_box_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ancient_city_ice_box")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_bastion_bridge_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_bastion_hoglin_stable_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_bastion_other_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_bastion_treasure_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_buried_treasure_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/buried_treasure")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_desert_pyramid_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/desert_pyramid")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_end_city_treasure_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/end_city_treasure")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_igloo_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/igloo_chest")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_jungle_temple_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_jungle_temple_dispenser_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple_dispenser")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_nether_bridge_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/nether_bridge")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_pillager_outpost_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/pillager_outpost")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_ruined_portal_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ruined_portal")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_shipwreck_map_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_map")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_shipwreck_supply_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_supply")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_shipwreck_treasure_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_treasure")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_simple_dungeon_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/simple_dungeon")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_spawn_bonus_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/spawn_bonus_chest")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_stronghold_corridor_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_corridor")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_stronghold_crossing_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_crossing")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_stronghold_library_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_library")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_underwater_ruin_big_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin_big")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_underwater_ruin_small_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin_small")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_woodland_mansion_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/woodland_mansion")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_village_armorer_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_armorer")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_village_butcher_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_butcher")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_village_cartographer_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_cartographer")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_village_desert_house_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_desert_house")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_village_fisher_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_fisher")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_village_fletcher_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_fletcher")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_village_manson_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_manson")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_village_plains_house_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_plains_house")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_village_savanna_house_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_savanna_house")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_village_shepherd_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_shepherd")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_village_snowy_house_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_snowy_house")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_village_taiga_house_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_taiga_house")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_village_tannery_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_tannery")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_village_temple_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_temple")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_village_toolsmith_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_toolsmith")).build()
        }, ModItems.UNITY_CASH.get()));

        add("unity_cash_from_village_weaponsmith_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_weaponsmith")).build()
        }, ModItems.UNITY_CASH.get()));
    }
}
