package fr.venodez.vanillaplus.crafts;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import fr.venodez.vanillaplus.Main;

public class CraftEnchantedObsidian {
	
	public static void registerCraft() {
		
	    ItemStack obsi = new ItemStack(Material.PAPER, 1);
	    ItemMeta mobsi = obsi.getItemMeta();
	    mobsi.setDisplayName("§fEnchanted Obsidian");
	    mobsi.addEnchant(Enchantment.FIRE_ASPECT, 1, true);
	    mobsi.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	    obsi.setItemMeta(mobsi);
	    
	    ItemStack Mobsi = new ItemStack(Material.OBSIDIAN, 12);
	    
	    NamespacedKey key = new NamespacedKey(Main.getPlugin(Main.class), "obsi");
	    ShapedRecipe recipe = new ShapedRecipe(key, obsi);
	    recipe.shape("OOO", "OOO", "OOO");
	    recipe.setIngredient('O', Mobsi.getData());
	    Bukkit.addRecipe(recipe);
		
	}
	
}
