package simpleInterestCalculator;

import java.math.BigDecimal;

public class SimpleInterestCalculatorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00","12");
		
		BigDecimal totalValue = calculator.calculateTotalValue(5);
		
		System.out.println(totalValue);

	}

}
