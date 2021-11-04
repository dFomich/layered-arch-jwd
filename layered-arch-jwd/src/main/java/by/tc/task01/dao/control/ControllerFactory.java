package by.tc.task01.dao.control;

import by.tc.task01.entity.*;
import by.tc.task01.dao.control.impl.*;

public final class ControllerFactory {

	private static final ControllerFactory instance = new ControllerFactory();

	private ControllerFactory() {
	}

	public static ControllerFactory getInstance() {
		return instance;
	}

	public Controller takeApplianceConrtoller(Appliance appliance) {

		if (appliance.getClass() == Oven.class) {
			return new OvenController((Oven) appliance);
		}
		if (appliance.getClass() == Laptop.class) {
			return new LaptopController((Laptop) appliance);
		}
		if (appliance.getClass() == Refrigerator.class) {
			return new RefrigeratorController((Refrigerator) appliance);
		}
		if (appliance.getClass() == Speakers.class) {
			return new SpeakersController((Speakers) appliance);
		}
		if (appliance.getClass() == TabletPC.class) {
			return new TabletPCController((TabletPC) appliance);
		}
		if (appliance.getClass() == VacuumCleaner.class) {
			return new VacuumCleanerController((VacuumCleaner) appliance);
		}
		return null;
	}

}
