package Constructor;

public class Fruit {
	
	String name;
	String colour;
	WeightQuantity weight;
	FruitSize size;
    Price price;
	
public 	Fruit(String name, String colour , WeightQuantity weight , FruitSize size , Price price) {
	
	this.name=name;
	this.colour=colour;
	this.weight=weight;
	this.size=size;
	this.price=price;
	

}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getColour() {
	return colour;
}

public void setColour(String colour) {
	this.colour = colour;
}

public WeightQuantity getWeight() {
	return weight;
}

public void setWeight(WeightQuantity weight) {
	this.weight = weight;
}

public FruitSize getSize() {
	return size;
}

public void setSize(FruitSize size) {
	this.size = size;
}

public Price getPrice() {
	return price;
}

public void setPrice(Price price) {
	this.price = price;
}

}
