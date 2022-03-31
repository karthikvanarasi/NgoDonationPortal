package entities;
public class DonationItem {
	private int itemId;
	private String itemDescription;
	DonationType donationType;
	public DonationItem(int itemId, String itemDescription, DonationType donationType) {
		this.itemId = itemId;
		this.itemDescription = itemDescription;
		this.donationType = donationType;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public DonationType getDonationType() {
		return donationType;
	}
	public void setDonationType(DonationType donationType) {
		this.donationType = donationType;
	}
	@Override
	public String toString() {
		return "DonationItem [itemId=" + itemId + ", itemDescription=" + itemDescription + ", donationType="
				+ donationType + "]";
	}
}
