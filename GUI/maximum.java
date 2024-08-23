import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class maximum{
	
	Scene scene;
	Button submitButton;
	TextField inputField;
	
	public maximum()
	{
		Label promptLabel = new Label("Enter maximum number of products to store:");

	    // Create a TextField for user input
	    inputField = new TextField();
	    inputField.setPromptText("Enter a positive integer");

	    // Create a Button for submitting the input
	    submitButton = new Button("Submit");

	    VBox vbox = new VBox(10);
	    vbox.setAlignment(Pos.CENTER);
	    vbox.getChildren().addAll(promptLabel, inputField, submitButton);

	    // Create a Scene with the VBox as the root
	    scene = new Scene(vbox, 300, 200);
	}
	 public Scene getScene() {
         return scene;
     }

     public Button getButton() {
         return submitButton;

     }
     public String getnum() {
         return inputField.getText();
     }
}
