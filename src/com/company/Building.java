package com.company;

import java.util.ArrayList;

public class Building {
	
	private boolean upgraded;
	private Position position;
	private static ArrayList<Building> buildings = new ArrayList<>();
	
	private Building(Position inPos) {
		position = inPos;
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
	 * This method should be used instead of calling the constructor since it contains error checking.
	 * @param division the division
	 * @param index the index
	 * @return the constructed building; returns null if no building can be built
	 */
	public static Building build(Position inPos) {
		// error checking
		if (Position.getLength(getBuildingPositions(), inPos) == 2) {
			System.out.println("Building here:    " + inPos.getDivision() + ", " + inPos.getIndex());
			Building building = new Building(inPos);
			buildings.add(building);
			Road.longestRoad();
			return building;
		}
		
		System.out.println("Can't build here: " + inPos.getDivision() + ", " + inPos.getIndex());
		return null;
	}
	
	/**
	 * Finds a building by a given division and index
	 * @param division the division
	 * @param index the index
	 * @return the found building; null if no building is found
	 */
	public static Building getByPosition(Position inPos) {
		for (int i = 0; i < buildings.size(); i++) {
			if (buildings.get(i).getDivision() == inPos.getDivision() && buildings.get(i).getIndex() == inPos.getIndex())
				return buildings.get(i);
		}
		
		return null;
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
		return position.getDivision();
	}
	
	/**
	 * @return the index of the building
	 */
	public int getIndex() {
		return position.getIndex();
	}
	
	/**
	 * Sets the division
	 * @param division the division
	 */
	public void setDivision(int division) {
		position.setDivision(division);
	}
	
	/**
	 * Sets the index
	 * @param index the index
	 */
	public void setIndex(int index) {
		position.setIndex(index);
	}
	
	/**
	 * TODO
	 * @return
	 */
	public static ArrayList<Building> getBuildings() {
		return buildings;
	}
	
	/**
	 * TODO
	 * @return
	 */
	public Position getPosition() {
		return position;
	}
	
	/**
	 * TODO
	 * @return
	 */
	public static ArrayList<Position> getBuildingPositions() {
		ArrayList<Position> positions = new ArrayList<>();
		for (int i = 0; i < buildings.size(); i++) {
			positions.add(buildings.get(i).getPosition());
		}
		return positions;
	}
}
