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

public class CraftEnchantedIron {
	
	public static void registerCraft() {
		
    ItemStack iron = new ItemStack(Material.IRON_INGOT, 2);
    ItemMeta miron = iron.getItemMeta();
    miron.setDisplayName("§fEnchanted Iron");
    miron.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
    miron.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    iron.setItemMeta(miron);
    NamespacedKey key = new NamespacedKey(Main.getPlugin(Main.class), "iron");
    ShapedRecipe recipe = new ShapedRecipe(key, iron);
    recipe.shape("OOO", "O O", "OOO");
    recipe.setIngredient('O', Material.IRON_INGOT);
    Bukkit.addRecipe(recipe);
	
	}
    
}
