package Encapsulation;

public class TestHouse {
	
	public static void main(String[] args) {
		House house1 = new House();
		house1.setYear(2010);
		house1.setColor("Beige");
		house1.setbuildType("Condo");
		house1.setRooms(4);
		
		System.out.println("House1 Details: " +
		"\n" + house1.getbuildType() + "\n" + house1.getColor() 
		+ "\n" + house1.getRooms() + "\n" + house1.getYear());
		
		House house2 = new House();
		house2.setYear(2013);
		house2.setColor("ForestGreen");
		house2.setbuildType("Ranch Style");
		house2.setRooms(6);
		
		System.out.println("House2 Details: " +
				"\n" + house2.getbuildType() + "\n" + house2.getColor() 
				+ "\n" + house2.getRooms() + "\n" + house2.getYear());
				
	}

}
