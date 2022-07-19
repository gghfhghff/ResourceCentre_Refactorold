
public class Camcorder extends Item{
	private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
		String output = String.format("%-10s %-30s %-10s %-10s %-20d\n", super.getAssetTag(), super.getDescription(), 
				 super.showAvailability(getIsAvailable())+"", super.getDueDate(), this.getOpticalZoom());
		return output;
	}
}

