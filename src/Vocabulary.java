
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
	
	public void prinitInfo() {
		System.out.println("Vocabulary:"+ voca +" Meaning:"+ meaning +" Example:"+ example +" Meaning of the example:"+ meaningOfTheExample );
	}

}
