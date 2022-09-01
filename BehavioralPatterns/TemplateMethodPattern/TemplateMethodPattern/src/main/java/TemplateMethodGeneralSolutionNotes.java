
public enum TemplateMethodGeneralSolutionNotes {
	
	//TODO burada pattern ile alakalı cözüm ve örnekler ile alakalı bilgiler verilmistir.

//	• Bu durumda bir metotta algoritmanın akışı ifade edilir ve bu akışta 
//	pek çok metot çağrısı yapılır.
//	
//	• Akışta davranışı belli olan metotlara gerçekleştirme verilir.
//	
//	• Ama belirsizlik ya da değişiklik içeren adımlara karşı gelen metotlar soyut bırakılır 
//	öyle ki alt sınıflar bu soyut metotları gerçekleştirirler.
//	
//	• Bir algoritmanın akışını, somut ve soyut metot çağrıları şeklinde veren,
//	tarif eden metoda template method ya da kalıp metot denir.
//	
//	• Çözümde template method ya da kalıp metot bir soyut sınıf içinde bulunur
//	ve alt sınıflarda ezilemeyecek şekilde final/sealed yapılır.
//	
//	• Soyut sınıfta somut (concrete) ve soyut (abstract) olan metotlar da
//	vardır ve somut olanlar algoritmanın davranışı belli olan adımlarını, 
//	soyut metotlar ise davranışı belli olmayan ve alt sınıflarda belirlenecek adımlarını temsil eder.
//	
//	• Template method da somut ve soyut metotları çağırarark algoritmayı yerine getirir.
//	
//	• GoF, soyut olan Application ve Document sınıflarına sahip bir çerçeveyi örnek olarak verir.
//	
//	• Application sınıfı dokümanları açmaktan sorumludur.
//	
//	• Application sınıfının openDocument() metodunda bir dokümanın 
//	nasıl açılacağı adım adım tarif edilmektedir.
//	
//	• Fakat problem şudur ki bu adımların hepsinin ayrıntıları belli değildir.
//	
//	• openDocument() metodu önce dokümanın açılıp açılmayacağını kontrol eder
//	sonra uygulamaya has bir Document nesnesi oluşturur ve onu kendi dokümanlarına
//	ekler ve sonunda da dokümanı okur.
//	
//	• openDocument() metodunda ifade edilen algoritmanın iskeletinde çağrılan
//	metotlardan sadece addDocument()’ın gerçekleştirmesi bellidir, diğer metotlar soyuttur 
//	ve bu algoritma ancak soyut metotlar alt sınıflar tarafından ezildiğinde tamamlanacaktır.
//
//
//	• Doküman oluşturma algoritmasının tamamlanabilmesi için uygulama geliştirenlerin 
//	Application ve Document sınıflarına alt tip sağlamaları ve belirsiz adımlara detay 
//	verilerek yani soyut metotlara gerçekleştirme sağlayarak algoritmayı ihtiyaçlarına
//	göre tamamlaması gerekmektedir.

}
