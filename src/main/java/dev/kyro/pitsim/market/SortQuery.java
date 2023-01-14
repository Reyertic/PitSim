package dev.kyro.pitsim.market;

import org.bukkit.ChatColor;
import org.bukkit.Material;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortQuery {

	private final PrimarySortType primarySortType;
	private final ListingFilter listingFilter;
	private final ItemFilter itemFilter;
	private final String sortParameter;
	private final MarketListing[] listings;

	public SortQuery(PrimarySortType primarySortType, ListingFilter listingFilter, ItemFilter itemFilter, String sortParameter) {

		 this.primarySortType = primarySortType;
		 this.listingFilter = listingFilter;
		 this.itemFilter = itemFilter;
		 this.sortParameter = sortParameter;

		 List<MarketListing> sortedListings = getSortedList(primarySortType, listingFilter, itemFilter, sortParameter);
		 listings = new MarketListing[sortedListings.size()];
		 for(int i = 0; i < sortedListings.size(); i++) {
			 listings[i] = sortedListings.get(i);
		 }
	}

	public ListingFilter getSecondarySortTypefromListing(MarketListing listing) {
		if(listing.stackBIN) return ListingFilter.BIN;
		if(listing.startingBid != -1 && listing.binPrice != -1) return ListingFilter.ALL;
		if(listing.startingBid != -1) return ListingFilter.AUCTION;
		return ListingFilter.BIN;
	}

	public List<MarketListing> getSortedList(PrimarySortType primarySortType, ListingFilter listingFilter, ItemFilter itemFilter, String sortParameter) {
		List<MarketListing> sortedList = new ArrayList<>();

		listings:
		for(MarketListing listing : MarketManager.listings) {
			ListingFilter listingType = getSecondarySortTypefromListing(listing);

			if(listingFilter != ListingFilter.ALL && listingType != ListingFilter.ALL) {
				if(listingFilter != listingType) continue;
			}
			if(listing.hasEnded()) continue;

			switch(primarySortType) {
				case PRICE_LOW:
					for(int i = 0; i < sortedList.size(); i++) {
						if(listing.getHighestPrice() < sortedList.get(i).getHighestPrice()) {
							sortedList.add(i, listing);
							continue listings;
						}
					}
					sortedList.add(listing);
					break;
				case PRICE_HIGH:
					for(int i = 0; i < sortedList.size(); i++) {
						if(listing.getHighestPrice() > sortedList.get(i).getHighestPrice()) {
							sortedList.add(i, listing);
							continue listings;
						}
					}
					sortedList.add(listing);
					break;
				case DATE_NEW:
					for(int i = 0; i < sortedList.size(); i++) {
						if(listing.creationTime > sortedList.get(i).creationTime) {
							sortedList.add(i, listing);
							continue listings;
						}
					}
					sortedList.add(listing);
					break;
				case ENDING_SOON:
					for(int i = 0; i < sortedList.size(); i++) {
						if(listing.getTimeRemaining() < sortedList.get(i).getTimeRemaining()) {
							sortedList.add(i, listing);
							continue listings;
						}
					}
					sortedList.add(listing);
					break;
			}
		}

		if(!sortParameter.isEmpty()) {
			sortedList.sort(Comparator.comparing(m -> m.itemData.getItemMeta().getDisplayName()));
			sortedList.sort((m1, m2) -> m1.itemData.getItemMeta().getDisplayName().compareToIgnoreCase(sortParameter));
		}

		return sortedList;
	}

	enum PrimarySortType {
		PRICE_HIGH(Material.GOLD_INGOT, "Highest Price", ChatColor.GOLD),
		PRICE_LOW(Material.GOLD_NUGGET, "Lowest Price", ChatColor.YELLOW),
		DATE_NEW(Material.PAINTING, "Newest", ChatColor.GREEN),
		ENDING_SOON(Material.WATCH, "Ending Soon", ChatColor.BLUE);

		public final Material material;
		public final String displayName;
		public final ChatColor color;
		PrimarySortType(Material material, String displayName, ChatColor color) {
			this.material = material;
			this.displayName = displayName;
			this.color = color;
		}
		public PrimarySortType getNext() {
			for(int i = 0; i < values().length; i++) {
				PrimarySortType type = values()[i];
				if(type == this) {
					if(i == values().length - 1) return values()[0];
					return values()[i + 1];
				}
			}
			return null;
		}
	}

	enum ListingFilter {
		ALL(Material.HOPPER, "All Listings", ChatColor.GREEN),
		AUCTION(Material.GOLD_BARDING, "Auctions", ChatColor.GOLD),
		BIN(Material.NAME_TAG, "Buy It Now", ChatColor.BLUE);

		public final Material material;
		public final String displayName;
		public final ChatColor color;
		ListingFilter(Material material, String displayName, ChatColor color) {
			this.material = material;
			this.displayName = displayName;
			this.color = color;
		}

		public ListingFilter getNext() {
			for(int i = 0; i < values().length; i++) {
				ListingFilter type = values()[i];
				if(type == this) {
					if(i == values().length - 1) return values()[0];
					return values()[i + 1];
				}
			}
			return null;
		}
	}

	enum ItemFilter {
		AUCTION,
		BIN,
		ALL;
	}

	public PrimarySortType getPrimarySortType() {
		return primarySortType;
	}

	public ListingFilter getListingFilter() {
		return listingFilter;
	}

	public ItemFilter getItemFilter() {
		return itemFilter;
	}

	public MarketListing[] getListings() {
		return listings;
	}

	public String getSortParameter() {
		return sortParameter;
	}

}
