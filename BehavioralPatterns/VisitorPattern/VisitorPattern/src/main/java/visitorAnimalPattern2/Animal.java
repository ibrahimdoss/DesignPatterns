package visitorAnimalPattern2;

public interface Animal {
	void eat();
	
	String getName();
	
	void accept(Feeder feeder);
}
