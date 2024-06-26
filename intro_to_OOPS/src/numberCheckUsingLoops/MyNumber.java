package numberCheckUsingLoops;

public class MyNumber {
	
	private int number;

	public MyNumber(int number) {
		
		this.number = number;
	}
	
	//Prime number check
	boolean isPrime() {
		int count =0;
		
		if(number<2) {
			return false;
		}
		
		for(int i=2;i<=number;i++) {
			if(number%i == 0) {
				count++;
			}
			if(count>1)
				return false;
		}
		return true;
	}
	
	//Sum of all the numbers up to N
	int sumUptoN() {
		return number*(number-1)/2;
	}
	
	//sum of all divisors of number N
	int sumOfDivisors() {
		int sum =0;
		for(int i=2;i<number;i++) {
			if(number%i == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	//printing a number triangle till number N
	void numberTriangle() {
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.printf("%d" + " ",j);
			}
			System.out.println();
		}
	}

}
