

public class TV extends Product {
	private String screenType;
	private String resolution;
	private int displaySize;
	
	//Constructor
	public TV(int itemNumber, String name, int quantity, double price,String screenType, String resolution, int displaySize) {
		super(itemNumber, name, quantity, price);
		this.screenType = screenType;
        this.resolution = resolution;
        this.displaySize = displaySize;
	}
	
	//accessor
	public String getScreenType() {
        return screenType;
    }
	
	public String getResolution() {
        return resolution;
    }
	
	public int getDisplaySize() {
	        return displaySize;
	}
	
	//mutator
    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }
    
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }
    //
    public double StockValue() {
        return super.getTotalInventoryValue();
     }
    
    @Override
    public String toString() {
    	StringBuilder sb = new StringBuilder();
		sb.append("Item number: " + this.getItemNumber() + "\n");
		sb.append("Product name: " + this.getName() + "\n");
		sb.append("Screen Type: " + this.screenType + "\n");
		sb.append("Resolution: " + this.resolution + "\n");
		sb.append("Display size: " + this.displaySize + "\n");
		sb.append("Quantity available: " + this.getQuantity() + "\n");
		sb.append("Price (RM): " + String.format("%.2f",this.getPrice()) + "\n");
		sb.append("Inventory value (RM): "+ String.format("%.2f",this.StockValue())+ "\n");
		sb.append("Product status: " + (this.getStatus() ? "Active" : "Discontinued")+ "\n");
		return sb.toString();


}
}
