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

public class CraftTotem {
	
	public static void registerCraft() {
		
		ItemStack obsi = new ItemStack(Material.PAPER, 1);
	    ItemMeta mobsi = obsi.getItemMeta();
	    mobsi.setDisplayName("§fEnchanted Obsidian");
	    mobsi.addEnchant(Enchantment.FIRE_ASPECT, 1, true);
	    mobsi.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	    obsi.setItemMeta(mobsi);

        ItemStack totem = new ItemStack(Material.TOTEM_OF_UNDYING);
        ItemMeta mtotem = totem.getItemMeta();
        mtotem.setDisplayName("§e¦ Totem Of Undying ¦");
        totem.setItemMeta(mtotem);

        NamespacedKey key = new NamespacedKey(Main.getPlugin(Main.class), "totem");
        ShapedRecipe recipe = new ShapedRecipe(key, totem);
        recipe.shape("OOG", "MAM", "GOO");
        recipe.setIngredient('O', obsi.getData());
        recipe.setIngredient('G', Material.GOLD_INGOT);
        recipe.setIngredient('A', Material.GOLDEN_APPLE);
        recipe.setIngredient('M', Material.PHANTOM_MEMBRANE);
        Bukkit.addRecipe(recipe);
		
	}
	
}
