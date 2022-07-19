
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String os) {
		super(assetTag, description);
		this.os = os;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
		String output = String.format("%-10s %-30s %-10s %-10s %-20s\n", super.getAssetTag(), super.getDescription(), 
				 super.showAvailability(getIsAvailable())+"", super.getDueDate(), this.getOs());
		return output;
	}
}


