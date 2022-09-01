package SingletonSerializableProblem;

public enum Notes {
	
//	Singleton nesne oluşturmayı ulaşılamayan, **private kurucu ile yapmak
//	çoğu zaman problemlidir.
//	
//	 Bu tür çözümler reflection ve serialization ile kırılabilir, birden fazla
//	singleton nesne yaratılabilir.
//	
//	 Java ve C#’da kurulucu private olsa bile reflection ile sınıfların nesneleri
//	oluşturulabilir.
//	
//	 Serialize edilmiş singleton nesne birden fazla kere okunarak belleğe farklı
//	nesneler olarak yüklenebilir.
	
	
	//TODO: burada reflection ile denediğimiz de bize birden fazla singleton nesnesi oluşturuyor 
	//ve belleğe farklı yükleniyor.
	
	//TODO: Solution 
		//EnumSingleton paketi içinde.
}
