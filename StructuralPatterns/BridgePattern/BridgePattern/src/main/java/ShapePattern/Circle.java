package ShapePattern;

public class Circle extends AbstractShape {

	public Circle(String name, ShapeDrawer drawer) {
		super(name, drawer);
	}

	@Override
	public void draw() {
		drawer.drawCircle();
	}

	@Override
	public void erase() {
		drawer.eraseCircle();
	}
}
