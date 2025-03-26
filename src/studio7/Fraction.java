package studio7;

public class Fraction {
	int numerator;
	int denominator;
	int fraction = numerator/denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public double fractionSum(int numerator1, int denominator1) {
		double fraction1 = numerator1/denominator1;
		double fractionSum = fraction1 + this.fraction;
		
		return fractionSum;
	}
	
	public double fractionProduct(int numerator1, int denominator1) {
		double fraction1 = numerator1/denominator1;
		double fractionProduct = fraction1 * this.fraction;
		
		return fractionProduct;
	}
	
	public double reciprocal() {
		double reciprocal =  (numerator/denominator) * (denominator/numerator);
		
		return reciprocal;
	}
	
	
	
	
	public static void main(String[] args) {
		Fraction a = new Fraction(10,20);
		a.reciprocal();
		System.out.println(a.reciprocal());

	}

}
