package by.tc.task01.entity;

import java.util.Objects;

import by.tc.task01.entity.Laptop;

public class Laptop extends Appliance {

	private double batteryCapacity;
	private String operationSystem;
	private double memoryROM;
	private double systemMemory;
	private double cpu;
	private double displayInchs;

	public Laptop() {

	}

	public Laptop(double batteryCapacity, String operationSystem, double memoryROM, double systemMemory, double cpu,
			double displayInchs) {

		this.batteryCapacity = batteryCapacity;
		this.operationSystem = operationSystem;
		this.memoryROM = memoryROM;
		this.systemMemory = systemMemory;
		this.cpu = cpu;
		this.displayInchs = displayInchs;
	}

	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
	}

	public double getMemoryROM() {
		return memoryROM;
	}

	public void setMemoryROM(double memoryROM) {
		this.memoryROM = memoryROM;
	}

	public double getSystemMemory() {
		return systemMemory;
	}

	public void setSystemMemory(double systemMemory) {
		this.systemMemory = systemMemory;
	}

	public double getCpu() {
		return cpu;
	}

	public void setCpu(double cpu) {
		this.cpu = cpu;
	}

	public double getDisplayInchs() {
		return displayInchs;
	}

	public void setDisplayInchs(double displayInchs) {
		this.displayInchs = displayInchs;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Laptop laptop = (Laptop) o;
		return Double.compare(laptop.batteryCapacity, batteryCapacity) == 0
				&& Double.compare(laptop.memoryROM, memoryROM) == 0
				&& Double.compare(laptop.systemMemory, systemMemory) == 0 && Double.compare(laptop.cpu, cpu) == 0
				&& Double.compare(laptop.displayInchs, displayInchs) == 0
				&& operationSystem.equals(laptop.operationSystem);
	}

	@Override
	public int hashCode() {
		return (int) (23 * batteryCapacity - Objects.hashCode(operationSystem) + 7 * memoryROM + 13 * systemMemory
				+ 29 * cpu - 5 * displayInchs);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "{" + ", batteryCapacity=" + batteryCapacity + ", operationSystem='"
				+ operationSystem + ", memoryROM=" + memoryROM + ", systemMemory=" + systemMemory + ", cpu=" + cpu
				+ ", displayInchs=" + displayInchs + '}';
	}
}
