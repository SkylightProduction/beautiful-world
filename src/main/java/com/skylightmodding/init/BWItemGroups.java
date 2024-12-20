package com.skylightmodding.init;

import com.skylightmodding.BeautifulWorld;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BWItemGroups {
    public static final ItemGroup ITEMS_TAB = registerGroup(
            "items",
            FabricItemGroup.builder()
            .icon(() -> new ItemStack(BWItems.PITAHAYA))
            .displayName(Text.translatable("itemGroup.beautifulworld.items"))
            .entries((context, entries) -> {
                entries.add(BWItems.CRYSTALLITE);
                entries.add(BWItems.RHODIUM_INGOT);
                entries.add(BWItems.OVERLOUD_INGOT);
                entries.add(BWItems.RAW_OVERLOUD);
                entries.add(BWItems.BAIKAL_WATER);
                entries.add(BWItems.PITAHAYA);
                entries.add(BWItems.AMULET_OF_CREATION.getDefaultStack());
                entries.add(BWItems.OVERLOUD_UPGRADE_SMITHING_TEMPLATE);
            }).build()
    );


    public static final ItemGroup BLOCKS_TAB = registerGroup(
            "blocks",
            FabricItemGroup.builder()
            .icon(() -> new ItemStack(BWBlocks.FORTIFIED_CRYING_OBSIDIAN))
            .displayName(Text.translatable("itemGroup.beautifulworld.blocks"))
            .entries((context, entries) -> {
                entries.add(BWBlocks.OVERLOUD_ORE);
                entries.add(BWBlocks.OVERLOUD_BLOCK);
                entries.add(BWBlocks.RAW_OVERLOUD_BLOCK);
                entries.add(BWBlocks.RHODIUM_ORE);
                entries.add(BWBlocks.RHODIUM_BLOCK);
                entries.add(BWBlocks.PITAHAYA_TREE_PLANKS);
                entries.add(BWBlocks.PITAHAYA_TREE_STAIRS);
                entries.add(BWBlocks.PITAHAYA_TREE_SLAB);
                entries.add(BWBlocks.PITAHAYA_TREE_DOOR);
                entries.add(BWBlocks.PITAHAYA_TREE_TRAPDOOR);
                entries.add(BWBlocks.PITAHAYA_TREE_PRESSURE_PLATE);
                entries.add(BWBlocks.PITAHAYA_TREE_FENCE);
                entries.add(BWBlocks.PITAHAYA_TREE_FENCE_GATE);
                entries.add(BWBlocks.PITAHAYA_TREE_BUTTON);
                entries.add(BWBlocks.PITAHAYA_TREE_LOG);
                entries.add(BWBlocks.STRIPPED_PITAHAYA_TREE_LOG);
                entries.add(BWBlocks.PITAHAYA_TREE_WOOD);
                entries.add(BWBlocks.STRIPPED_PITAHAYA_TREE_WOOD);
                entries.add(BWBlocks.PITAHAYA_TREE_LEAVES);
                entries.add(BWBlocks.PITAHAYA_TREE_SAPLING);
                entries.add(BWBlocks.FORTIFIED_CRYING_OBSIDIAN);
            }).build()
    );


    public static final ItemGroup EQUIPMENT_TAB = registerGroup(
            "equipment",
            FabricItemGroup.builder()
            .icon(() -> new ItemStack(BWItems.OVERLOUD_AXE))
            .displayName(Text.translatable("itemGroup.beautifulworld.equipment"))
            .entries((context, entries) -> {
                entries.add(BWItems.OVERLOUD_HELMET);
                entries.add(BWItems.OVERLOUD_CHESTPLATE);
                entries.add(BWItems.OVERLOUD_LEGGINGS);
                entries.add(BWItems.OVERLOUD_BOOTS);
                entries.add(BWItems.OVERLOUD_SWORD);
                entries.add(BWItems.OVERLOUD_PICKAXE);
                entries.add(BWItems.OVERLOUD_AXE.getDefaultStack());
                entries.add(BWItems.OVERLOUD_SHOVEL);
                entries.add(BWItems.OVERLOUD_HOE);
                entries.add(BWItems.RHODIUM_SWORD);
                entries.add(BWItems.RHODIUM_MULTITOOL);
                entries.add(BWItems.NETHERITE_MULTI_TOOL);
                entries.add(BWItems.CRYSTALLITE_PICKAXE);
                entries.add(BWItems.CRYSTALLITE_SHOVEL);
                entries.add(BWItems.CRYSTALLITE_AXE);
                entries.add(BWItems.BEGLOV_SHOVEL);
            }).build()
    );


    public static final ItemGroup KORG_TAB = registerGroup(
            "korg_tab",
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(BWItems.KORG_FRAGMENT))
                    .displayName(Text.translatable("itemGroup.beautifulworld.korg_tab"))
                    .entries((context, entries) -> {
                        entries.add(BWBlocks.INFECTED_DIRT);
                        entries.add(BWBlocks.INFECTED_GRASS);
                        entries.add(BWBlocks.INFECTED_CLAY);
                        entries.add(BWBlocks.INFECTED_SAND);
                        entries.add(BWBlocks.INFECTED_SANDSTONE);
                        entries.add(BWBlocks.INFECTED_STONE);
                        entries.add(BWBlocks.INFECTED_COBBLESTONE);
                        entries.add(BWItems.KORG_FRAGMENT);
                    }).build()
    );

    private static ItemGroup registerGroup (String name, ItemGroup group) {
        return Registry.register(Registries.ITEM_GROUP, Identifier.of(BeautifulWorld.MOD_ID, name), group);
    }

    public static void registerItemsGroups() {
        BeautifulWorld.LOGGER.info("Registering Items Groups from " + BeautifulWorld.MOD_ID);
    }
}
