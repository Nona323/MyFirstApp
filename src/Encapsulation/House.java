package Encapsulation;

public class House {

	private int year;
	private String color;
	private String buildType;
	private int rooms;

	public int getYear() {
		return year;

	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;

	}

	public void setColor(String color) {
		this.color = color;

	}

	public void setbuildType(String buildType) {
		this.buildType = buildType;

	}

	public String getbuildType() {
		return buildType;

	}

	public void setRooms(int rooms) {
		if (rooms > 2) {
			this.rooms = rooms;
		}
	}

	public int getRooms() {
		return rooms;
	}

}
