package fr.venodez.vanillaplus;

import org.bukkit.plugin.java.JavaPlugin;

import fr.venodez.vanillaplus.crafts.CraftEnchantedGold;
import fr.venodez.vanillaplus.crafts.CraftEnchantedIron;
import fr.venodez.vanillaplus.crafts.CraftEnchantedIronBlock;
import fr.venodez.vanillaplus.crafts.CraftEnchantedObsidian;
import fr.venodez.vanillaplus.crafts.CraftHammer;
import fr.venodez.vanillaplus.crafts.CraftNametag;
import fr.venodez.vanillaplus.crafts.CraftPerfectPickaxe;
import fr.venodez.vanillaplus.crafts.CraftTotem;
import fr.venodez.vanillaplus.enchantements.AutoSmelt;
import fr.venodez.vanillaplus.items.Hammer;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		
		getServer().getPluginManager().registerEvents(new Hammer(), this);
		getServer().getPluginManager().registerEvents(new AutoSmelt(), this);
		CraftHammer.registerCraft();
		CraftNametag.registerCraft();
		CraftTotem.registerCraft();
		CraftPerfectPickaxe.registerCraft();
		CraftEnchantedObsidian.registerCraft();
		CraftEnchantedIron.registerCraft();
		CraftEnchantedIronBlock.registerCraft();
		CraftEnchantedGold.registerCraft();
		
	}
	
}
