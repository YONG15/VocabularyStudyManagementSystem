import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;


		while(num != 6) {
			System.out.println("*** Vocabulary Study Management System Menu ***");
			System.out.println(" 1. Add vocabulary");
			System.out.println(" 2. Delete vocabulary");
			System.out.println(" 3. Edit vocabulary");
			System.out.println(" 4. View vocabulary");
			System.out.println(" 5. Show a menu");
			System.out.println(" 6. Exit");
			System.out.print("Select one number between 1 - 6:");
			num = input.nextInt();
			if (num == 1) {
				addVoca();
			}
			else if(num == 2) {
				deleteVoca();
			}
			else if(num == 3) {
				editVoca();
			}
			else if(num == 4) {
				viewVoca();
			}
			else {
				continue;
			}
		}
	}

	public static void addVoca() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a vocabulary:");
		String voca = input.nextLine();
		System.out.print("Please enter the meaning of the vocabulary:");
		String meaning = input.nextLine();
		System.out.print("Please enter an example sentence:");
		String example = input.nextLine();
		System.out.print("Please enter the meaning of the example sentence:");
		String meaningOfTheExample = input.nextLine();
		System.out.println("vocabulary: "+voca);
		System.out.println("meaning of the vocabulary: "+meaning);
		System.out.println("example sentence: "+example);
		System.out.println("meaning of the example sentence: "+meaningOfTheExample);

	}
	public static void deleteVoca() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a vocabulary:");
		String voca = input.nextLine();
	}
	public static void editVoca() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a vocabulary:");
		String voca = input.nextLine();
	}
	public static void viewVoca() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a vocabulary:");
		String voca = input.nextLine();
	}
}
