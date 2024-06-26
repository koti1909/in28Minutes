package simpleInterestCalculator;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	
	private BigDecimal principal;
	private BigDecimal interest;
	private BigDecimal noOfYears;
	

	public SimpleInterestCalculator(String principal, String interest) {
		// TODO Auto-generated constructor stub
		BigDecimal divisor = new BigDecimal("100");
		
		this.principal = new BigDecimal(principal);
		
		BigDecimal temp = new BigDecimal(interest);
		this.interest = temp.divide(divisor);
		
	}
	
	BigDecimal calculateTotalValue(int noOfYears) {
		this.noOfYears = new BigDecimal(noOfYears);
		BigDecimal one = new BigDecimal("1");
		return interest.multiply(this.noOfYears).add(one).multiply(principal);
	}

}
