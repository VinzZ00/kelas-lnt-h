package pert5;

public class kucing extends Hewan implements berlari{
	
	private String jenisKucing;

	public kucing(int mata, String senjata, String habitat, String jeniskucing) {
		super(mata, senjata, habitat);
		// TODO Auto-generated constructor stub
		this.jenisKucing = jeniskucing;
		System.out.println("kucing anda telah tercetak");
	}

	@Override
	public void sounds() {
		// TODO Auto-generated method stub
		System.out.println("Miao");
	}

	//Setter getter auto complete => alt + shift + s + r
	public String getJenisKucing() {
		return jenisKucing;
	}

	public void setJenisKucing(String jenisKucing) {
		this.jenisKucing = jenisKucing;
	}

	@Override
	public void bergerak() {
		// TODO Auto-generated method stub
		System.out.println("kucing bergerak dengan cara berlari");
	}

	@Override
	public void runningsounds() {
		// TODO Auto-generated method stub
		System.out.println("grubuk-grubuk");
	}

	@Override
	public double kecepatanlari(double jarak, double waktu) {
		// TODO Auto-generated method stub
		double kecepatan;
		kecepatan = jarak/waktu;
		
		return kecepatan;
	}

	
	

}
