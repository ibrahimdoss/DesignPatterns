package Toast.problem;

public class CheeseTomatoToast extends CheseToast {

	public CheeseTomatoToast() {
		name = "Cheese Domato Toast";
	}
	
	@Override
	public int calculatePrice() {
		return super.calculatePrice() + 2;
	}
}
