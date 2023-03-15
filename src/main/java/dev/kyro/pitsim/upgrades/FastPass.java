package dev.kyro.pitsim.upgrades;

import dev.kyro.pitsim.controllers.UpgradeManager;
import dev.kyro.pitsim.controllers.objects.RenownUpgrade;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class FastPass extends RenownUpgrade {
	public FastPass() {
		super("Fast Pass", "FAST_PASS", 100, 34, 38, false, 0);
	}

	@Override
	public List<Integer> getTierCosts() {
		return null;
	}

	@Override
	public ItemStack getDisplayItem(Player player) {
		ItemStack item = new ItemStack(Material.ACTIVATOR_RAIL);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(UpgradeManager.itemNameString(this, player));
		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Start at level 50 after"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7you &eprestige&7."));
		meta.setLore(UpgradeManager.loreBuilder(this, player, lore, false));
		item.setItemMeta(meta);
		return item;
	}

	@Override
	public String getSummary() {
		return "&eFast Pass&7 is an &erenown&7 upgrade that increases the level you start on after completing a &eprestige";
	}
}
