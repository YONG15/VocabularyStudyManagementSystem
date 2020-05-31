package vocabulary;

import java.util.Scanner;

public class Idiom extends Vocabulary {

	public Idiom(VocabularyKind kind) {	
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setVoca(input);

		setMeaning(input);

		setExample(input);

		setMeaningOfTheExample(input);
	}
	public void prinitInfo() {
		System.out.println("Kind:"+kind+"\rVocabulary:"+ voca +" \rMeaning:"+ meaning +" \rExample:"+ example +" \rMeaning of the example:"+ meaningOfTheExample );
	}
}
