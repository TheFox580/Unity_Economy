package net.thefox580.unity_economy.custom.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
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
        add("unity_cash_from_chest", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/abandoned_mineshaft")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ancient_city")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ancient_city_ice_box")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_bridge")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_hoglin_stable")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_other")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/bastion_treasure")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/buried_treasure")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/desert_pyramid")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/end_city_treasure")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/igloo_chest")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple_dispenser")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/nether_bridge")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/pillager_outpost")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/ruined_portal")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_map")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_supply")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/shipwreck_treasure")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/simple_dungeon")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/spawn_bonus_chest")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_corridor")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_crossing")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/stronghold_library")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin_big")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/underwater_ruin_small")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/woodland_mansion")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_armorer")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_butcher")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_cartographer")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_desert_house")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_fisher")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_fletcher")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_manson")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_plain_house")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_savanna_house")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_shepherd")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_snowy_house")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_taiga_house")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_tannery")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_temple")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_toolsmith")).build(),
                new LootTableIdCondition.Builder(new ResourceLocation("chests/village/village_weaponsmith")).build()
        }, ModItems.UNITY_CASH.get()));
    }
}
