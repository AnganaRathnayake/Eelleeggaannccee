package flogschema;

public class LetterBag extends FlogGame{

	private char[] tenLetters;
	private char[] first2Letters;
	private char[] usedLetters;
	
	
	public char[] getUsedLetters() {
		return usedLetters;
	}

	public void setUsedLetters(char[] usedLetters) {
		this.usedLetters = usedLetters;
	}
	
	public char[] give10letters(){
		
		
		simulateScrabbleLetterBag();
		
		
		return tenLetters;
	}
	
	
	public void simulateScrabbleLetterBag(){
		
		/* generate bag of letters for the game
		 * Random
		 */
		replicateLetter();
	}
	
	
	public void replicateLetter(){
	
		usedLetters = getUsedLetters();
		
		/* add letter to scrabble bag
		 * for removed one
		 */
		
	}
	
	
	public char[] giveFirst2Letters(){
		
		WordBag wordBag = new WordBag();
		
		return first2Letters;
	}
	
	public char exchangeLetters(char exchangeLetter){
		
		boolean isVowel = false;
		
		isVowel = checkForVowel(exchangeLetter);;
		char newLetter = (isVowel)?giveConsonant():giveVowel();	
		
		return newLetter;
	}

	public boolean checkForVowel(char exchangeLetter){
		
		/* loop through enum and
		 * detect whether it is a vowel
		 */
		
		return true;
	}
	
	
	public char giveConsonant(){
		char consonant='c';
		/* randomly give a consonant
		 * */
		return consonant;
	}

	public char giveVowel(){
		char vowel='a';
		/* randomly give a vowel
		 * */
	
		return vowel;
	}
	

	
}
