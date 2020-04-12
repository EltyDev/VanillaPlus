package fr.venodez.vanillaplus.items;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class Hammer implements Listener {
	
	
	private final ArrayList<Material> breakable = new ArrayList<Material>(Arrays.asList(Material.DIORITE_SLAB,Material.DIORITE_STAIRS,Material.DIORITE_WALL,Material.POLISHED_DIORITE,Material.POLISHED_DIORITE_SLAB,Material.POLISHED_DIORITE_STAIRS,Material.GRANITE_SLAB,Material.GRANITE_STAIRS,Material.GRANITE_WALL,Material.POLISHED_GRANITE,Material.POLISHED_GRANITE_SLAB,Material.POLISHED_GRANITE_STAIRS,Material.ANDESITE_SLAB,Material.ANDESITE_STAIRS,Material.ANDESITE_WALL,Material.POLISHED_ANDESITE_SLAB,Material.POLISHED_ANDESITE_STAIRS,Material.OBSIDIAN,Material.ENDER_CHEST,Material.COAL_BLOCK,Material.ANVIL,Material.DIAMOND_BLOCK,Material.EMERALD_BLOCK,Material.IRON_BLOCK,Material.REDSTONE_BLOCK,Material.ENCHANTING_TABLE,Material.IRON_BARS,Material.IRON_DOOR,Material.SPAWNER,Material.DROPPER,Material.DISPENSER,Material.FURNACE, Material.GOLD_BLOCK,Material.DIAMOND_ORE,Material.EMERALD_ORE,Material.END_STONE,Material.GOLD_ORE,Material.HOPPER,Material.IRON_ORE,Material.LAPIS_BLOCK,Material.LAPIS_ORE,Material.NETHER_QUARTZ_ORE,Material.REDSTONE_ORE,Material.BRICK_STAIRS,Material.BRICKS,Material.CAULDRON,Material.COBBLESTONE,Material.COBBLESTONE_STAIRS,Material.COBBLESTONE_WALL,Material.MOSSY_COBBLESTONE_WALL,Material.NETHER_BRICKS,Material.NETHER_BRICK_FENCE,Material.NETHER_BRICK_STAIRS,Material.SMOOTH_STONE_SLAB,Material.ANDESITE,Material.DARK_PRISMARINE,Material.DIORITE,Material.GRANITE,Material.PRISMARINE_BRICKS,Material.PRISMARINE,Material.STONE,Material.STONE_BRICKS,Material.STONE_BRICK_STAIRS,Material.TERRACOTTA,Material.BLACK_GLAZED_TERRACOTTA,Material.BLACK_TERRACOTTA,Material.BLUE_GLAZED_TERRACOTTA,Material.BLUE_TERRACOTTA,Material.BROWN_GLAZED_TERRACOTTA,Material.BROWN_TERRACOTTA,Material.CYAN_GLAZED_TERRACOTTA,Material.CYAN_TERRACOTTA,Material.GRAY_GLAZED_TERRACOTTA,Material.GRAY_TERRACOTTA,Material.GREEN_GLAZED_TERRACOTTA,Material.GREEN_TERRACOTTA,Material.LIGHT_BLUE_GLAZED_TERRACOTTA,Material.LIGHT_BLUE_TERRACOTTA,Material.LIGHT_GRAY_GLAZED_TERRACOTTA,Material.LIGHT_GRAY_TERRACOTTA,Material.LIME_GLAZED_TERRACOTTA,Material.LIME_GLAZED_TERRACOTTA,Material.LIME_TERRACOTTA,Material.MAGENTA_GLAZED_TERRACOTTA,Material.MAGENTA_TERRACOTTA,Material.ORANGE_GLAZED_TERRACOTTA,Material.ORANGE_TERRACOTTA,Material.PINK_GLAZED_TERRACOTTA,Material.PINK_TERRACOTTA,Material.PURPLE_GLAZED_TERRACOTTA,Material.PURPLE_TERRACOTTA,Material.RED_GLAZED_TERRACOTTA,Material.RED_TERRACOTTA,Material.WHITE_GLAZED_TERRACOTTA,Material.WHITE_TERRACOTTA,Material.YELLOW_GLAZED_TERRACOTTA,Material.YELLOW_TERRACOTTA,Material.QUARTZ_BLOCK,Material.RED_SANDSTONE,Material.RED_SANDSTONE_STAIRS,Material.SANDSTONE,Material.SANDSTONE_STAIRS,Material.ACTIVATOR_RAIL,Material.DETECTOR_RAIL,Material.POWERED_RAIL,Material.RAIL,Material.BREWING_STAND,Material.ICE,Material.PACKED_ICE,Material.STONE_PRESSURE_PLATE,Material.HEAVY_WEIGHTED_PRESSURE_PLATE,Material.LIGHT_WEIGHTED_PRESSURE_PLATE));
	
	@EventHandler
	@SuppressWarnings("deprecation")
	public void onBreakBlockWithHammer(BlockBreakEvent event) {
		
		Player player = event.getPlayer();
		ItemStack item = player.getItemInHand();
		Block block = event.getBlock();
		Location playerLocation = player.getLocation();
		Location blockLocation = block.getLocation();
		float yaw = playerLocation.getYaw();
		float pitch = playerLocation.getPitch();
		
		if (item.getType().equals(Material.DIAMOND_PICKAXE) && item.hasItemMeta() && item.getItemMeta().hasDisplayName() && item.getItemMeta().getDisplayName().equalsIgnoreCase("§cHammer")) {
				
				if (!(breakable.contains(block.getType()))) return;
			
				if (pitch >= -45 && pitch <= 45) {

					if ((yaw >= -315 && yaw <= -225) || (yaw <= -45 && yaw >= -135)) {
							
						Block block1 = new Location(player.getWorld(),blockLocation.getBlockX(),blockLocation.getBlockY()+1,blockLocation.getBlockZ()).getBlock();
						if (breakable.contains(block1.getType())) block1.breakNaturally();
						Block block2 = new Location(player.getWorld(),blockLocation.getBlockX(),blockLocation.getBlockY()-1,blockLocation.getBlockZ()).getBlock();
						Block block3 = new Location(player.getWorld(),blockLocation.getBlockX(),blockLocation.getBlockY(),blockLocation.getBlockZ()+1).getBlock();
						Block block4 = new Location(player.getWorld(),blockLocation.getBlockX(),blockLocation.getBlockY(),blockLocation.getBlockZ()-1).getBlock();
						Block block5 = new Location(player.getWorld(),blockLocation.getBlockX(),blockLocation.getBlockY()+1,blockLocation.getBlockZ()+1).getBlock();
						Block block6 = new Location(player.getWorld(),blockLocation.getBlockX(),blockLocation.getBlockY()+1,blockLocation.getBlockZ()-1).getBlock();
						Block block7 = new Location(player.getWorld(),blockLocation.getBlockX(),blockLocation.getBlockY()-1,blockLocation.getBlockZ()+1).getBlock();
						Block block8 = new Location(player.getWorld(),blockLocation.getBlockX(),blockLocation.getBlockY()-1,blockLocation.getBlockZ()-1).getBlock();
						if (breakable.contains(block1.getType())) block1.breakNaturally(item);
						if (breakable.contains(block2.getType())) block2.breakNaturally(item);
						if (breakable.contains(block3.getType())) block3.breakNaturally(item);
						if (breakable.contains(block4.getType())) block4.breakNaturally(item);
						if (breakable.contains(block5.getType())) block5.breakNaturally(item);
						if (breakable.contains(block6.getType())) block6.breakNaturally(item);
						if (breakable.contains(block7.getType())) block7.breakNaturally(item);
						if (breakable.contains(block8.getType())) block8.breakNaturally(item);
						
					}
					
					else {
						
						Block block1 = new Location(player.getWorld(),blockLocation.getBlockX(),blockLocation.getBlockY()+1,blockLocation.getBlockZ()).getBlock();
						Block block2 = new Location(player.getWorld(),blockLocation.getBlockX(),blockLocation.getBlockY()-1,blockLocation.getBlockZ()).getBlock();
						Block block3 = new Location(player.getWorld(),blockLocation.getBlockX()+1,blockLocation.getBlockY(),blockLocation.getBlockZ()).getBlock();
						Block block4 = new Location(player.getWorld(),blockLocation.getBlockX()-1,blockLocation.getBlockY(),blockLocation.getBlockZ()).getBlock();
						Block block5 = new Location(player.getWorld(),blockLocation.getBlockX()+1,blockLocation.getBlockY()+1,blockLocation.getBlockZ()).getBlock();
						Block block6 = new Location(player.getWorld(),blockLocation.getBlockX()-1,blockLocation.getBlockY()+1,blockLocation.getBlockZ()).getBlock();
						Block block7 = new Location(player.getWorld(),blockLocation.getBlockX()+1,blockLocation.getBlockY()-1,blockLocation.getBlockZ()).getBlock();
						Block block8 = new Location(player.getWorld(),blockLocation.getBlockX()-1,blockLocation.getBlockY()-1,blockLocation.getBlockZ()).getBlock();
						if (breakable.contains(block1.getType())) block1.breakNaturally(item);
						if (breakable.contains(block2.getType())) block2.breakNaturally(item);
						if (breakable.contains(block3.getType())) block3.breakNaturally(item);
						if (breakable.contains(block4.getType())) block4.breakNaturally(item);
						if (breakable.contains(block5.getType())) block5.breakNaturally(item);
						if (breakable.contains(block6.getType())) block6.breakNaturally(item);
						if (breakable.contains(block7.getType())) block7.breakNaturally(item);
						if (breakable.contains(block8.getType())) block8.breakNaturally(item);
						
					}
					
				}
				
				else {
					
					Block block1 = new Location(player.getWorld(),blockLocation.getBlockX()+1,blockLocation.getBlockY(),blockLocation.getBlockZ()).getBlock();
					Block block2 = new Location(player.getWorld(),blockLocation.getBlockX()-1,blockLocation.getBlockY(),blockLocation.getBlockZ()).getBlock();
					Block block3 = new Location(player.getWorld(),blockLocation.getBlockX(),blockLocation.getBlockY(),blockLocation.getBlockZ()+1).getBlock();
					Block block4 = new Location(player.getWorld(),blockLocation.getBlockX(),blockLocation.getBlockY(),blockLocation.getBlockZ()-1).getBlock();
					Block block5 = new Location(player.getWorld(),blockLocation.getBlockX()+1,blockLocation.getBlockY(),blockLocation.getBlockZ()+1).getBlock();
					Block block6 = new Location(player.getWorld(),blockLocation.getBlockX()-1,blockLocation.getBlockY(),blockLocation.getBlockZ()+1).getBlock();
					Block block7 = new Location(player.getWorld(),blockLocation.getBlockX()+1,blockLocation.getBlockY(),blockLocation.getBlockZ()-1).getBlock();
					Block block8 = new Location(player.getWorld(),blockLocation.getBlockX()-1,blockLocation.getBlockY(),blockLocation.getBlockZ()-1).getBlock();
					if (breakable.contains(block1.getType())) block1.breakNaturally(item);
					if (breakable.contains(block2.getType())) block2.breakNaturally(item);
					if (breakable.contains(block3.getType())) block3.breakNaturally(item);
					if (breakable.contains(block4.getType())) block4.breakNaturally(item);
					if (breakable.contains(block5.getType())) block5.breakNaturally(item);
					if (breakable.contains(block6.getType())) block6.breakNaturally(item);
					if (breakable.contains(block7.getType())) block7.breakNaturally(item);
					if (breakable.contains(block8.getType())) block8.breakNaturally(item);
						
				}
			
		}
		
		else {
			
			
		}
		
	}

}
