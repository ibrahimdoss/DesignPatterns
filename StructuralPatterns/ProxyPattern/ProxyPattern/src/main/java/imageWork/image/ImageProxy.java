

package imageWork.image;

public class ImageProxy implements Image {
	
	private BigImage bigImage;

	public void draw() {
		if(bigImage == null)
			bigImage = new BigImage();
		bigImage.draw();
	}

	public void erase() {
		bigImage.erase();
	}
}
