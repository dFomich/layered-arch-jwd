package by.tc.task01.entity;

import java.util.Objects;

import by.tc.task01.entity.Speakers;

public class Speakers extends Appliance {

	private double powerConsumption;
	private int numberOfSpeakers;
	private String frequency;
	private double cordLength;

	public Speakers() {
	}

	public Speakers(double powerConsumption, int numberOfSpeakers, String frequency, double cordLength) {

		this.powerConsumption = powerConsumption;
		this.numberOfSpeakers = numberOfSpeakers;
		this.frequency = frequency;
		this.cordLength = cordLength;
	}

	public double getPowerConsumption() {
		return powerConsumption;
	}

	public void setPowerConsumption(double powerConsumption) {
		this.powerConsumption = powerConsumption;
	}

	public int getNumberOfSpeakers() {
		return numberOfSpeakers;
	}

	public void setNumberOfSpeakers(int numberOfSpeakers) {
		this.numberOfSpeakers = numberOfSpeakers;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public double getCordLength() {
		return cordLength;
	}

	public void setCordLength(double cordLength) {
		this.cordLength = cordLength;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Speakers speakers = (Speakers) o;
		return Double.compare(speakers.powerConsumption, powerConsumption) == 0
				&& numberOfSpeakers == speakers.numberOfSpeakers && Double.compare(speakers.cordLength, cordLength) == 0
				&& frequency.equals(speakers.frequency);
	}

	@Override
	public int hashCode() {
		return (int) (29 * powerConsumption + 23 * numberOfSpeakers + Objects.hashCode(frequency) + 13 * cordLength);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "Speakers [powerConsumption=" + powerConsumption + ", numberOfSpeakers="
				+ numberOfSpeakers + ", frequency=" + frequency + ", cordLength=" + cordLength + ", getClass()=" + "]";
	}

}
