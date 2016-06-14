package play;


import flogschema.WordBoard;
import gamesplayers.Player;

public class GamePlay {

	public static void main(String[] args) {
		
		// testing code
		
		Player player = new Player(null, null);
		
		player.setGameName("GameName");
		System.out.println(player.getGameName());
		
		player.setPlayerName("Player");
		System.out.println(player.getPlayerName());
		
		WordBoard wordBoard1 = new WordBoard();
		
		
	}

}
