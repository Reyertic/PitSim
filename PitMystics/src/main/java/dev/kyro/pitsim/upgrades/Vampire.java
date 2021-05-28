package dev.kyro.pitsim.upgrades;

import dev.kyro.arcticapi.builders.ALoreBuilder;
import dev.kyro.pitsim.controllers.PitUpgrade;
import dev.kyro.pitsim.events.AttackEvent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class Vampire extends PitUpgrade {

	public Vampire() {
		super("Vampire", new ItemStack(Material.FERMENTED_SPIDER_EYE), 10);
	}

	@EventHandler
	public void onAttack(AttackEvent.Apply attackEvent) {

		if(!playerHasUpgrade(attackEvent.attacker)) return;

		attackEvent.attacker.setHealth(Math.min(attackEvent.attacker.getHealth() + 1, attackEvent.attacker.getMaxHealth()));
	}

	@Override
	public List<String> getDescription() {
		return new ALoreBuilder("gay perk").getLore();
	}
}
