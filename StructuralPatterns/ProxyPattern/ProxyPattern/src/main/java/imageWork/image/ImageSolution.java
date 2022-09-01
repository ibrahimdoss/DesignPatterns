package imageWork.image;

public enum ImageSolution {

	/*
	 * Pahalı/büyük nesnelerin yüklenmesini istemcinin isteme anına kadar
	 * geciktirmede (lazy loading) de Proxy kalıbı uygulanabilir.
	 * 
	 * • Bu durumda ara nesne (placeholder), asıl nesne varmış gibi davranan, onun
	 * yerine geçen sahte vekil (virtual proxy) nesnedir.
	 * 
	 * • İstemci ise ara nesnenin varlığında çalışmakta ve gerçekte asıl nesnenin
	 * belleğe yüklenmediğini bilmemektedir.
	 * 
	 * • İstemci asıl nesneye ihtiyacı olduğunda vekil nesne, asıl nesnenin
	 * yaratılmasını sağlayıp kendisine gelen çağrıları ona yönlendirir
	 * 
	 */
	
	//TODO
	
//	• BigImage, görüntülenecek 	esas nesnedir, ImageProxy ise onun yerine geçen ara nesne, vekilidir.
	
//	• ImageProxy, Document’ten 	gelen görüntüleme draw() isteğine, BigImage’i yükleyip onu görüntüleyerek cevap verir.
}

