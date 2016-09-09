package escapeTheTrolls25Weekly;

public class EscapeTheTrolls {
	/*\Please Note:
	|*|x is vertical axis and y is horizontal axis.
	|*|The origin is in the top right
	\*/
	public static void main(String[] args) {
		EscapeTheTrolls game = new EscapeTheTrolls();
		game.initiate();
	}
	
	private MazeMap mazeMap;
	private Hero hero;
	private InputHandler inputHandler;
	private ETTFrame ettFrame;
	
	private void initiate() {
		MapLoader mapLoader = new MapLoader();
		
		inputHandler = new InputHandler(this);
		
		mazeMap = new MazeMap(mapLoader.loadMap("map"));
		hero = new Hero(this);
		
		ettFrame = new ETTFrame(this);
		ettFrame.draw();
	}
	
	public MazeMap getMazeMap() {
		return mazeMap;
	}
	
	public Hero getHero() {
		return hero;
	}

	public InputHandler getInputHandler() {
		return inputHandler;
	}
	
	public ETTFrame getETTFrame() {
		return ettFrame;
	}
}
