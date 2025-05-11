package board.tokens;

public class Token {
	private int house_nr;
	public Token(){
		house_nr = 0;
	}
	public Token(int houseNr){
		house_nr = houseNr;
	}
	public void setHouseNumber(int houseNumber){
	house_nr = houseNumber;
	}
	
}
