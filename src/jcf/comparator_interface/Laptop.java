package jcf.comparator_interface;

public class Laptop {
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
		return "Id: " + id + ", Processor: " + processor + ", Price: " + price;
	}
}
