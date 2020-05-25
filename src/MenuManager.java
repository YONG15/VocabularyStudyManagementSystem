import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		VocabularyManager vocabularyManager = getObject("vocabularymanager.ser");
		if(vocabularyManager == null) {
			vocabularyManager = new VocabularyManager(input);
		}
		else {
			vocabularyManager.setScanner(input);
		}
		selectMenu(input, vocabularyManager);
		putObject(vocabularyManager, "vocabularymanager.ser");
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
					logger.log("add a vocabulary");
					break;
				case 2:
					vocabularyManager.deleteVoca();
					logger.log("delete a vocabulary");
					break;
				case 3:
					vocabularyManager.editVoca();
					logger.log("edit a vocabulary");
					break;
				case 4:
					vocabularyManager.viewVocabularies();
					logger.log("view a list of vocabularies");
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

	public static VocabularyManager getObject(String filename) {
		VocabularyManager vocabularyManager = null;



		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			vocabularyManager = (VocabularyManager) in.readObject();

			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return vocabularyManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return vocabularyManager;
	}

	public static void putObject(VocabularyManager vocabularyManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(vocabularyManager);

			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}