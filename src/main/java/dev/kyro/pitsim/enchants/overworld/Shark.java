package dev.kyro.pitsim.enchants.overworld;

import dev.kyro.pitsim.controllers.objects.PitEnchant;
import dev.kyro.pitsim.enums.ApplyType;
import dev.kyro.pitsim.events.AttackEvent;
import dev.kyro.pitsim.misc.PitLoreBuilder;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;

import java.util.List;

public class Shark extends PitEnchant {

	public Shark() {
		super("Shark", false, ApplyType.MELEE,
				"shark");
	}

	@EventHandler
	public void onAttack(AttackEvent.Apply attackEvent) {
		if(!canApply(attackEvent)) return;

		int enchantLvl = attackEvent.getAttackerEnchantLevel(this);
		if(enchantLvl == 0) return;

		List<Entity> entityList = attackEvent.getAttacker().getNearbyEntities(7, 7, 7);
		int nearby = 0;

		nearby = (int) Math.ceil(entityList.size() * 0.3);

//		for(Entity entity : entityList) {
//			if(entity instanceof Player && ((Player) entity).getHealth() < 10) nearby++;
//		}

		double increasePercent = getDamage(enchantLvl) * nearby;
		increasePercent = Math.min(increasePercent, (getCap(enchantLvl) / 100D));
		attackEvent.increasePercent += increasePercent;
	}

	@Override
	public List<String> getNormalDescription(int enchantLvl) {
		return new PitLoreBuilder(
				"&7Deal &c+" + getDamage(enchantLvl) + "% &7damage per other player below &c5\u2764 &7within 7 " +
				"blocks (&c+" + getCap(enchantLvl) + "% &7max)"
		).getLore();
	}

	public int getDamage(int enchantLvl) {
		return (int) (Math.pow(enchantLvl, 1.2) * 2);
	}

	public double getCap(int enchantLvl) {
		return enchantLvl * 10 + 5;
	}
}
