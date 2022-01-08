package pert3latihan;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	Scanner sc = new Scanner(System.in);
	public Main() {
		// TODO Auto-generated constructor stub
		Vector<Vector<String>> students = new Vector<>();
		
		int choose;
		
		do {
			System.out.println("1. Add");
			System.out.println("2. view");
			System.out.println("3. update");
			System.out.println("4. Delete");
			System.out.println("5. Exit");
			System.out.print("Choose >> ");
			choose = sc.nextInt(); sc.nextLine();
			
			switch (choose) {
			case 1:
				String nama, domisili;
				Vector<String> student = new Vector<String>();
				
				System.out.println("Masukan nama anda");
				nama = sc.nextLine();
				
				System.out.println("Masukan domisili anda");
				domisili = sc.nextLine();
				
				student.add(nama);
				student.add(domisili);
				
				students.add(student);
				break;

			case 2:
				
				for (Vector<String> vector: students) {
					System.out.println("\n===============================\n");
						System.out.println("Nama : " + vector.get(0));
						System.out.println("Domisili :" + vector.get(1));						
						System.out.println("\n===============================\n");
				}
				break;
			case 3:
				int ind2 = 1;
				for (Vector<String> vector: students) {
					System.out.println("\n===============================\n");
						System.out.println("No. " + ind2);
						System.out.println("Nama : " + vector.get(0));
						System.out.println("Domisili :" + vector.get(1));						
						System.out.println("\n===============================\n");
						ind2++;
				}
				
				System.out.println("Mau update yg siapa?");
				int input1 = sc.nextInt(); sc.nextLine();
				Vector<String> temp = students.get((input1-1));
				
				
				for (int i = 0; i < temp.size(); i++) {
					System.out.println("No. " + (i+1));
					System.out.println(temp.get(i));
				}
				
				System.out.println("Mau update yg yang mana?");
				int input2 = sc.nextInt(); sc.nextLine();
				System.out.println("Jadi apa?");
				String penganti = sc.nextLine();
				
				temp.set((input2-1), penganti);
				
				students.set((input1-1), temp);
			break;
			
			case 4:
				int ind = 1;
				for (Vector<String> vector: students) {
					System.out.println("\n===============================\n");
						System.out.println("No. " + ind);
						System.out.println("Nama : " + vector.get(0));
						System.out.println("Domisili :" + vector.get(1));						
						System.out.println("\n===============================\n");
						ind++;
				}
				
				System.out.println("pengen hapus yg mana?");
				int input = sc.nextInt(); sc.nextLine();
				students.remove((input-1));
				break;
			}
		} while (choose != 5);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
