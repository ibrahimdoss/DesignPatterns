package employeeSolutionFm5;

public enum SolutionNotes {
	
//	Ayrıca birden fazla factory metodunu tek bir sınıfta toplamak için,
//	oluşturulan nesnelerin bir nesne ailesinin parçası olması gereklidir. => Abstract Factory
//	
//	Aksi taktirde statik factory metotlarına sahip sınıfın, Employee, Car,
//	Account vb. alakasız nesneleri yaratması sebebiyle birlikteliği düşecek,
//	bağımlılığı artacak ve birden fazla değişim sebebine sahip olacağından
//	SRP’ye tamamen aykırı olacaktır.
//	
//	 Böyle bir yaklaşımla bir sistemdeki tüm nesneler tek bir factory sınıfına
//	ürettirilebilir! => FactoryUtility anti-pattern!
	
	
//	Bu durumdan kaçınmak için
//	
//	 Ya farklı statik factory metotları farklı sınıflara konur
//	
//	 ***Statik factory metoduna sahip sınıf, nesnesi yaratılan sınıf ise ise Pattern
//	****Bloch’ın çözümüne evrilir.
//	
//	** Ya da aynı sınıfta ilgisiz nesneleri değil de bir nesne ailesini yaratan statik
//	***factory metotları bir araya getirilirse AbstractFactory’ye yaklaşılmış olur.
//	
//	 ***Tek fark, bir arayüzde tanımlanan abstract metotların alt sınıflarda
//**	***override edilmesi yerine somut bir sınıfta statik factory metotları söz
//	***konusudur dolayısıyla genişletilebilen bir yapı olmaz

}
