package escapeTheTrolls25Weekly;

public class Hero {
	
	private EscapeTheTrolls game;
	
	private Coord position;
	
	public Hero(EscapeTheTrolls game) {
		this.game = game;
		
		position = game.getMazeMap().randomOpenCoord();
	}
}
