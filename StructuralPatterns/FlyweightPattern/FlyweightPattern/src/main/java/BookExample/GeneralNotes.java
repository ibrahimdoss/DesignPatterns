package BookExample;

public enum GeneralNotes {
	
	//Bu örnekte sayfalardan oluşan kitap, Book modellenmiştir.
	
	//Sayfa Page, satır Line,nesnelerinden, satırlar da karakter Character nesnelerinden oluşmaktadır.
	
	
	//TODO fly.png image baz alınarak incelendi.
	
//	Buradaki tüy siklet nesne Character’dir.
//	
//	 Tüm kitapta her karakterden binlercesi olabilir.
//	
//	 Ama kitabın sayfalarının hepsini aynı andaoluşturmak, göstermek vs. gerekmediği 
//	durumlarda belli sayıda Character nesnesi farklı zamanlarda satır ve
//	pozisyon bilgisi değiştirilerek farklı sayfalarda görünebilir.
	
	
	//İçsel durumu gösterdiği karakter value ve büyük-küçük harf upperCase bilgisidir.
	
	 //Dışsa durumu ise içinde bulunduğu satır line ve sütün position bilgisidir.
	
	//Buradaki en temel tasarım konusum Character’in ne kadar dış duruma ihtiyacı olacağıdır.
	
	// Örneğin Java’da immutable olan String nesneleri sinek siklettir ama dışsal bir bilgiye sahip
	//değildir.
	
	 //Ayrıca bu örnekte Character’in görünümü değişmemekte sadece dışsal durumu değişmektedir.
	
	

}
