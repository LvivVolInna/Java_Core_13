package hw13;

public class Person {
	
	protected double weight;
	protected double heigth;
	public Person(double weight, double height) {
		super();
		this.weight = weight;
		this.heigth = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return heigth;
	}
	public void setHeight(double height) {
		this.heigth = height;
	}
	@Override
	public String toString() {
		return "People [weight = " + weight + ", heigth = " + heigth + "]";
	}
	
	

}
