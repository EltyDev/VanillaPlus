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

public class CraftPerfectShovel {
	
public static void registerCraft() {
		
		ItemStack iron = new ItemStack(Material.IRON_BLOCK, 2);
        ItemMeta miron = iron.getItemMeta();
        miron.setDisplayName("§fEnchanted Iron Block");
        miron.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
        miron.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        iron.setItemMeta(miron);

        ItemStack obsi = new ItemStack(Material.OBSIDIAN, 2);
        ItemMeta mobsi = obsi.getItemMeta();
        mobsi.setDisplayName("§fEnchanted Obsidian");
        mobsi.addEnchant(Enchantment.FIRE_ASPECT, 1, true);
        mobsi.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        obsi.setItemMeta(mobsi);

        ItemStack shovel = new ItemStack(Material.IRON_SHOVEL);
        ItemMeta mshovel = shovel.getItemMeta();
        mshovel.setDisplayName("§5✦ Perfect Shovel ✦");
        mshovel.addEnchant(Enchantment.DIG_SPEED, 100, true);
        mshovel.addEnchant(Enchantment.DURABILITY, 10, true);
        mshovel.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        shovel.setItemMeta(mshovel);

        NamespacedKey key = new NamespacedKey(Main.getPlugin(Main.class), "shovel");
        ShapedRecipe recipe = new ShapedRecipe(key, shovel);
        recipe.shape(" O ", " G ", " S ");
        recipe.setIngredient('O', obsi.getData());
        recipe.setIngredient('G', iron.getData());
        recipe.setIngredient('S', Material.STICK);
        Bukkit.addRecipe(recipe);
		
	}

}
