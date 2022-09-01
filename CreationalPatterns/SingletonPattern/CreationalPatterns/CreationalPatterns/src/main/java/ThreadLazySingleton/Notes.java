package ThreadLazySingleton;

public enum Notes {

	//Birden fazla thread oluşturduk ve her bir  threadi başlatıp içinde bulunan Run methoda
	//gidiyoruz.
	
	
	//ThreadedLazySingletonClient 'de çalıştırdığımız zaman Singleton'dan 1 tane değil de 3 veya daha
	//fazla oluşmaya başladı, birden fazla thread bu objeleri yani tek bir nesneyi almaya çalıştığı zaman
	//birden fazla singleton objesi oluşturulmaya başlanıyor.
	
	//TODO Solution :
		//Bunun çözümü ise Thread-Safe Lazy Loaded
}