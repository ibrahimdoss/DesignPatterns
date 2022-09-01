package BasbakanSolution1;

public class Vekil {
	private Basbakan basbakan = new Basbakan();

	public void dinle(String konu) {
		if(ayikla(konu))
				ilet(konu);
	}
	
	private boolean ayikla(String konu) {
		// ...
		return true;
	}
	
	private void ilet(String konu) {
		basbakan.dertDinle(konu);
	}
}
