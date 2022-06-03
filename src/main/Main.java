package main;

import java.util.Scanner;
import java.util.Vector;

import phone.Applia;
import phone.Phone1;
import phone.Samsuing;

public class Main {
	Scanner sc = new Scanner(System.in);
	Vector<Phone1> hp = new Vector();
	public void clear() {
		for (int i = 0; i < 25; i++) {
			System.out.println("");
		}
	}
	
	
	public void mainMenu() {
		System.out.println("BakSmaryphone");
		System.out.println("=================");
		System.out.println("1. Search Smartphone");
		System.out.println("2. View All Smartphone");
		System.out.println("3. Buy Smartphone");
		System.out.println("4. Exit");
		System.out.println(">> ");
	}
	
	public void subMenu() {
		System.out.println("Search Smartphone");
		System.out.println("===================");
		System.out.println("1. Applia");
		System.out.println("2. Samsuing");
		System.out.println(">> ");
	}
	
	public void searchSmartphone() {
		String cord = "";
		String address = "";
		String type = "";
		int choose = -1;
		
			do {
				subMenu();
				try {
					choose = sc.nextInt();
				} catch (Exception e) {
					choose = -1;
				}
				sc.nextLine();
			} while(choose < 1 || choose > 2);
			
			if(choose == 1) {
				do {
					System.out.println("Do you want to include your applia with charging cord?[Yes | No] (case sensitive): ");
					cord = sc.nextLine();
				}while(!(cord.equals("Yes") || cord.equals("No")));
				
				do {
					System.out.println("Type of applia phone you want to buy?[Original | Pro | Promax] (case sensitive): ");
					type = sc.nextLine();
				} while (!(type.equals("Original") || type.equals("Pro") || type.equals("Promax")));
				
//				do {
//					System.out.println("Input your house address[must be alphanumeric]: ");
//					address = sc.nextLine();
//				}while(address.toUpperCase() != null);
				
				hp.add(new Applia(cord, type, address));
			} else if(choose == 2) {
				do {
					System.out.println("Do you want to include your samsuing with charging cord?[Yes | No] (case sensitive): ");
					cord = sc.nextLine();
				}while(!(cord.equals("Yes") || cord.equals("No")));
				
				do {
					System.out.println("Type of applia phone you want to buy?[Alries | Saries | Xseries] (case sensitive): ");
					type = sc.nextLine();
				} while (!(type.equals("Alries") || type.equals("Saries") || type.equals("Xseries")));
				
//				do {
//					System.out.println("Input your house address[must be alphanumeric]: ");
//					address = sc.nextLine();
//				}while(address.toUpperCase()!=null);
				
				hp.add(new Samsuing(cord, type, address));
			}
	
		
	}
	
	public void viewAll() {
		if(hp.isEmpty()) {
			System.out.println("there is no smartphone");
		} else {
			for (int i = 0; i < hp.size(); i++) {
				if(hp.get(i) instanceof Applia) {
					System.out.println(" | " + (i+1) + " | " + hp.get(i).getCord() + " | " +  ((Applia) hp.get(i)).getAppliaType() + " | " 
							+ " - " + hp.get(i).getAddress() + " | " + hp.get(i).price() );
				} else {
					System.out.println(" | " + (i+1) + " | " + hp.get(i).getCord() + " | " +   " - " +((Samsuing) hp.get(i)).getSamsuingType() + " | " 
							 + hp.get(i).getAddress() + " | " + hp.get(i).price() );
				}
			}
		}
	}
	
	public void buy() {
		viewAll();
		if(hp.isEmpty());
		else {
			String test;
			boolean flag = false;
			System.out.println("Input the number want you buy[1..2]: ");
			test = sc.nextLine();
			
			for (int i = 0; i < hp.size(); i++) {
				if(hp.get(i).equals(test)) {
					hp.remove(i);
					flag = true;
					System.out.println("Total Price: " + hp.get(i).price());
				}
				
			}
		}
	}
	
	public Main() {
		boolean isRun = true;
		int input = -1;
		
		do {
			do {
				mainMenu();
				try {
					input = sc.nextInt();
				} catch (Exception e) {
					input = -1;
				}
				sc.nextLine();
			} while (input < 1 || input > 4);
			
			switch (input) {
			case 1:
				clear();
				searchSmartphone();
				break;
			case 2:
				clear();
				viewAll();
				break;
			case 3:
				
				clear();
				buy();
				break;
			case 4:
				clear();
				break;

			default:
				break;
			}
		} while (isRun);
	}

	public static void main(String[] args) {
		new Main();
		
	}

}
