/****************************************************************************
 *
 * Created by: James Sanii
 * Created on: March 2018
 * Enumeration of planets
 *
 ****************************************************************************/

public enum EnumPlanets {
	MERCURY (1),
 	VENUS   (2),
 	EARTH   (3),
 	MARS    (4),
    JUPITER (5),
    SATURN  (6),
    URANUS  (7),
    NEPTUNE (8);
	private final int planetNumber;	
	
	private EnumPlanets (int planetNumber) {
		this.planetNumber = planetNumber;
	}
	public static void main(String[] args) {
		for ( EnumPlanets planetChoice : EnumPlanets.values()) {
			System.out.println(planetChoice + " is the considered the " 
			+ planetChoice.planetNumber + " closest planet to the sun.");
			}
		}
	}
	

