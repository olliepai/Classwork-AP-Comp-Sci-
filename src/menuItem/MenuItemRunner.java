package menuItem;

import menuItem.MenuItem.Type;

public class MenuItemRunner {
	public static void main(String[] args) {
		MenuItem fries = new MenuItem("Fries", 4.99, Type.appetizer, "Yummy organic potato strips from the farm outside");
		fries.setSpecialRequest("Don't add salt");
		System.out.println(fries);
	}
}
