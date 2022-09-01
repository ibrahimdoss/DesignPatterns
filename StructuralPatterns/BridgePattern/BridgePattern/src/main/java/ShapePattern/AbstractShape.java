package ShapePattern;

public abstract class AbstractShape implements Shape {
	protected String name;
	protected ShapeDrawer drawer;
	
	public AbstractShape(String name, ShapeDrawer drawer) {
		this.name = name;
		this.drawer = drawer;
	}

	@Override
	public void setDrawer(ShapeDrawer drawer) {
		this.drawer = drawer;
	}
}
