

package imageWork.image;

public class Document {


	public static void main(String[] args) {
		ImageChooser imageChooser = ImageChooser.getInstance();
		Image image = imageChooser.getImage();
		
		double chance = Math.random();
		if(chance > 0.9)
			image.draw();
	}
}
