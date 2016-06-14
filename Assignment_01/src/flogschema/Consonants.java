package flogschema;

// define score given to each consonant
public enum Consonants {

	B(19),
	C(18),
	D(17),
	F(13),
	G(14),
	H(8),
	J(7),
	K(9),
	L(10),
	M(12),
	N(11),
	P(16),
	Q(21),
	R(20),
	S(21),
	T(15),
	V(23), 
	W(22),
	X(24),
	Y(25),
	Z(26);

	private final int CONSONANT_VALUE;

	private Consonants(int consonantValue) {
		CONSONANT_VALUE = consonantValue;
	}

	public int getConsonantValue() {
		return CONSONANT_VALUE;
	}

}
