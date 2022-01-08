package pert6;

import java.util.Scanner;
import java.util.Vector;

import pert4.Anjing;
import pert4.anjinganggora;

public class Main {

	Scanner sc = new Scanner(System.in);
	public Main() {
		// TODO Auto-generated constructor stub
		int panjang, lebar, Choose, diameter;
//		float panjang = (float)5.23;
//		float lebar = (float)6.85;
		
//		String Panjang = "5";
//		String lebar = "6.8";
//		double panjang = 6.85;
//		double Lebar = 4.568987;
//		Persegi persegi1 = new Persegi("5", 6, "Persegi");
		
		System.out.println("Hello");
		
		System.out.println("bangun ruang apa yang ingin anda kalkulasi");
		
		String bangunRuang = sc.nextLine();
		if (bangunRuang.equals("Persegi")) {
			
		
		System.out.println("masukan panjang dan lebar persegi anda");
		
		panjang = sc.nextInt(); sc.nextLine();
		
		lebar = sc.nextInt(); sc.nextLine();

		Persegi Persegi1 = new Persegi(panjang, lebar, "Persegi");
		
		do {
			System.out.println("1. Cari Keliling?");
			System.out.println("2. Cari luas?");
			System.out.println("3. Exit");
			Choose = sc.nextInt();
			sc.nextLine();
			switch (Choose) {
			case 1:
				Persegi1.keliling();
				break;

			case 2:
				Persegi1.Luas();
				break;
			}
		} while (Choose != 3);
	} else if (bangunRuang.equals("Lingkaran")) {
			System.out.println("Masukan Diameter");
			diameter = sc.nextInt(); sc.nextLine();
			
			Lingkaran lingkaran = new Lingkaran("Lingkaran", diameter);
			
			do {
				System.out.println("1. Cari Keliling?");
				System.out.println("2. Cari luas?");
				System.out.println("3. Exit");
				Choose = sc.nextInt();
				sc.nextLine();
				switch (Choose) {
				case 1:
					lingkaran.keliling();
					break;

				case 2:
					lingkaran.Luas();
					break;
				}
			} while (Choose != 3);
	}
		
//		persegi1.Luas();
//		persegi1.keliling();
		
//		System.out.println("panjang " + persegi1.getPanjang());
//		System.out.println("Lebar " + persegi1.getLebar());
		
//		Vector<Object> vector = new Vector<Object>() {
////			@Override
////			public synchronized int capacity() {
////				// TODO Auto-generated method stub
////				return 11;
////			}
//		};
//		
//		Anjing anjingelvin = new anjinganggora();
//		
//		anjingelvin.barking();
// 		
//		System.out.println(vector.capacity());
//		
//		System.out.println("========================");
	
//		Persegi persegi2 = new Persegi((float)panjang,(float)Lebar);
//		System.out.println(persegi2.getPanjang());
//		System.out.println(persegi2.getLebar());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
