package assignment;



public abstract class Product {
	private String name;
    private double price;
    private int quantity;
    private int itemNumber;
    private boolean status = true;
    
    //default constructor
   public Product() {
    }
   
    //parameterized constructor
    public Product(int itemNumber, String name, int quantity, double price) {
        this.itemNumber = itemNumber;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        
    }
   
    //accessor
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public boolean getStatus() {
        return status;
    }

    //mutator
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    //
    public double getTotalInventoryValue() {
        return price * quantity;
    }
    public void addProductQuantity(int number) {
        if (status) {
            this.quantity += number;
        }
    }

    public void deductProductQuantity(int number) {
        if (status && quantity >= number) {
            this.quantity -= number;
        }
    }
    @Override
    public String toString() {
    	 StringBuilder sb = new StringBuilder();
    		sb.append("Item number: " + itemNumber + "\n");
    		sb.append("Product name: " + name + "\n");
    		sb.append("Quantity available: " + quantity + "\n");
    		sb.append("Price (RM): " + String.format("%.2f",price) + "\n");
    		sb.append("Inventory value (RM):  " +String.format("%.2f",this.getTotalInventoryValue())  + "\n");
    		sb.append("Product status: " + (status ? "Active" : "Discontinued")+ "\n");	
    		return sb.toString();
       
    }
   

}


