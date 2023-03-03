package net.yakoro.yakoromod;

import net.fabricmc.api.ModInitializer;
import net.yakoro.yakoromod.item.ModItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class YakoroMod implements ModInitializer {
	public static final String MOD_ID = "yakoromod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItem.registerModItem();

	}
}
