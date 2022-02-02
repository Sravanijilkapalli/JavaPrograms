package Constructor;

public class FruitMain {
	
	public static void main(String[] args) {
		
		Price applePrice = new Price(10.1 ,PriceType.DOLLAR);
		Price pearsPrice = new Price(16.1 ,PriceType.RUPEES);
		
		Price newApplePrice = new Price(10 ,PriceType.DOLLAR);
		
		WeightQuantity appleweigth = new WeightQuantity (  1.1 , WeightType.KG);
		WeightQuantity pearsweigth = new WeightQuantity (  1.2 , WeightType.LB);

		
		Fruit w1=new Fruit("Apple","Red" , appleweigth , FruitSize.MEDIUM , applePrice );
		
		Fruit w2=new Fruit("pears" , "yellow" , pearsweigth , FruitSize.SMALL ,pearsPrice );
		
		System.out.println(w1.getName());
		
		System.out.println(w2.getColour());
		System.out.println(w1.getPrice().getAmount() + " " + w1.getPrice().getPriceType() );
		FruitUtilises.updatePrice(w1 ,newApplePrice   , FruitSize.BIG);
		
		System.out.println(w1.getPrice().getAmount()+" "+w1.getPrice().getPriceType() + " for "+w1.getSize());
	
		System.out.println(w1.getWeight().getQuantity() + " " + w1.getWeight().getWeighttype());
	}

}
