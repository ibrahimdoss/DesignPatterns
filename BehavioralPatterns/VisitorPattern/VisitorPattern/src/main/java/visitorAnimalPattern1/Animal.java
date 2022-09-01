package visitorAnimalPattern1;

public interface Animal {
	void eat();
	
	void accept(Feeder feeder);
}
