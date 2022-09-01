package visitorFilePattern1;

public interface Visitor {

	public boolean visit(TextFile file);

	public boolean visit(XMLFile file);

}
