package pert6;

public class Lingkaran extends BangunRuang {

	private int Diameter;
	

	public Lingkaran(String namaBangunRuang, int diameter) {
		super(namaBangunRuang);
		Diameter = diameter;
	}

	public int getDiameter() {
		return Diameter;
	}

	public void setDiameter(int diameter) {
		Diameter = diameter;
	}

	@Override
	public void Luas() {
		// TODO Auto-generated method stub
		double luas = (22/7) * Math.pow((Diameter/2), 2); 
		System.out.println((int)luas);
	}

	@Override
	public void keliling() {
		// TODO Auto-generated method stub
		double keliling = 2 * (22/7) * (Diameter/2);
		System.out.println((int)keliling);
	}
	
	

}
