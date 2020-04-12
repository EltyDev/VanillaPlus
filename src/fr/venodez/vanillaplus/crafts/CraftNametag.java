package fr.venodez.vanillaplus.crafts;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import fr.venodez.vanillaplus.Main;

public class CraftNametag {
	
	public static void registerCraft() {
		
        ItemStack nametag = new ItemStack(Material.NAME_TAG, 2);
        ItemMeta mnametag = nametag.getItemMeta();
        mnametag.setDisplayName("§f§l✦ Name Tag ✦");
        nametag.setItemMeta(mnametag);
        NamespacedKey key = new NamespacedKey(Main.getPlugin(Main.class), "nametag");
        ShapedRecipe recipe = new ShapedRecipe(key, nametag);
        recipe.shape("  S", " P ", "P  ");
        recipe.setIngredient('P', Material.PAPER);
        recipe.setIngredient('S', Material.STRING);
        Bukkit.addRecipe(recipe);

	}

}
