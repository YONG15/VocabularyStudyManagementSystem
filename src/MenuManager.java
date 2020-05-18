import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		VocabularyManager vocabularyManager = new VocabularyManager(input);

		selectMenu(input, vocabularyManager);
	}

	public static void selectMenu(Scanner input, VocabularyManager vocabularyManager) {
		int num = -1;


		while(num != 5) {
			try {
				showMenu();
				num = Integer.parseInt(input.nextLine());

				switch(num){
				case 1:
					vocabularyManager.addVoca();
					break;
				case 2:
					vocabularyManager.deleteVoca();
					break;
				case 3:
					vocabularyManager.editVoca();
					break;
				case 4:
					vocabularyManager.viewVocabularies();
					break;
				case 5:
					break;
				default:
					System.out.println("Please put an integer between 1 and 5!");
					continue;
				}
			}
			catch(NumberFormatException e){
				System.out.println("Please put an integer between 1 and 5!");
				num = -1;
			}
		}
	}

	public static void showMenu() {
		System.out.println("*** Vocabulary Study Management System Menu ***");
		System.out.println(" 1. Add vocabulary");
		System.out.println(" 2. Delete vocabulary");
		System.out.println(" 3. Edit vocabulary");
		System.out.println(" 4. View vocabularies");
		System.out.println(" 5. Exit");
		System.out.print("Select one number between 1 - 5:");
	}

}