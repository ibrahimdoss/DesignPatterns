package Toast.problem;

public class SausageToast extends AbstractToast {

	public SausageToast() {
		super();
		name = "Sausage Toast";
	}

	@Override
	public int calculatePrice() {
		return 6;
	}
}
