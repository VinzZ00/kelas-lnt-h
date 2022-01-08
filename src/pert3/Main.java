package pert3;

import java.util.ArrayList;
import java.util.Vector;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
//		int[] arrst = new int[4];
//		
//		arrst[0] = 1;
//		arrst[1] = 2;
//		arrst[2] = 3;
//		arrst[3] = 4;
//		
//		
//		
//		for (int i = 0; i < arrst.length; i++) {
//			System.out.println(arrst[i]);
//		}
////		================
//		arrst[0] = 2;
////		================
//		System.out.println("\n============\n");
//		
//		for (int i : arrst) {
//			System.out.println(i);
//		}
//		
//		System.out.println("\n+++++++++++++++++++++++++\n");
//		
//		Vector<String> vec = new Vector<String>();
//		
//		vec.add("Budi"); //0
//		vec.add("andi"); //1
//		vec.add("dodi"); //2
//		
//		System.out.println(vec.size());
//		System.out.println(vec.capacity());
//		
//		for (int i = 0; i < vec.size(); i++) {
//			System.out.println("No. " + (i+1) );
//			System.out.println(vec.get(i));
//		}
//		
////		==============================
//		vec.set(0, "Rudi");
////		vec.removeAll(vec);
//		vec.add(2, "elvin");
////		==============================
//		System.out.println("\n=============================\n");
//		
//		System.out.println(vec.size());
//		System.out.println(vec.capacity());
//		
//		int i = 1;
//		for (String string : vec) {
//			System.out.println("No. " + i);
//			System.out.println(string);
//			i++;
//		}
		
		int[][] arr2d = new int[2][2];
		
		arr2d[0][0] = 1;
		arr2d[0][1] = 2;
		arr2d[1][0] = 3;
		arr2d[1][1] = 4;
		
		
		for (int i = 0; i < arr2d.length; i++) {
			for (int j = 0; j < arr2d[i].length; j++) {
				System.out.println(arr2d[i][j]);
			}
		}
		
		ArrayList<ArrayList<String>> arrlist2d = new ArrayList<ArrayList<String>>();
		
			ArrayList<String> arrlist1d = new ArrayList<String>();
			arrlist1d.add("Elvin");
			arrlist1d.add("Riau");
			
		arrlist2d.add(arrlist1d);
		
		ArrayList<String> arrlist1d2 = new ArrayList<String>();
		arrlist1d2.add("Budi");
		arrlist1d2.add("Riau");
		
		arrlist2d.add(arrlist1d2);
		
		for (int i = 0; i < arrlist2d.size(); i++) {
			for (String string : arrlist2d.get(i)) {
				System.out.println(string);
			}
			System.out.println("=======");
		}
//			

	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
