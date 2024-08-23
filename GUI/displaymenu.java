import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class displaymenu{
	
	        private Scene scene;
	        Button viewProductsButton = new Button("View Products"); 
            Button addStockButton = new Button("Add Stock");
            Button deductStockButton= new Button("Deduct Stock"); 
            Button discontinueProductButton= new Button("Discontinue Product"); 
            Button exitButton=new Button("Exit");
            Label a = new Label("Has shown in terminal");
	        public displaymenu() {
	        	Label titleLabel = new Label("Stock Management");	             
	            a.setVisible(false);
	            VBox layout = new VBox(10);
	            layout.setPadding(new Insets(10));
	            layout.setAlignment(Pos.CENTER);
	            layout.getChildren().addAll(
	                    titleLabel, viewProductsButton, addStockButton,
	                    deductStockButton, discontinueProductButton, exitButton,a);

	             scene = new Scene(layout, 400, 400);
	        }

	        public Scene getScene() {
	            return scene;
	        }

	        public Button viewProductsButton() {
	            return viewProductsButton;
	    }
	        public Button getViewProductsButton() {
	            return viewProductsButton;
	        }

	        // Accessor methods for addStockButton
	        public Button getAddStockButton() {
	            return addStockButton;
	        }

	        // Accessor methods for deductStockButton
	        public Button getDeductStockButton() {
	            return deductStockButton;
	        }

	        // Accessor methods for discontinueProductButton
	        public Button getDiscontinueProductButton() {
	            return discontinueProductButton;
	        }

	        // Accessor methods for exitButton
	        public Button getExitButton() {
	            return exitButton;
	        }
	        public void set() {
	        	 a.setVisible(true);
	        }
	        public void set1() {
	        	 a.setVisible(false);
	        }
}