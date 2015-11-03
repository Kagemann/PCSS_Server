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
		/*
		Hexagon[] hexagons = Hexagon.generateMap();
		Building[] buildings = new Building[5];
		
		buildings[0] = new Building(0, 1);
		buildings[1] = new Building(0, 3);
		buildings[2] = new Building(1, 0);
		buildings[3] = new Building(1, 5);
		buildings[4] = new Building(1, 13);
		
		System.out.println("Buildings nearby: " + Hexagon.getHexagonByDivision(1, 2, hexagons).getNearbyBuildings(buildings));
		*/
		// Hexagon test code END
		
		Hexagon[] hexagons = Hexagon.generateMap();
		Building[] buildings = new Building[10];
		
		buildings[0] = Building.build(new Position(0, 0));
		buildings[1] = Building.build(new Position(1, 17));
		buildings[2] = Building.build(new Position(1, 0));
		buildings[3] = Building.build(new Position(1, 1));
		buildings[4] = Building.build(new Position(2, 2));
		buildings[5] = Building.build(new Position(2, 1));
		/*buildings[1] = Building.build(0, 1);
		buildings[2] = Building.build(1, 1);
		buildings[3] = Building.build(1, 0);
		buildings[4] = Building.build(2, 2);
		buildings[5] = Building.build(2, 1);*/
	}

    public static void main(String[] args) {
    	Main main = new Main();
    }
}
