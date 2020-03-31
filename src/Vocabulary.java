
public class Vocabulary {

	String voca;
	String meaning;
	String example;
	String meaningOfTheExample;

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

	public void prinitInfo() {
		System.out.println("Vocabulary:"+ voca +" \rMeaning:"+ meaning +" \rExample:"+ example +" \rMeaning of the example:"+ meaningOfTheExample );
	}

	public void printEng() {
		System.out.println("Vocabulary:"+ voca +" \rExample:"+ example);
	}

}
