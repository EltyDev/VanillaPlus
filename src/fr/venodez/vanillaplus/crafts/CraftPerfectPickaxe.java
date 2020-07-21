package fr.venodez.vanillaplus.crafts;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import fr.venodez.vanillaplus.Main;

public class CraftPerfectPickaxe {
	

	@SuppressWarnings("deprecation")
	public static void registerCraft() {
		
		ItemStack iron = new ItemStack(Material.IRON_BLOCK, 2);
        ItemMeta miron = iron.getItemMeta();
        miron.setDisplayName("§fEnchanted Iron Block");
        miron.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
        miron.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        iron.setItemMeta(miron);

        ItemStack obsi = new ItemStack(Material.PLAYER_HEAD);
		SkullMeta mobsi = (SkullMeta) obsi.getItemMeta();
		mobsi.setOwner("BlockOfObsidian");
		mobsi.setDisplayName("§5Enchanted Obsidian");
        mobsi.addEnchant(Enchantment.FIRE_ASPECT, 1, true);
        mobsi.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        obsi.setItemMeta(mobsi);

        ItemStack pickaxe = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta mpickaxe = pickaxe.getItemMeta();
        mpickaxe.setDisplayName("Â§eâœ¦  Perfect Pickaxe âœ¦");
        mpickaxe.addEnchant(Enchantment.DIG_SPEED, 10, true);
        mpickaxe.addEnchant(Enchantment.DURABILITY, 10, true);
        mpickaxe.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS);
        pickaxe.setItemMeta(mpickaxe);

        NamespacedKey key = new NamespacedKey(Main.getPlugin(Main.class), "pickaxe");
        ShapedRecipe recipe = new ShapedRecipe(key, pickaxe);
        recipe.shape("GOG", " N ", " S ");
        recipe.setIngredient('O', obsi.getData());
        recipe.setIngredient('G', iron.getData());
        recipe.setIngredient('N', Material.NETHER_STAR);
        recipe.setIngredient('S', Material.STICK);
        Bukkit.addRecipe(recipe);
		
	}
	
}
