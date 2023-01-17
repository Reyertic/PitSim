package dev.kyro.pitsim.aitems.mobdrops;

import dev.kyro.arcticapi.builders.ALoreBuilder;
import dev.kyro.pitsim.aitems.StaticPitItem;
import dev.kyro.pitsim.enums.AuctionCategory;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IronIngot extends StaticPitItem {

	public IronIngot() {
		hasDropConfirm = true;
		auctionCategory = AuctionCategory.DARKZONE_DROPS;
	}

	@Override
	public String getNBTID() {
		return "iron-ingot";
	}

	@Override
	public List<String> getRefNames() {
		return new ArrayList<>(Arrays.asList("iron", "ironingot"));
	}

	@Override
	public Material getMaterial() {
		return Material.IRON_INGOT;
	}

	@Override
	public String getName() {
		return "&aIron Ingot";
	}

	@Override
	public List<String> getLore() {
		return new ALoreBuilder(
				"&7Ingot gathered from the Golems",
				"&7of the Golem Caves",
				"",
				"&5Tainted Item"
		).getLore();
	}
}
