package studio7;

public class Die {
	int numSides;
	
public Die(int numSides) {
	this.numSides = numSides;
}

public int dieRoll() {
	int dieRoll = (int)(Math.random()* numSides + 1);
	return dieRoll;
}








public static void main(String[] args) {
	Die a = new Die(8);
	a.dieRoll();
	System.out.println(a.dieRoll());
	
	
	}
}