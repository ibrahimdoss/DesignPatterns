
public enum CommandGeneralProblemNotes {
	
//	• Nesneler mesaj göndererek birbirlerinden istekte bulunurlar.
//	
//	• Bazen istekte bulunan nesnenin, isteğin kendisini yani çağrılan metodu ve 
//	isteği gerçekte kimin yerine getireceğini yani metoda sahip olan nesneyi bilmemesi gerekir.
//	
//	• Çünkü istemci ile muhatap olunan nesne ve işi yerine getiren metodu arasında 
//	olabildiğince az bir bağımlılık bulunması istenir.
//	
//	• Dolayısıyla istemcinin hem isteği kimin yerine getirdiğini hem de isteğin
//	gerçekte hangi metotla gerçekleştirildiğini bilmemesi gerekir.
//	
//	• Bu şunun gibi bir durumdur:
//		
//	• Bilmediğiniz birine gerçekte ne olduğunu bilmediğiniz bir işi, 
//	çok genel bir emirle, “yap” diye söylüyorsunuz ve o ne yapacağını bildiği için 
//	yapması gerekeni yapıyor.
//	
//	• Buradaki “yap” emri çok genel bir emirdir, 
//	hernangi özel bir hareketi değil, sadece yapanın yapmasını bildiği şeyi temsil eder.
	
//	• GoF bu duruma UI çerçevelerinden (framework) bir örnek verir:
//		
//		• UI çerçeveleri button ya da menu gibi nesnelere sahiptir,
//		
//		• Ama çerçeve bu nesnelerin tıklandığında ya da seçildiğinde
//		yapacağı işleri bilmediğinden, bu nesnelere gelen istekleri yerine
//		getiremez.
//		
//		• Çünkü ancak bu çerçeveyi kullanan uygulamalar bir button
//		tıklandığında ne olması gerektiğini bilebilir.
//		
//		• Dolayısıyla çerçeveyi tasarlayanların önceden bir button tıklandığında
//		ya da menü seçildiğinde gerçekte ne olacağını yani hangi nesnenin
//		isteği alacağını ve hangi metodun bunu yerine getireceğini bilmeleri
//		mümkün değildir.
	
//	• Bazen de yerine getirilen isteklerin geri alınması (undo), tekrar
//	yapılması (redo), listesinin tutulması ve kaydedilmesi (audit) gibi
//	ihtiyaçlar da olur.
//	
//	• Bu durumda bir nesne üzerinde bir metot çağırarak yerine getirilen
//	istekle ilgili yukarıda sayılan pek çok farklı iş için yardımcı metotlar
//	oluşturulur.
//	
//	• Bu durumda bu yan/yardımcı metotlarla, metot ailesiyle, nesne
//	karmaşıklaşır.
	


}
