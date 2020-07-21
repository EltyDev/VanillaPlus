package fr.venodez.vanillaplus.crafts;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;

import fr.venodez.vanillaplus.Main;

public class ObsiLeggings {
	

	@SuppressWarnings("deprecation")
	public static void registerCraft() {

		ItemStack obsi = new ItemStack(Material.PAPER, 1);
	    ItemMeta mobsi = obsi.getItemMeta();
	    mobsi.setDisplayName("§fEnchanted Obsidian");
	    mobsi.addEnchant(Enchantment.FIRE_ASPECT, 1, true);
	    mobsi.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	    obsi.setItemMeta(mobsi);

        ItemStack ObsiArmor = new ItemStack(Material.LEATHER_LEGGINGS);
        LeatherArmorMeta ObsiMeta = (LeatherArmorMeta) ObsiArmor.getItemMeta();
        ObsiMeta.setColor(Color.fromRGB(1, 1, 1));
        ObsiMeta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 20, true);
        ObsiMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ObsiMeta.setDisplayName("§6Obsidian Leggings");
        ObsiMeta.setLore(Arrays.asList(" ", "§6§lLEGENDARY"));
        ObsiArmor.setItemMeta(ObsiMeta);

        NamespacedKey key = new NamespacedKey(Main.getPlugin(Main.class), "obsidianleggings");
        ShapedRecipe recipe = new ShapedRecipe(key, ObsiArmor);
        recipe.shape("OOO", "O O", "O O");
        recipe.setIngredient('O', obsi.getData());
        Bukkit.addRecipe(recipe);

    }

}
