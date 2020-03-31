import java.util.Scanner;

public class VocabularyManager {
	Vocabulary vocabulary;
	Scanner input;
	VocabularyManager(Scanner input){
		this.input = input;
	}
	public void addVoca() {
		vocabulary = new Vocabulary();
		System.out.print("Please enter a vocabulary:");
		vocabulary.voca = input.nextLine();
		System.out.print("Please enter the meaning of the vocabulary:");
		vocabulary.meaning = input.nextLine();
		System.out.print("Please enter an example sentence:");
		vocabulary.example = input.nextLine();
		System.out.print("Please enter the meaning of the example sentence:");
		vocabulary.meaningOfTheExample = input.nextLine();
		System.out.println("vocabulary: "+vocabulary.voca);
		System.out.println("meaning of the vocabulary: "+vocabulary.meaning);
		System.out.println("example sentence: "+vocabulary.example);
		System.out.println("meaning of the example sentence: "+vocabulary.meaningOfTheExample);

	}
	public void deleteVoca() {
		System.out.print("Please enter a vocabulary:");
		String voca = input.nextLine();
		if (vocabulary == null) {
			System.out.println("the vocabulary has not been resistered");
			return;
		}
		if (vocabulary.voca == voca) {
			vocabulary = null;
			System.out.println("the vocabulary is deleted");
		}
	}
	public void editVoca() {
		System.out.print("Please enter a vocabulary:");
		String voca = input.nextLine();
		if (vocabulary.voca == voca) {
			System.out.println("the vocabulary to be edited is " + voca);
		}
	}
	public void viewVoca() {
		System.out.print("Please enter a vocabulary:");
		String voca = input.nextLine();
		if (vocabulary.voca == voca) {
			vocabulary.prinitInfo();
		}
	}
}


