import java.util.HashMap;
import java.util.Map;


public class Pizza {
	
	private String flavor;
	private double price;
	
	Map <Integer, String> ingredients = new HashMap <Integer, String>();
	private int mapIndex = 0;
	private int totalIngredients;
	
	private static int totalPizzas = 0;
	
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
}
