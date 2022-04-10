package dev.kyro.pitsim.mobs;

import dev.kyro.pitsim.controllers.MobManager;
import dev.kyro.pitsim.controllers.objects.PitMob;
import dev.kyro.pitsim.enums.MobType;
import org.bukkit.Location;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class PitCreeper extends PitMob {

	public PitCreeper(Location spawnLoc) {
		super(MobType.CHARGED_CREEPER, spawnLoc, 1, "&cCreeper");
	}

	@Override
	public LivingEntity spawnMob(Location spawnLoc) {
		Creeper creeper = (Creeper) spawnLoc.getWorld().spawnEntity(spawnLoc, EntityType.CREEPER);

		creeper.setMaxHealth(50);
		creeper.setHealth(50);

		creeper.setCustomNameVisible(false);
		MobManager.makeTag(creeper, displayName);
		return creeper;
	}

	@Override
	public Map<ItemStack, Integer> getDrops() {
		return null;
	}
}
