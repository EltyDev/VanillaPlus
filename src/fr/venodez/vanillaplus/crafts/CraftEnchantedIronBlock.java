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

public class CraftEnchantedIronBlock {
	
	public static void registerCraft() {
		
        ItemStack ironb = new ItemStack(Material.IRON_INGOT, 2);
        ItemMeta mironb = ironb.getItemMeta();
        mironb.setDisplayName("§fEnchanted Iron");
        mironb.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
        mironb.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ironb.setItemMeta(mironb);

        ItemStack obsi1 = new ItemStack(Material.IRON_BLOCK, 2);
        ItemMeta mobsi1 = obsi1.getItemMeta();
        mobsi1.setDisplayName("§fEnchanted Iron Block");
        mobsi1.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
        mobsi1.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        obsi1.setItemMeta(mobsi1);
        NamespacedKey key = new NamespacedKey(Main.getPlugin(Main.class), "obsi1");
        ShapedRecipe recipe = new ShapedRecipe(key, obsi1);
        recipe.shape("OOO", "OBO", "OOO");
        recipe.setIngredient('O', ironb.getData());
        recipe.setIngredient('B', Material.IRON_BLOCK);
        Bukkit.addRecipe(recipe);
		
	}

}
