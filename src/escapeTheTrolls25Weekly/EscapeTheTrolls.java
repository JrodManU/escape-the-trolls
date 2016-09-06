package escapeTheTrolls25Weekly;

public class EscapeTheTrolls {
	public static void main(String[] args) {
		EscapeTheTrolls game = new EscapeTheTrolls();
		game.initiate();
	}
	
	private MazeMap mazeMap;
	
	private void initiate() {
		MapLoader mapLoader = new MapLoader();
		mazeMap = new MazeMap(mapLoader.loadMap("map"));
		Hero hero = new Hero(this);
	}
	
	public MazeMap getMazeMap() {
		return mazeMap;
	}
}
