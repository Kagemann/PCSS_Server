package com.company;

public class Main {
	
	Main() {
		// Building test code START
		/*
		Hexagon[] hexagons = Hexagon.generateMap();
		Building testBuilding = new Building(0, 2);
		
		// finds adjacent hexagons
		Hexagon[] nearbyHexagons = testBuilding.getNearbyHexagons(hexagons);
		for (int i = 0; i < nearbyHexagons.length; i++) {
			System.out.println(nearbyHexagons[i].getDivision() + ", " + nearbyHexagons[i].getIndex());
		}
		*/
		// Building test code END
		
		// Hexagon test code START
		Hexagon[] hexagons = Hexagon.generateMap();
		Building[] buildings = new Building[5];
		
		buildings[0] = new Building(0, 1);
		buildings[1] = new Building(0, 3);
		buildings[2] = new Building(1, 0);
		buildings[3] = new Building(1, 5);
		buildings[4] = new Building(1, 13);
		
		//System.out.println(buildings[1].getDivision() + ", " + buildings[1].getIndex());
		
		Hexagon.getHexagonByDivision(1, 2, hexagons).getNearbyPlayers(buildings);
		// Hexagon test code END
	}

    public static void main(String[] args) {
    	Main main = new Main();
    }
}
