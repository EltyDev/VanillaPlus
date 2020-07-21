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

public class CraftEnchantedGold {
	
	public static void registerCraft() {
		
        ItemStack ore = new ItemStack(Material.GOLD_INGOT, 2);
        ItemMeta more = ore.getItemMeta();
        more.setDisplayName("§fEnchanted Gold Ingot");
        more.addEnchant(Enchantment.KNOCKBACK, 3, true);
        more.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ore.setItemMeta(more);
        NamespacedKey key = new NamespacedKey(Main.getPlugin(Main.class), "ore");
        ShapedRecipe recipe = new ShapedRecipe(key, ore);
        recipe.shape("OOO", "O O", "OOO");
        recipe.setIngredient('O', Material.GOLD_INGOT);
        Bukkit.addRecipe(recipe);
		
	}
	
}
