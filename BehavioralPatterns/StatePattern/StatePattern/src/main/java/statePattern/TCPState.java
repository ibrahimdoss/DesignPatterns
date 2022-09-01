package statePattern;

public interface TCPState {
	
	void open();

	void close();

	void acknowledge();

}
