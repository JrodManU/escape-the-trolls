package escapeTheTrolls25Weekly;

import java.util.ArrayList;
import java.util.List;

public class MazeMap {
	private final char WALL_CHAR = '#';
	private final char OPEN_SPACE_CHAR = ' ';
	private final char EXIT_CHAR = 'X';
	
	private char[][] map;
	private Coord exit;
	private ArrayList<Coord> openSpaces;
	
	
	public MazeMap(char[][] map) {
		this.map = map;
		
		exit = findExit();
		openSpaces = findOpenSpaces();
	}
	
	public boolean wallAt(int x, int y) {
		return map[x][y] == WALL_CHAR;
	}
	
	public Coord randomOpenCoord() {
		return openSpaces.get((int) Math.floor(Math.random() * openSpaces.size()));
	}
	
	//Top left corner is (0,0) 
	private Coord findExit() {
		for(int x = 0; x < map.length; x++) {
			for(int y = 0; y < map[0].length; y++) {
				if(map[x][y] == EXIT_CHAR) {
					return new Coord(x,y);
				}
			}
		}
		System.out.println("Could not find exit");
		//default exit
		return new Coord(0,0);
	}
	
	private ArrayList<Coord> findOpenSpaces() {
		ArrayList<Coord> coords = new ArrayList<Coord>();
		
		for(int x = 0; x < map.length; x++) {
			for(int y = 0; y < map[0].length; y++) {
				//We could use !wallAt() but that would let player spawn on exit
				if(map[x][y] == OPEN_SPACE_CHAR) {
					coords.add(new Coord(x, y));
				}
			}
		}
		
		return coords;
	}
}
