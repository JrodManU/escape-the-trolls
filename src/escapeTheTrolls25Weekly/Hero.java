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
	
	public void moveUp() {
		if(!game.getMazeMap().wallAt(position.x - 1, position.y)) {
			position.x -= 1;
		}
		game.getETTFrame().draw();
	}
	
	public void moveDown() {
		if(!game.getMazeMap().wallAt(position.x + 1, position.y)) {
			position.x += 1;
		}
		game.getETTFrame().draw();
	}
	
	public void moveLeft() {
		if(!game.getMazeMap().wallAt(position.x, position.y - 1)) {
			position.y -= 1;
		}
		game.getETTFrame().draw();
	}
	
	public void moveRight() {
		if(!game.getMazeMap().wallAt(position.x, position.y + 1)) {
			position.y += 1;
		}
		game.getETTFrame().draw();
	}
}
