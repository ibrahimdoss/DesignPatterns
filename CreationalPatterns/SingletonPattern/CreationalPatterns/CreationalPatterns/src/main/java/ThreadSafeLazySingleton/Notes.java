package ThreadSafeLazySingleton;

public enum Notes {

	//Problem 
	//Birden fazla thread
	
//	Bu durumda thread safety sağlamak için getInstance() metodunun
//	aynı anda sadece bir tek kanal tarafından çağrılabileceğinden emin
//	olmak gereklidir.
//	
//	 Dışlayıcı kilit (mutex lock) kullanılmalıdır bu da synchronized ile sağlanıyor.
//	 
//	 Bu amaçla getInstance() metodund Java’da synchronized ile
//	tüm metodun ya da belirlenen kapsamın (scope) aynı anda sadece bir
//	kanal tarafından çalıştırılması sağlanır.
//	
	
	//Java’da getInstance() metodunun synchronized olarak
	//nitelenmesindense sadece gerekli bloğun synchronized yapılması
	//performans açısından daha uygundur.
	
	
	//TODO: PROBLEM
		//Sonradan yüklemeli ve thread-safe çözümde getInstance’da singleton
		//nesnenin null kontrolünün mutex lock ile yapılması performans
		//açısından sorunludur.
	
		//	Çünkü mutex lock sadece singleton nesne oluşturuluncaya kadar
		//	gereklidir, sonrasında referans null olmaktan çıktığından if kontrolü
		//	hiçbir zaman true dönmeyecektir.
		//	
		//	 Ama buna rağmen çalışma zamanında tüm null kontrolleri mutex lock
		//	ile yapılamaktdır.
		//	
	
		//TODO: Solution.
		//	 Bu durumdan singleton nesnenin null kontrolünü, birisi mutex lock
		//	içinde diğer öncesinde olmak üzere iki defa yapılmakla kurtulmak
		//	mümkündür.
	
		//Çözümü ise DoubleCheckedLockingSingleton paketi içindedir.
	
}
