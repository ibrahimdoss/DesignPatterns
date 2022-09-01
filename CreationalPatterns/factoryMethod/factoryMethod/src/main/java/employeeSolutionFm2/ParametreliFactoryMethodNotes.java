package employeeSolutionFm2;

public enum ParametreliFactoryMethodNotes {
	
//	Burada bir diğer önemli nokta da, nesne oluşturmak için gerekli durum
//	bilgisinin olabildiğince create() metodunda oluşturması ya da bu metot
//	tarafından elde edilmesidir.
//	
//	 Yani karmaşık nesneleri oluşturmak için gerekli parametrelerinin
//	olabildiğince create() metodu tarafından temin edilmesi tercih
//	edilmelidir.
//	
//	 Bu durumda create() metoduna parametre geçmeye gerek
//	kalmayabilir ya da daha az geçilir.
	
	//Yani buradaki prensip olabildiğince objeyi kullanacak olan tarafın katkısını minimilize etmek.
//	buradaki örnekte create() kısmına parametre geçmeye olabildiğince soğuk bakmak gerekiyor. Burada amac
//	create() metodunun parametreleri kendisinin toparlaması. O yüzden olabildiğince factorylere az parametre
//	gecmek gerekir.
	
//	Aslolan, istemciyi nesneyi oluşturmak için gerekli bilgileri toparlamaktan
//	kurtarmaktır.
//	
//	 Bu bilgiler, veri tabanında, ön bellekte, entegre olunan ayrı bir sistemde
//	vs. olabilir ya da nesne için o anda oluşturulabilir.
//	
//	 Eğer nesnenin yaratılması için gerekli bilgiye, create() metodu
//	ulaşabiliyorsa, bu bilgilerin toparlanması sorumluluğunun bu metotta
//	olması ve istemcinin bu bilgileri parametre olarak geçmemesi daha doğru
//	bir çözümdür.
	
//	Bunun en temel istisnası nesneyi oluştururken gerekli bazı verilerin,
//	örneğin kullanıcı tarafından girilmesi durumudur.
//	
//	 Bu durumda istemcinin bu bilgilerin factory metoduna geçilmesi gerekir.
//	
//	 *********Ne kadar az parametre geçilirse, Factory Method kalıbını kullanmaktan
//	doğan fayda o denli artar.
//	
//	 Aslolan, istemciyi, nesnenin oluşturulmasından olabildiğince bağımsız
//	kılmaktır.
	
	

}
