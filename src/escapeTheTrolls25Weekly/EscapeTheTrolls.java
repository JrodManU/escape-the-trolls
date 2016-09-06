package escapeTheTrolls25Weekly;

public class EscapeTheTrolls {
	public static void main(String[] args) {
		EscapeTheTrolls game = new EscapeTheTrolls();
		game.initiate();
	}
	
	private void initiate() {
		MapLoader mapLoader = new MapLoader();
		MazeMap mazeMap = new MazeMap(mapLoader.loadMap("map"));
	}
}
