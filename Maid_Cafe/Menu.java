package Maid_Cafe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Menu {
	public static Queue orders = new LinkedList<>();
	public static ArrayList<Model.Menu> order = new ArrayList(); 
	
	public static ArrayList <Model.Menu> menus = new ArrayList();
	
	public static double sum =0;
	
	public Menu() {
		menus.add(new Model.Menu("0","Kumatan Hamburge", 100.0));
		menus.add(new Model.Menu("1","Unicorn Parfait", 150.00 ));
		menus.add(new Model.Menu("2","Seal Parfait", 120.0));
		menus.add(new Model.Menu("3","Kuma Croquette Curry", 100.0));
		menus.add(new Model.Menu("4","Curry Rice Kumatan", 100.0));
		menus.add(new Model.Menu("5","Buddy Waffle", 120.0));
		menus.add(new Model.Menu("6","Bear Parfait", 150.0));
		menus.add(new Model.Menu("7","Kuma Dreamin", 130.0));
		menus.add(new Model.Menu("8","Sparkling Peachy Milky", 160.0));
	}
	
	
	
	public void RequestOrder(Customer customers) {
		Scanner  sc = new Scanner(System.in);
		for(int i=0;i<menus.size();i++) {
			System.out.println("ID("+menus.get(i).getId()+") "+menus.get(i).getName()+" Price("+menus.get(i).getPrice()+")");
		}
		
		System.out.println("-------------------------------------");
		
		System.out.print("Enter Customer id: ");
		String cid = sc.next();
		
		while(true) {
			System.out.print("Enter Menu Id: ");
			String mid = sc.next();
			System.out.print("Enter amount: ");
			String amount = sc.next();
			
			System.out.print("Do you want continue ? (y/n)");
			
			
			sum +=Double.parseDouble(amount) * menus.get(Integer.parseInt(mid)).getPrice();
			order.add(menus.get(Integer.parseInt(mid)));
			if(sc.next().equals("n")) {
				break;
			}
			
		}
		
		
		System.out.println("----------------------\nTotal price : ("+sum+")");
		orders.add(new Model.Order(customers.getCustomer(Integer.parseInt(cid)),order));
	}
	
	public void OutOrder() {
		if(order.size() !=0) {
			order.remove(order.size()-1);
			orders.poll();
			System.out.print("Order ID out"+order.size());
		}else {
			System.out.println("Order is Empty!");
		}
		
	}
	public void ListOrderWait() {
		System.out.println(orders.size());
	}
	


}
