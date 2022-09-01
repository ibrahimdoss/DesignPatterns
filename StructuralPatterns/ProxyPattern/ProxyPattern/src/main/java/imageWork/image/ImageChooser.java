

package imageWork.image;

public class ImageChooser {
	
	private static ImageChooser ic = new ImageChooser();
	private Image image;
	
	public ImageChooser(){
		image = new ImageProxy();
	}
	
	Image getImage(){
		return image;
	}

	public static ImageChooser getInstance(){
		return ic;
	}
}
