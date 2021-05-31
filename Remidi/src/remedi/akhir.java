package remedi;
import java.util.Scanner;


public class akhir {
public static void main(String []args) {
	int hargaawal, pilihan;
	double diskon, totalharga;
	double harga = 0;
	
	pilihan A = new pilihan("Nike", "laki laki", "Gold", 30, 300000.0);
	pilihan B = new pilihan("NB", "laki laki", "putih", 29, 400000.0);
	pilihan C = new pilihan("adidas", "laki laki", "Gold", 30, 500000.0);
	
	
	
	System.out.println("STRUK BELANJA");
	System.out.println("================");
	System.out.println("Nama kasir : Nudi");
	System.out.println("Tanggal : 20 November 2022");
	
	System.out.println("================");
	System.out.println("");
	System.out.println("");
	
	System.out.println("Sepatu yang Dipilih");
	
	 System.out.println("Berikut Merupakan Daftar Sepatu Yang Bisa Dibeli: ");
     System.out.println("\n1. Sepatu Pertama:");
     A.cetak();
     System.out.println("\n2. Sepatu Kedua:");
     B.cetak();
     System.out.println("\n3. Sepatu Ketiga:");
     C.cetak();
     System.out.println("==========");
	
	
	
	
	
	Scanner scanner = new Scanner(System.in);
    System.out.print("Silahkan Input Nomor Pilihan Anda: ");
    pilihan = scanner.nextInt();
    
    switch(pilihan){
        case 1: 
            harga = A.harga(); 
            break;
        case 2: 
            harga = B.harga(); 
            break;
        case 3: 
            harga = C.harga(); 
            break;
            
    }
    System.out.println("==========");
    System.out.println("maksimal pembelian 3 pasang.");
    System.out.print("Silahkan Input Jumlah Barang Yang Dibeli: ");
    hargaawal = scanner.nextInt();
    
    
    
    
    System.out.println("==========");
    
    totalharga = harga*hargaawal - Potongan.potonganharga(hargaawal);
    
    System.out.println("Berikut Merupakan Total Harga Beli Anda: "+totalharga);
   
	
	}


}
