package ToastSolution;

public enum SolutionNotes2 {
	
	//TODO cözümle ile ilgili notların devamı SolutionNotes3 enumı icinde.
	
//	• Bu çözümde farklı içerikteki tostların fiyatının nasıl hesaplanacağı modellenmiştir.
	
//	• Bundan dolayı Toastable‘ın calculatePrice() metodu tüm alt sınıflar tarafından override edilir.
	
//	• Topping, soyut bir sınıftır ve dekoratörlerin ebeveynidir.
//	
//	• Tost, aslen bir Toastable nesnesidir ve ToastBread nesnesi ile başlar ve ona dekoratörler eklenerek devam eder.
//	
//	• Tosta hangi malzemeler konacak ise onun dekoratör nesneleri sırayla ToastBread nesnesine eklemlenir.
	
//	//örnegi
//	Toastable ayvalıkToast = new ToastBread("Toast bread", 5);
//	ayvalıkToast = new Cheese(ayvalıkToast, "Cheddar cheese", 3);
	
	
//	• Daha doğrusu, ilk oluşturulan ToastBread nesnesi, tosta eklenecek ilk dekoratöre, 
//	örneğin Cheese’e geçilerek, “peynirli tost” oluşturulur.
//	
//	• Daha sonra peynirli tost, bir başka dekoratöre, örneğin, Sausage’a 
//	geçilerek “sucuklu ve peynirli tost” oluşturulur ve bu şekilde diğer dekoratörlerle ilerler.
//	
//	• Tüm dekoratörler eklendiğinde tost bitmiştir.
//	
//	//TODO örnegi.
//	Toastable ayvalıkToast = new ToastBread("Toast bread", 5);
//	ayvalıkToast = new Cheese(ayvalıkToast, "Cheddar cheese", 3);
//	ayvalıkToast = new Sausage(ayvalıkToast, "Sucuk", 3);
//	ayvalıkToast = new Tomato(ayvalıkToast, "Tomato", 2);
//	ayvalıkToast = new Ketchup(ayvalıkToast, "Ketchup", 1);
//	ayvalıkToast = new Salad(ayvalıkToast, "Russian salad", 2);
	
	
//	• Her eklemede yeni dekoratör nesnesi, kendi fiyatını, o ana kadar oluşan fiyata ekler.
//	
//	• İstenilen bir anda Toastable nesnesinin fiyatı calculatePrice() ile alınabilir.
//	
//	public abstract class Topping implements Toastable{
//	…
//	@Override
//	public int calculatePrice() {
//	return toastTopping.calculatePrice() + price;
//	}
//	}

}
