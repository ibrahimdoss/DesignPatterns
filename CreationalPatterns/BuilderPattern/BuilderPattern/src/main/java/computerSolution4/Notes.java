package computerSolution4;

public enum Notes {
	
	//TODO cözümü computerSolution5 paketi icindedir.

	//TODO DEĞİSMEZ NESNE
	
//	Karmaşık nesneyi bina eden builder, nesnenin içinde, örneğin bir iç
//	sınıf (inner/nested class) olarak konumlandırılırsa nesnenin set
//	metotlarından kurtulmak mümkün olur ve nesnenin kurucusu dışarıdan
//	erişime kapatıulabilir.
//	
//	 Böylece oluşturulan nesnenin durumunun daha sonra değiştirilmesinin
//	önüne geçilir ve değişmez nesne (immutable) elde edilir.
//	
//	 Bu durumda builder nesne, bina edilen nesneden alınır yani nesne
//	kendi builder nesnesinin üretici metoduna (factory method) sahip olur.
	
	
//	ComputerBuilderI değişemiştir ve Computer’in statik getBuilder() metoduyla alınır.
//	
//	• ComputerBuilder, Computer’in bir iç sınıfıdır.
//	
//	• Computer’da set metotları yoktur ve tüm kurucuları dışarıya kapatılmıştır.
	
	//TODO 
	//Bu çözümde ComputerBuilderI bina edilen Computer’nesnesinden alınır yani Computer kendi builder nesnesini, 
	//ComputerBuilderI, üreten metoda (factory method), getBuilder() sahip olur. acıklaması asagıdaki kod.
	
	/*public class Computer {
		…
		public static ComputerBuilderI getBuilder(String name){
		return new ComputerBuilder(name);
		}
		public static class ComputerBuilder implements ComputerBuilderI{
		…
		}
		}*/
	
	
	//TODO PROBLEM
	//burada build bütün nesneyi en sonda direkt üretiyor, o nesneye kadar da parçaları üretiyor
	//aslında parçaları ürettikten sonra objeyi üretmekten vazgeçebiliriz, bu durumda parçalarda üretilmesin 
	//isteyebiliriz.
}
