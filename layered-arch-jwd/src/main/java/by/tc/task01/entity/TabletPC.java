package by.tc.task01.entity;

import java.util.Objects;

import by.tc.task01.entity.TabletPC;

public class TabletPC extends Appliance {

	private double batteryCapacity;
	private double displayInches;
	private double memoryROM;
	private double flashMemoryCapacity;
	private String color;

	public TabletPC() {
	}

	public TabletPC(double batteryCapacity, double displayInches, double memoryROM, double flashMemoryCapacity,
			String color) {

		this.batteryCapacity = batteryCapacity;
		this.displayInches = displayInches;
		this.memoryROM = memoryROM;
		this.flashMemoryCapacity = flashMemoryCapacity;
		this.color = color;
	}

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public double getDisplayInches() {
		return displayInches;
	}

	public void setDisplayInches(double displayInches) {
		this.displayInches = displayInches;
	}

	public double getMemoryROM() {
		return memoryROM;
	}

	public void setMemoryROM(double memoryROM) {
		this.memoryROM = memoryROM;
	}

	public double getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}

	public void setFlashMemoryCapacity(double flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		TabletPC tabletPC = (TabletPC) o;
		return Double.compare(tabletPC.batteryCapacity, batteryCapacity) == 0
				&& Double.compare(tabletPC.displayInches, displayInches) == 0
				&& Double.compare(tabletPC.memoryROM, memoryROM) == 0
				&& Double.compare(tabletPC.flashMemoryCapacity, flashMemoryCapacity) == 0
				&& color.equals(tabletPC.color);
	}

	@Override
	public int hashCode() {
		return (int) (29 * batteryCapacity + 23 * displayInches + 13 * memoryROM + 7 * flashMemoryCapacity
				+ Objects.hashCode(color));
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "{" + " batteryCapacity=" + batteryCapacity + ", displayInches="
				+ displayInches + ", memoryROM=" + memoryROM + ", flashMemoryCapacity=" + flashMemoryCapacity
				+ ", color='" + color + '}';
	}

}
