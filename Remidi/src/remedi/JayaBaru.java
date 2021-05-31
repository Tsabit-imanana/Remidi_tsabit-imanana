package remedi;

public class JayaBaru {

	protected double harga;
	protected String merk, Model , warna;
	int Size;
	
	public JayaBaru(String merk, String Model, String warna,int Size, double harga ) {
		this.merk = merk;
		this.Model = Model;
		this.Size = Size;
		this.harga = harga;
		
	}
	public String Merk() {
		return merk;
		
	}
	
	public void Merk(String Merk) {
		this.merk = merk;
	
	}
	public String Model() {
		
		return Model;
	}
	
	public void Model(String Model) {
		this.Model=Model;
	}
	public String warna() {
		return warna;
	}
	public void warna(String warna) {
		this.warna=warna;
	}
	
	public int Size() {
		return Size;
	}
	
	public void Size(int Size) {
		this.Size = Size;
		
	}
	public double harga() {
		return harga;
	}
	
	public void harga(double harga) {
		this.harga=harga;
	}
	
	
	
	
	
	
	
}
	
