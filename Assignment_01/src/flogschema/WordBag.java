package flogschema;

public class WordBag extends LetterBag {

	private char[] word;

	
	public WordBag() {
		super();
		buildWordBag();
	}


	public void buildWordBag(){
		
		/* initialization the tree 
		 * with local dictionary file
		 */
		
	}
	
	public boolean verifyFirstTwoLetters(){
		
		/*traverse the tree with
		 * first 2 characters
		 * in-order to find whether there are valid words
		*/
		
		return true;
	}
	
	public char[] getWord() {
		return word;
	}

	public void setWord(char[] word) {
		this.word = word;
	}
	
	public boolean isCompleteWord(char[] word){
	
		boolean isComplete;
		isComplete = (word.length == 12)?true:false;
		return isComplete;
		
	}
	
	// automatic method to find the longest word
	public char[] findLongestWord(char[] currentCharSequence){
		char[] longestWord  ={};
		
		/* traverse the tree with
		 * current Char Sequence
		 * in-order to find a word with 12 characters
		 */
		
		return longestWord;
		
		
	}
	
	
	// verify word existence
	public boolean verifyInputWord(char[] inputWord){
		
		boolean isValid = true;	
		
		/* traverse the tree with
		 * input word characters
		 * find whether last character is leaf node
		 */
		
		return isValid;
	}
	
	
	public String[] searchForSimilarWords(char[] suppliedCharacters){
		
		String[] similarWords={};
		
		/* traverse the tree with
		 * supplied characters
		 * in-order to find the suffixes for complete words
		 */
		
		return similarWords;	
	}
}
