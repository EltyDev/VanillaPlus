package fr.venodez.vanillaplus.crafts;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import fr.venodez.vanillaplus.Main;

public class CraftCasqueFarmer {

	public static void registerCraft() {
		
	    ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
	    ItemMeta helmetm = (LeatherArmorMeta)helmet.getItemMeta();
	    ((LeatherArmorMeta) helmetm).setColor(Color.ORANGE);
	    helmetm.setDisplayName("§fEnchanted Iron");
	    helmetm.addEnchant(Enchantment.DURABILITY, 3, true);
	    helmetm.addItemFlags(ItemFlag.HIDE_ENCHANTS);
	    
	    helmet.setItemMeta(helmetm);
	    NamespacedKey key = new NamespacedKey(Main.getPlugin(Main.class), "helmet");
	    ShapedRecipe recipe = new ShapedRecipe(key, helmet);
	    recipe.shape("OOO", "O O", "OOO");
	    recipe.setIngredient('O', Material.IRON_INGOT);
	    Bukkit.addRecipe(recipe);
		
		}
	
}
