package ToastSolution;

import java.util.ArrayList;
import java.util.List;
//bunun abstract olmasının sebebi topping'in nesnesinin olusturulmasını engellemek.
public abstract class Topping implements Toastable{
	private String name;
	protected Toastable toastTopping;
	protected int price;
	
	private List<Topping> toppings = new ArrayList<>();
	
	public Topping(Toastable toastTopping, int price, String name){
		this.toastTopping = toastTopping;
		toppings.add(this);
		this.name = name;
		this.price = price;
	}
	
	@Override
	public int calculatePrice() {
		return toastTopping.calculatePrice() + price;
	}
	
	@Override
	public List<Topping> getToppings() {
		 List<Topping> toppings = toastTopping.getToppings();
		 toppings.add(this);
		 return toppings;
	}

	public String getName() {
		return name;
	}

	public Toastable getToastTopping() {
		return toastTopping;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Topping [name=" + name + ", price=" + price + "]";
	}
}
