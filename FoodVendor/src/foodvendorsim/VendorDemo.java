package foodvendorsim;

import java.math.BigDecimal;

import javax.swing.JPanel;
import javax.swing.JFrame;

public class VendorDemo {

	
	
	
	public static void main(String[] args) throws NullException {
		// TODO Auto-generated method stub
		LinkedList<String> Bevs = new LinkedList<String>();
		LinkedList<String> Apptez = new LinkedList<String>();
		LinkedList<String> Soups = new LinkedList<String>();
		LinkedList<String> Ent = new LinkedList<String>();
		LinkedList<String> CS = new LinkedList<String>();
		CategoryList<String>cList = new CategoryList<String>();
		CategoryList<String>test = new CategoryList<String>();
		
		Object result;
		//Appetizers
		FoodItem frenchFries = new FoodItem("French Fries", new BigDecimal(3.95),100,"Fries Potato Slices","Medium",true);
		FoodItem bread = new FoodItem("Bread", new BigDecimal(3.00), 100, "fluffy food made from yeast", "Medium", true);
		FoodItem Chips = new FoodItem("Chips", new BigDecimal(2.25), 200, "Made from the richest grains", "Large", true);
		FoodItem CheeseSticks = new FoodItem("CheeseSticks", new BigDecimal(2.25), 100, "Delcious bread filled with cheese", "Large", false);
		//Beverages
		FoodItem Coca_Cola = new FoodItem("Coca-Cola", new BigDecimal(1.75), 100, "A classic delcious drink", "Medium", true);
		FoodItem Water = new FoodItem("Water", new BigDecimal(1.25), 100, "Gathered from the richest springs", "Large", true);
		FoodItem Sprite = new FoodItem("Sprite", new BigDecimal(1.75), 100, "Made from the richest grains", "Medium", true);
		FoodItem Orange_Juice = new FoodItem("Orange Juice", new BigDecimal(1.50), 100, "Natural organically made from real oranges", "Large", true);
		//soups
		FoodItem Vegetable_Soup = new FoodItem("Vegetable Soup", new BigDecimal(2.75), 100, "Made by vegetables such as lettuce,potatoes, and onion", "Large", false);
		FoodItem Chicken_Soup = new FoodItem("Chicken Soup", new BigDecimal(2.75), 100, "A chicken and noodle soup", "Large", true);
		FoodItem Noodle_Soup = new FoodItem("Noodle Soup", new BigDecimal(2.75), 100, "Just used by noodles to make", "Large", true);
		//Entrees
		FoodItem Chicken_Breasts = new FoodItem("Chicken Breasts", new BigDecimal(4.25), 200, "Tender delcious chicken breasts", "Medium", true);
		FoodItem Peppers = new FoodItem("Peppers", new BigDecimal(3.25), 200, "Spicky peppers all the way from Peru", "Medium", false);
		FoodItem Pork_Chops = new FoodItem("Pork Chops", new BigDecimal(4.25), 200, "Cut from the pigs, the most delcious slender chops ever", "Large", true);
		FoodItem Salmon = new FoodItem("Salmon", new BigDecimal(4.50), 200, "Fish  that is absolutely to die for", "Large", true);
		//Chef Specials
		FoodItem Prime_rib = new FoodItem("Prime rib", new BigDecimal(5.25), 200, "Neatly cut and trimmed", "Large", true);
		FoodItem Steak = new FoodItem("Steak", new BigDecimal(4.25), 100, "Best steak in the world", "Large", false);
		FoodItem Pork = new FoodItem("Pork", new BigDecimal(3.25), 100, "From pigs, most delicious pork ever", "Large", false);
		
		
		//Appetizers link list
		Apptez.add("Bread");
		Apptez.add("Chips");
		Apptez.add("Cheesesticks");
		
		
		
		//Beverages link list
		Bevs.add("Coca-Cola");
		Bevs.add("Water");
		Bevs.add("Sprite");
		Bevs.add("Orange Juice");
		
		//Soups link list
		Soups.add("Vegatable Soup");
		Soups.add("Chicken Soup");
		Soups.add("Noodle Soup");
		
		//Entree link list
		Ent.add("Chicken Breasts");
		Ent.add("Peppers");
		Ent.add("Pork Chops");
		Ent.add("Salmon");
		
		//Chef Specials
		CS.add("Prime Ribs");
		CS.add("Steak");
		CS.add("Pork");
		
		//Category link list
		cList.add("Beverages");
		cList.add("Soups");
		cList.add("Chef Specials");
		cList.add("Entrees");
		cList.add("Appetizers");
		
		
		System.out.println(Apptez);
		System.out.println(Bevs);
		System.out.println(Bevs.contains("Coca-Cola"));
		System.out.println(Bevs.contains("Sprite"));
		

		System.out.println("POP:" + ((LinkedListNode)Bevs.pop()).getElement());
		System.out.println();
		System.out.println(cList);
		
		System.out.println(Bevs);
		
		
		
		
		new WriteBinaryFile("food.dat",frenchFries); 
		ReadBinaryFile rbf = new ReadBinaryFile("food.dat");
		new WriteBinaryFile("food1.dat", bread);
		ReadBinaryFile rbc = new ReadBinaryFile("food1.dat");
		System.out.println(((FoodItem)rbf.getReadItem()));
		System.out.println(((FoodItem)rbc.getReadItem()));
		
		
		new WriteBinaryFile("food2.dat",Chips); 
		ReadBinaryFile rbf1 = new ReadBinaryFile("food2.dat");
		System.out.println(((FoodItem)rbf1.getReadItem()));
		
		new WriteBinaryFile("food3.dat",CheeseSticks); 
		ReadBinaryFile rbf2 = new ReadBinaryFile("food3.dat");
		System.out.println(((FoodItem)rbf2.getReadItem()));
		
		new WriteBinaryFile("food4.dat",Coca_Cola); 
		ReadBinaryFile rbf3 = new ReadBinaryFile("food4.dat");
		System.out.println(((FoodItem)rbf3.getReadItem()));
		
		new WriteBinaryFile("food5.dat",Water); 
		ReadBinaryFile rbf4 = new ReadBinaryFile("food5.dat");
		System.out.println(((FoodItem)rbf4.getReadItem()));
		
		new WriteBinaryFile("food6.dat",Sprite); 
		ReadBinaryFile rbf5 = new ReadBinaryFile("food6.dat");
		System.out.println(((FoodItem)rbf5.getReadItem()));
		
		new WriteBinaryFile("food7.dat",Orange_Juice); 
		ReadBinaryFile rbf6 = new ReadBinaryFile("food7.dat");
		System.out.println(((FoodItem)rbf6.getReadItem()));
		
		new WriteBinaryFile("food8.dat",Vegetable_Soup); 
		ReadBinaryFile rbf7 = new ReadBinaryFile("food8.dat");
		System.out.println(((FoodItem)rbf7.getReadItem()));
		
		new WriteBinaryFile("food9.dat",Chicken_Soup); 
		ReadBinaryFile rbf8 = new ReadBinaryFile("food9.dat");
		System.out.println(((FoodItem)rbf8.getReadItem()));
		
		new WriteBinaryFile("food10.dat",Noodle_Soup); 
		ReadBinaryFile rbf9 = new ReadBinaryFile("food10.dat");
		System.out.println(((FoodItem)rbf9.getReadItem()));
		
		new WriteBinaryFile("food11.dat",Chicken_Breasts); 
		ReadBinaryFile rbf10 = new ReadBinaryFile("food11.dat");
		System.out.println(((FoodItem)rbf10.getReadItem()));
		
		new WriteBinaryFile("food12.dat",Peppers); 
		ReadBinaryFile rbf11 = new ReadBinaryFile("food12.dat");
		System.out.println(((FoodItem)rbf11.getReadItem()));
		
		new WriteBinaryFile("food13.dat",Pork_Chops); 
		ReadBinaryFile rbf12 = new ReadBinaryFile("food13.dat");
		System.out.println(((FoodItem)rbf12.getReadItem()));
		
		new WriteBinaryFile("food14.dat",Salmon); 
		ReadBinaryFile rbf13 = new ReadBinaryFile("food14.dat");
		System.out.println(((FoodItem)rbf13.getReadItem()));
		
		new WriteBinaryFile("food15.dat",Prime_rib); 
		ReadBinaryFile rbf14 = new ReadBinaryFile("food15.dat");
		System.out.println(((FoodItem)rbf14.getReadItem()));
		
		new WriteBinaryFile("food16.dat",Steak); 
		ReadBinaryFile rbf15 = new ReadBinaryFile("food16.dat");
		System.out.println(((FoodItem)rbf15.getReadItem()));
		
		new WriteBinaryFile("food17.dat",Pork); 
		ReadBinaryFile rbf16 = new ReadBinaryFile("food17.dat");
		System.out.println(((FoodItem)rbf16.getReadItem()));
	
			
	
		//new ExcelBrowserFrame(); 
		
		if(cList.contains("Beverages")){
			System.out.println("Beverages: ");	
			System.out.println(Bevs);
		}
		
		if(cList.contains("Appetizers")){
			System.out.println("Appetizers: ");	
			System.out.println(Apptez);
		}
		
		if(cList.contains("Soups")){
			System.out.println("Soups: ");	
			System.out.println(Soups);
		}
		
		if(cList.contains("Chef Specials")){
			System.out.println("Chef Specials:");
			System.out.println(CS);
		}
		
		if(cList.contains("Entrees")){
			System.out.println("Entrees:");
			System.out.println(Ent);
		}
		
	
		//button frame gui
		
		ButtonFrame bFrame = new ButtonFrame();
		
		bFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bFrame.setSize(800,650);
		bFrame.setVisible(true);
		
		

	}
}
