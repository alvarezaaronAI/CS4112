package Assignment3;

public class Number {
	int number = 0;
	
	public Number(int numberInput) {
		this.number = numberInput;
	}
	
	
	
	public int getNumber() {
		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}



	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.number);
		
		return sb.toString();
	}
}
