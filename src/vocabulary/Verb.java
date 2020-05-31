package vocabulary;

import java.util.Scanner;

public class Verb extends Vocabulary {
	protected String tense;

	public Verb(VocabularyKind kind) {	
		super(kind);
	}


	public String getTense() {
		return tense;
	}

	public void setTense(String tense) {
		this.tense = tense;
	}

	public void prinitInfo() {
		System.out.println("Kind:"+kind+"\rVocabulary:"+ voca +" \rMeaning:"+ meaning +" \rTence:"+ tense +" \rExample:"+ example +" \rMeaning of the example:"+ meaningOfTheExample );
	}

	public void getUserInput(Scanner input) {
		setVoca(input);

		setMeaning(input);

		setTense(input);

		setExample(input);

		setMeaningOfTheExample(input);
	}

	public void setTense(Scanner input) {
		System.out.print("Please enter tense:");
		String tense = input.nextLine();
		this.setTense(tense);
	}


}
