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
import fr.venodez.vanillaplus.crafts.ObsiBoot;
import fr.venodez.vanillaplus.crafts.ObsiChestplate;
import fr.venodez.vanillaplus.crafts.ObsiHelmet;
import fr.venodez.vanillaplus.crafts.ObsiLeggings;
import fr.venodez.vanillaplus.crafts.ObsidianSword;
import fr.venodez.vanillaplus.crafts.PhantomMemb;
import fr.venodez.vanillaplus.enchantements.AutoSmelt;
import fr.venodez.vanillaplus.events.MobDeath;
import fr.venodez.vanillaplus.items.Hammer;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		
		getServer().getPluginManager().registerEvents(new Hammer(), this);
		getServer().getPluginManager().registerEvents(new AutoSmelt(), this);
		getServer().getPluginManager().registerEvents(new MobDeath(), this);
		CraftHammer.registerCraft();
		CraftNametag.registerCraft();
		CraftTotem.registerCraft();
		CraftPerfectPickaxe.registerCraft();
		CraftEnchantedObsidian.registerCraft();
		CraftEnchantedIron.registerCraft();
		CraftEnchantedIronBlock.registerCraft();
		CraftEnchantedGold.registerCraft();
		ObsiBoot.registerCraft();
		ObsiChestplate.registerCraft();	
		ObsiHelmet.registerCraft();
		ObsiLeggings.registerCraft();
		PhantomMemb.registerCraft();	
		ObsidianSword.registerCraft();
	}
	
}
