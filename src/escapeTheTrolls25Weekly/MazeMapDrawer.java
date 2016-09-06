package escapeTheTrolls25Weekly;

public class MazeMapDrawer {
	
	private EscapeTheTrolls game;
	
	public MazeMapDrawer(EscapeTheTrolls game) {
		this.game = game;
	}
	
	public void draw() {
		for(int x = 0; x < game.getMazeMap().getMapSize().x; x++) {
			String row = "";
			for(int y = 0; y < game.getMazeMap().getMapSize().y; y++) {
				//will add checker for trolls later
				if(game.getHero().getPosition().x == x && game.getHero().getPosition().y == y) {
					row += game.getHero().getMarker();
				} else {
					row += game.getMazeMap().getCharAt(x, y);
				}
			}
			System.out.println(row);
		}
	}
}
