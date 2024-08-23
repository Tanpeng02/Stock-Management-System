package assignment;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class StockManagement {
	public static int addProductNum(Scanner sc)
	{
		int num;
		System.out.print("Maximum number of products to store");
		 num =readInteger(sc);
		while(num<0) {
			System.out.println("Invalid value entered.");
			System.out.print("Maximum number of products to store:");
			 num =readInteger(sc);
		}
		return num;
		
	}
	
	public static int updateProduct(ArrayList<Product> list,Scanner sc)
	{
		for(int i=0;i<list.size();i++)System.out.println(i+1 +" "+list.get(i).getName());
		int num = 0;
		do
		{
			System.out.print("Enter the index number of product to be updated:");
			num = sc.nextInt();
		}while(num<=0 || num>list.size());
		
		return (num -1);
		
	}
	public static int displayMenu(Scanner sc)
	{
		
		int i;
		System.out.println();
		System.out.println("1. View products");
		System.out.println("2. Add stock");
		System.out.println("3. Deduct stock");
		System.out.println("4. Discontinue product");
		System.out.println("0. Exit");
		System.out.print("Please enter a menu option: ");
		i = sc.nextInt();
		while(i<0||i>4) 
		{
			System.out.print("Invalid value entered. Please enter a menu option: ");
			i = sc.nextInt();
		}
		return i;
	}
	
	public static void addStock(ArrayList<Product> list,Scanner sc)
	{
		int x=0;
		int index = updateProduct(list, sc);
		System.out.println("Enter the number of stocks to add for "+list.get(index).getName()+":");
		x=sc.nextInt();
		while(x<0)
		{
			System.out.println("Invalid value entered. Enter the number of stocks to add for "+list.get(index).getName()+":");
			x=sc.nextInt();
		}
		if(list.get(index).getStatus())
			list.get(index).addProductQuantity(x);
		else
			System.out.println("The product has been discountinued");

		execute(displayMenu(sc),list,sc);
		
	}
	
	public static void deductStock(ArrayList<Product> list,Scanner sc)
	{
		int x=0;
		int index = updateProduct(list, sc);
		System.out.println("Enter the number of stocks to deduct for "+list.get(index).getName()+":");
		x=sc.nextInt();
		while(x<0||x>list.get(index).getQuantity())
		{
			System.out.println("Invalid value entered. Enter the number of stocks to deduct for "+list.get(index).getName()+":");
			x=sc.nextInt();
		}
		list.get(index).deductProductQuantity(x);
	
		
		execute(displayMenu(sc),list,sc);
		
	}
	
	public static void discontinueProduct(ArrayList<Product> list,Scanner sc)
	{
		
		int index = updateProduct(list, sc);
		list.get(index).setStatus(false);
		execute(displayMenu(sc),list,sc);
		
		
	}
	
	public static void execute(int menuChoice,ArrayList<Product> list,Scanner sc)
	{
		switch(menuChoice) {
		case 1:
			displayProduct(list);
			System.out.print("\nPress enter to continue");
			sc.nextLine();
			sc.nextLine();
			execute(displayMenu(sc),list,sc);
			break;
		case 2:
			addStock(list,sc);
			break;
		case 3:
			deductStock(list,sc);
			break;
		case 4:
			discontinueProduct(list,sc);
			break;
		default: 
	    	break;
		}
	}
	
	public static void addProduct(ArrayList<Product> list, Scanner sc)
	{
		
		int y = addProductNum(sc);
		int z = 0;
		do {
			int x;
			System.out.println("");
			System.out.println("Menu:");
			System.out.println("1. Refrigerator");
			System.out.println("2. TV");
			System.out.println("3. Fan");
			System.out.print("Select the product type to be added:");
			 x =readInteger(sc);
			
			while(x<1||x>3)
			{
				System.out.println("Only number 1 to 3 allowed!");
				System.out.print("Select the product type to be added(Refrigerator-1,TV-2,Fan-3):");
				x =readInteger(sc);
				
			}
			if(x==1)
				addRefrigerator(list,sc);
			else if(x==2)
				addTV(list,sc);
			else
				addFan(list,sc);
			z++;
			if(z < y) 
			{
				System.out.print("Would you like to add more product(s)?(yes-1,no-0)");
				
				sc.nextLine();
				x =readInteger(sc);
				
				while(x<0||x>1)
				{
					System.out.println("Only number 0 or 1 allowed!");
					System.out.print("Would you like to add more product(s)?(yes-1,no-0)");
					x =readInteger(sc);
				
				}
				if(x == 0)
					
					break;
			}
		}while(z < y);
		if(z == y)
				
				System.out.println("Maximum number of products to be stored reached.");
	}
	public static void addRefrigerator(ArrayList<Product> list,Scanner sc)
	{
		String name;
		String doorDesign;
		String color;
		int capacity;
	    double price;
	    int quantity;
	    int itemNumber;
	    
		System.out.println("Name of the Refrigerator:");
		name=sc.nextLine();
		System.out.println("Door design of the Refrigerator:");
		doorDesign=sc.nextLine();
		System.out.println("Color of the Refrigerator:");
		color=sc.nextLine();
		System.out.println("Capacity of the Refrigerator:");
		capacity=sc.nextInt();
		System.out.println("Quantity available in stock(Refrigerator):");
		quantity=sc.nextInt();
		System.out.println("Price of the Refrigerator:");
		price=sc.nextDouble();

		System.out.println("Item number of the Refrigerator:");
		itemNumber=sc.nextInt();
		Product refrigerator=new Refrigerator(itemNumber,name,quantity,price,doorDesign,color,capacity);
		list.add(refrigerator);
	}
	public static void addTV(ArrayList<Product> list,Scanner sc)
	{
		String name;
		String screenType;
		String resolution;
		int displaySize;
	    double price;
	    int quantity;
	    int itemNumber;
		System.out.println("Name of the TV:");
		name=sc.nextLine();
		System.out.println("Screen type of the TV:");
		screenType=sc.nextLine();
		System.out.println("Resolution of the TV:");
		resolution=sc.nextLine();
		System.out.println("Display size of the TV:");
		displaySize=sc.nextInt();
		System.out.println("Quantity available in stock(TV):");
		quantity=sc.nextInt();
		System.out.println("Price of the TV:");
		price=sc.nextDouble();
		System.out.println("Item number of the TV:");
		itemNumber=sc.nextInt();
		
		Product tv=new TV(itemNumber,name,quantity,price,screenType,resolution,displaySize);
		list.add(tv);
	}
	
	public static void addFan(ArrayList<Product> list,Scanner sc)
	{
		String name;
		String Color;
		String BladeDesign;
		int Num_Of_Blade;
		double price;
	    int quantity;
	    int itemNumber;
	    
	    System.out.println("Name of the Fan:");
		//sc.nextLine();
		name=sc.nextLine();
		System.out.println("Color of the Fan:");
		Color=sc.nextLine();
		System.out.println("Blade Design of the Fan:");
		BladeDesign=sc.nextLine();
		System.out.println("Number of Blade of the Fan:");
		Num_Of_Blade=sc.nextInt();
		System.out.println("Quantity available in stock(Fan):");
		quantity=sc.nextInt();
		System.out.println("Price of the Fan:");
		price=sc.nextDouble();
		System.out.println("Item number of the Fan:");
		itemNumber=sc.nextInt();
		
		Product fan=new Fan(itemNumber,name,quantity,price,Color,BladeDesign,Num_Of_Blade);
		list.add(fan);
	}
	public static void displayProduct(ArrayList<Product> list)
	{
		for(int i=0;i<list.size();i++) {
			System.out.println();
			System.out.print(list.get(i));
		}
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to the SMS");
		 LocalDateTime now = LocalDateTime.now();
	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	     String formattedDateTime = now.format(formatter);
	     System.out.println("Current date and time: " + formattedDateTime);
	     System.out.println("Group Member:");
	     System.out.println("Ha Lik Quan");
	     System.out.println("Sim Rui En");
	     System.out.println("Tan Kiong Peng");
	     System.out.println("Tiang Jiun Wei");
	     
	     UserInfo user=new UserInfo();
	     user.enterName();
	     
	     int choice=0;
	     Scanner sc = new Scanner(System.in);
	     ArrayList<Product> list=new ArrayList<Product>();
	     System.out.print("Would you like to add product(s)?(yes-1,no-0)");
	     choice =readInteger(sc);
	     while(choice<0||choice>1)
	     {
	    	 System.out.println("Invalid value entered.");
	    	 System.out.print("Would you like to add product(s)?(yes-1,no-0)");
	    	 choice =readInteger(sc);
	     }
	     if(choice==1)
	     {
	    	 addProduct(list,sc);
	     }
	     else
	     {
	    	 System.out.println(user.getName()+"("+user.getUserID()+")"+". Thank you for using the program!");
	    	 sc.close();
	    	 System.exit(0);
	     }
	    execute(displayMenu(sc),list,sc);
	    System.out.println(user.getName()+"("+user.getUserID()+")"+". Thank you for using the program!");
	    sc.close();
   	    System.exit(0);
	}
	
	public static int readInteger(Scanner sc) {
	    int b = 0;
	    boolean done = false;
	    while (!done) {
	        System.out.println(" (Enter an Integer):");
	        String str = sc.nextLine();
	        try {
	            b = Integer.parseInt(str);
	            done = true;
	        } catch (NumberFormatException e) {
	            System.out.print("Not an integer");
	        }
	    }
	    return b;
	}

	
}
