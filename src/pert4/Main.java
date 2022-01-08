package pert4;

import java.util.Scanner;

import pert4accmod.Hewan;

public class Main {
	
	public Main() {
		// TODO Auto-generated constructor stub
		Anjing Hachiko = new Anjing();
		Hachiko.feet = 4;
		Hachiko.head = 1;
		Hachiko.setEyes(2);
		Hachiko.setDogName("Hachiko");
		System.out.println("hachiko has " + Hachiko.getEyes() + " Eyes");
		
		Anjing anjing2 = new Anjing(1, 4, 2, "Budi");
		anjing2.suara();
		anjing2.tipehewan();
		
//		
		Anjing anjing3 = Hachiko;
//		int a = 5;
//		int b = a;
		
		System.out.println("nama anjing sebelum diset " + anjing3.getDogName());
		anjing3.setDogName("Anjing Elvin");
		System.out.println("nama anjing sesudah diset " + anjing3.getDogName());
		
		
		
//		Hewan kucing = new Hewan();
////		kucing.sethabitat("Hutan");
//		System.out.println(kucing.gethabitat());
////		kucing.bernafas = true;
//		
//		System.out.println(kucing.bernafas);
//		kucing.suara();
//		kucing.tipehewan = "Mamalia";
		
		segipanjang segipanjang1 = new segipanjang();
		
		int luas = segipanjang1.luas(5, 8);
		System.out.println(luas);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
