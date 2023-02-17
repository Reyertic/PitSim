package dev.kyro.pitsim.enchants.overworld;

import dev.kyro.pitsim.controllers.objects.PitEnchant;
import dev.kyro.pitsim.enums.ApplyType;
import dev.kyro.pitsim.events.AttackEvent;
import dev.kyro.pitsim.misc.PitLoreBuilder;
import net.minecraft.server.v1_8_R3.EntityLiving;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftLivingEntity;
import org.bukkit.event.EventHandler;

import java.util.List;

public class GoldAndBoosted extends PitEnchant {

	public GoldAndBoosted() {
		super("Gold and Boosted", false, ApplyType.SWORDS,
				"gab", "gold-and-boosted", "goldandboosted");
	}

	@EventHandler
	public void onAttack(AttackEvent.Apply attackEvent) {
		if(!attackEvent.isAttackerPlayer()) return;
		if(!canApply(attackEvent)) return;

		int enchantLvl = attackEvent.getAttackerEnchantLevel(this);
		if(enchantLvl == 0) return;

		EntityLiving nmsPlayer = ((CraftLivingEntity) attackEvent.getAttacker()).getHandle();
		if(nmsPlayer.getAbsorptionHearts() == 0) return;
		attackEvent.increasePercent += getDamage(enchantLvl);
	}

	@Override
	public List<String> getNormalDescription(int enchantLvl) {
		return new PitLoreBuilder(
				"&7Deal &c+" + getDamage(enchantLvl) + "% &7damage when you have absorption hearts"
		).getLore();
	}

	public int getDamage(int enchantLvl) {
		return enchantLvl * 9 + 7;
	}
}
