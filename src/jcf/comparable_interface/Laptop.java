package jcf.comparable_interface;

public class Laptop implements Comparable<Laptop>{
	int id;
	String processor;
	double price;
	
	Laptop(int id, String processor, double price) {
		this.id = id;
		this.processor = processor;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "id: " + id + ", processor: " + processor + ", price: " + price;
	}
	
	// ascending order sorting based on id
	@Override
	public int compareTo(Laptop lap) {
		return this.id - lap.id;
	}
	
}
