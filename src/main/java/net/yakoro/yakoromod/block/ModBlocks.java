package net.yakoro.yakoromod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;
import net.yakoro.yakoromod.YakoroMod;
import net.yakoro.yakoromod.item.ModItemGroup;

public class ModBlocks {
        public static final Block BORNITE_BLOCK = registerBlock("bornite_block",
                new Block(FabricBlockSettings.of(Material.METAL).luminance(8).strength(4f).requiresTool()), ModItemGroup.BORNITE);

        public static final Block BORNITE_ORE = registerBlock("bornite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).luminance(8).strength(4f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.BORNITE);
    public static final Block DEEPSTATE_BORNITE_ORE = registerBlock("deepslate_bornite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).luminance(8).strength(4f).requiresTool(),
                    UniformIntProvider.create(3, 7)), ModItemGroup.BORNITE);



    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(YakoroMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(YakoroMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        YakoroMod.LOGGER.debug("Registering ModBlocks for " + YakoroMod.MOD_ID);
    }
}
