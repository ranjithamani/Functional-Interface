package com.xworkz.habba.dto;
import java.io.Serializable;
import com.xworkz.market.dto.constants.Religion;

public class HabbaDTO implements Serializable {


	private String name;
	private String region;
	private int noOfDays;
	private Religion religion;
	private String food;
	private boolean shouldBath;
	private boolean wakeupEarly;

	public HabbaDTO() {
	}

	public HabbaDTO(String name, String region, int noOfDays, Religion religion, String food, boolean shouldBath,
			boolean wakeupEarly) {
		super();
		this.name = name;
		this.region = region;
		this.noOfDays = noOfDays;
		this.religion = religion;
		this.food = food;
		this.shouldBath = shouldBath;
		this.wakeupEarly = wakeupEarly;
	}

	@Override
	public String toString() {
		return "HabbaDTO [name=" + name + ", region=" + region + ", noOfDays=" + noOfDays + ", religion=" + religion
				+ ", food=" + food + ", shouldBath=" + shouldBath + ", wakeupEarly=" + wakeupEarly + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((religion == null) ? 0 : religion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HabbaDTO other = (HabbaDTO) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (religion != other.religion)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public Religion getReligion() {
		return religion;
	}

	public void setReligion(Religion religion) {
		this.religion = religion;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public boolean isShouldBath() {
		return shouldBath;
	}

	public void setShouldBath(boolean shouldBath) {
		this.shouldBath = shouldBath;
	}

	public boolean isWakeupEarly() {
		return wakeupEarly;
	}

	public void setWakeupEarly(boolean wakeupEarly) {
		this.wakeupEarly = wakeupEarly;
	}
	

	}


