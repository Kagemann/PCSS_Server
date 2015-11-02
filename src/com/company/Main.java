package com.company;

<<<<<<< HEAD
public class Main {
	
	Main() {
		// Building test code START
		Hexagon[] hexagons = Hexagon.generateMap();
		Building testBuilding = new Building(0, 2);
		
		// finds adjacent hexagons
		Hexagon[] nearbyHexagons = testBuilding.getNearbyHexagons(hexagons);
		for (int i = 0; i < nearbyHexagons.length; i++) {
			System.out.println(nearbyHexagons[i].getDivision() + ", " + nearbyHexagons[i].getIndex());
		}
		// Building test code END
	}

    public static void main(String[] args) {
    	Main main = new Main();
=======
/*public class Main {

    public static void main(String[] args) {




>>>>>>> origin/master
    }
}*/
