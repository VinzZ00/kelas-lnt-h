package pert4accmod;

import java.util.Scanner;

public abstract class Hewan {

	protected String tipehewan;
	public boolean bernafas;
	String habitat;
	
	public Hewan() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void suara();
	
	public void sethabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public String gethabitat() {
		return habitat;
	}
 
}
