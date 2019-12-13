import java.util.HashMap;
import java.util.Map;


public class Pizza {
	
	private String flavor;
	private double price;
	private static int totalPizzas = 0;
	private static Map <String, Integer> allIngredients = new HashMap <String, Integer>();
	
	Map <Integer, String> ingredients = new HashMap <Integer, String>();
	private int mapIndex = 0;
	private int totalIngredients;
	
	
	public Pizza(String flavor) {
		this.flavor = flavor;
		this.totalIngredients = 0;
		totalPizzas++;
	}
	
	public void addIngredient(String ingredient) {
		this.mapIndex++;
		this.ingredients.put(mapIndex, ingredient);
		this.totalIngredients++;
		setPrice();
		if (allIngredients.containsKey(ingredient)) {
			int quantity = allIngredients.get(ingredient) + 1;
			allIngredients.replace(ingredient, quantity);
		} else {
			allIngredients.put(ingredient, 1);
		}
	}
	
	private void setPrice() {
		if (totalIngredients > 5) {
			price = 23;
		} else if (totalIngredients > 2) {
			price = 20;
		} else if (totalIngredients < 3){
			price = 15;
		}
	}
	
	public double getPrice() {
		return this.price; 
	}
	
	public int getTotalIngredients() {
		return this.mapIndex;
	}
	
	public String getFlavor() {
		return this.flavor;
	}
	
	public void displayAllIngredients() {
		String[] display = allIngredients.toString().split(", ");
		for (String s : display) {
			System.out.println(s);
		}
	}
}
