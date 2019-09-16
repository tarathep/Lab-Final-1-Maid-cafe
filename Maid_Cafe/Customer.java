package Maid_Cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
	
	private ArrayList<Model.Customer> customers = new ArrayList();
	private static int genid=-1;
	
	public Customer() {
		
	}
	
	public void Register() {
		Scanner sn = new Scanner(System.in);
		do {
			Model.Customer customer = new Model.Customer();
			String input;
			
			
			while(true) {
				System.out.print("Enter Name: ");
				input =  sn.next();
				if(IsDigit(input) && !(input.isEmpty())) {
					break;
				}else {
					System.out.println("ERROR has digit");
				}
			}
			customer.setName(input);
			
			
			while(true) {
				System.out.print("Enter NickName: ");
				input =  sn.next();
				if(IsDigit(input)&& !(input.isEmpty())) {
					break;
				}else {
					System.out.println("ERROR has digit");
				}
			}
			customer.setNickname(input);
			
			
			
			genid = genid+1;
					
			customer.setId(genid+"");
			
			
			System.out.print("Enter Address: ");
			customer.setAddress(sn.next());
			
			
			while(true) {
				System.out.print("Enter birthday (DDMMYYYY): ");
				input =  sn.next();
				if(!(input.isEmpty()) && !(IsDigit(input)) ) {
					break;
				}else {
					System.out.println("ERROR ");
				}
			}
			customer.setBirthday(input);
			
			
			
			while(true) {
				System.out.print("Enter tel: ");
				input =  sn.next();
				if(!(input.isEmpty()) && !(IsDigit(input)) ) {
					break;
				}
			}
			customer.setTel(input);
			
			
			do {
				System.out.print("Enter gender: ");
				input = sn.next();
			}while(!(input.equals("M")) && !(input.equals("F")));
			customer.setGender(input);
			
			
			do {
				System.out.print("Enter type(M/R): ");
				input = sn.next();
			}while(!(input.equals("M")) && !(input.equals("R")) && (input.isEmpty()));
			customer.setType(input);
			
			
			
			customers.add(customer);
			
			System.out.print("Do you want Continue(y/n) :");
		}while(sn.next().equals("y"));
	}
	
	
	
	public ArrayList<Model.Customer> getCustomers(){
		return this.customers;
	}
	
	public void ListCustomer() {
		for(int i=0;i<getCustomers().size();i++) {
			System.out.println("Customer ID>"+getCustomers().get(i).getId());
			System.out.println("Customer Name>"+getCustomers().get(i).getName());
			System.out.println("Customer Type>"+getCustomers().get(i).getType());
		}
	}
	
	public Model.Customer getCustomer(int id){
		return this.customers.get(id);
	}
	private boolean IsDigit(String str) {

		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	public Model.Customer getCustomer(String id) {
		for(int i = 0 ;i<customers.size();i++) {
			if(customers.get(i).getId().equals(id))
				return customers.get(i);
		}
		return null;
			
	}
	
	
	
}



