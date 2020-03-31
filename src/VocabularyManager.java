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
		if (vocabulary.voca.equals(voca)) {
			vocabulary = null;
			System.out.println("the vocabulary is deleted");
		}
	}
	public void editVoca() {
		System.out.print("Please enter a vocabulary:");
		String voca = input.nextLine();
		if (vocabulary.voca.equals(voca)) {
			int num = -1;
			while(num != 5) {
				System.out.println("** Vocabulary Info Edit Menu **");
				System.out.println(" 1. Edit vocabulary");
				System.out.println(" 2. Edit meaning of the vocabulary");
				System.out.println(" 3. Edit example sentence");
				System.out.println(" 4. Edit meaning of the example sentence");
				System.out.println(" 5. Exit");
				System.out.print("Select one number between 1 - 5:");
				num = Integer.parseInt(input.nextLine());


				if (num == 1) {
					System.out.print("Please enter a vocabulary:");
					vocabulary.voca = input.nextLine();
				}
				else if(num == 2) {
					System.out.print("Please enter the meaning of the vocabulary:");
					vocabulary.meaning = input.nextLine();
				}
				else if(num == 3) {
					System.out.print("Please enter an example sentence:");
					vocabulary.example = input.nextLine();
				}
				else if(num == 4) {
					System.out.print("Please enter the meaning of the example sentence:");
					vocabulary.meaningOfTheExample = input.nextLine();
				}
				else {
					continue;
				}
			}
		}
	}
	public void viewVoca() {
		System.out.print("Please enter a vocabulary:");
		String voca = input.nextLine();
		if (vocabulary.voca.equals(voca)) {
			vocabulary.prinitInfo();
		}
	}
}


