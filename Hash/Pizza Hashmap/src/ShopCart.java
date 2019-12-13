import java.util.ArrayList;

public class ShopCart {
	
	private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	private double totalCost = 0;
	
	public ShopCart() {
	}
	
	public void addItem(Pizza pizza) {
		if (pizza.getTotalIngredients() == 0) {
			System.out.println("Only pizzas with at least one ingredient can be added to the cart!");
		} else {
			pizzas.add(pizza);
			System.out.println("''" + pizza.getFlavor().substring(0, 1).toUpperCase() + pizza.getFlavor().substring(1) + "'' was added to the cart.");
		}
	}
	
	public double totalCost() {
		for (Pizza p : pizzas) {
			totalCost += p.getPrice();
		}
		
		return totalCost;
	}
	
	public int totalItems() {
		return this.pizzas.size();
	}
}
