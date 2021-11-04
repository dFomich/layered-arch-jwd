package by.tc.task01.dao.control.impl;

import by.tc.task01.entity.Oven;
import by.tc.task01.dao.control.Controller;

public class OvenController implements Controller {

	private Oven oven;

	public OvenController(Oven oven) {
		this.oven = oven;
	}

	@Override
	public String takeInfo() {
		return this.oven.toString();
	}

	@Override
	public boolean containsValue(String key, Object value) {
		boolean answer = true;
		switch (key) {

		case "POWER_CONSUMPTION":
			if (!(oven.getPowerConsumption() == Double.parseDouble(value.toString()))) {
				answer = false;
			}
			break;
		case "WEIGHT":
			if (!(oven.getWeight() == Double.parseDouble(value.toString()))) {
				answer = false;
			}
			break;
		case "CAPACITY":
			if (!(oven.getCapacity() == Double.parseDouble(value.toString()))) {
				answer = false;
			}
			break;
		case "DEPTH":
			if (!(oven.getDepth() == Double.parseDouble(value.toString()))) {
				answer = false;
			}
			break;
		case "HEIGHT":
			if (!(oven.getHeight() == Double.parseDouble(value.toString()))) {
				answer = false;
			}
			break;
		case "WIDTH":
			if (!(oven.getWidth() == Double.parseDouble(value.toString()))) {
				answer = false;
			}
			break;

		default:
			answer = false;
		}
		return answer;
	}
}
