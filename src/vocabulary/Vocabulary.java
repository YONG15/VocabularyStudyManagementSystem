package vocabulary;

import java.util.Scanner;

public class Vocabulary {
	protected VocabularyKind kind = VocabularyKind.Noun;
	protected String voca;
	protected String meaning;
	protected String example;
	protected String meaningOfTheExample;

	public Vocabulary(){}

	public Vocabulary(String voca,String meaning,String example,String meaningOfTheExample){
		this.voca=voca;
		this.meaning=meaning;
		this.example=example;
		this.meaningOfTheExample=meaningOfTheExample;
	}

	public Vocabulary(String voca,String meaning){
		this.voca=voca;
		this.meaning=meaning;
	}

	public VocabularyKind getKind() {
		return kind;
	}

	public void setKind(VocabularyKind kind) {
		this.kind = kind;
	}

	public String getVoca() {
		return voca;
	}

	public void setVoca(String voca) {
		this.voca = voca;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public String getExample() {
		return example;
	}

	public void setExample(String example) {
		this.example = example;
	}

	public String getMeaningOfTheExample() {
		return meaningOfTheExample;
	}

	public void setMeaningOfTheExample(String meaningOfTheExample) {
		this.meaningOfTheExample = meaningOfTheExample;
	}

	public void prinitInfo() {
		System.out.println("Kind:"+kind+"\rVocabulary:"+ voca +" \rMeaning:"+ meaning +" \rExample:"+ example +" \rMeaning of the example:"+ meaningOfTheExample );
	}

	public void printEng() {
		System.out.println("Vocabulary:"+ voca +" \rExample:"+ example);
	}
	public void getUserInput(Scanner input) {
		System.out.print("Please enter a vocabulary:");
		String voca = input.nextLine();
		this.setVoca(voca);

		System.out.print("Please enter the meaning of the vocabulary:");
		String meaning = input.nextLine();
		this.setMeaning(meaning);

		System.out.print("Please enter an example sentence:");
		String example = input.nextLine();
		this.setExample(example);

		System.out.print("Please enter the meaning of the example sentence:");
		String meaningOfTheExample = input.nextLine();
		this.setMeaningOfTheExample(meaningOfTheExample);
	}

}
