package BookExample;

public enum SolutionNotes {
	
//	Sinek siklet nesne (flyweight object) farklı anlarda farklı bağlamlarda
//	ortak olarak kullanılabilen bir nesnedir.
	//comment: Yani bir obje bi yerde er askeri, bir yerde subay vs olabilir gibi.
	//Temel nesne aynıdır.
	//Mesela subay olusturmak icin sıfırdan subay objesi yapmak yerine, var olan er askeri üzerine
	//yeni bağlamdan dolayı subay gibi giydirmem daha az masraflı olabilir.
	
//	
//	 Sinek siklet nesne, içinde bulunduğu bağlam ile ilgili bir bilgi edinebilir
//	ve buna göre davranışını değişirebilir.
//	
//	 Dolayısıyla nesne fakrlı bağlamlarda farklı şekillerde görünebilir.
	
	//TODO Solution Continue
//	Bu noktada sinek siklet nesnenin durumu ile ilgili şu ayırım yapılabilir:
//		
//		• İçsel ya da asıl durum (intrinsic state) 
	//comment: yani konumdan bağımsız, bu obje ne objesi ona deriz.
	//Yani bu obje a nesnesi gibi kesin durum.
	
//		• Dışsal ya da ikincil/arizi durum (extrinsic state) 
	//comment: yani bir askerin konumu bağlamsal durumdur, yani hareket ettirirsin, konumunu degistirirsin
	//objeyi degistirmeyiz.
//		
//	 İçsel durum, sinek siklet nesnenin temsil ettiği asıl durum iken dışsal durum,
//		içinde bulunduğu bağlam tarafından belirlenen durumdur.
//		
//		• Uygulamarda içsel durumu aynı ama dışsal durum farklı çok sayıda nesneye
//		ihtiyaç duyulur.
//		
//			Dışsal durum ne kadar basit ise sinek siklet nesnenin kullanımı o kadar kolaylaşır.

}
