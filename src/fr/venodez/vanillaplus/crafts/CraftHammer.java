package fr.venodez.vanillaplus.crafts;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import fr.venodez.vanillaplus.Main;

public class CraftHammer {
	
	public static void registerCraft() {
		
		ItemStack hammer = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemMeta mHammer = hammer.getItemMeta();
		mHammer.setDisplayName("§cHammer");
		hammer.setItemMeta(mHammer);
		NamespacedKey key = new NamespacedKey(Main.getPlugin(Main.class), "hammer");
		ShapedRecipe recipe = new ShapedRecipe(key, hammer);
		recipe.shape("EPE", " N ", " S ");
		recipe.setIngredient('E', Material.EMERALD_BLOCK);
		recipe.setIngredient('P', Material.DIAMOND_PICKAXE);
		recipe.setIngredient('N', Material.NETHER_STAR);
		recipe.setIngredient('S', Material.STICK);
		Bukkit.addRecipe(recipe);
		
	}

}
