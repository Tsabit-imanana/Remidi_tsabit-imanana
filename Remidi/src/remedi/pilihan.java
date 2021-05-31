package remedi;

 class pilihan extends JayaBaru{
	
	public pilihan(String merk, String Model , String warna, int Size, double harga) {
		
		super(merk, Model, warna, Size, harga);
		
	}
	public void cetak() {
		System.out.println("kategori sepatu : ");
		System.out.println("Merk : " + merk);
		System.out.println("Model : " + Model);
		System.out.println("ukuran : " + Size);
		System.out.println("warna : " + warna);
		System.out.println("harga : " +harga);
		
		
		
	}
}
