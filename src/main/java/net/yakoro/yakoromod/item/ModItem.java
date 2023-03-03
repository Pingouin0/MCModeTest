package net.yakoro.yakoromod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.yakoro.yakoromod.YakoroMod;

public class ModItem {
    public static final Item RAW_BORNITE = registerItem("raw_bornite",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item BORNITE = registerItem("bornite",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(YakoroMod.MOD_ID, name), item);
    }

    public static void registerModItem() {
        YakoroMod.LOGGER.debug("register Mod Item for " + YakoroMod.MOD_ID);
    }
}
