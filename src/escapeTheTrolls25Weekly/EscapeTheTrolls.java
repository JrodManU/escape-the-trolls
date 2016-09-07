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
		
		ETTFrame ettFrame = new ETTFrame(this);
		ettFrame.draw();
	}
	
	public MazeMap getMazeMap() {
		return mazeMap;
	}
	
	public Hero getHero() {
		return hero;
	}
}
