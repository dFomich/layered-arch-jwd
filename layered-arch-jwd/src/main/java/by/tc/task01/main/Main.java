package by.tc.task01.main;

import by.tc.task01.entity.criteria.SearchCriteria.*;

import java.util.List;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {

	public static void main(String[] args) {
		List<Appliance> appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());// "Oven"
		criteriaOven.add(Oven.CAPACITY.toString(), 32);

		appliance = service.find(criteriaOven);
		for (int i = 0; i < appliance.size(); i++) {

			PrintApplianceInfo.print(appliance.get(i));
		}
		System.out.println();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "red");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 15);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);

		appliance = service.find(criteriaTabletPC);

		for (int i = 0; i < appliance.size(); i++) {
			PrintApplianceInfo.print(appliance.get(i));
		}
		System.out.println();

		//////////////////////////////////////////////////////////////////

		System.out.println("Ovens:");
		appliance = service.find(new Criteria(Oven.class.getSimpleName()));
		for (int i = 0; i < appliance.size(); i++) {
			PrintApplianceInfo.print(appliance.get(i));
		}

	}

}