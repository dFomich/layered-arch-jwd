package by.tc.task01.dao.control.impl;

import by.tc.task01.entity.Refrigerator;
import by.tc.task01.dao.control.Controller;

public class RefrigeratorController implements Controller {

	private Refrigerator refrigerator;

	public RefrigeratorController(Refrigerator refrigerator) {
		this.refrigerator = refrigerator;
	}

	@Override
	public String takeInfo() {
		return this.refrigerator.toString();
	}

	@Override
	public boolean containsValue(String key, Object value) {
		boolean answer = true;
		switch (key) {

		case "POWER_CONSUMPTION":
			if (!(refrigerator.getPowerConsumption() == Double.parseDouble(value.toString()))) {
				answer = false;
			}
			break;
		case "WEIGHT":
			if (!(refrigerator.getWeight() == Double.parseDouble(value.toString()))) {
				answer = false;
			}
			break;
		case "FREEZER_CAPACITY":
			if (!(refrigerator.getFreezerCapacity() == Double.parseDouble(value.toString()))) {
				answer = false;
			}
			break;
		case "OVERALL_CAPACITY":
			if (!(refrigerator.getOverallCapacity() == Double.parseDouble(value.toString()))) {
				answer = false;
			}
			break;
		case "HEIGHT":
			if (!(refrigerator.getHeight() == Double.parseDouble(value.toString()))) {
				answer = false;
			}
			break;
		case "WIDTH":
			if (!(refrigerator.getWidth() == Double.parseDouble(value.toString()))) {
				answer = false;
			}
			break;

		default:
			answer = false;
		}
		return answer;
	}
}
