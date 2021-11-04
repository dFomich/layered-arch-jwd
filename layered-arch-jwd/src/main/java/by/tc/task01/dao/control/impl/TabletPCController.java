package by.tc.task01.dao.control.impl;

import by.tc.task01.entity.TabletPC;
import by.tc.task01.dao.control.Controller;

public class TabletPCController implements Controller {

	private TabletPC tabletPC;

	public TabletPCController(TabletPC tabletPC) {
		this.tabletPC = tabletPC;
	}

	@Override
	public String takeInfo() {
		return this.tabletPC.toString();
	}

	@Override
	public boolean containsValue(String key, Object value) {
		boolean answer = true;
		switch (key) {

		case "BATTERY_CAPACITY":
			if (!(tabletPC.getBatteryCapacity() == Double.parseDouble(value.toString()))) {
				answer = false;
			}
			break;
		case "DISPLAY_INCHES":
			if (!(tabletPC.getDisplayInches() == Double.parseDouble(value.toString()))) {
				answer = false;
			}
			break;
		case "MEMORY_ROM":
			if (!(tabletPC.getMemoryROM() == Double.parseDouble(value.toString()))) {
				answer = false;
			}
			break;
		case "FLASH_MEMORY_CAPACITY":
			if (!(tabletPC.getFlashMemoryCapacity() == Double.parseDouble(value.toString()))) {
				answer = false;
			}
			break;
		case "COLOR":
			if (!(tabletPC.getColor().equals(value.toString()))) {
				answer = false;
			}
			break;

		default:
			answer = false;
		}
		return answer;
	}
}
