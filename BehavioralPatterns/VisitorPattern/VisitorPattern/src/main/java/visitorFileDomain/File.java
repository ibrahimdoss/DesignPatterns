package visitorFileDomain;

public abstract class File {
	protected String name;
	
	public File(String name){
		this.name = name;
	}
	
	public abstract void open();
	
	public abstract void read();
	
	public abstract void close();

}
