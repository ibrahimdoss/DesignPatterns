package visitorFileProblem2;

public enum Notes {

//	Bir başka çözüm, başka bir nesnenin File nesnelerinin tipine bakarak ne yapacağına 
//	karar vermesi olabilir.
//	
//	TextFile için format, XMLFile için de doğrulama (validate) ihtiyaçları, 
//	FileOperator sınıfı ile halledilebilir.
	
	
//	Bu çözümde FileOperator , File nesneleri üzerinde çalışabilir ama her
//	farklı alt tip için ayrı bir davranış söz konusu olduğundan, if-else’e ve
//	RTTI (Run-time Type Identification) için instanceof/is gibi yapılara ihtiyaç duyacaktır.
//	
//	
//	• Buna double disptach denir.
	
//	Double dispatch (https:en.wikipedia.org/wiki/Double_dispatch),
//		nesnenin çalışma zamanındaki tipine göre sahip olduğu somut (concrete) metodun çağrılmasıdır.
//		
//		• Java ve C# gibi diller double dispatchi doğrudan halletmezler, referans ancak
//		cast ile tuttuğu nesnenin tipine dönüştürüldükten sonra üzerinde metot çağrısı yapılabilir.
	
	
	
	
	
//	source code:
//		
//		public class FileOperator {
//		public void operate(List<File> files) {
//		for(File aFile : files){
//		aFile.open();
//		if(aFile instanceof XMLFile){
//		XMLFile xmlFile = (XMLFile) aFile;
//		boolean valid = xmlFile.validate();
//		if(valid){
//		xmlFile.read();
//		}
//		}
//		else{
//		TextFile textFile = (TextFile) aFile;
//		boolean formatted = textFile.checkFormat();
//		if(formatted){
//		textFile.read();
//		}
//		}
//		aFile.close();
//		}
//		}
//		}
}
