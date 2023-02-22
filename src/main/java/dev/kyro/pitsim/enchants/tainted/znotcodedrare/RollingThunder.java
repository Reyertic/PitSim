package dev.kyro.pitsim.enchants.tainted.znotcodedrare;

import dev.kyro.pitsim.PitSim;
import dev.kyro.pitsim.controllers.objects.PitEnchant;
import dev.kyro.pitsim.enums.ApplyType;
import dev.kyro.pitsim.events.PitPlayerAttemptAbilityEvent;
import dev.kyro.pitsim.misc.PitLoreBuilder;
import dev.kyro.pitsim.misc.effects.FallingBlock;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import java.util.ArrayList;
import java.util.List;

public class RollingThunder extends PitEnchant {
	public static RollingThunder INSTANCE;

	public RollingThunder() {
		super("Rolling Thunder", true, ApplyType.SCYTHES,
				"rollingthunder", "roll", "rolling", "thunder");
		isTainted = true;
		INSTANCE = this;
	}

	@EventHandler
	public void onUse(PitPlayerAttemptAbilityEvent event) {
		Player player = event.getPlayer();
		int enchantLvl = event.getEnchantLevel(this);
		if(enchantLvl == 0) return;

		Location[][] locations = new Location[4][];
		Location startingLoc = player.getLocation().add(0, -1, 0);

		for(int i = 0; i < 4; i++) {
			locations[i] = new Location[3 + (2 * i)];
		}

		float pitch = Math.abs(player.getLocation().getPitch());
//		boolean xAxis = pitch - 90 >= 0 && pitch - 90 <= 45;
		boolean xAxis = true;
		int coefficient = 1;

		for(int i = 0; i < 3; i++) {
			Location tempLocation = startingLoc.clone().subtract(0, i, 0);
			if(tempLocation.getBlock().getType() != Material.AIR) break;
			startingLoc = tempLocation;
		}

		int z;
		int x;

		startingLoc.add(xAxis ? 0 : -1, 0, xAxis ? -1 : 0);

		for(int i = 0; i < locations.length; i++) {
			z = xAxis ? ((-1 * coefficient) * i) : i + (1 * coefficient);
			x = xAxis ? i + (1 * coefficient) : ((-1 * coefficient) * i);

			for(int j = 0; j < 3 + (2 * i); j++) {
				System.out.println(x + " " + z);
				locations[i][j] = startingLoc.clone().add(x, 0, z);
				z = xAxis ? z + 1 : z;
				x = xAxis ? x : x + 1;
			}
		}

		List<Player> viewers = getViewers(startingLoc);

		for(int i = 0; i < locations.length; i++) {
			Location[] blockLocations = locations[i];
			long delay = i * 2;
			Vector vector = new Vector(0, (i + 1) * 0.15, 0);

			for(Location blockLocation : blockLocations) {
				if(blockLocation.getBlock().getType() == Material.AIR) continue;
				if(blockLocation.clone().add(0, 1, 0).getBlock().getType() != Material.AIR) continue;

				new BukkitRunnable() {
					@Override
					public void run() {
						Block block =  blockLocation.getBlock();
						FallingBlock fallingBlock = new FallingBlock(block.getType(), block.getData(), blockLocation.add(0, 1, 0));
						fallingBlock.setViewers(viewers);
						fallingBlock.spawnBlock();
						fallingBlock.setVelocity(vector);
						fallingBlock.removeAfter((int) (delay + 5));
					}
				}.runTaskLater(PitSim.INSTANCE, delay);
			}
		}

	}

	public List<Player> getViewers(Location location) {
		List<Player> players = new ArrayList<>();
		for(Entity nearbyEntity : location.getWorld().getNearbyEntities(location, 20, 20, 20)) {
			if(!(nearbyEntity instanceof Player)) continue;
			Player player = Bukkit.getPlayer(nearbyEntity.getUniqueId());
			if(player != null) players.add(player);
		}
		return players;
	}




	@Override
	public List<String> getNormalDescription(int enchantLvl) {
		return new PitLoreBuilder(
				"&7I can't be asked to code this"
		).getLore();
	}
}
