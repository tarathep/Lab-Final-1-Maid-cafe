package Model;

import java.util.ArrayList;

public class Order {
	private ArrayList<Model.Menu> order;
	private Model.Customer customer;
	
	public Order(Model.Customer customer,ArrayList<Model.Menu> order) {
		this.customer = customer;
		this.order=order;
	}
	
	
	

}
