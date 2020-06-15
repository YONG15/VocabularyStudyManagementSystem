package vocabulary;

import java.util.Scanner;

public interface VocabularyInput {
	public String getVoca();
	public String getMeaning();
	public String getExample();
	public String getMeaningOfTheExample();
	public void setVoca(String voca);
	public void setMeaning(String meaning);
	public void setExample(String example);
	public void setMeaningOfTheExample(String meaningOfTheExample);

	public void getUserInput(Scanner input);
	public void prinitInfo();

	public void setVoca(Scanner input);
	public void setMeaning(Scanner input);
	public void setExample(Scanner input);
	public void setMeaningOfTheExample(Scanner input);

}
