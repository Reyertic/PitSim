package dev.kyro.pitsim.enchants.tainted.chestplate;

import dev.kyro.pitsim.controllers.EnchantManager;
import dev.kyro.pitsim.controllers.objects.PitEnchant;
import dev.kyro.pitsim.controllers.objects.PitPlayer;
import dev.kyro.pitsim.enums.ApplyType;
import dev.kyro.pitsim.events.ManaRegenEvent;
import dev.kyro.pitsim.misc.Misc;
import dev.kyro.pitsim.misc.PitLoreBuilder;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;

import java.util.List;

public
class Sonic extends PitEnchant {
	public static Sonic INSTANCE;

	public Sonic() {
		super("Sonic", true, ApplyType.CHESTPLATES,
				"sonic", "fast");
		isTainted = true;
		INSTANCE = this;
	}

	@EventHandler
	public void onManaRegen(ManaRegenEvent event) {
		Player player = event.getPlayer();
		int enchantLvl = EnchantManager.getEnchantLevel(player, this);
		if(enchantLvl == 0) return;
		event.multipliers.add(Misc.getReductionMultiplier(getManaReduction(enchantLvl)));
	}

	public static float getWalkSpeedIncrease(PitPlayer pitPlayer) {
		if(!INSTANCE.isEnabled() || !pitPlayer.hasManaUnlocked()) return 0;

		int enchantLvl = EnchantManager.getEnchantLevel(pitPlayer.player, INSTANCE);
		if(enchantLvl == 0) return 0;

		return getWalkSpeedIncrease(enchantLvl);
	}

	@Override
	public List<String> getNormalDescription(int enchantLvl) {
		return new PitLoreBuilder(
				"&7Move &e" + getWalkSpeedIncrease(enchantLvl) + "% &7faster at all times. When worn, regain mana &b" +
						getManaReduction(enchantLvl) + "% &7slower"
		).getLore();
	}

	@Override
	public String getSummary() {
		return getDisplayName(false, true) + " &7is a &5Darkzone &7enchant that " +
				"substantially increases your movement speed";
	}

	public static int getWalkSpeedIncrease(int enchantLvl) {
		return 100;
	}

	public static int getManaReduction(int enchantLvl) {
		return Math.max(130 - enchantLvl * 30, 0);
	}
}
