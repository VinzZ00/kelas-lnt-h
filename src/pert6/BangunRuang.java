package pert6;

public abstract class BangunRuang {

	String namaBangunRuang;

	public BangunRuang(String namaBangunRuang) {
		super();
		this.namaBangunRuang = namaBangunRuang;
	}

	public String getNamaBangunRuang() {
		return namaBangunRuang;
	}

	public void setNamaBangunRuang(String namaBangunRuang) {
		this.namaBangunRuang = namaBangunRuang;
	}
	
	public abstract void Luas();
	public abstract void keliling();

}
