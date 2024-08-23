
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class GUI extends Application {

    private ArrayList<Product> productList;
    int g = 0;
    int k = 0;
    display display;
    add add;
    deduct deduct;
    discontinue discontinue;
    
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
    	productList = new ArrayList<>(); 
    	 displaymenu a  = new displaymenu();
    	 refriscene b = new refriscene();
    	 tvscene t = new tvscene();
    	 maximum c = new maximum();
  	 // Initialize productList
    	 
    	 add =new add(productList);
    	 deduct =new deduct(productList);
    	 discontinue = new discontinue(productList);
    	 
    	 Label label = new Label("Would you like to add more product(s)?");

         // Create an "OK" button
         
    	 Button okButton = new Button("Yes");
    	 Button NoButton = new Button("No");


         // Create a layout and add the label and button to it
         VBox layout = new VBox(10); // Use VBox to stack the label and button vertically with spacing of 10 pixels
         layout.setAlignment(Pos.CENTER);
         layout.getChildren().addAll(label, okButton,NoButton);

         // Create a scene with the layout
          Scene reenter = new Scene(layout, 400, 500);

         

    	 Label instructionLabel = new Label("Select the product type to be added:");
         // Create buttons for refrigerator and TV
         Button refrigeratorButton = new Button("Refrigerator");
         Button tvButton = new Button("TV");
         // Add event handlers for buttons
         refrigeratorButton.setOnAction(e -> addRefrigerator(primaryStage,b.getScene()));
         tvButton.setOnAction(e -> addRefrigerator(primaryStage,t.getScene()));

         
         
         
         // Create VBox to hold components
         VBox vBox1 = new VBox(20);
         vBox1.setAlignment(Pos.CENTER);
         vBox1.getChildren().addAll(instructionLabel, refrigeratorButton, tvButton);
         // Create scene
         Scene scene1 = new Scene(vBox1, 300, 200);
        
         //////////next //////////
    	
         okButton.setOnAction(event -> {
        	 primaryStage.setScene(scene1);
         });
         
         NoButton.setOnAction(event -> {
        	 display= new display(productList);
        	 primaryStage.setScene(a.getScene());
         });
         
        c.getButton().setOnAction(event -> {
     
            String input = c.getnum();
            if (input.matches("\\d+")) {
                int num = Integer.parseInt(input);
                if (num >= 0) {
                    // Call the addProductNum method and display the result in an Alert
                    int result = addProductNum(num);
                 
                    MyData.setNumber(result);
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Result");
                    alert.setHeaderText(null);
                    alert.setContentText("Maximum number of products to store: " + result);
                    alert.showAndWait();
                    primaryStage.setScene(scene1);

                    
                } else {
                    showAlert("Error", "Invalid value entered", "Please enter a non-negative integer.");
                }
            } else {
                showAlert("Error", "Invalid value entered", "Please enter a valid integer.");
            }
        });
       
        // Create a Scene with the VBox as the root
        Label welcomeLabel = new Label("Welcome to the SMS");
		welcomeLabel.setFont(Font.font("Courier",FontWeight.BOLD, FontPosture.REGULAR, 30));
		welcomeLabel.setTextFill(Color.DARKBLUE);
		 LocalDateTime now = LocalDateTime.now();
	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	     String formattedDateTime = now.format(formatter);

        Label inputLabel = new Label("Current date and time: " + formattedDateTime+"\nGroup Member:\nHa Lik Quan\nSim Rui En\nTan Kiong Peng\nTiang Jiun Wei\n\nName (Include first name and surname) :");
        TextField nameField = new TextField();
        Label output = new Label();
        Button submitButton = new Button("Submit");
        
        add.getButton1().setOnAction(e -> {
        	 a.set1();
    		 primaryStage.setScene(a.getScene());
           
        });
        
     
        submitButton.setOnAction(event -> {
           
            MyData UserName = MyData.getInstance();
            UserName.setMyString(nameField.getText());

            
            primaryStage.setScene(c.getScene());
            primaryStage.setTitle("Stock Management");
            primaryStage.show();

            
            // Process the input here
        }); 
        
        
        // Create a VBox to hold the welcome message label and text input components
        VBox inputVBox = new VBox(10, welcomeLabel, inputLabel,nameField, submitButton,output);
        inputVBox.setAlignment(Pos.CENTER);
        
        
        // Create a BorderPane to hold the VBox
        BorderPane root = new BorderPane(inputVBox);
      
        root.setPadding(new Insets(10));

        // Create the scene and set it on the stage
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Stock Management");
        primaryStage.show();

        // Add the UI elements to the VBox
        // Create a Scene with the VBox as the root
       
        b.addButton().setOnAction(e -> {
        	
            // Get input values
            String name = b.getName();
            String doorDesign = b.getDoorDesign();
            String color = b.getColor();
            int capacity = b.getCapacity();
            int quantity = b.getQuantity();
            double price = b.getPrice();
            int itemNumber = b.getItemNumber();

            // Create and add Refrigerator object to productList
            Product refrigerator = new Refrigerator(itemNumber, name, quantity, price, doorDesign, color, capacity);
            productList.add(refrigerator);

            // Clear input fields
           
            k++;
        	System.out.println(k);
        	int num = MyData.getNumber();
        	
            if(k >= num) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Warning");
                alert.setHeaderText(null);
                alert.setContentText("Maximum number of products to store reached\n now will bring you to edit page");
                alert.showAndWait();
                primaryStage.setScene(a.getScene());
             
            }//primaryStage.setScene(a.getScene());
            else
            	primaryStage.setScene(reenter);
            	//primaryStage.setScene(scene1);
            for(int i=0;i<productList.size();i++)
            	System.out.println(i+1 +" "+productList.get(i).getName());
            b.clear();
            
          
            
        });
        t.addButton().setOnAction(e -> {
        	
            // Get input values
            String name = t.getName();
            String doorDesign = t.getDoorDesign();
            String color = t.getColor();
            int capacity = t.getCapacity();
            int quantity = t.getQuantity();
            double price = t.getPrice();
            int itemNumber = t.getItemNumber();

            // Create and add Refrigerator object to productList
            Product tv = new TV(itemNumber, name, quantity, price, doorDesign, color, capacity);
            productList.add(tv);

            // Clear input fields
           
            k++;
        	System.out.println(k);
        	int num = MyData.getNumber();
        	
            if(k >= num) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Warning");
                alert.setHeaderText(null);
                alert.setContentText("Maximum number of products to store reached now will bring u to edit page");
                alert.showAndWait();
                primaryStage.setScene(a.getScene());
             
            }//primaryStage.setScene(a.getScene());
            else
            	primaryStage.setScene(reenter);
            	//primaryStage.setScene(scene1);
            for(int i=0;i<productList.size();i++)
            	System.out.println(i+1 +" "+productList.get(i).getName());
            b.clear();
                     
        });
       
       
       
        a.viewProductsButton().setOnAction(e->{     	
        	a.set();
        	 display= new display(productList);
        	primaryStage.setScene(a.getScene());
        	displayProduct(productList);
        
        });
        a.getAddStockButton().setOnAction(e->{
        	add.set(productList);
        	primaryStage.setScene(add.getScene());        	
        	
        });
       add.getButton().setOnAction(e->{
        	 
        	
        	 if(add.getint() < 0 || add.getint()>productList.size())
        	 {
        		 add.set3();
        		 add.set();
        		 add.set5();
        		 add.clear();
        		 primaryStage.setScene(add.getScene());
        	 }
        	 else if(add.getint1()<0)
        	 {
        		 add.set2();
        		 add.set1();
        		 add.set5();
        		 add.clear();
        		 primaryStage.setScene(add.getScene());
        		 
        	 }
        	 else if(productList.get(add.getint()-1).getStatus() == false)
        	 {
        		 add.set4();
        		 add.set3();
        		 add.set2();
        		 add.clear();
        		 primaryStage.setScene(add.getScene());
        		 
        	 }
        	 else
        	 {   
        		 
        		 productList.get(add.getint()-1).setQuantity(add.getint1()+productList.get(add.getint()-1).getQuantity());
        		 a.set1();
        		 primaryStage.setScene(a.getScene());
        	 }        	       
        });
     	
  
      a.getDeductStockButton().setOnAction(e->{
       	deduct.set(productList);
       	primaryStage.setScene(deduct.getScene());
       	
       	
       });
      deduct.getButton().setOnAction(e->{
       	 
       	
       	 if(deduct.getint() < 0 || deduct.getint()>productList.size())
       	 {
       		 deduct.set3();
       		 deduct.set();
       		 deduct.clear();
       		 primaryStage.setScene(deduct.getScene());
       	 }
       	 else if(deduct.getint1()<0)
       	 {
       		 deduct.set2();
       		 deduct.set1();
       		 deduct.clear();
       		 primaryStage.setScene(deduct.getScene());
       		 
       	 }
       	 else
       	 {        		
       		 productList.get(deduct.getint()-1).setQuantity(-deduct.getint1()+productList.get(deduct.getint()-1).getQuantity());
       		 a.set1();
       		 primaryStage.setScene(a.getScene());
       	 }
       	      
       });
   	
      
        a.getDiscontinueProductButton().setOnAction(e->{
           	discontinue.set(productList);
           	primaryStage.setScene(discontinue.getScene());
           	
           	
           });
          discontinue.getButton().setOnAction(e->{
           	 
           	
           	 if(discontinue.getint() < 0 || discontinue.getint()>productList.size())
           	 {
           		
           		 discontinue.set();
           		 discontinue.clear();
           		 primaryStage.setScene(discontinue.getScene());
           	 }

           	 else
           	 {        		
           		 productList.get(discontinue.getint()-1).setStatus(false);
           		 a.set1();
           		 primaryStage.setScene(a.getScene());
           	 }
           	
           
           });

        
      a.getExitButton().setOnAction(e->{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Result");
            alert.setHeaderText(null);
            String UserName = MyData.getMyString();
            alert.setContentText("Thank for using the program "+ UserName );
            alert.showAndWait();
        	primaryStage.close();
        	
        	
        });  
    }


	private void addRefrigerator(Stage primaryStage,Scene scene2) {
        // Code for adding a refrigerator to the product list
        // Replace with your own implementation
        System.out.println("Adding a refrigerator");
        primaryStage.setScene(scene2);
    }

    public int addProductNum(int num) {
        // Implementation of the addProductNum method
        // You can replace this with your own logic
        // Here, we simply return the input value
        return num;
    }

    public void showAlert(String title, String header, String content) {
        // Helper method to show an Alert
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
    
    public static void displayProduct(ArrayList<Product> list)
	{
    	System.out.println("Display");
		for(int i=0;i<list.size();i++) {
			System.out.println();
			System.out.print(list.get(i));
		}
		System.out.println();		
	}    
  
}
