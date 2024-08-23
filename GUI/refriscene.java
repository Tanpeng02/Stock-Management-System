import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class refriscene {
	 private Scene scene;
	 Button addButton;
	 TextField nameTextField;
	 TextField doorDesignTextField;
	 TextField colorTextField;
	 TextField capacityTextField ;
	 TextField quantityTextField;
	 TextField priceTextField;
	 TextField itemNumberTextField;
	 
     public refriscene() {
    	 
    	 Label nameLabel = new Label("Name:");
         nameTextField = new TextField(); // Removed the local variable declaration
         Label doorDesignLabel = new Label("Door Design:");
         doorDesignTextField = new TextField(); // Removed the local variable declaration
         Label colorLabel = new Label("Color:");
         colorTextField = new TextField(); // Removed the local variable declaration
         Label capacityLabel = new Label("Capacity:");
         capacityTextField = new TextField(); // Removed the local variable declaration
         Label quantityLabel = new Label("Quantity:");
         quantityTextField = new TextField(); // Removed the local variable declaration
         Label priceLabel = new Label("Price:");
         priceTextField = new TextField(); // Removed the local variable declaration
         Label itemNumberLabel = new Label("Item Number:");
         itemNumberTextField = new TextField(); // Removed the local variable declaration
         addButton = new Button("Add"); // Removed the local variable declaration
         GridPane formLayout = new GridPane();
         formLayout.setPadding(new Insets(10));
         formLayout.setVgap(10);
         formLayout.setHgap(10);
         formLayout.setAlignment(Pos.CENTER);
         formLayout.add(nameLabel, 0, 0);
         formLayout.add(nameTextField, 1, 0);
         formLayout.add(doorDesignLabel, 0, 1);
         formLayout.add(doorDesignTextField, 1, 1);
         formLayout.add(colorLabel, 0, 2);
         formLayout.add(colorTextField, 1, 2);
         formLayout.add(capacityLabel, 0, 3);
         formLayout.add(capacityTextField, 1, 3);
         formLayout.add(quantityLabel, 0, 4);
         formLayout.add(quantityTextField, 1, 4);
         formLayout.add(priceLabel, 0, 5);
         formLayout.add(priceTextField, 1, 5);
         formLayout.add(itemNumberLabel, 0, 6);
         formLayout.add(itemNumberTextField, 1, 6);
         formLayout.add(addButton, 1, 7);
         scene = new Scene(formLayout, 400, 400);

     	
     }
     public Scene getScene() {
         return scene;
     }
     
     public Button addButton() {
         return addButton;
     }
     public String getName() {
         return nameTextField.getText();
     }

     public String getDoorDesign() {
         return doorDesignTextField.getText();
     }

     public String getColor() {
         return colorTextField.getText();
     }

     public int getCapacity() {
         return Integer.parseInt(capacityTextField.getText());
     }

     public int getQuantity() {
         return Integer.parseInt(quantityTextField.getText());
     }

     public double getPrice() {
         return Double.parseDouble(priceTextField.getText());
     }

     public int getItemNumber() {
         return Integer.parseInt(itemNumberTextField.getText());
     }
     public void clear() {
    	 nameTextField.clear();
    	 doorDesignTextField.clear();
    	  colorTextField.clear();
    	 capacityTextField.clear() ;
    	 quantityTextField.clear();
    	  priceTextField.clear();
    	 itemNumberTextField.clear();
     }

}
