	
public class Main {
	public static void main(String[] args) {
		ShopCart myCart = new ShopCart();
		
		Pizza mozzarella = new Pizza("mozzarella");
		myCart.addItem(mozzarella);
		mozzarella.addIngredient("mozzarella cheese");
		mozzarella.addIngredient("basil leaves");
		myCart.addItem(mozzarella);

		Pizza veggie = new Pizza("vegetarian");
		veggie.addIngredient("broccoli");
		veggie.addIngredient("palm heart");
		veggie.addIngredient("swiss cheese");
		veggie.addIngredient("capers");
		myCart.addItem(veggie);
		
		Pizza monster = new Pizza("monster");
		monster.addIngredient("loin slices");
		monster.addIngredient("bacon slices");
		monster.addIngredient("jalapeño slices");
		monster.addIngredient("gorgonzola cheese");
		monster.addIngredient("fries");
		monster.addIngredient("parmesan cheese");
		monster.addIngredient("mozzarella cheese");
		monster.addIngredient("black olives");
		myCart.addItem(monster);
		
		System.out.println("\nThe total cost of your " + myCart.totalItems() + " pizzas is : $" + myCart.totalCost());
		System.out.println("\nTotal of ingredients used in all pizzas:");
		mozzarella.displayAllIngredients();
	}	
}
