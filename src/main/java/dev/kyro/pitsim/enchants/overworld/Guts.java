package dev.kyro.pitsim.enchants.overworld;

import dev.kyro.pitsim.controllers.objects.PitEnchant;
import dev.kyro.pitsim.controllers.objects.PitPlayer;
import dev.kyro.pitsim.enums.ApplyType;
import dev.kyro.pitsim.events.KillEvent;
import dev.kyro.pitsim.misc.Misc;
import dev.kyro.pitsim.misc.PitLoreBuilder;
import org.bukkit.event.EventHandler;

import java.util.List;

public class Guts extends PitEnchant {

	public Guts() {
		super("Guts", false, ApplyType.MELEE,
				"guts", "gut");
	}

	@EventHandler
	public void onAttack(KillEvent killEvent) {
		if(!killEvent.isKillerPlayer()) return;

		int enchantLvl = killEvent.getKillerEnchantLevel(this);
		if(enchantLvl == 0) return;

		PitPlayer pitPlayer = killEvent.getKillerPitPlayer();
		pitPlayer.heal(getHealing(enchantLvl));
	}

	@Override
	public List<String> getNormalDescription(int enchantLvl) {
		return new PitLoreBuilder(
				"&7Heal &c+" + Misc.getHearts(getHealing(enchantLvl)) + " &7on kill"
		).getLore();
	}

	@Override
	public String getSummary() {
		return getDisplayName(false, true) + " &7is an enchant that heals you on kill";
	}

	public double getHealing(int enchantLvl) {
		return enchantLvl * 0.5 + 0.5;
	}
}
