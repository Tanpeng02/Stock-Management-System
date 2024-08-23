package assignment;

public class Fan extends Product {
	 
		private String Color;
		private String BladeDesign;
		private int Num_Of_Blade;
		
		//Constructor
		public Fan(int itemNumber, String name, int quantity, double price,String Color, String BladeDesign, int Num_Of_Blade) {
			super(itemNumber, name, quantity, price);
			this.Color = Color;
	        this.BladeDesign = BladeDesign;
	        this.Num_Of_Blade = Num_Of_Blade;
		}
		
		//accessor
		public String getColor() {
	        return this.Color;
	    }

	    // Mutator (setter) method for "BladeDesign" attribute
	    public void setBladeDesign(String bladeDesign) {
	        this.BladeDesign = bladeDesign;
	    }

	    // Accessor (getter) method for "BladeDesign" attribute
	    public String getBladeDesign() {
	        return this.BladeDesign;
	    }

	    // Mutator (setter) method for "Num_Of_Blade" attribute
	    public void setNumOfBlade(int numOfBlade) {
	        this.Num_Of_Blade = numOfBlade;
	    }

	    // Accessor (getter) method for "Num_Of_Blade" attribute
	    public int getNumOfBlade() {
	        return this.Num_Of_Blade;
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
			sb.append("Color: " + this.Color + "\n");
			sb.append("BladeDesign: " + this.BladeDesign + "\n");
			sb.append("Num_Of_Blade " + this.Num_Of_Blade + "\n");
			sb.append("Quantity available: " + this.getQuantity() + "\n");
			sb.append("Price (RM): " + String.format("%.2f",this.getPrice()) + "\n");
			sb.append("Inventory value (RM): "+ String.format("%.2f",this.StockValue())+ "\n");
			sb.append("Product status: " + (this.getStatus() ? "Active" : "Discontinued")+ "\n");
			return sb.toString();


	}
	}



