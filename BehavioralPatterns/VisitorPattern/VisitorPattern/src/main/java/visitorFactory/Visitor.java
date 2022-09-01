package visitorFactory;

public interface Visitor {
	
	public void visit(Employee employee);

	public void visit(Boss boss);

}
