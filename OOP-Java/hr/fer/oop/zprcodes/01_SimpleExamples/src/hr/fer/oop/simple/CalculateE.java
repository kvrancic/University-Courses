package hr.fer.oop.zprcodes;

public class CalculateE {
	
	public static void main(String[] args) {
		//call the method that would calculate e 
        //by calculating Taylor series sum
		double sum = ePowerX(1);
		System.out.printf("e = %.6f%n", sum);
	}

    // Calculates e^x for Taylor series, according to formula:
	//e^x=1+x+(x^2/(2!))+(x^3/(3!))+(x^4/(4!))+...	 
	public static double ePowerX(double x) { 
		double sum = 0.0;
		double power = 1.0; 
		double factorial = 1.0;
		sum += 1.0;
		for(int i = 1; i < 10; i++) {  
			power = power * x; 
			factorial = factorial * i;
			sum += power/factorial;
		}
		return sum;
	}
}
