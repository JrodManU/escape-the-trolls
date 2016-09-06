package escapeTheTrolls25Weekly;

public class EscapeTheTrolls {
	public static void main(String[] args) {
		EscapeTheTrolls game = new EscapeTheTrolls();
		game.initiate();
	}
	
	private MazeMap mazeMap;
	private Hero hero;
	
	private void initiate() {
		MapLoader mapLoader = new MapLoader();
		
		mazeMap = new MazeMap(mapLoader.loadMap("map"));
		hero = new Hero(this);
		
		MazeMapDrawer mazeMapDrawer = new MazeMapDrawer(this);
		mazeMapDrawer.draw();
	}
	
	public MazeMap getMazeMap() {
		return mazeMap;
	}
	
	public Hero getHero() {
		return hero;
	}
}
