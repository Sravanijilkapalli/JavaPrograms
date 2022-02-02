package Constructor;

public class WeightQuantity {
	
	WeightType weighttype;
	
	double quantity;
	
	
	WeightQuantity(  double quantity , WeightType weighttype ){
		
		this.weighttype=weighttype;
		
		this.quantity=quantity;
		
	}


	public WeightType getWeighttype() {
		return weighttype;
	}


	public void setWeighttype(WeightType weighttype) {
		this.weighttype = weighttype;
	}


	public double getQuantity() {
		return quantity;
	}


	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	

}
