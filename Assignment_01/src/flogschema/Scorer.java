package flogschema;

public class Scorer extends WordBag {

	private static double roundScore = 0;
	private static double currentScore = 0;
	private static double highScore;
	private double powerBonus;
	private double wordLengthBonus;
	private final static int TWELVE_LETTER_WORD_MULTIPLICATION = 10;
	private final static int roundBonus = 100;
	private static boolean roundEnd = false;
	
	public static int getTwelveLetterWordMultiplication() {
		
		return TWELVE_LETTER_WORD_MULTIPLICATION;
	}

	public double getRoundScore() {
		return roundScore;
	}
	
	public void setRoundScore(int roundScore) {
		Scorer.roundScore = roundScore;
	}

	public double getCurrentScore() {
		return currentScore;
	}

	public void setCurrentScore(double currentScore) {
		Scorer.currentScore = currentScore;
	}
	
	public static double getHighScore() {
		return highScore;
	}

	public static void setHighScore(double highScore) {
		Scorer.highScore = highScore;
	}
	
	public double getPowerBonus() {
		return powerBonus;
	}

	public void setPowerBonus(double powerBonus) {
		this.powerBonus = powerBonus;
	}

	public double getWordLengthBonus() {
		return wordLengthBonus;
	}

	public void setWordLengthBonus(double wordLengthBonus) {
		this.wordLengthBonus = wordLengthBonus;
	}

	public static int getRoundbonus() {
		return roundBonus;
	}

	public static boolean isRoundEnd() {
		
		/* check whether there is not more positions to place letters,
		/*or no valid words
		*/
		
		return roundEnd;
	}

	public static void setRoundEnd(boolean roundEnd) {
		Scorer.roundEnd = roundEnd;
	}

	public void calculateRoundScore(){
		
		roundScore = (Scorer.roundEnd)?getCurrentScore()+roundBonus:0;
		
	}
	
	/* calculate penalty given to the weakest players 
	 * based on option choosed
	 */
	
	public double calculatePenalty(int selectedPenaltyOption) {

		double scoreWithPenalty = 0.0;

		switch (selectedPenaltyOption) {

		case 0:
			scoreWithPenalty = getRoundScore() * PenaltyOptions.LOW_DAMAGE.getDAMAGE();
			break;
		case 1:
			scoreWithPenalty = getRoundScore() * PenaltyOptions.MEDIUM_DAMAGE.getDAMAGE();
			break;
		case 2:
			scoreWithPenalty = getRoundScore() * PenaltyOptions.HIGH_DAMAGE.getDAMAGE();
			break;
		}

		return scoreWithPenalty;
	}

	public double calculateScoreForValidWord() {

		boolean isCompleteWord;
		boolean isValidWord;


		isValidWord = verifyInputWord(getWord());
		isCompleteWord = isCompleteWord(getWord());

		currentScore = (isValidWord && isCompleteWord) ? 
				calculate12LetterWordScore() : calculatePartialWord();

		return currentScore;
	}

	public double calculate12LetterWordScore() {

		double score = getCurrentScore();
		score = (score + calculatePartialWord()) * getTwelveLetterWordMultiplication();

		return score;

	}

	public double calculatePartialWord() {

		double score = getCurrentScore();
		
		/*
		 * use enum Consonants and enum Vowel values to calculate
		 * partial word score
		 * */
		
		return score;
	}

	
	public void addPowerBonus(){
		
		double score = getCurrentScore();
		
		/* calculate power bonus 
		* by moving along the 3D array
		*/
		
		score += powerBonus;
		currentScore = score;
		
	}
	
	
	public double[] randomizePaneltyOptions(){
	
		double[] shuffledPenaltyOptions ={};
		
		/* shuffling the penalty options,
		 * using random numbers
		 */
		
		
		return shuffledPenaltyOptions;
	}
	
	public void addWordLengthBonus(){
		
		double score = getCurrentScore();
		
		/* calculate  
		* by moving along the 3D array
		*/
		
		score += wordLengthBonus;
		currentScore = score;
		
	}


	public void checkForHighestScore(){
		
		
	}

}
