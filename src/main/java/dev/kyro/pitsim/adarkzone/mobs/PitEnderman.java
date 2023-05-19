package dev.kyro.pitsim.adarkzone.mobs;

import dev.kyro.pitsim.adarkzone.*;
import dev.kyro.pitsim.aitems.mobdrops.EnderPearl;
import dev.kyro.pitsim.controllers.ItemFactory;
import dev.kyro.pitsim.enums.MobStatus;
import dev.kyro.pitsim.misc.CustomPitEnderman;
import dev.kyro.pitsim.misc.EntityManager;
import net.minecraft.server.v1_8_R3.World;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.entity.Creature;

public class PitEnderman extends PitMob {

	static {
		EntityManager.registerEntity("PitEnderman", 58, CustomPitEnderman.class);
	}

	public PitEnderman(Location spawnLocation, MobStatus mobStatus) {
		super(spawnLocation, mobStatus);
	}

	@Override
	public SubLevelType getSubLevelType() {
		return SubLevelType.ENDERMAN;
	}

	@Override
	public Creature createMob(Location spawnLocation) {
//		Enderman enderman = spawnLocation.getWorld().spawn(spawnLocation, Enderman.class);
//		enderman.setCustomNameVisible(false);
//		enderman.setRemoveWhenFarAway(false);
//		enderman.setCanPickupItems(false);
//
//		return enderman;

		World nmsWorld = ((CraftWorld) spawnLocation.getWorld()).getHandle();

		CustomPitEnderman enderman = new CustomPitEnderman(nmsWorld, DarkzoneManager.getSubLevel(SubLevelType.ENDERMAN));
		enderman.setLocation(spawnLocation.getX(), spawnLocation.getY(), spawnLocation.getZ(), 0, 0);
		nmsWorld.addEntity(enderman);

		return (Creature) enderman.getBukkitEntity();
	}

	@Override
	public String getRawDisplayName() {
		return "Enderman";
	}

	@Override
	public String getRawDisplayNamePlural() {
		return "Endermen";
	}

	@Override
	public ChatColor getChatColor() {
		return ChatColor.DARK_PURPLE;
	}

	@Override
	public int getMaxHealth() {
		return DarkzoneBalancing.getAttributeAsInt(getSubLevelType(), DarkzoneBalancing.Attribute.MOB_HEALTH);
	}

	@Override
	public double getDamage() {
		return DarkzoneBalancing.getAttribute(getSubLevelType(), DarkzoneBalancing.Attribute.MOB_DAMAGE);
	}

	@Override
	public int getSpeedAmplifier() {
		return 1;
	}

	@Override
	public int getDroppedSouls() {
		return DarkzoneBalancing.getAttributeAsRandomInt(getSubLevelType(), DarkzoneBalancing.Attribute.MOB_SOULS);
	}

	@Override
	public DropPool createDropPool() {
		return new DropPool()
				.addRareItem(() -> ItemFactory.getItem(EnderPearl.class).getItem(), DarkzoneBalancing.MOB_ITEM_DROP_PERCENT);
	}

	@Override
	public PitNameTag createNameTag() {
		return new PitNameTag(this, PitNameTag.NameTagType.NAME_AND_HEALTH)
				.addMob(PitNameTag.RidingType.BABY_RABBIT)
				.addMob(PitNameTag.RidingType.BABY_RABBIT);
	}
}