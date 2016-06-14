package flogschema;

//define score given to each vowel
public enum Vowels {

	A(2),
	E(1),
	I(3),
	O(4),
	U(5);
	
	private final int VOWEL_VALUES;
	
	private Vowels(int vowelValues) {
		VOWEL_VALUES = vowelValues;
	}

	public int getVowelValues() {
		return VOWEL_VALUES;
	}
	
}
