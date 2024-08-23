
	import java.util.ArrayList;

	import javafx.scene.Scene;
	import javafx.scene.control.Button;
	import javafx.scene.control.Label;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.GridPane;

	public class discontinue {
		 Scene md;
		 Button button = new Button("discontinue");
		 TextField inputField = new TextField();
		
		 Label a = new Label();
		 Label invalid = new Label("Enter a valid number");
		 
		 public discontinue(ArrayList<Product> productList) {
			 
		 }
		 public void set(ArrayList<Product> productList) {

			 GridPane module = new display(productList).getgrid();
			 Label name = new Label("Enter the number.");
			    module.add(name, 0, productList.size() + 1);
			    
			    inputField = new TextField();
			    module.add(inputField, 0, productList.size() + 2);
			    
			   // Label number = new Label("Enter the quantity to deduct.");
			    //module.add(number, 0, productList.size() + 3);
			    
			   
			    invalid.setVisible(false);
			    //invalid2.setVisible(false);
			    
			    // Create and add a button
			    module.add(button, 0, productList.size() + 5);
			    module.add(invalid, 0, productList.size() + 6);
			    //module.add(invalid2, 0, productList.size() + 7);
			    md = new Scene(module, 500, 500);
			 
			 
		 }
		 public Scene getScene() {
	         return md;
	     }
		 public int getint() {
			 return Integer.parseInt(inputField.getText());
		 }

		 public Button getButton() {
	         return button;
	     }
		 public void set() {
	    	 invalid.setVisible(true);
	    }

	    
		 public void set2(){
	    	 invalid.setVisible(false);
	    }

		 public void clear() {
			 inputField.clear();
			 
	    	 
	     }
	}


