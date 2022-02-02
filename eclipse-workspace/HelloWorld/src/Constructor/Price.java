package Constructor;

public class Price {
	
	double amount;
	PriceType priceType;
	
	public Price(double amount,PriceType priceType ) {
		
		this.amount = amount;
		this.priceType = priceType;
	}

	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public PriceType getPriceType() {
		return priceType;
	}

	public void setPriceType(PriceType priceType) {
		this.priceType = priceType;
	}
	
	

}
