package escapeTheTrolls25Weekly;

import javax.swing.*;
import java.awt.*;

public class MazeMapDrawer extends JFrame {

	private Font displayFont;

	private EscapeTheTrolls game;
	private JTextArea textArea;
	
	public MazeMapDrawer(EscapeTheTrolls game) {
		this.game = game;
		initializeTextArea();
		initializeJFrame();
	}


	public void draw() {
		textArea.setText("");

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
			textArea.append(row + "\n");
		}
	}

	private void initializeTextArea() {
		textArea = new JTextArea(game.getMazeMap().getMapSize().x, game.getMazeMap().getMapSize().y);
		textArea.setEditable(false);

		displayFont = new Font("monospaced", Font.PLAIN, 16);
		textArea.setFont(displayFont);
	}

	private void initializeJFrame() {
		setLayout(new GridLayout());
		add(textArea);
		pack();
		setVisible(true);
	}
}
