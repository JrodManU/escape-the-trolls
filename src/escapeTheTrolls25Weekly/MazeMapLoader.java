package escapeTheTrolls25Weekly;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MazeMapLoader {
	public List<String> loadMap(String mapName) {
		try {
			return Files.readAllLines(Paths.get("resources/" + mapName + ".txt"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
