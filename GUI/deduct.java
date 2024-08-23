
	import java.util.ArrayList;

	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.GridPane;

	public class deduct {
		 Scene md;
		 Button button = new Button("deduct");
		 TextField inputField = new TextField();
		 TextField inputField2 = new TextField();
		 Label a = new Label();
		 Label invalid = new Label("Enter a valid number");
		 Label invalid2 = new Label("Enter a valid quantity");
		 public deduct(ArrayList<Product> productList) {

			 /*GridPane module = new display(productList).getgrid();
	    	 
	         module.add(inputField, 0, productList.size() + 1);

	         // Create and add a button
	         //Button button = new Button("Add");
	        
	         module.add(button, 1, productList.size() + 1);
	         md = new Scene(module, 300, 200);*/
			 
			 
		 }
		 public void set(ArrayList<Product> productList) {

			 GridPane module = new display(productList).getgrid();
			 Label name = new Label("Enter the number.");
			    module.add(name, 0, productList.size() + 1);
			    
			    inputField = new TextField();
			    module.add(inputField, 0, productList.size() + 2);
			    
			    Label number = new Label("Enter the quantity to deduct.");
			    module.add(number, 0, productList.size() + 3);
			    
			    inputField2 = new TextField();
			    module.add(inputField2, 0, productList.size() + 4);
			    invalid.setVisible(false);
			    invalid2.setVisible(false);
			    
			    // Create and add a button
			    module.add(button, 0, productList.size() + 5);
			    module.add(invalid, 0, productList.size() + 6);
			    module.add(invalid2, 0, productList.size() + 7);
			    md = new Scene(module, 500, 500);
			 
			 
		 }
		 public Scene getScene() {
	         return md;
	     }
		 public int getint() {
			 return Integer.parseInt(inputField.getText());
		 }
		 public int getint1() {
			 return Integer.parseInt(inputField2.getText());
		 }
		 public Button getButton() {
	         return button;
	     }
		 public void set() {
	    	 invalid.setVisible(true);
	    }
		 public void set1() {
	    	 invalid2.setVisible(true);
	    }
		 public void set2(){
	    	 invalid.setVisible(false);
	    }
		 public void set3(){
	    	 invalid2.setVisible(false);
	    }
		 public void clear() {
			 inputField.clear();
			 inputField2.clear();
	    	 
	     }
	}


