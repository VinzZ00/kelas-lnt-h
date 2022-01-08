package pert5;

import java.util.Scanner;
import java.util.Vector;

public class Zoo {

	Scanner sc = new Scanner(System.in);
	Vector<Hewan> hewan = new Vector<Hewan>();
	
	public Zoo() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Hello ther who is your name?");
		String nama = sc.nextLine();
		int choose;
		
		do {
			System.out.println("Hello " + nama);
			System.out.println("What you wanna do?");
			System.out.println("1. Input kucing");
			System.out.println("2. Input burung");
			System.out.println("3. View");
			System.out.println("4. view how its walk");
			System.out.println("5. view the sounds of flying bird");
			System.out.println("6. view the running of cat");
			System.out.println("7. kecepatan lari kucing");
			System.out.print(">> ");
			choose = sc.nextInt();
			sc.nextLine();
			int mata;
			String senjata, habitat;
			switch (choose) {
			case 1:
				String jeniskucing;
				System.out.println("how much eyes?");
				mata = sc.nextInt();
				sc.nextLine();
				System.out.println("what is its weapon?");
				senjata = sc.nextLine();
				System.out.println("What is its habitat");
				habitat = sc.nextLine();
				System.out.println("what type of cat is it?");
				jeniskucing = sc.nextLine();

				hewan.add(new kucing(mata, senjata, habitat, jeniskucing));
				break;

			case 2:

				String jenisburung;
				System.out.println("how much eyes?");
				mata = sc.nextInt();
				sc.nextLine();
				System.out.println("what is its weapon?");
				senjata = sc.nextLine();
				System.out.println("What is its habitat");
				habitat = sc.nextLine();
				System.out.println("what type of bird is it?");
				jeniskucing = sc.nextLine();

				hewan.add(new burung(mata, senjata, habitat, jeniskucing));
				break;

			case 3:

				for (Hewan hewan2 : hewan) {
					if (hewan2 instanceof kucing) {
						kucing kucing = (kucing) hewan2;
						System.out.printf("your cat have %s eyes\n", kucing.getMata());
						System.out.println("its weapon is " + kucing.getSenjata());
						System.out.println("its habitat is " + kucing.getHabitat());
						System.out.printf("this is %s cat\n", kucing.getJenisKucing());
						System.out.println("=======================================\n");
					} else {
						burung burung = (burung) hewan2;
						System.out.printf("your bird have %s eyes\n", burung.getMata());
						System.out.println("its weapon is " + burung.getSenjata());
						System.out.println("its habitat is " + burung.getHabitat());
						System.out.printf("this is %s bird\n", burung.getJenisburung());
						System.out.println("=======================================\n");
					}
				}
				sc.nextLine();
				break;
				
			case 4:
				for (Hewan hewan2 : hewan) {
					if (hewan2 instanceof burung) {
						burung burung = (burung) hewan2;
//						System.out.printf("This is a %s bird, its transport by", burung.getJenisburung());
						burung.bergerak();
					} else {
						kucing kucing = (kucing) hewan2;
//						System.out.printf("this is a %s cat, its transport by", kucing.getJenisKucing());
						kucing.bergerak();
					}
				}
				sc.nextLine();
				break;
			case 5:
				for (Hewan hewan2 : hewan) {
					if (hewan2 instanceof burung) {
						burung burung = (burung) hewan2;
//						System.out.printf("the %s birds flying sounds like",burung.getJenisburung());
						burung.flyingsounds();
						sc.nextLine();
					}
				}
				break;
			case 6:
				for (Hewan hewan2 : hewan) {
					if (hewan2 instanceof kucing) {
						kucing kucing = (kucing) hewan2;
//						System.out.printf("the %s cat running sounds like", kucing.getJenisKucing());
						kucing.runningsounds();
						sc.nextLine();
					}
				}
			case 7:
				for (Hewan hewan2 : hewan) {
					if (hewan2 instanceof kucing) {
						kucing kucing = (kucing) hewan2;
//						System.out.printf("the %s cat running sounds like", kucing.getJenisKucing());
						System.out.println("Masukan jarak dan waktu");
						double jarak = sc.nextInt(); sc.nextLine();
						double waktu = sc.nextInt(); sc.nextLine();
						double kecepatan = kucing.kecepatanlari(jarak, waktu);
						System.out.println("Kecepatan dia adalah " + kecepatan);
						sc.nextLine();
						}
				}
				break;
			}
		} while (choose != 8);
	}

	public static void main(String[] args) {
		new Zoo();
	}

}
