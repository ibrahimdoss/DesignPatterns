package employee.SolutionFm4;

public enum staticFactoryMethodClassNotes {
	
//	Akla sıklıkla Factory’nin arayüz ya da soyut (abstract) sınıf yerine
//	somut (concrete) sınıf olabileceği gelebilir.
//	
//	 Bu ancak soyut bir yapı ve bir hiyerarşi kullanmadan, utility sınıfı
//	yaklaşımıyla çözüm bulma arayışının bir sonucudur.
//	
//	 Hatta create()metodu parametre alarak, hangi Employee
//	nesnesinin yaratılacağına karar verebilir dolayısıyla her yeni Employee
//	sınıfı için yeni bir Factory nesnesine ihtiyaç da kalmaz.
	
	
	//TODO WARNING
	
//	TODO *******Bu çözüm kalıptan bir sapmadır çünkü Factory Method kalıbının
//	hedefi sadece bir nesne yaratmayı soyutlamaktır, bu çözümde ise
//	farklı nesnelerin hepsi aynı metotta oluşturulduğundan karmaşıklık ve
//	değişim problemi oluşur.
//	
//	*** Bol if problemi!
//	
//	***** Tüm nesneler aynı metotta yaratıldığından bir Factory hiyerarşisi
//	kurgulamaya da gerek kalmaz, zaten nesne üreten metot static
//	olduğundan ezilemez.
	
	//Bu çözüm SRP ve OCP prensiplerine aykırıdır, bir yerde birden fazla
	//şeyi halletmektedir ve değişime kapalı değildir.
	
	// Büyüyebilen bir çözüm değildir, dolayısıyla kaçınmak gerekir.
	
	
	//Bu cözüm factory methot çözümünden sapmadır.
	
	
	//Bu yöntemin problemi de objeden kacıs problemidir. Yani objeden kacmak yerine objenin üzerinden islem yapmak
	//gerekiyor. Yani bu kod cok tercih edilmemeli.
	
	//Burada yeni bir özellik eklemek istediğimiz de bu sefer if-else'ler artaracak bu sekilde yazmak da iyi yöntem
	//	degil.

}
