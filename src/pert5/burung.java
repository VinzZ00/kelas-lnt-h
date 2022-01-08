package pert5;

public class burung extends Hewan implements terbang{
	
	public burung(int mata, String senjata, String habitat, String jenisburung) {
		super(mata, senjata, habitat);
		// TODO Auto-generated constructor stub
		this.jenisburung = jenisburung;
		System.out.println("burung anda telah tercetak");
	}

	private String jenisburung;

	@Override
	public void sounds() {
		// TODO Auto-generated method stub
		System.out.println("Chirp");
		
	}

	@Override
	public void bergerak() {
		// TODO Auto-generated method stub
		System.out.println("burung bergerak dengan cara terbang");
	}

	public String getJenisburung() {
		return jenisburung;
	}

	public void setJenisburung(String jenisburung) {
		this.jenisburung = jenisburung;
	}

	@Override
	public void flyingsounds() {
		// TODO Auto-generated method stub
		System.out.println("whoosh");
	}

	@Override
	public double kecepatanterbang(double jarak, double waktu) {
		double kecepatan;
		kecepatan = jarak/waktu;
		
		return kecepatan;
		
		// TODO Auto-generated method stub
		
	}
	
	

}
