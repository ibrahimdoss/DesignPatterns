package observerPublisher;

public interface Subscriber {

	public String getName();

	public void receive(Publication publication);
}
