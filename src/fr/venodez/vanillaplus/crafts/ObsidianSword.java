package fr.venodez.vanillaplus.crafts;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import fr.venodez.vanillaplus.Main;

public class ObsidianSword {
	
	 
	 public static void registerCraft() {
			
		    ItemStack obsi = new ItemStack(Material.PAPER, 1);
		    ItemMeta mobsi = obsi.getItemMeta();
		    mobsi.setDisplayName("§fEnchanted Obsidian");
		    mobsi.addEnchant(Enchantment.FIRE_ASPECT, 1, true);
		    mobsi.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		    obsi.setItemMeta(mobsi);
		    
		    ItemStack OBSISWORD = new ItemStack(Material.DIAMOND_SWORD);
			ItemMeta OBSISWORDM = OBSISWORD.getItemMeta();
			OBSISWORDM.addEnchant(Enchantment.DURABILITY, 80, true);
			OBSISWORDM.addEnchant(Enchantment.DAMAGE_ALL, 20, true);
			OBSISWORDM.addItemFlags(ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
			OBSISWORDM.setDisplayName("§6Obsidian Sword");
			OBSISWORDM.setLore(Arrays.asList(" ", "§6§lLEGENDARY"));
			OBSISWORD.setItemMeta(OBSISWORDM);
		    
		    NamespacedKey key = new NamespacedKey(Main.getPlugin(Main.class), "obsidiansword");
		    ShapedRecipe recipe = new ShapedRecipe(key, OBSISWORD);
		    recipe.shape(" O ", " O ", " S ");
		    recipe.setIngredient('O', obsi.getData());
		    recipe.setIngredient('S', Material.STICK);
		    Bukkit.addRecipe(recipe);
			
		}
	 
	
}
