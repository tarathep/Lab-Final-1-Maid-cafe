package Model;

public class Menu {
	String Name;
	double price;
	String id;
	
	public Menu(String id,String Name, double price) {
		this.Name=Name;
		this.price=price;
		this.id=id;
	}
	public void setName(String name) {
		this.Name=Name;
	}
	public String getName() {
		return this.Name=Name;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public double getPrice() {
		return this.price=price;
	}
	public String getId() {
		return this.id;
	}
	

}
