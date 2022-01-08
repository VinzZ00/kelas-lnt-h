package pert5;

public abstract class Hewan {

	private int mata;
	private String senjata;
	private String habitat;
	
	//shortcut constructor alt + shift + s + o
	public Hewan(int mata, String senjata, String habitat) {
		super();
		this.mata = mata;
		this.senjata = senjata;
		this.habitat = habitat;
	}
	
	public abstract void sounds();

	public int getMata() {
		return mata;
	}

	public void setMata(int mata) {
		this.mata = mata;
	}

	public String getSenjata() {
		return senjata;
	}

	public void setSenjata(String senjata) {
		this.senjata = senjata;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public abstract void bergerak();
	

}
