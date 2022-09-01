package UpdatableSingleton;

public enum Notes {

	
//	Singleton nesne güncellebilir bir duruma (mutable state) sahipse çok
//	kanallı (multi-threaded) ortamda mutex lock ile kontrol gerekir.
//	
//	 Aksi taktirde verinin güncellenmesinde beklenmeyen durumlar olabilir.
//	 
//	 Bu durum da güncellenen singleton nesnelerin kullanımını zorlaştırır.
//	 
//	 Dolayısıyla kullanım kolaylığı açısından singleton nesnenin durumunu
//	değişmez (final/readonly) yapmak ya da en azından gerekiyorsa
//	sadece tek bir istemci tarafından güncellenecek şekilde kullanmak
//	önemlidir.
	
	
	//TODO: Eğer bu sekilde güncellenebilir bir singleton yapıyorsak mutex lock ile kontrol 
	//etmemiz gerekiyor.
}
