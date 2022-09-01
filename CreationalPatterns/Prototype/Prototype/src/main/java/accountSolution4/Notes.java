package accountSolution4;

public enum Notes {
	
//	Prototip nesneler ayrı bir yerde, örneğin AccountPrototypes isimli
//	statik bir iç sınıfta (static inner class) tutulabilir.
//	
//	 Prototip sayısının artması durumunda bu yaklaşım, abstract factory
//	sınıfını rahatlatır.
	
	//Çok fazla prototype varsa o zaman nesneyi bölmemiz lazım.
	
	//Burada cohesionu daha yüksek olacak sekilde accountFactoryde artık AccountPrototypes adı altında prototyplerı
	//toplayarak artık tek ulasan accountFactorydir.

	
	//Bunun örneği accountSolution4 paketi icindedir.
//	Ya da Bloch’ın statik factory metotlarında kullanılabilir.
//	
//	 Statik factory metotları yine iyi isimlendirilmiş metotlardıri.
//	
//	 Bu durumda prototype nesneler aynı sınıf üzerinde static olarak
//	tutulabilir.
}
