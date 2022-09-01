package ShapePattern;

public abstract class AbstractShapeDrawer implements ShapeDrawer{
	protected String name;
	
	public AbstractShapeDrawer(String name){
		this.name = name;
	}
}
