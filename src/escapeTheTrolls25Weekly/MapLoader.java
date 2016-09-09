package escapeTheTrolls25Weekly;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MapLoader {
	public char[][] loadMap(String mapName) {
		List<String> mapData;
		
		try {
			mapData = Files.readAllLines(Paths.get("resources/" + mapName + ".txt"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		
		char[][] map = new char[mapData.size()][];
		//turn into char array
		for(int i = 0; i < mapData.size(); i++) {
			map[i] = mapData.get(i).toCharArray();
		}
		return map;
	}
}
