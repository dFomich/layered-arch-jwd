package by.tc.task01.entity;

import by.tc.task01.entity.Oven;

public class Oven extends Appliance {

	private double powerConsumption;
	private double weight;
	private double capacity;
	private double depth;
	private double height;
	private double width;

	public Oven() {

	}

	public Oven(double powerConsumption, double weight, double capacity, double depth, double heiht, double width) {

		this.powerConsumption = powerConsumption;
		this.weight = weight;
		this.capacity = capacity;
		this.depth = depth;
		this.height = heiht;
		this.width = width;
	}

	public double getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(double powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "{" + ", powerConsumption=" + powerConsumption + ", weight=" + weight
				+ ", capacity=" + capacity + ", depth=" + depth + ", height=" + height + ", width=" + width + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Oven oven = (Oven) o;
		return Double.compare(oven.powerConsumption, powerConsumption) == 0 && Double.compare(oven.weight, weight) == 0
				&& Double.compare(oven.capacity, capacity) == 0 && Double.compare(oven.depth, depth) == 0
				&& Double.compare(oven.height, height) == 0 && Double.compare(oven.width, width) == 0;
	}

	@Override
	public int hashCode() {
		return (int) (29 * powerConsumption + 13 * weight + 7 * capacity + 5 * depth + 3 * height + width);
	}
}
