
package Penjual;

//melakukan pemanggilan
import Menu.MainMenu;
import java.util.Scanner;
import java.io.*;

public class TambahBarang {
    
    public void tambah(){//Fungsi method tambah untuk menambah dataBarang
    
    String NamaBarang;
    String Deskripsi;
    String Harga;
    
    //Auto-generated method stub
    Scanner keyboard=new Scanner(System.in);
        //untuk meminta inputan data barang
        System.out.println("Input Data Barang\n");
        System.out.print("Nama Barang \t\t: ");
        NamaBarang=keyboard.nextLine(); 
        System.out.print("Deskripsi Barang \t: ");
        Deskripsi=keyboard.nextLine();
        System.out.print("Harga Barang \t\t: ");
        Harga=keyboard.nextLine();
    
    //printahwriter untuk mencetak txt
    try{
            File data= new File("file/DataPenjual.txt");//nama file atau direktori spt "file/DataPenjual.txt"
            PrintWriter pr = new PrintWriter(new FileWriter(data, true));//jika true maka file lama akan di tambah
            //simpan ke DataPenjual.txt
            pr.println("No Identitas    : " +MainMenu.NOKTP);
            pr.println("Nama Pembeli    : " +MainMenu.name);
            pr.println("NO Telepon      : " +MainMenu.NoHp );
            pr.println("Alamat Email    : " +MainMenu.email);
            pr.println("Alamat          : " +MainMenu.alamat);
            pr.println("Nama Barang     : " +NamaBarang);
            pr.println("Deskripsi       : " +Deskripsi);
            pr.println("Harga Barang    : " +Harga);
            pr.println("\n");
            pr.close();//WAJIB! Menutup koneksi I/0 agar file tidak corrupt
            File Barang =new File("File/DataBarang.txt");
            PrintWriter p =new PrintWriter(new FileWriter(Barang, true));//jika true maka file lama akan di tambah
            //simpan ke DataBarang.txt
            p.println("Nama Barang     : " +NamaBarang);
            p.println("Deskripsi       : " +Deskripsi);
            p.println("Harga Barang    : " +Harga);
            p.println("\n");
            p.close();//WAJIB! Menutup koneksi I/0 agar file tidak corrupt
            //jika data berhasil disimpan maka keluar output seperti dibawa
            System.out.println("Data Telah Tersimpan \n");
            System.out.println("Info Barang Disetujui Akan dikirim Melalui SMS dan Email ");
            System.out.println("Cek Berkala Pesan SMS dan Email Anda ");
            System.out.println("");
        }
    //kondisi jika program databarang.txt tidak ditemukan
        catch(Exception e){
          System.out.println("Tidak dapat dicetak");//jika gagal disimpan maka output seperti ini  
        }
    }
}
