package by.tc.task01.main;

import by.tc.task01.entity.Appliance;
import by.tc.task01.dao.control.Controller;
import by.tc.task01.dao.control.ControllerFactory;

public class PrintApplianceInfo {

	public static void print(Appliance appliance) {
		ControllerFactory controllerFactory = ControllerFactory.getInstance();
		Controller controller = controllerFactory.takeApplianceConrtoller(appliance);
		System.out.println(controller.takeInfo());

	}

	// you may add your own code here

}
