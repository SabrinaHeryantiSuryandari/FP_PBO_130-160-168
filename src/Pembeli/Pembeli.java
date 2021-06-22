
package Pembeli;

//melakukan pemanggilan
import Menu.MainMenu;
import java.util.Scanner;
import java.io.*;

public class Pembeli { //class pembeli
    
        public String NamaBarang;
	public String deskripsi;
        public String harga_awal;
        public static String nb, des,harga;
        public static String Foto;
        public static String kam1,kam11,kam12,kam2,kam21,kam22,kam3,kam31,kam32;
        public static String HP;
        public static String hp1,hp11,hp12,hp2,hp21,hp22,hp3,hp31,hp32;
        public String Tawaran;
        Scanner keyboard=new Scanner(System.in);//Auto-generated method stub
        
        public void Lelang(){ //Fungsi method lelang untuk menyimpan data Lelang
            //untuk meminta input data lelang
            System.out.print("Nama Barang\t: ");
            keyboard.nextLine();
            NamaBarang=keyboard.nextLine(); 
            System.out.print("Harga Penawaran\t: ");
            Tawaran=keyboard.nextLine();
        
            //printah writer untuk mencetak txt
            try{
                File data= new File("file/DataPembeli.txt");//nama file atau direktori spt "file/DataPembeli.txt"
                PrintWriter pr = new PrintWriter(new FileWriter(data, true));//jika true maka file lama akan di tambah
                //simpan ke DataPembeli.txt
                pr.println("No Identitas    : " +MainMenu.NOKTP);
                pr.println("Nama Pembeli    : " +MainMenu.name);
                pr.println("NO Telepon      : " +MainMenu.NoHp );
                pr.println("Alamat Email    : " +MainMenu.email);
                pr.println("Alamat          : " +MainMenu.alamat);
                pr.println("Nama Barang     : " +NamaBarang);
                pr.println("Harga Penawaran : " +Tawaran);
                pr.println("\n");
                pr.close();//WAJIB! Menutup koneksi I/0 agar file tidak corrupt
                System.out.println("Data Telah Tersimpan \n");
                System.out.println("Info Pemenang Lelang Akan dikirim Melalui SMS dan Email ");
                System.out.println("Cek Berkala Pesan SMS dan Email Anda ");
                System.out.println("");
            }catch(Exception e){
                System.out.println("Tidak dapat dicetak");  
            }
        }

	
public void MenuPembeli() throws IOException{
    int number,no;

    MainMenu.Customer();//pada class MainMenu.Customer melakukan pemanggilan untuk memasukkan identitas
    do{//Melakukan perulangan while sebelum mengecek isi pernyataan 
    System.out.println("==============================================================");
    System.out.println("||             Isi Data Diri Anda Sesuai di KTP             ||");
    System.out.println("||                         E-Lelang                         ||");
    System.out.println("==============================================================");
    System.out.println("Silahkan Pilih Barang :");
    System.out.println("1. HP	 ");
    System.out.println("2. Kamera   ");
    System.out.println("3. cek Lelang ");
    System.out.println("0. kembali   ");
    System.out.println("==============================================================");
    System.out.print("Pilih barang yang di inginkan: ");
    number=keyboard.nextInt();
		 
    switch(number){//percabangan untuk membandingan isi sebuah variabel dengan beberapa nilai 
        case 1 ://kondisi pertama dimana pembeli melakukan pemilihan HP
            System.out.println("Silahkan Pilih Barang :");
            System.out.println("1. samsung	 ");
            System.out.println("2. Vivo  ");
            System.out.println("3. Iphone  ");
            System.out.println("0. Kembali");
            System.out.println("==============================================================");
            System.out.print("Pilih barang yang di inginkan: ");
            no=keyboard.nextInt();
                        
            switch(no){//percabangan untuk membandingan isi sebuah variabel dengan beberapa nilai 
                case 1 : //kondisi pertama dimana pembeli melakukan pemilihan HP samsung
                    //didalam pilihan samsung muncul output data barang samsung
                    HP=hp1;
                    System.out.println("\nData Barang\n");
                    System.out.println("Nama Barang : "+hp1+"\ndeskripsi : \n"+hp11+"\nHarga Barang :"+hp12);
                    nb=hp1;
                    des=hp11;
                    harga=hp12;
                    Lelang();//melakukan pemanggil fungsi lelang
                    //printahwriter untuk mencetak txt
                    try{
                    File samsung =new File("File/hp/Samsung.txt");//nama file atau direktori spt "File/hp/Samsung.txt"
                    PrintWriter pr =new PrintWriter(new FileWriter(samsung, true));//jika true maka file lama akan di tambah
                    //simpan ke Samsung.txt
                    pr.println("Nama Pembeli        : " +MainMenu.name);
                    pr.println("Harga Penawaran     : " +Tawaran);
                    pr.println("\n");
                    pr.close();//WAJIB! Menutup koneksi I/0 agar file tidak corrupt
                    }catch(Exception e){
                        System.out.println("Tidak dapat dicetak");  
                    }
                break;
                case 2 : //kondisi kedua dimana pembeli melakukan pemilihan HP Vivo
                    //didalam pilihan Vivo muncul output data barang Vivo
                    HP=hp2;
                    System.out.println("\nData Barang\n");
                    System.out.println("Nama Barang : "+hp2+"\ndeskripsi : \n"+hp21+"\nHarga Barang :"+hp22);
                    nb=hp2;
                    des=hp21;
                    harga=hp22;
                    Lelang();//melakukan pemanggil fungsi lelang
                    //printahwriter untuk mencetak txt
                    try{
                    File vivo =new File("File/hp/Vivo.txt");//nama file atau direktori spt "File/hp/Vivo.txt"
                    PrintWriter pr =new PrintWriter(new FileWriter(vivo, true));//jika true maka file lama akan di tambah
                    //simpan ke Vivo.txt
                    pr.println("Nama Pembeli        : " +MainMenu.name);
                    pr.println("Harga Penawaran     : " +Tawaran);
                    pr.println("\n");
                    pr.close();//WAJIB! Menutup koneksi I/0 agar file tidak corrupt
                    }catch(Exception e){
                        System.out.println("Tidak dapat dicetak");  
                    }
                break;
                case 3 : //kondisi ketiga dimana pembeli melakukan pemilihan HP Iphone
                    //didalam pilihan Iphone muncul output data barang Iphone
                    HP=hp3;
                    System.out.println("\nData Barang\n");
                    System.out.println("Nama Barang : "+hp3+"\ndeskripsi : \n"+hp31+"\nHarga Barang :"+hp32);
                    nb=hp3;
                    des=hp31;
                    harga=hp32;
                    Lelang();//melakukan pemanggil fungsi lelang
                    //printahwriter untuk mencetak txt
                    try{
                    File Iphone =new File("File/hp/Iphone.txt");//nama file atau direktori spt "File/hp/Iphone.txt"
                    PrintWriter pr =new PrintWriter(new FileWriter(Iphone, true));//jika true maka file lama akan di tambah
                    //simpan ke Iphone.txt
                    pr.println("Nama Pembeli        : " +MainMenu.name);
                    pr.println("Harga Penawaran     : " +Tawaran);
                    pr.println("\n");
                    pr.close();//WAJIB! Menutup koneksi I/0 agar file tidak corrupt
                    }catch(Exception e){
                        System.out.println("Tidak dapat dicetak");  
                    }
                break;
                case 0 : //kondisi keempat dimana pembeli melakukan pemilihan kembali
                    MenuPembeli();
                    break;
                } 
            break;
        case 2 ://kondisi kedua dimana pembeli melakukan pemilihan Kamera
            System.out.println("Silahkan Pilih Barang :");
            System.out.println("1. Canon	 ");
            System.out.println("2. Fujifilem  ");
            System.out.println("3. Nikon  ");
            System.out.println("0. Keluar");
            System.out.println("==============================================================");
            System.out.print("Pilih barang yang di inginkan: ");
            no=keyboard.nextInt();
                        
            switch(no){//percabangan untuk membandingan isi sebuah variabel dengan beberapa nilai 
            case 1 ://kondisi pertama dimana pembeli melakukan pemilihan kamera canon
                //didalam pilihan canon muncul output data barang canon
                Foto=kam1;
                System.out.println("\nData Barang\n");
                System.out.println("Nama Barang : "+kam1+"\ndeskripsi : \n"+kam11+"\nHarga Barang :"+kam12);
                nb=kam1;
                des=kam11;
                harga=kam12;
                Lelang();//melakukan pemanggil fungsi lelang
                //printahwriter untuk mencetak txt
                try{
                    File canon =new File("File/Kamera/Canon.txt");//nama file atau direktori spt "File/kamera/Canon.txt"
                    PrintWriter pr =new PrintWriter(new FileWriter(canon, true));//jika true maka file lama akan di tambah
                    //simpan ke Canon.txt
                    pr.println("Nama Pembeli        : " +MainMenu.name);
                    pr.println("Harga Penawaran     : " +Tawaran);
                    pr.println("\n");
                    pr.close();//WAJIB! Menutup koneksi I/0 agar file tidak corrupt
                    }catch(Exception e){
                        System.out.println("Tidak dapat dicetak");  
                    }
                break;
                case 2 ://kondisi kedua dimana pembeli melakukan pemilihan kamera fujifilem
                    //didalam pilihan fujifilem muncul output data fujifilem
                    Foto=kam2;
                    System.out.println("\nData Barang\n");
                    System.out.println("Nama Barang : "+kam2+"\ndeskripsi : \n"+kam21+"\nHarga Barang :"+kam22);
                    nb=kam2;
                    des=kam21;
                    harga=kam22;
                    Lelang();//melakukan pemanggil fungsi lelang
                    //printahwriter untuk mencetak txt
                    try{
                        File fuji =new File("File/kamera/fujifilem.txt");//nama file atau direktori spt "File/kamera/fujifilem.txt"
                        PrintWriter pr =new PrintWriter(new FileWriter(fuji, true));//jika true maka file lama akan di tambah
                        //simpan ke fujifilem.txt
                        pr.println("Nama Pembeli        : " +MainMenu.name);
                        pr.println("Harga Penawaran     : " +Tawaran);
                        pr.println("\n");
                        pr.close();//WAJIB! Menutup koneksi I/0 agar file tidak corrupt
                        }catch(Exception e){
                            System.out.println("Tidak dapat dicetak");  
                        }
                break;
                case 3 ://kondisi ketiga dimana pembeli melakukan pemilihan kamera Nikon
                    //didalam pilihan Nikon muncul output data barang Nikon
                    Foto=kam3;
                    System.out.println("\nData Barang\n");
                    System.out.println("Nama Barang : "+kam3+"\ndeskripsi : \n"+kam31+"\nHarga Barang :"+kam32);
                    nb=kam3;
                    des=kam31;
                    harga=kam32;
                    Lelang();//melakukan pemanggil fungsi lelang
                    //printahwriter untuk mencetak txt
                    try{
                        File nikon =new File("File/kamera/Nikon.txt");//nama file atau direktori spt "File/kamera/Nikon.txt"
                        PrintWriter pr =new PrintWriter(new FileWriter(nikon, true));//jika true maka file lama akan di tambah
                        //simpan ke Nikon.txt
                        pr.println("Nama Pembeli        : " +MainMenu.name);
                        pr.println("Harga Penawaran     : " +Tawaran);
                        pr.println("\n");
                        pr.close();//WAJIB! Menutup koneksi I/0 agar file tidak corrupt
                    }catch(Exception e){
                        System.out.println("Tidak dapat dicetak");  
                    }
                break;
                case 0://kondisi keempat digunakan kembali ke menu awal
                    MenuPembeli();
                    break;
                }
            break;
        case 3 ://kondisi ketiga dimana pembeli melakukan pemilihan cek barang
            System.out.println("Silahkan Pilih Barang yang mau di cek :");
            System.out.println("1. Canon	 ");
            System.out.println("2. Fujifilem  ");
            System.out.println("3. Nikon  ");
            System.out.println("4. samsung	 ");
            System.out.println("5. Vivo  ");
            System.out.println("6. Iphone  ");
            System.out.println("0. Kembali");
            System.out.println("==============================================================");
            System.out.print("Pilih data barang yang ingin dicek: ");
            no=keyboard.nextInt();
                        
            switch(no){  //percabangan untuk membandingan isi sebuah variabel dengan beberapa nilai                          
                case 1 : //kondisi pertama dimana pembeli melakukan pemilihan cek canon
                    CekBarangLelang cbl= new CekBarangLelang();//object cbl diinstance pada sebuah method di class cekbaranglelang
                    cbl.cekCanon();//melakukan pemanggil fungsi cekcanon di class cekbaranglelang
                    break;
                case 2 ://kondisi kedua dimana pembeli melakukan pemilihan cek fujifilem
                    CekBarangLelang cb= new CekBarangLelang();//object cb diinstance pada sebuah method di class cekbaranglelang
                    cb.cekFuji();//melakukan pemanggil fungsi cekfuji di class cekbaranglelang
                    break;
                case 3 ://kondisi ketiga dimana pembeli melakukan pemilihan cek Nikon
                    CekBarangLelang c= new CekBarangLelang();//object c diinstance pada sebuah method di class cekbaranglelang
                    c.cekNikon();//melakukan pemanggil fungsi ceknikon di class cekbaranglelang
                     break;
                case 4 ://kondisi keempat dimana pembeli melakukan pemilihan cek samsung
                    CekBarangLelang b= new CekBarangLelang();//object b diinstance pada sebuah method di class cekbaranglelang
                    b.cekSamsung();//melakukan pemanggil fungsi ceksamsung di class cekbaranglelang
                    break;
                case 5 : //kondisi kelima dimana pembeli melakukan pemilihan cek Vivo
                    CekBarangLelang l= new CekBarangLelang();//object l diinstance pada sebuah method di class cekbaranglelang
                    l.cekVivo();//melakukan pemanggil fungsi cekvivo di class cekbaranglelang
                    break;
                case 6 ://kondisi keenam dimana pembeli melakukan pemilihan cek iphone
                    CekBarangLelang bl= new CekBarangLelang();//object bl diinstance pada sebuah method di class cekbaranglelang
                    bl.cekIphone();//melakukan pemanggil fungsi cekiphone di class cekbaranglelang
                    break;
                }
            break;
        case 0 ://kondisi keempat dimana pembeli melakukan pemilihan kembali
            MainMenu menu=new MainMenu();
            menu.Menu();
            break;
        }keyboard.nextLine();
    }while(true); //jika benar kembali melakukan perulangan
    }
}
