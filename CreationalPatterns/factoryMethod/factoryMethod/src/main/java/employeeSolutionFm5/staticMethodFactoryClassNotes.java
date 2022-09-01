package employeeSolutionFm5;

public enum staticMethodFactoryClassNotes {
	
//	Birden fazla sınıfın nesnesinin tek bir create() metodunda,
//	yaratılmalarında kullanılacak bilgileri parametre olarak geçmeden
//	oluşturulması gerçekçi olmayabilir.
//	
//	 3. çözümdeki gibi nesneler farklı bilgilerle yaratılıyor olabilir.
//	 
//	 Farklı nesneler için gerekli bilgilerin hepsini tek bir create()
//	metoduyla almak yerine her nesne için farklı create() metodu
//	kullanmak, yani tek olan create()’i bölmek, bu metodun OCP ve
//	SRP’ye aykırı olan durumunu iyileştirebilir.

	
//	Bu durumda aynı somut EmployeeFactory sınıfı üzerinde,
//	createEmployee(), createEmployee(), createEmployee()
//	gibi birden çok somut ve statik factory metodu düşünülebilir.
//	
//	 Bu çözüm tek metotlu create() çözümüne göre daha rahattır ama
//	burada da problem EmployeeFactory sınıfının SRP ve OCP
//	olmamasıdır.
//	
//	EmployeeFactory sınıfı birden fazla nesnenin yaratılmasından
//	sorumludur ve her yeni tipte sınıfa yeni bir factory metodu eklenecektir.
}
