
package Penjual;

//melakukan pemanggilan
import java.util.Scanner;
import Menu.MainMenu;
import java.io.IOException;

public class Penjual {
    //menginputkan data atau nilai saat setelah program di running di jalankan
    Scanner keyboard=new Scanner(System.in); 
    
	public void MenuPenjual() throws IOException{ //untuk mencari nilai dalam suatu operasi, untuk mendeklarasikannya kita harus menembahkan kata kunci void
		int number,no;
                do{//Melakukan perulangan while sebelum mengecek isi pernyataan 
		 System.out.println("==============================================================");
		 System.out.println("||             Isi Data Diri Anda Sesuai di KTP             ||");
                 System.out.println("||                         E-Lelang                         ||");
		 System.out.println("==============================================================");
		 System.out.println("Silahkan Pilih  :");
		 System.out.println("1. Input Barang	 ");
		 System.out.println("2. Cek Barang    ");
                 System.out.println("0. Kembali ");
		 System.out.println("==============================================================");
		 System.out.print("Pilih barang yang di inginkan: ");
                 number=keyboard.nextInt();
		 
                 switch(number){//percabangan untuk membandingan isi sebuah variabel dengan beberapa nilai 
                    case 1 : //kondisi pertama dimana penjual melakukan penambahan barang
                        MainMenu.Customer();//pada class MainMenu.Customer melakukan pemanggilan untuk memasukkan identitas
                        TambahBarang tb=new TambahBarang();//object tb diinstance pada sebuah method di class TambahBarang
                        tb.tambah();//melakukan pemanggil fungsi tambah di class tambahBarang
                        break;
                    case 2 : //kondisi kedua dimana penjual melakukan cek barang
                        CekBarang cb= new CekBarang();//object cb diinstance pada sebuah method di class cekbarang
                        cb.cek();//melakukan pemanggil fungsi cek di class cekbarang
                        break;
                    case 0 : //kondisi ketiga dimana penjual kembali kemenu awal menampilkan penjual dan pembeli
                        MainMenu menu=new MainMenu();
                        menu.Menu();
                        break;
                 }keyboard.nextLine();
                }while(true);//jika benar kembali melakukan perulangan
             }
}

