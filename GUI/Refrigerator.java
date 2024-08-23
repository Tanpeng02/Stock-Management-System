

public class Refrigerator extends Product {
	private String doorDesign;
    private String color;
    private int capacity;
    
    //constructor
    public Refrigerator(int itemNumber, String name, int quantity, double price, String doorDesign, String color, int capacity) {
        super(itemNumber, name, quantity, price);
        this.doorDesign = doorDesign;
        this.color = color;
        this.capacity = capacity;
    }
    
    //accessor
    public String getDoorDesign() {
        return doorDesign;
    }

    public String getColor() {
        return color;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    //mutator
    public void setDoorDesign(String doorDesign) {
        this.doorDesign = doorDesign;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
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
		sb.append("Door design: " + this.doorDesign + "\n");
		sb.append("Color: " + this.color + "\n");
		sb.append("Capacity (in Litres): " + this.capacity + "\n");
		sb.append("Quantity available: " + this.getQuantity() + "\n");
		sb.append("Price (RM): " +String.format("%.2f",this.getPrice())  + "\n");
		sb.append("Inventory value (RM):  " + String.format("%.2f",this.StockValue()) + "\n");
		sb.append("Product status: " + (this.getStatus() ? "Active" : "Discontinued")+ "\n");
		return sb.toString();
   
    	
    	        
    }
   


}
