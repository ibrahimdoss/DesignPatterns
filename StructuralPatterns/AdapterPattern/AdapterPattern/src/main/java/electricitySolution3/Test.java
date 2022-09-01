package electricitySolution3;

import electricityDomainTR.*;
import electricityDomainUS.*;

public class Test {

	public static void main(String[] args) {
		// In US with Turkish home appliance
		USPowerSource usPowerSource = new USPowerProvider();
		TwoWayUSTurkishPowerAdapter twoWayUSTurkishPowerAdapter1 = new TwoWayUSTurkishPowerAdapter(usPowerSource);
		
		System.out.println();
		
		Appliance turkishMixer = new TurkishHomeAppliance("Mixer");
		turkishMixer.setPowerSource(twoWayUSTurkishPowerAdapter1);
		turkishMixer.start();
		turkishMixer.stop();
		
		System.out.println();
		
		// In Turkey with US home appliance
		TurkishPowerSource turkishPowerSource = new TurkishPowerProvider();
		TwoWayUSTurkishPowerAdapter twoWayUSTurkishPowerAdapter2 = new TwoWayUSTurkishPowerAdapter(turkishPowerSource);
		
		System.out.println();
		
		USHomeApplicance usBroom = new USHomeApplicance("Broom");
		usBroom.setPowerSource(twoWayUSTurkishPowerAdapter2);
		usBroom.start();
		usBroom.stop();
	}
}
