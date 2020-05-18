import java.util.ArrayList;
import java.util.Scanner;

import vocabulary.Adjective;
import vocabulary.Adverb;
import vocabulary.Idiom;
import vocabulary.Noun;
import vocabulary.Verb;
import vocabulary.Vocabulary;
import vocabulary.VocabularyInput;
import vocabulary.VocabularyKind;

public class VocabularyManager {
	ArrayList<VocabularyInput> vocabularies = new ArrayList<VocabularyInput>();
	Scanner input;
	VocabularyManager(Scanner input){
		this.input = input;
	}

	public void addVoca() {
		int kind = 0;
		VocabularyInput vocabularyInput;
		while(kind != 1 && kind !=2) {
			try {
				System.out.println("1 for Noun");
				System.out.println("2 for Verb");
				System.out.println("3 for Adjective");
				System.out.println("4 for Adverb");
				System.out.println("5 for Idiom");
				System.out.print("Select num for Vocabulary Kind between 1 and 5:");
				kind = Integer.parseInt(input.nextLine());
				switch(kind) {
				case 1:
					vocabularyInput = new Noun(VocabularyKind.Noun);
					vocabularyInput.getUserInput(input);
					vocabularies.add(vocabularyInput);
					break;
				case 2:
					vocabularyInput = new Verb(VocabularyKind.Verb);
					vocabularyInput.getUserInput(input);
					vocabularies.add(vocabularyInput);
					break;				
				case 3:
					vocabularyInput = new Adjective(VocabularyKind.Adjective);
					vocabularyInput.getUserInput(input);
					vocabularies.add(vocabularyInput);
					break;				
				case 4:
					vocabularyInput = new Adverb(VocabularyKind.Adverb);
					vocabularyInput.getUserInput(input);
					vocabularies.add(vocabularyInput);
					break;				
				case 5:
					vocabularyInput = new Idiom(VocabularyKind.Idiom);
					vocabularyInput.getUserInput(input);
					vocabularies.add(vocabularyInput);
					break;				
				default:
					System.out.println("Please put an integer between 1 and 5!");
				}
			}
			catch(NumberFormatException e) {
				System.out.println("Please put an integer between 1 and 5!");
				kind = -1;
			}
		}
	}
	public void deleteVoca() {
		System.out.print("Please enter a vocabulary:");
		String voca = input.nextLine();
		int index = findIndex(voca);
		for (int i = 0; i<vocabularies.size(); i++) {
			if (vocabularies.get(i).getVoca().equals(voca)) {
				index = i;
				break;
			}
		}
		removefromVocabularies(index, voca);

	}

	public int findIndex(String voca) {
		int index = -1;
		for (int i = 0; i<vocabularies.size(); i++) {
			if (vocabularies.get(i).getVoca().equals(voca)) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int removefromVocabularies(int index, String voca) {
		if(index >= 0) {
			vocabularies.remove(index);
			System.out.println("the vocabulary '" + voca + "' is deleted");
			return 1;
		}
		else {
			System.out.println("the vocabulary has not been resistered");
			return -1;
		}
	}

	public void editVoca() {
		System.out.print("Please enter a vocabulary:");
		String vocabul = input.nextLine();
		for (int i = 0; i<vocabularies.size(); i++) {
			VocabularyInput vocabulary = vocabularies.get(i);
			if (vocabulary.getVoca().equals(vocabul)) {
				int num = -1;
				while(num != 5) {
					try {
						showEditMenu();
						num = Integer.parseInt(input.nextLine());

						switch(num) {
						case 1:
							vocabulary.setVoca(input);
							break;
						case 2:
							vocabulary.setMeaning(input);
							break;
						case 3:
							vocabulary.setExample(input);
							break;
						case 4:
							vocabulary.setMeaningOfTheExample(input);
							break;
						default:
							System.out.println("Please put an integer between 1 and 5!");
							continue;
						}
					}
					catch(NumberFormatException e) {
						System.out.println("Please put an integer between 1 and 5!");
						num = -1;
					}
				}
				break;
			}
		}
	}
	public void viewVocabularies() {
		System.out.println("# of registered vocabularies:" + vocabularies.size());
		for (int i = 0; i<vocabularies.size(); i++) {
			vocabularies.get(i).prinitInfo();
			System.out.println();
		}
	}



	public void showEditMenu() {
		System.out.println("** Vocabulary Info Edit Menu **");
		System.out.println(" 1. Edit vocabulary");
		System.out.println(" 2. Edit meaning of the vocabulary");
		System.out.println(" 3. Edit example sentence");
		System.out.println(" 4. Edit meaning of the example sentence");
		System.out.println(" 5. Exit");
		System.out.print("Select one number between 1 - 5:");
	}
}


