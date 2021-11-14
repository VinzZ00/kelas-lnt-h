package pert2;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		String a = "Hello World";
		int lenght = a.length();
		System.out.println(lenght);
		
		boolean startwith = a.startsWith("Hello");
		System.out.println(startwith);
		
		boolean endwith = a.endsWith("orld");
		System.out.println(endwith);
		
		//contains
		boolean contains = a.contains("llo ");
		System.out.println("contains = " + contains);
		
		// == 
		
		int angkaa = 5;
		int angkab = 6;
		boolean angka = angkaa == angkab;
		
		String hello = "Hello";
		String hello2 = "hELLO";
		
		//equals
		boolean st = hello.equals(hello2);
		boolean st2 = hello.equalsIgnoreCase(hello2);
		System.out.println(st);
		System.out.println("ini st2 " + st2);
		
		//to lowercase
		String lower = hello2.toLowerCase();
		System.out.println(lower);
		
		//to uppercase
		String uppercase = lower.toUpperCase();
		System.out.println("upper case = " + uppercase);
		
		//concat
		String concat = "ini Concat => ".concat(uppercase);
		
		String concatb = "Nice to meet you";
		String concatc = concat.concat(concatb);
		System.out.println("Concat ke dua " + concatc);
		
		
		//split
		String[] split = concatb.split(" ");
		System.out.println(split[1]);
		
		//compareto
		String comparea = "a";
		String compareb = "A";
		System.out.println(comparea.compareTo(compareb));
		
		//lebih dari satu method
		double decimal = 10.256315;
		String format = String.valueOf(String.format("Ini adalah Decimal dengan Value %f", decimal).length());
		System.out.println(format);
		String dec = String.valueOf(decimal).concat(" Ini adalah Decimal");
		System.out.println(dec);
		
		//String imutable tidak sama dengan Array
		String hello3 = "Hello";
//		hello3 = "Helpo";
		hello3 = hello3.replace('l', 'p');
		System.out.println("INi " + hello3);
		
		char[] hello4 = {'H', 'e', 'l', 'l', 'o'};
		hello4[3] = 'P';
		System.out.println(hello4);
		
		//susbstring
		String a4 = "hello World";
		String a5 = a4.substring(1,5);
		System.out.println(a5);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
