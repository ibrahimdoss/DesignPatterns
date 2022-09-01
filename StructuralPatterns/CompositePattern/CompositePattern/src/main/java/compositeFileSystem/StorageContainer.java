
package compositeFileSystem;

import java.util.List;

import fileSystemIterator.DirectoryIterator;


public interface StorageContainer {
	
	public void add(Storage element);
	
	public void delete(Storage element);
	
	public void list();
	
	public List<Storage> elements();
	
	public DirectoryIterator iterator();

}
