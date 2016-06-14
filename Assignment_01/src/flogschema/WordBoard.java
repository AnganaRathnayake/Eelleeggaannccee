package flogschema;

public class WordBoard extends WordBag{

	private int wordLength;
	private final int POWER_COUNT = 10;
	private int[][][] placedPowers;
	private char[][] wordBoard;
	private int[][] first2LetterPositon;
	
	// Initialize word board
	
	public WordBoard(){
		
		initialSetup();
	}

	
	public void initialSetup(){
		
		
		placePowersOnTheWordBoard();
		giveFirst2Letters();
		give10letters();
		buildWordBag();
		
		
	}
	
	public int getWordLength() {
		return wordLength;
	}

	public void setWordLength(int wordLength) {
		this.wordLength = wordLength;
	}
	
	public char[][] getWordBoard() {
		return wordBoard;
	}

	public void setWordBoard(char[][] wordBoard) {
		this.wordBoard = wordBoard;
	}
	
	public int getPowerCount() {
		return POWER_COUNT;
	}
	
	public int[][][] getPlacedPowers() {
		return placedPowers;
	}

	public void setPlacedPowers(int[][][] powerIndexes) {
		this.placedPowers = powerIndexes;
	}
	
	
	public void placePowersOnTheWordBoard(){
		
		randomizePowerPositions();
	
	}
	
	
	public int[][][] randomizePowerPositions(){
		
		int[][][] randomizedPowers ={};
		
		/* ex: a[1] ={10, 15, 2} // row, column, power
		 * loop
		*/
		
		return randomizedPowers;
	}
	
	public char findPlacedLetterDirection(){
		
		char direction='v';
		
		
		return direction;
	}
	
	public void searchForWordsHorizontally(char[] newlyPlacedCharacters){
		
		
	}
	
	
	public void searchForWordsVertically(char[] newlyPlacedCharacters){
		
		
	}

	public int letterCount(){
		int numLetters = 0;
		
		
		return numLetters;
	}


	public int[][] getFirst2LetterPositon() {
		return first2LetterPositon;
	}


	public void setFirst2LetterPositon() {
		// random position but limited to center of the board
		this.first2LetterPositon = first2LetterPositon;
	}
	

	

}
