package menuItem;

public class MenuItem {
	private String name;
	private double price;
	public enum Type {
		appetizer, entree, desert, beverage
	}
	
	Type type;
	private String description;
	private boolean isVegetarian;
	private String specialRequest;
	
	public MenuItem(String name, double price, Type type, String description) {
		this.name = name;
		this.price = price;
		this.type = type;
		this.description = description;
		isVegetarian = false;
		specialRequest = "";
	}
	
	public MenuItem(String name, double price, Type type, String description, boolean isVegetarian) {
		this.name = name;
		this.price = price;
		this.type = type;
		this.description = description;
		this.isVegetarian = isVegetarian;
		specialRequest = "";
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Type getType() {
		return type;
	}
	
	public boolean getIsVegetarian() {
		return isVegetarian;
	}
	
	public String getSpecialRequest() {
		return specialRequest;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setType(Type type) {
		this.type = type;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setIsVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}
	
	public void setSpecialRequest(String specialRequest) {
		this.specialRequest = specialRequest;
	}
	
	public String toString() {
		return "Name: " + name +  "\nPrice: " + price + "\nDescription: " + description + "\nType: " + type + "\nVegetarian: " + isVegetarian + "\nSpecialRequest: " + specialRequest;
	}
}
