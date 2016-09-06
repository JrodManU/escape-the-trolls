package escapeTheTrolls25Weekly;

public class Hero {
	//going to use <>V^ for direction purposes, V default
	private char MARKER = 'V';
	
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
