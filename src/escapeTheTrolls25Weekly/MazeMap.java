package escapeTheTrolls25Weekly;

public class MazeMap {
	private final char WALL_CHAR = '#';
	private final char OPEN_SPACE_CHAR = ' ';
	private final char EXIT_CHAR = 'X';
	
	private char[][] map;
	private Coord exit;
	
	
	public MazeMap(char[][] map) {
		this.map = map;
		
		exit = findExit();
	}
	
	public boolean wallAt(int x, int y) {
		return map[x][y] == WALL_CHAR;
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
}
