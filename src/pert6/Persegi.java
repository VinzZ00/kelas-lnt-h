package pert6;

public class Persegi <X, Y> extends BangunRuang{

	
	
	private int Panjang;
	private int Lebar;
	public int keliling;
	public int luas;
	
	public Persegi (X panjang, Y lebar, String namaBangunRuang) {
		super(namaBangunRuang);
		if (panjang.getClass().toString().contains("String") || lebar.getClass().toString().contains("String")) {
			if (panjang.getClass().toString().contains("String")) {
				Panjang = Integer.valueOf(String.valueOf(panjang));
			} else {
				Panjang = (int) panjang;
			}
			
			if (lebar.getClass().toString().contains("String")) {
				Lebar = Integer.valueOf(String.valueOf(lebar));
			} else {
				Lebar = (int) lebar;
			}
			
			System.out.println(panjang.getClass());
			System.out.println(lebar.getClass());
			
			System.out.printf("\n%d\n", Panjang);
			System.out.printf("%d\n", Lebar);
		} else {
			System.out.println(panjang.getClass());
			System.out.println(lebar.getClass());
			Panjang = (int) panjang;
			Lebar = (int) lebar;
			System.out.println(Lebar);
		}
		
	}
	
	
//	public Persegi(int panjang, int lebar) {
//		super();
//		Panjang = panjang;
//		Lebar = lebar;
//	}
//	
//	
//	public Persegi(float Panjang, float Lebar) {
//		this.Panjang = (int) Panjang;
//		this.Lebar = (int) Lebar;
//	}


	public int getPanjang() {
		return Panjang;
	}


	public void setPanjang(int panjang) {
		Panjang = panjang;
	}


	public int getLebar() {
		return Lebar;
	}


	public void setLebar(int lebar) {
		Lebar = lebar;
	}


	@Override
	public void Luas() {
		// TODO Auto-generated method stub
		this.luas = Panjang * Lebar;
		System.out.println(this.luas);
	}


	@Override
	public void keliling() {
		// TODO Auto-generated method stub
		this.keliling = 2 * (Panjang + Lebar);
		System.out.println(this.keliling);
	}
	
	
	
	
	
	

}
