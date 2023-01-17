package dev.kyro.pitsim.aitems.misc;

import de.tr7zw.nbtapi.NBTItem;
import dev.kyro.arcticapi.builders.AItemStackBuilder;
import dev.kyro.arcticapi.builders.ALoreBuilder;
import dev.kyro.pitsim.aitems.PitItem;
import dev.kyro.pitsim.enums.AuctionCategory;
import dev.kyro.pitsim.enums.NBTTag;
import dev.kyro.pitsim.misc.Misc;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaffCookie extends PitItem {

	public StaffCookie() {
		hasDropConfirm = true;
		auctionCategory = AuctionCategory.MISC;
	}

	@Override
	public String getNBTID() {
		return "staff-cookie";
	}

	@Override
	public List<String> getRefNames() {
		return new ArrayList<>(Arrays.asList("staffcookie", "cookie"));
	}

	public Material getMaterial() {
		return Material.COOKIE;
	}

	public String getName() {
		return "&dStaff Cookie";
	}

	public List<String> getLore(ItemStack itemStack) {
		NBTItem nbtItem = new NBTItem(itemStack);
		String giverString = nbtItem.getString(NBTTag.COOKIE_GIVER.getRef());
		String receiverString = nbtItem.getString(NBTTag.COOKIE_RECEIVER.getRef());

		return new ALoreBuilder(
				"&7Given to you by a staff member",
				"&7for some reason",
				"",
				giverString,
				receiverString
		).getLore();
	}

	@Override
	public void updateItem(ItemStack itemStack) {
		itemStack.setType(getMaterial());
		new AItemStackBuilder(itemStack)
				.setName(getName())
				.setLore(getLore(itemStack));
	}

	public ItemStack getItem(Player staff, Player receiver, int amount) {
		ItemStack itemStack = new ItemStack(Material.COOKIE, amount);
		itemStack = buildItem(itemStack);

		NBTItem nbtItem = new NBTItem(itemStack);
		String giverString = "&7From: " + PlaceholderAPI.setPlaceholders(staff,
				"%luckperms_prefix%[%luckperms_groups%] ") + Misc.getDisplayName(staff);
		String receiverString = "&7To: " + PlaceholderAPI.setPlaceholders(receiver,
				"%luckperms_prefix%[%luckperms_groups%] ") + Misc.getDisplayName(receiver);
		nbtItem.setString(NBTTag.COOKIE_GIVER.getRef(), giverString);
		nbtItem.setString(NBTTag.COOKIE_RECEIVER.getRef(), receiverString);
		itemStack = nbtItem.getItem();

		return new AItemStackBuilder(itemStack)
				.setName(getName())
				.setLore(getLore(itemStack))
				.getItemStack();
	}

	@EventHandler
	public void onEat(PlayerItemConsumeEvent event) {
		ItemStack itemStack = event.getItem();
		if(!isThisItem(itemStack)) return;
		event.setCancelled(true);
	}
}
