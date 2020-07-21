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

public class CraftEnchantedIronBlock {

	@SuppressWarnings("deprecation")
	public static void registerCraft() {
		
		ItemStack IronB = new ItemStack(Material.PLAYER_HEAD);
		SkullMeta IronBM = (SkullMeta) IronB.getItemMeta();
		IronBM.setOwner("metalhedd");
		IronBM.setDisplayName("§fEnchanted Iron Block");
		IronBM.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		IronBM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        IronB.setItemMeta(IronBM);
		
        ItemStack ironb = new ItemStack(Material.IRON_INGOT, 2);
        ItemMeta mironb = ironb.getItemMeta();
        mironb.setDisplayName("§fEnchanted Iron");
        mironb.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
        mironb.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        ironb.setItemMeta(mironb);

        NamespacedKey key = new NamespacedKey(Main.getPlugin(Main.class), "enchantedironblock");
        ShapedRecipe recipe = new ShapedRecipe(key, IronB);
        recipe.shape("OOO", "OBO", "OOO");
        recipe.setIngredient('O', ironb.getData());
        recipe.setIngredient('B', Material.IRON_BLOCK);
        Bukkit.addRecipe(recipe);
		
	}

}
