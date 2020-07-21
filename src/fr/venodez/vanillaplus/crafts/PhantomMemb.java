package fr.venodez.vanillaplus.crafts;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

import fr.venodez.vanillaplus.Main;

public class PhantomMemb {
	
	public static void registerCraft() {

        ItemStack gold = new ItemStack(Material.GOLD_NUGGET);

        ItemStack Lap = new ItemStack(Material.LAPIS_LAZULI);
        
        ItemStack Ske = new ItemStack(Material.BONE);
        
        ItemStack Pha = new ItemStack(Material.PHANTOM_MEMBRANE);
        
        NamespacedKey key = new NamespacedKey(Main.getPlugin(Main.class), "PHANTOMMEMBRANE");
        ShapedRecipe recipe = new ShapedRecipe(key, Pha);
        recipe.shape(" L ", " O ", " G ");
        recipe.setIngredient('O', Lap.getData());
        recipe.setIngredient('L', Ske.getData());
        recipe.setIngredient('G', gold.getData());
        Bukkit.addRecipe(recipe);

    }

}
