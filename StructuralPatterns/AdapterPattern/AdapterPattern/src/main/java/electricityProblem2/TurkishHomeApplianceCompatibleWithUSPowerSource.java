package electricityProblem2;

import electricityDomainTR.TurkishHomeAppliance;
import electricityDomainTR.TurkishPowerSource;
import electricityDomainUS.USPowerSource;

/**
 * This handles the problem with extending the TurkishHomeAppliance.
 *
 */
public class TurkishHomeApplianceCompatibleWithUSPowerSource extends TurkishHomeAppliance {
	private USPowerSource usPowerSource;
	private boolean turkishPowerSource;

	public TurkishHomeApplianceCompatibleWithUSPowerSource(String name) {
		super(name);
	}

	@Override
	public void setPowerSource(TurkishPowerSource powerSource) {
		this.powerSource = powerSource;
		turkishPowerSource = true;
	}

	public void setUSPowerSource(USPowerSource usPowerSource) {
		this.usPowerSource = usPowerSource;
		turkishPowerSource = false;
	}

	@Override
	public void start() {
		System.out.println("TurkishHomeAppliance " + name + " is starting!");
		if (turkishPowerSource)
			powerSource.turnOn();
		else
			usPowerSource.pushSwitch();
	}

	@Override
	public void stop() {
		System.out.println("TurkishHomeAppliance " + name + " stoping!");
		if (turkishPowerSource)
			powerSource.turnOff();
		else
			usPowerSource.pushSwitch();
	}
}
