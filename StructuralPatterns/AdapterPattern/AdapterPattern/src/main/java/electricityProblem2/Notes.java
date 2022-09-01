package electricityProblem2;

public enum Notes {

	//TODO
//	TurkishHomeAppliance burayı extend edip interface icindeki metotları degistirildi.
//	Buradaki cözüm problem1'den daha iyidir 
//	buradaki problem ise subclass patlamasına sebep olabilir. 
//	Yani burada birçok ülkeye gittiğimiz zaman o zaman birçok subclassa götürebilir.
	
	
	//TODO PROBLEM.
	//Fakat bu durumda her uyumsuzluk durumu için ayrı bir alt sınıfa ihtiyaç olur.
	
	//	Bu aslen büyük bir problem olmayabilir.
	
	//Esas problem farklıdır.
	
	//TODO important
	//Uyumsuzluk sorununu miras ile genişletmeyle çözmedeki en temel sıkıntı,
	//adaptörü, elektrikli aletinin içine gömmektir.
	
		//Bu durumda SRP’ye ters bir hal ortaya çıkar.
	
	// Halbuki adaptörlük apayrı bir sorumluluk ve roldür; ana sınıfın içine gömülmemelidir.
	
	// 	Ayrıca böyle yapılırsa, her aletin içine ayrı adaptör(ler) gömmek gerekir.
	
	// 		Aynı alet birden fazla ülkeye gittiğinde, her farklı standart için, içinde gömülü
	// 			farklı bir adaptöre ihtiyaç duyar.
	
	
	//Uyumsuzluk sorunun genisletmeyle cözmedeki bir baska sıkıntı, var olan elektrikli aletin
	//genisletilebilir durumda olmadıgı haldir.
	
	//***final/sealed sınıflar
	
	//Genişletilebilir olsa bile genişleten sınıfın sahip olacağı yüksek bağımlılıktan dolayı 
	//elektrikli aletin yeni sürümlerinde değiştirilmesi gerekebilir.
	
}
