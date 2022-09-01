package electricitySolution1;

import electricityDomainTR.*;
import electricityDomainUS.*;

public class Test1 {

	public static void main(String[] args) {
		USPowerSource usPowerSource = new USPowerProvider();
		USTurkishPowerAdapter uSTurkishPowerAdapter = new USTurkishPowerAdapter(usPowerSource);
		
		System.out.println();
		
		Appliance shaver = new TurkishHomeAppliance("Shaver");
		shaver.setPowerSource(uSTurkishPowerAdapter);
		shaver.start();
		shaver.stop();
		
		System.out.println();
//		
//		Appliance turkishBroom = new TurkishHomeAppliance("Broom");
//		turkishBroom.setPowerSource(uSTurkishPowerAdapter);
//		turkishBroom.start();
//		turkishBroom.stop();
	}
}
