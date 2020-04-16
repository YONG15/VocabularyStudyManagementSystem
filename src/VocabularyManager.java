import java.util.ArrayList;
import java.util.Scanner;

import vocabulary.Adjective;
import vocabulary.Adverb;
import vocabulary.Idiom;
import vocabulary.Verb;
import vocabulary.Vocabulary;
import vocabulary.VocabularyKind;

public class VocabularyManager {
	ArrayList<Vocabulary> vocabularies = new ArrayList<Vocabulary>();
	Scanner input;
	VocabularyManager(Scanner input){
		this.input = input;
	}

	public void addVoca() {
		int kind = 0;
		Vocabulary vocabulary;
		while(kind != 1 && kind !=2) {
			System.out.println("1 for Noun");
			System.out.println("2 for Verb");
			System.out.println("3 for Adjective");
			System.out.println("4 for Adverb");
			System.out.println("5 for Idiom");
			System.out.print("Select num for Vocabulary Kind between 1 and 5:");
			kind = Integer.parseInt(input.nextLine());
			if(kind == 1) {
				vocabulary = new Vocabulary();
				vocabulary.getUserInput(input);
				vocabularies.add(vocabulary);
				break;
			}
			else if(kind == 2) {
				vocabulary = new Verb();
				vocabulary.getUserInput(input);
				vocabularies.add(vocabulary);
				break;
			}
			else if(kind == 3) {
				vocabulary = new Adjective();
				vocabulary.getUserInput(input);
				vocabularies.add(vocabulary);
				break;
			}
			else if(kind == 4) {
				vocabulary = new Adverb();
				vocabulary.getUserInput(input);
				vocabularies.add(vocabulary);
				break;
			}
			else if(kind == 5) {
				vocabulary = new Idiom();
				vocabulary.getUserInput(input);
				vocabularies.add(vocabulary);
				break;
			}
			else {
				System.out.print("Select num for Vocabulary Kind between 1 and 2:");
			}
		}
	}
	public void deleteVoca() {
		System.out.print("Please enter a vocabulary:");
		String voca = input.nextLine();
		int index = -1;
		for (int i = 0; i<vocabularies.size(); i++) {
			if (vocabularies.get(i).getVoca().equals(voca)) {
				index = i;
				break;
			}
		}

		if(index >= 0) {
			vocabularies.remove(index);
			System.out.println("the vocabulary '" + voca + "' is deleted");
		}
		else {
			System.out.println("the vocabulary has not been resistered");
			return;
		}
	}
	public void editVoca() {
		System.out.print("Please enter a vocabulary:");
		String vocabul = input.nextLine();
		for (int i = 0; i<vocabularies.size(); i++) {
			Vocabulary vocabulary = vocabularies.get(i);
			if (vocabulary.getVoca().equals(vocabul)) {
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
						String voca = input.nextLine();
						vocabulary.setVoca(voca);
					}
					else if(num == 2) {
						System.out.print("Please enter the meaning of the vocabulary:");
						String meaning = input.nextLine();
						vocabulary.setMeaning(meaning);
					}
					else if(num == 3) {
						System.out.print("Please enter an example sentence:");
						String example = input.nextLine();
						vocabulary.setExample(example);
					}
					else if(num == 4) {
						System.out.print("Please enter the meaning of the example sentence:");
						String meaningOfTheExample = input.nextLine();
						vocabulary.setMeaningOfTheExample(meaningOfTheExample);
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}
	public void viewVocabularies() {
		//		System.out.print("Please enter a vocabulary:");
		//		String voca = input.nextLine();
		System.out.println("# of registered vocabularies:" + vocabularies.size());
		for (int i = 0; i<vocabularies.size(); i++) {
			vocabularies.get(i).prinitInfo();
			System.out.println();
		}
	}
}


