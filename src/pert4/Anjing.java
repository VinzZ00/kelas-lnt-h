package pert4;

import pert4accmod.Hewan;

public class Anjing extends Hewan{

	//Attribute
	public int head;
	public int feet;
	
	private int eyes;
	private String dogName;
	
	//alt + shift + s + o shortcut bikin Constructor
	//constructor with field
	public Anjing(int head, int feet, int eyes, String dogName) {
		this.head = head;
		this.feet = feet;
		this.eyes = eyes;
		this.dogName = dogName;
		this.tipehewan = "Mamalia, Ini adalah anjing";
		System.out.println(tipehewan);
		this.sethabitat("rumah");	
//		System.out.println(this.gethabitat());
		}
	
	
	//constructor kosong default java
	public Anjing() {
		// TODO Auto-generated constructor stub
	}
	
	public void tipehewan() {
		System.out.println(this.tipehewan);
	}
	
	//construct setter getter
	//shortcut alt + shift + s + r
	
	
	
	//method
	public void barking() {
		System.out.println("Whoof - Whoof");
	}


	public int getEyes() {
		return eyes;
	}


	public void setEyes(int eyes) {
		this.eyes = eyes;
	}


	public String getDogName() {
		return dogName;
	}


	public void setDogName(String dogName) {
		this.dogName = dogName;
	}


	@Override
	public void suara() {
		// TODO Auto-generated method stub
		System.out.println();
	}

}
