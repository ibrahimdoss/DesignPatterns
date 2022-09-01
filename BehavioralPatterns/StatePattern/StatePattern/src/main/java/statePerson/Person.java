package statePerson;

public class Person implements EmotionalState {

	EmotionalState emotionalState;

	public Person(EmotionalState emotionalState) {
		this.emotionalState = emotionalState;
	}

	public void setEmotionalState(EmotionalState emotionalState) {
		this.emotionalState = emotionalState;
	}

	public String sayGoodbye() {
		return emotionalState.sayGoodbye();
	}

	public String sayHello() {
		return emotionalState.sayHello();
	}

}