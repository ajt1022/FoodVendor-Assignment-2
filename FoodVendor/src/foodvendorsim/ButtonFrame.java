package foodvendorsim;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.math.BigDecimal;

public class ButtonFrame extends JFrame {
	
	private JButton CategoryButton, BeveragesButton, AddButton, DeleteButton, SearchButton, AppetizersButton, SoupsButton, ChefSpecialsButton, EntreesButton, SaveButton; //category button
	private JTextField FoodName, Price, Quantity, Description, Size, SpecialOrder, Search;
	String response, text;
	int amount;
	CategoryList<String>cList = new CategoryList<String>();
	LinkedList<String> Bevs = new LinkedList<String>();
	private JPanel FV;
	FoodItem Food = new FoodItem();
	public BigDecimal p;
	public double pri;
	public ButtonFrame(){
		super("Food Vendor");//title for window
		setLayout(new FlowLayout());//set frame layout
		
		FV = new JPanel();
		FV.setBackground(Color.BLUE);
		add(FV, BorderLayout.CENTER);
		
		
		cList.add("Beverages");
		cList.add("Soups");
		cList.add("Chef Specials");
		cList.add("Entrees");
		cList.add("Appetizers");
		
		
		
		//Icon C = new ImageIcon(getClass().getResource("category.gif"));
		
		CategoryButton = new JButton("Category");//sets button name
		add(CategoryButton);
		
		
		AddButton = new JButton("Add");
		add(AddButton);
		
		DeleteButton = new JButton("Delete");
		add(DeleteButton);
		
		SearchButton = new JButton("Search");
		add(SearchButton);
		
		SaveButton = new JButton("Save");
		add(SaveButton);
		
		CategoryHandler handler = new CategoryHandler();
		CategoryButton.addActionListener(handler);
		SearchHandler SH = new SearchHandler();
		SearchButton.addActionListener(SH);
		AddHandler AH = new AddHandler();
		AddButton.addActionListener(AH);
		DeleteHandler DH = new DeleteHandler();
		DeleteButton.addActionListener(DH);
		SaveHandler SAH = new SaveHandler();
		SaveButton.addActionListener(SAH);
		
		
		//the categories
		
		/*BeveragesHandler BH = new BeveragesHandler();
		BeveragesButton.addActionListener(BH);
		AppetizersHandler APPH = new AppetizersHandler();
		AppetizersButton.addActionListener(APPH);
		SoupsHandler SOUH = new SoupsHandler();
		SoupsButton.addActionListener(SOUH);
		ChefSpecialsHandler CSH = new ChefSpecialsHandler();
		BeveragesButton.addActionListener(CSH);
		EntreesHandler EH = new EntreesHandler();
		EntreesButton.addActionListener(EH);
		*/
		
		//textfields
		FoodName = new JTextField("Enter food name here");
		Price = new JTextField("Enter price here");
		Quantity = new JTextField("Enter quantity here");
		Description = new JTextField("Enter description here");
		Size = new JTextField("Enter size here");
		SpecialOrder = new JTextField("Enter special order here");
		
		
		//some features
		Search = new JTextField("What are you searching for?: ");
		add(Search);
		
		add(FoodName);
		add(Price);
		add(Quantity);
		add(Description);
		add(Size);
		add(SpecialOrder);
		
		TextFieldHandler FN = new TextFieldHandler();
		FoodName.addActionListener(FN);
		Price.addActionListener(FN);
		Quantity.addActionListener(FN);
		Description.addActionListener(FN);
		Size.addActionListener(FN);
		SpecialOrder.addActionListener(FN);
		Search.addActionListener(FN);
		
	
		
	}
	
	private class CategoryHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", event.getActionCommand() ));
			//System.out.println(cList);
			if(event.getSource() == CategoryButton){
				 JPanel CategoryPanel;
				 CategoryPanel = new JPanel();
					CategoryPanel.setBackground(Color.YELLOW);
					add(CategoryPanel, BorderLayout.CENTER);
					CategoryPanel.setSize(300, 350);
					BeveragesButton = new JButton("Beverages");
					add(BeveragesButton);
			
					AppetizersButton = new JButton("Appetizers");
					add(AppetizersButton);
					SoupsButton = new JButton("Soups");
					add(SoupsButton);
					ChefSpecialsButton = new JButton("Chef Specials");
					add(ChefSpecialsButton);
					EntreesButton = new JButton("Entrees");
					add(EntreesButton);
					
					
					BeveragesHandler BH = new BeveragesHandler();
					BeveragesButton.addActionListener(BH);
					AppetizersHandler APPH = new AppetizersHandler();
					AppetizersButton.addActionListener(APPH);
					SoupsHandler SOUH = new SoupsHandler();
					SoupsButton.addActionListener(SOUH);
					ChefSpecialsHandler CSH = new ChefSpecialsHandler();
					BeveragesButton.addActionListener(CSH);
					EntreesHandler EH = new EntreesHandler();
					EntreesButton.addActionListener(EH);
					
					SearchHandler SEH = new SearchHandler();
					SearchButton.addActionListener(SEH);
					
			}
		}
		
		
	}
	
	private class SearchHandler implements ActionListener{
		public void actionPerformed(ActionEvent aevent){
		JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", aevent.getActionCommand()));
			if(aevent.getSource() == SearchButton){
				text = String.format("Search: %s", aevent.getActionCommand());
				cList.contains(text);
				
				System.out.println(text);
			}
		}
	}
	
	private class AddHandler implements ActionListener{
		public void actionPerformed(ActionEvent bevent){
			JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", bevent.getActionCommand()));
			if(bevent.getSource() == AddButton){
				if(bevent.getSource() == AddButton){
					response = text;
					System.out.printf(" %s", response);
				}
			}
		}
	}
	
	private class DeleteHandler implements ActionListener{
		public void actionPerformed(ActionEvent cevent){
			JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", cevent.getActionCommand()));
		}
	}
	
	
	
	
	private class SaveHandler implements ActionListener{
		public void actionPerformed(ActionEvent Sevent){
			JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", Sevent.getActionCommand()));
			if(Sevent.getSource() == SaveButton){
				new WriteBinaryFile("Save.dat", Food);
				ReadBinaryFile sbf = new ReadBinaryFile("Save.dat");
				System.out.println(((FoodItem)sbf.getReadItem()));
			}
		}
	}
	
	
	
	//the categories when you click on them
	private class BeveragesHandler implements ActionListener{
		public void actionPerformed(ActionEvent BEVevent){
			
			JOptionPane.showMessageDialog(ButtonFrame.this,String.format("You pressed: %s", BEVevent.getActionCommand()) );
		}
	}
	
	
	private class AppetizersHandler implements ActionListener{
		public void actionPerformed(ActionEvent APPevent){
			JOptionPane.showMessageDialog(ButtonFrame.this,String.format("You pressed: %s", APPevent.getActionCommand()) );
		}
	}
	
	
	
	private class SoupsHandler implements ActionListener{
		public void actionPerformed(ActionEvent SOUevent){
			JOptionPane.showMessageDialog(ButtonFrame.this,String.format("You pressed: %s", SOUevent.getActionCommand()) );
		}
	}
	
	
	
	private class ChefSpecialsHandler implements ActionListener{
		public void actionPerformed(ActionEvent CSevent){
			JOptionPane.showMessageDialog(ButtonFrame.this,String.format("You pressed: %s", CSevent.getActionCommand()) );
		}
	}
	
	
	
	private class EntreesHandler implements ActionListener{
		public void actionPerformed(ActionEvent ENTevent){
			JOptionPane.showMessageDialog(ButtonFrame.this,String.format("You pressed: %s", ENTevent.getActionCommand()) );
		}
	}
	
	
	private class TextFieldHandler implements ActionListener{
		public void actionPerformed(ActionEvent Tevent){
			
			if(Tevent.getSource() == FoodName){
				text = String.format("FoodName: %s", Tevent.getActionCommand());
				JOptionPane.showMessageDialog(null, text);
				Food.setFoodName(text);
				System.out.println(Food.getFoodName());
			}
			
			if(Tevent.getSource() == Price){
				text = String.format("Price: %s", Tevent.getActionCommand());
				JOptionPane.showMessageDialog(null, text);
				Food.setPrice(p);
				System.out.println(Food.getPrice());
				
			}
			
			if(Tevent.getSource() == Quantity){
				text = String.format("Quantity: %s", Tevent.getActionCommand());
				//Food.setQuantity(Integer.parseInt(text));
				JOptionPane.showMessageDialog(null, text);
				
				
				System.out.println(Food.getQuantity());
			}
			
			
			if(Tevent.getSource() == Description){
				text = String.format("Description: %s", Tevent.getActionCommand());
				JOptionPane.showMessageDialog(null, text);
				Food.setDescription(text);
				System.out.println(Food.getDescription());
			}
			
			
			if(Tevent.getSource() == Size){
				text = String.format("Size: %s", Tevent.getActionCommand());
				JOptionPane.showMessageDialog(null, text);
				Food.setSize(text);
				System.out.println(Food.getSize());
			}
			
			if(Tevent.getSource() == SpecialOrder){
				text = String.format("Special Order: %s", Tevent.getActionCommand());
				JOptionPane.showMessageDialog(null, text);
				
				Food.setSpecial_order(Boolean.parseBoolean(text));
				System.out.println(text);
			}
			
			if(Tevent.getSource() == Search){
				text = String.format("Search: %s", Tevent.getActionCommand());
				JOptionPane.showMessageDialog(null, text);
			}
			
			
		}
	}

}
