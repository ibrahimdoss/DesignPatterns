package computerSolution7;

public enum Notes {

	//TODO SAFHALI VE SIRALI BUİLD
	
//	Safhalı inşada sıra önemliyse, builder nesnelerini alma da sıraya konmalıdır.
//	
//	Örneğin Computer’ üzerinden, sadece CPU, RAM ve HardDrive üreten BaseComputerBuilder nesnesi alınır.
//	
//	Sonrasında BaseComputerBuilderI nesnesinden ComputerDisplayBuilderI nesnesi, sonrasında ondan da
//	 ComputerAccessoryBuilder nesnesinin alınmasıya safhalar sıraya konabilir.
	
	
	
	//TODO 
//	Bu çözümde sadece BaseComputerBuilder, builder nesnesi Computer’den statik metotla alınabilir.
//	
//	 Diğer builder nesnelerini veren statik metotlar private yapılmıştır.
//	 
//	 Diğer builder nesneleri birbirlerinden buildXxx() metotlarıyla alınır.
//	 
//	 Builderlar ortak kullandıkları Computer nesnesini bina ederler.
	
	//Computer’da set metotları yoktur ve tüm kurucuları dışarıya kapatılmıştır.
	
	//TODO Onemli...
	//BaseComputerBuilderI’ın buildBaseComputer() metoduyla Computer yerine ComputerDisplayBuilderI,
//	ComputerDisplayBuilderI’ın da buildComputerDisplay() metoduyla AccessoryBuilderI döndürdüğüne dikkat edin.
	
	// AccessoryBuilderI de build() metoduyla Computer nesnesini döndürür.
}
