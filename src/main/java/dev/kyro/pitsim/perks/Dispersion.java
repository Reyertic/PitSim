package dev.kyro.pitsim.perks;

import dev.kyro.arcticapi.builders.ALoreBuilder;
import dev.kyro.pitsim.PitSim;
import dev.kyro.pitsim.controllers.MapManager;
import dev.kyro.pitsim.controllers.NonManager;
import dev.kyro.pitsim.controllers.objects.PitEnchant;
import dev.kyro.pitsim.controllers.objects.PitPerk;
import dev.kyro.pitsim.events.AttackEvent;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Dispersion extends PitPerk {
	public static Dispersion INSTANCE;

	public Dispersion() {
		super("Dispersion", "dispersion", new ItemStack(Material.WEB), 22, false, "", INSTANCE, false);
		INSTANCE = this;
	}

	@EventHandler
	public void onAttack(AttackEvent.Apply attackEvent) {
		if(!PitSim.status.isOverworld()) return;
		if(!attackEvent.isAttackerPlayer() || !attackEvent.isDefenderPlayer()) return;
		if(NonManager.getNon(attackEvent.getDefender()) != null) return;
		if(!playerHasUpgrade(attackEvent.getDefenderPlayer())) return;
		if(MapManager.inDarkzone(attackEvent.getDefenderPlayer())) return;

		if(MapManager.currentMap.world != attackEvent.getDefenderPlayer().getWorld()) return;
		if(MapManager.currentMap.getMid().distance(attackEvent.getDefenderPlayer().getLocation()) > getRange()) return;

		List<PitEnchant> toRemove = new ArrayList<>();
		for(Map.Entry<PitEnchant, Integer> entry : attackEvent.getAttackerEnchantMap().entrySet()) {
			if(Math.random() > getChance() / 100.0) continue;
			toRemove.add(entry.getKey());
		}
		for(PitEnchant pitEnchant : toRemove) attackEvent.getAttackerEnchantMap().remove(pitEnchant);
	}

	@Override
	public List<String> getDescription() {
		return new ALoreBuilder("&dDisperse " + getChance() + "% &7of the enchants",
				"&7on your opponent's attacks",
				"&7while in middle").getLore();
	}

	@Override
	public String getSummary() {
		return "&aDispersion &7is a perk that spreads out the enchants of your opponents attacks in middle";
	}

	public static int getRange() {
		return 10;
	}

	public static int getChance() {
		return 60;
	}
}
