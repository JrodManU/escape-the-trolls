package escapeTheTrolls25Weekly;

public class Hero {
	
	private final char MARKER = 'O';
	
	private EscapeTheTrolls game;
	
	private Coord position;
	
	public Hero(EscapeTheTrolls game) {
		this.game = game;
		
		position = game.getMazeMap().randomOpenCoord();
	}
	
	public Coord getPosition() {
		return position;
	}
	
	public char getMarker() {
		return MARKER;
	}
}
