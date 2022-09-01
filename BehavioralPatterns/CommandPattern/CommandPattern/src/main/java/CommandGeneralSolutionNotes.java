
public enum CommandGeneralSolutionNotes {
	
//	• Bu iki karmaşıklığı çözmenin yolu, isteği yerine getiren metodun nesne olarak modellenmesidir.
//	
//	• Bu şekilde önceki durumda etrafındaki yardımcı metotlarla birlikte bir
//	isteği yerine getiren metot, bir sınıf olarak tanımlanmış olur.
//	
//	• Yeni sınıf, aslen metodu temsil eden ama daha yukarı seviyeli bir soyutlamadır.
//	
//	• Ayrıca Strategy kalıbında isteği yerine getiren nesne
//	saklanabildiğinden, gerçekte isteği yerine getiren metot saklanmış olur.

	
//	• Bir metot iken, nesne seviyesine çıkarılan isteğe Command denir.
//	
//	• Command kalıbı, Strateji’nin daha genel hali olarak, sadece isteği
//	alan nesnenin değil metodun da saklandığı çözüm olarak görülebilir.
//	
//	• Command kalıbı bunu Strateji’deki gibi bir arayüzü yerine getiren kardeş sınıflarla yapar.
	
//	• Command’ı soyut olarak temsil eden arayüzdür.
//	
//	• Arayüzün üzerindeki metodun ismi execute()’dur.
//	
//	• Her alt sınıf, somut Command nesnesi, execute()’u hangi emiri yerine getirdiğine göre ezer.
//	• Her farklı emirde execute() metodu, eski halde bir metot olarak
//	gerçekleştirilen isteğe karşılık gelir.
//	
//	• Dolayısıyla execute() metodunun gerçekte ne yaptığını belirleyen bu
//	metoda sahip olan alt sınıf yani emir nesnesidır.
	
//	• Ayrıca her Command nesnesi, temsil ettiği istekle ilgili undo/redo gibi
//	farklı yardımcı metotlara da sahip olabilir.
	
//	• GoF’un bahsettiği UI çerçevesi probleminin çözümü: commandImage icinde command.png image.
	
}
