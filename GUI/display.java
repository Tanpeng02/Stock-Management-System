import java.util.ArrayList;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class display {
	
	
	TextField inputField;
	Button button;
	GridPane gridPane = new GridPane();;
    public display(ArrayList<Product> productList) {
    	Label nameLabel = new Label("Sequence");
        Label priceLabel = new Label("Product name");
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(priceLabel, 1, 0);
        // Add product data to the grid pane
        for (int i = 0; i < productList.size(); i++) {
            Product product = productList.get(i);
            Label name = new Label(product.getName());
            Label price = new Label(String.valueOf(i + 1));
            // Assuming Product has a getPrice() method to retrieve the price
            gridPane.add(price, 0, i + 1);
            gridPane.add(name, 1, i + 1);
        }

        /*inputField = new TextField();
        gridPane.add(inputField, 0, productList.size() + 1);

        // Create and add a button
        Button button = new Button("Submit!");
       
        gridPane.add(button, 1, productList.size() + 1);*/

        
    }

    
    public GridPane getgrid(){
    	return gridPane;
    }

    
    public Button getButton() {
        return button;
    }
}
	
