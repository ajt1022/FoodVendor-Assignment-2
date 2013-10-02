package foodvendorsim;
import java.io.Serializable;
import java.math.BigDecimal;


public class FoodItem implements Serializable {

	
	private static final long serialVersionUID = 1L;
	public String FoodName, Description, Size;
	public BigDecimal Price;
	int Quantity;
	boolean special_order;
	
	
	public FoodItem(){
		super();
	}
	
	
	public FoodItem(String FoodName, BigDecimal Price, int Quantity,
			String Description, String Size, boolean special_order){
		super();
		this.FoodName = FoodName;
		this.Price = Price;
		this.Quantity = Quantity;
		this.Description = Description;
		this.Size = Size;
		this.special_order = special_order;
	}
	
	


	public String getFoodName(){
		return FoodName;
	}
	
	public void setFoodName(String FoodName){
		this.FoodName = FoodName;
	}
	
	
	public String getDescription(){
		return Description;
	}
	
	public void setDescription(String Description){
		this.Description = Description;
	}
	
	public BigDecimal getPrice(){
		return Price;
	}
	
	public void setPrice(BigDecimal Price){
		this.Price = Price;
	}
	
	
	public int getQuantity(){
		return Quantity;
	}
	
	public void setQuantity(int Quantity){
		this.Quantity = Quantity;
	}
	
	
	public String getSize(){
		return Size;
	}
	
	public void setSize(String Size){
		this.Size = Size;
	}
	
	
	public boolean getSpecial_order() {
		return special_order;
	}


	public void setSpecial_order(boolean special_order) {
		this.special_order = special_order;
	}
	
	
	@Override
	public String toString() {
		return "FoodItem [name=" + FoodName + ", price=" + Price + ", quantity="
				+ Quantity + ", description=" + Description + ", size=" + Size
				+ ", specialOrder=" + special_order + "]";
	}
	
}
