package BasbakanSolution2;

public enum SolutionNotes {
	
//	Vatandas’ın gerçek Basbakan’la bağımlılığını soyut hale getirip
//	araya aynı arayüze sahip bir vekil nesne konduğunda ortaya şu model
//	çıkar: "CD.png" image icinde.
	
	//TODO important
	//Bu çözümde VekilBasbakan proxy, GerçekBaşbakan ise saklanan nesnedir
	
	
//	• Basbakan arayüzü ve Vekil sayesinde Vatandas ile
//	GercekBasbakan arasındaki doğrudan bağımlılık ortadan kalkmıştır.
//	
//	• Vekil, GercekBasbakan’ın birlikteliğini düşüren sorumlulukları
//	devralarak GercekBasbakan’ın daha odaklı olmasını sağlamıştır.
//	
//	• Vatandas, Basbakan’a ulaşmaktadır ama gerçekte ulaştığı proxy,
//	vekil nesnedir.
//	
//	• Tüm nesneler arasındaki bağımlılıklar soyuttur ve nesnelerin
//	birliktelikleri yüksektir.
	
//	• BasbakanlikKalemi de VekilBasbakan nesnesini (nesnelerini)
//	üreten bir Factory’dir.
	
//	• VekilBasbakan nesnelerinin sayısına göre onları yaratır, havuza
//	koyar, sırayla Vatandas’a verir.

}
