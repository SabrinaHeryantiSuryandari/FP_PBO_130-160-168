
package Pembeli;

//melakukan pemanggilan
import java.util.Scanner;

public class hp extends Pembeli{//inheritance single dari class pembeli
    //deklarasi tipe data string untuk huruf dan angka 
    public hp(String nb, String des, String ha){
        this.NamaBarang = nb;
        this.deskripsi = des;
        this.harga_awal = ha;
    }
   
    public static void Henpon(){
		
	hp[] h=new hp[3];//menggunakan indekes array berjumlah 3
        //menginput data barang
	h[0]=new hp("Samsung Galaxy S21 Ultra 5G", "Warna Hitam\nKapasitas ROM 128GB, RAM 12GB\nScreen Size 6.8\nBatrai 5000mAh\nKamera\n-Wide(108MP LASER AF)\n-Ultra wide(12MP AF, 0.6x)\n-Telephoto1(10MP AF, 3x)\n-Telephoto2(10MP AF, 10x)", "Rp.14.000.000");
	h[1]=new hp("Vivo NEX 3 5G","Warna Pink\nKapasitas 256GB, RAM 12GB\nScreen Size 6.56inci, Ressolusi layar 1080 x 2376pixels, AMOLED\nBatrai 4000mAh\nKamera :\nKamera belakang 12+12MP\nKamera depan 16MP/f3.4\nResolusi video 12K","Rp.13.700.000");
	h[2]=new hp("Iphone 11 Pro MAX", "Warna Putih\nKapasitas RAM 4GB, Memori Internal 64GB\nScreen Size6.5inci\nBatrai 3500mAh\nKamera :\nDepan 12MP, Resolusi Video 216p\nBelakang 12MP, Resolusi Video 216p\n","Rp.16.000.000");
	//melakukan perulangan dengan menginisialisasikan i sebagai banyak array		
        for(int i=0;i<=h.length;i++){
		if(i==0){//jika i=0 maka memunculkan h array ke 0
                    hp1=h[i].getNamaBarang()+"\n";
                    hp11=h[i].getDeskripsi()+"\n";
                    hp12=h[i].getHarga()+"\n";
                } 
		if(i==1){//jika i=1 maka memunculkan h array ke 1
                    hp2=h[i].getNamaBarang()+"\n";
                    hp21=h[i].getDeskripsi()+"\n";
                    hp22=h[i].getHarga()+"\n";       
                }
		if(i==2){//jika i=2 maka memunculkan h array ke 2
                    hp3=h[i].getNamaBarang()+"\n";
                    hp31=h[i].getDeskripsi()+"\n";
                    hp32=h[i].getHarga()+"\n";
        	}
        }
        
    }   
    // untuk menyimapan nama barang
	public String getNamaBarang(){
		 return NamaBarang;
	}
        // untuk menyimapan Deskripsi
	public String getDeskripsi(){
		 return deskripsi;
	}
	// untuk menyimapan harga awal
	public String getHarga(){
		return harga_awal;
	}
    }