package com.company;

import java.util.ArrayList;

public class Building {
	
	private boolean upgraded;
	private int position[];
	
	Building(int division, int index) {
		position = new int[2];
		position[0] = division;
		position[1] = index;
	}
	
	/**
	 * Finds the nearby hexagons.
	 * @param hexagons the hexagon array to search
	 * @return the found hexagons
	 */
	public Hexagon[] getNearbyHexagons(Hexagon[] hexagons) {
		ArrayList<Hexagon> foundHexagons = new ArrayList<>();
		
		for (int i = 0; i < hexagons.length; i++) {
			// check division
			int hexDivision = hexagons[i].getDivision();
			if (hexDivision == position[0] || hexDivision == position[0] + 1) {
				// get maxBuildingIndex
				int maxBuildingIndex;
				switch(position[0]) {
					case 0:
						maxBuildingIndex = 6;
						break;
					case 1:
						maxBuildingIndex = 18;
						break;
					case 2:
						maxBuildingIndex = 30;
						break;
					default:
						System.out.println("Error in building division");
						maxBuildingIndex = 1;
				}
				
				// get maxHexIndex
				int maxHexIndex;
				switch(hexDivision) {
					case 0:
						maxHexIndex = 1;
						break;
					case 1:
						maxHexIndex = 6;
						break;
					case 2:
						maxHexIndex = 12;
						break;
					default:
						System.out.println("Error in hex division: " + hexDivision);
						maxHexIndex = 1;
				}
				
				float dividor = maxBuildingIndex / (float)maxHexIndex;
				
				// check if same position
				if ((int)(position[1] / dividor) == hexagons[i].getIndex()) {
					foundHexagons.add(hexagons[i]);
				} else if (Math.round(position[1] / dividor) % maxHexIndex == hexagons[i].getIndex()) {
					foundHexagons.add(hexagons[i]);
				} else if ((position[1]*2) % (int)(dividor*2) == 0 && hexDivision > position[0] && (int)(position[1] / dividor) == (hexagons[i].getIndex() + 1) % maxHexIndex) {
					foundHexagons.add(hexagons[i]);
				}
			}
		}
		
		// copy arrayList into array
		Hexagon[] returnHexagons = new Hexagon[foundHexagons.size()];
		for (int i = 0; i < returnHexagons.length; i++) {
			returnHexagons[i] = foundHexagons.get(i);
		}
		
		return returnHexagons;
	}
	
	/**
	 * Checks if a single hexagon is near the building.
	 * Uses {@link Building#getNearbyHexagons(Hexagon[])} to calculate this.
	 * @param hexagon the hexagon
	 * @return true if the hexagon is near the building; otherwise false
	 */
	public boolean isNearby(Hexagon hexagon) {
		Hexagon[] hexArray = new Hexagon[1];
		hexArray[0] = hexagon;
		hexArray = getNearbyHexagons(hexArray);
		
		if (hexArray.length == 0)
			return false;
		return true;
	}

	/**
	 * Upgrades a building.
	 * Contains error checking to check if the building is already upgraded.
	 * @return true if successfully upgraded; otherwise false
	 */
	public boolean upgrade() {
		if (!upgraded) {
			upgraded = true;
			return true;
		}
		else {
			System.out.println("Building is already upgraded!");
			return false;
		}
	}
	
	/**
	 * @return upgraded
	 */
	public boolean isUpgraded() {
		return upgraded;
	}

	/**
	 * @return the division of the building
	 */
	public int getDivision() {
		return position[0];
	}
	
	/**
	 * @return the index of the building
	 */
	public int getIndex() {
		return position[1];
	}
	
	/**
	 * Sets the division
	 * @param division the division
	 */
	public void setDivision(int division) {
		this.position[0] = division;
	}
	
	/**
	 * Sets the index
	 * @param index the index
	 */
	public void setIndex(int index) {
		this.position[1] = index;
	}
}
