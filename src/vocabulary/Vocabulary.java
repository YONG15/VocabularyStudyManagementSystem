package vocabulary;

import java.io.Serializable;
import java.util.Scanner;

public abstract class Vocabulary implements VocabularyInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2175606133997983142L;
	protected VocabularyKind kind = VocabularyKind.Noun;
	protected String voca;
	protected String meaning;
	protected String example;
	protected String meaningOfTheExample;

	public Vocabulary(){}

	public Vocabulary(VocabularyKind kind){
		this.kind = kind;
	}

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

	public Vocabulary(VocabularyKind kind, String voca,String meaning,String example,String meaningOfTheExample){
		this.kind = kind;
		this.voca=voca;
		this.meaning=meaning;
		this.example=example;
		this.meaningOfTheExample=meaningOfTheExample;
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

	public abstract void prinitInfo();

	public void setVoca(Scanner input) {
		System.out.print("Please enter a vocabulary:");
		String voca = input.nextLine();
		this.setVoca(voca);
	}

	public void setMeaning(Scanner input) {
		System.out.print("Please enter the meaning of the vocabulary:");
		String meaning = input.nextLine();
		this.setMeaning(meaning);
	}

	public void setExample(Scanner input) {
		System.out.print("Please enter an example sentence:");
		String example = input.nextLine();
		this.setExample(example);
	}

	public void setMeaningOfTheExample(Scanner input) {
		System.out.print("Please enter the meaning of the example sentence:");
		String meaningOfTheExample = input.nextLine();
		this.setMeaningOfTheExample(meaningOfTheExample);
	}

	public void printEng() {
		System.out.println("Vocabulary:"+ voca +" \rExample:"+ example);
	}


}
