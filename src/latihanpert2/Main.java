package latihanpert2;

import java.util.Random;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	public Main() {
		// TODO Auto-generated constructor stub
//		int a = rand.nextInt(10);
//		int b = (int) Math.round((Math.random() * 10));
		
//		System.out.println(b);
		int choose;		
		do {
			System.out.println("Happy Petshop");
			System.out.println("=============");
			System.out.println("1. Buy new Pet");
			System.out.println("2. Exit");
			System.out.print("Choose Menu >> ");
			choose = sc.nextInt(); sc.nextLine();
			
			switch (choose) {
			case 1:
				String category, type, address;
				int petprice;
				int addtionalprice;
				int harga = 0;
				String pembayaran;
				//alt + shift + z
				
				do {
					System.out.print("Choose pet category you want? [Mammals | Reptile] : ");
					category = sc.nextLine();
				} while (!(category.equals("Mammals") || category.equals("Reptile")));
				
				if (category.equals("Reptile")) {
					do {
						System.out.print("Choose pet type you want [Python | Iguana | Turtle] : ");
						type = sc.nextLine();
					} while (!(type.equals("Python") || type.equals("Iguana") || type.equals("Turtle")));	
				} else {
					
				do {
					System.out.print("Choose pet type you want [Dog | Cat | Hamster] : ");
					type = sc.nextLine();
				} while (!(type.equals("Dog") || type.equals("Cat") || type.equals("Hamster")));
				}
				
				
				do {
					System.out.print("Input your address to send the pet [MUst End with street & min. 2 words] : ");
					address = sc.nextLine();
				} while (!(address.contains(" ") && address.endsWith("street") && !address.startsWith(" ")));
				
				if (type.equals("Dog")) {
					petprice = 250;
				} else if (type.equals("Cat")) {
					petprice = 200;
				} else if (type.equals("Hamster")) {
					petprice = 150;
				} else if (type.equals("Iguana")) {
					petprice = 400;
				} else if (type.equals("Python")) {
					petprice = 450;
				}
				else {
					petprice = 300;
				}
				
				harga += petprice;
				
				if (category.equals("Mammals")) {
					addtionalprice = petprice/10; // 10% => 10/100 = 1/10 "%" => Modulus
				} else {
					addtionalprice = petprice/5;
				}
				
				harga += addtionalprice;
				
				System.out.println("Payment detail");
				System.out.println("================");
				System.out.println("Pet Category : " + category);
				System.out.println("Pet type : " + type);
				System.out.println("Address : " + address);
				System.out.println("================");
				System.out.println("Total Payment : $" + harga);
				do {
					System.out.print("Input your money: $");
					pembayaran = sc.nextLine();
				} while (String.valueOf(pembayaran).startsWith(" ") || Integer.valueOf(pembayaran) < harga);
				
				System.out.println("Payment success, your change is $" + Integer.valueOf(Integer.valueOf(pembayaran)-harga));
				System.out.println("Press enter to continue");
				sc.nextLine();
				break;
			}
		} while (choose != 2);
		
			
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
