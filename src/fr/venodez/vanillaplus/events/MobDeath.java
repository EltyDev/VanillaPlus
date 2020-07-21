package fr.venodez.vanillaplus.events;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class MobDeath implements Listener {

	@EventHandler
	public void onEDeath(EntityDeathEvent event) {
		if (event.getEntity().getKiller() != null) {
			if(event.getEntityType() == EntityType.HOGLIN) {
				Location loc = event.getEntity().getLocation();
				Player player = event.getEntity().getKiller();
				ItemStack obsi = new ItemStack(Material.PAPER, 1);
			    ItemMeta mobsi = obsi.getItemMeta();
			    mobsi.setDisplayName("§fEnchanted Obsidian");
			    mobsi.addEnchant(Enchantment.FIRE_ASPECT, 1, true);
			    mobsi.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			    obsi.setItemMeta(mobsi);
				event.getEntity().getLocation().getWorld().dropItem(loc, obsi);
			}
			if(event.getEntityType() == EntityType.ENDER_DRAGON ) {
				Location loc = event.getEntity().getLocation();
				ItemStack skull = new ItemStack(Material.PLAYER_HEAD, 1);
				SkullMeta meta = (SkullMeta) skull.getItemMeta();
				meta.setOwner("LandM");
				meta.setDisplayName("EnderDragon's Head");
				skull.setItemMeta(meta);
				event.getEntity().getLocation().getWorld().dropItem(loc, skull);
			}
		}
	}
	
}

//LandM 