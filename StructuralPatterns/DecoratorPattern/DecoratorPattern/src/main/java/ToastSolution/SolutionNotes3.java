package ToastSolution;

public enum SolutionNotes3 {
	
//	Ayrıca Topping, Toastable’ın getToppings() metodunada
//	gerçekleştirme sağlar.
//	
	//örnegi
//	public abstract class Topping implements Toastable{
//	…
//	@Override
//	public List<Topping> getToppings() {
//	List<Topping> toppings = toastTopping.getToppings();
//	toppings.add(this);
//	return toppings;
//	}
//	}
	
	
//	• Bundan dolayı Topping sınıfının kurucusu kendi cinsinden bir nesne alır.
//	
//	• Ayrıca isim ve fiyat bilgisini de alır ama bunlar statik yapılabilir.
//	
//	• Dolayısıyla her yeni Topping nesnesi, kendisinden önceki dekoratörü 
//	yani Toastable (ya da Topping) nesnesini bilir.
//	• Bu şekilde dekoratörler, Topping nesneleri, zincir şeklinde birbirlerine eklenir.
	
//	//örnegi
//	public abstract class Topping implements Toastable{
//	public Topping(Toastable toastTopping, String name, int price){
//	super(toastTopping, price, name);
//	}
//	}
	
//	• Bu çözümde tost nesnesi hayatına ToastBread nesnesi olarak
//	başlar ve dekoratörler eklendikçe fiyatı değişir.
//	
//	• Dolayısıyla ToastBread nesnesine farklı dekoratörler istenilen kombinasyonlarla eklenebilirler
}
