
package Pembeli;

//melakukan pemanggilan
import java.util.Scanner;

public class Kamera extends Pembeli{//inheritance single dari class pembeli
    //deklarasi tipe data string untuk huruf dan angka 
        public Kamera(String nb, String des, String ha){
        this.NamaBarang = nb;
        this.deskripsi = des;
        this.harga_awal = ha;
    }
     
    public static void Foto(){
		
	Kamera[] k=new Kamera[3];//menggunakan indekes array berjumlah 3
        //menginput data barang
	k[0]=new Kamera("Canon", "Warna Hitam\nKapasitas ROM 128GB, RAM 12GB\nScreen Size 6.8\nBatrai 5000mAh\nKamera\n-Wide(108MP LASER AF)\n-Ultra wide(12MP AF, 0.6x)\n-Telephoto1(10MP AF, 3x)\n-Telephoto2(10MP AF, 10x)", "Rp.14.000.000");
	k[1]=new Kamera("Fujifilm X-A7","Warna Putih\nKualitas Resolusi 6000 x 4000\n", "Rp.9.000.000");
	k[2]=new Kamera("Nikon D-90", "Warna Merah\nKualitas Resolusi 1080 60i/30p", "Rp.4.500.000");
	//melakukan perulangan dengan menginisialisasikan i sebagai banyak array		
        for(int i=0;i<=k.length;i++){
		if(i==0){//jika i=0 maka memunculkan k array ke 0
                    kam1=k[i].getNamaBarang()+"\n";
                    kam11=k[i].getDeskripsi()+"\n";
                    kam12=k[i].getHarga()+"\n";               
                }
		if(i==1){//jika i=1 maka memunculkan k array ke 1
                    kam2=k[i].getNamaBarang()+"\n";
                    kam21=k[i].getDeskripsi()+"\n";
                    kam22=k[i].getHarga()+"\n";              
                }
		if(i==2){//jika i=2 maka memunculkan k array ke 2
                    kam3=k[i].getNamaBarang()+"\n";
                    kam31=k[i].getDeskripsi()+"\n";
                    kam32=k[i].getHarga()+"\n";
        	}
        }    
    }   
    // untuk menyimpan nama barang
	public String getNamaBarang(){
		 return NamaBarang;
	}
            // untuk menyimpan Deskripsi
	public String getDeskripsi(){
		 return deskripsi;
	}
	    // untuk menyimpan Harga Awal
	public String getHarga(){
		return harga_awal;
	}
    }
