package dev.kyro.pitsim.brewing.ingredients;

import de.tr7zw.nbtapi.NBTItem;
import dev.kyro.arcticapi.misc.AOutput;
import dev.kyro.arcticapi.misc.AUtil;
import dev.kyro.pitsim.brewing.PotionManager;
import dev.kyro.pitsim.brewing.objects.BrewingIngredient;
import dev.kyro.pitsim.brewing.objects.PotionEffect;
import dev.kyro.pitsim.enums.NBTTag;
import dev.kyro.pitsim.misc.Misc;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiderEye extends BrewingIngredient {
	public static SpiderEye INSTANCE;

	public SpiderEye() {
		super(3, NBTTag.SPIDER_EYE, "Cleanse", ChatColor.WHITE, PotionType.INVISIBILITY);
		INSTANCE = this;
	}

	@Override
	public void administerEffect(Player player, BrewingIngredient potency, int duration) {
		AOutput.send(player, "&5&lPOTION! &7Effected with " + color + name + " " +
				AUtil.toRoman(potency.tier));
		for(PotionEffect potionEffect : PotionManager.getPotionEffects(player)) {
			int tier = potionEffect.potency.tier;
			if(tier - potency.tier < 1) {
				AOutput.send(player, potionEffect.potionType.color + potionEffect.potionType.name + " " +
						AUtil.toRoman(potionEffect.potency.tier) + " &7\u21e8 " + potionEffect.potionType.color +
						ChatColor.STRIKETHROUGH + potionEffect.potionType.name);
				potionEffect.onExpire(true);
			} else {
				AOutput.send(player, potionEffect.potionType.color + potionEffect.potionType.name + " " +
						AUtil.toRoman(potionEffect.potency.tier) + " &7\u21e8 " + potionEffect.potionType.color +
						potionEffect.potionType.name + " " + AUtil.toRoman(potionEffect.potency.tier - potency.tier));

				potionEffect.potency = BrewingIngredient.getIngredientFromTier(tier - potency.tier);
			}
		}
	}

	@Override
	public Object getPotency(BrewingIngredient potencyIngredient) {
		return potencyIngredient.tier;
	}

	@Override
	public List<String> getPotencyLore(BrewingIngredient potency) {
		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.GRAY + "Clears " + color + getPotency(potency) + " Tiers " + ChatColor.GRAY + "off of all");
		lore.add(ChatColor.GRAY + "active potion effects.");
		return lore;
	}

	@Override
	public int getDuration(BrewingIngredient durationIngredient) {
		return 0;
	}

	@Override
	public int getBrewingReductionMinutes() {
		return 30;
	}

	@Override
	public ItemStack getItem() {
		ItemStack eye = new ItemStack(Material.SPIDER_EYE);
		ItemMeta meta = eye.getItemMeta();
		List<String> lore = Arrays.asList(ChatColor.GRAY + "Eye gathered from the Spiders", ChatColor.GRAY
				+ "of the Spider Caves", "", ChatColor.DARK_PURPLE + "Tainted Item");
		meta.setLore(lore);
		meta.setDisplayName(ChatColor.GREEN + "Spider Eye");
		eye.setItemMeta(meta);

		NBTItem nbtItem = new NBTItem(eye);
		nbtItem.setBoolean(nbtTag.getRef(), true);
		return nbtItem.getItem();
	}
}
