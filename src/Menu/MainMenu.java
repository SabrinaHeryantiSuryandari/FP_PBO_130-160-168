
package Menu;

//melakukan pemanggilan
import java.util.Scanner;
import Pembeli.Pembeli;
import Pembeli.hp;
import Pembeli.Kamera;
import Penjual.Penjual;
import Penjual.TambahBarang;
import Penjual.CekBarang;
import java.io.IOException;

        
public class MainMenu {
        //Auto-generated method stub
    	static Scanner keyboard=new Scanner(System.in);
       
        public static String name;
	public static String alamat;
	public static String email;
	public static String NoHp;  
        public static String NOKTP;
        
    public static void Customer(){ //Fungsi method customer untuk Isi Data Diri
		 System.out.println("==============================================================");
		 System.out.println("||             Isi Data Diri Anda Sesuai di KTP             ||");
                 System.out.println("||                         E-Lelang                         ||");
		 System.out.println("==============================================================");
                 //untuk Meminta Inputan Data Diri
		 System.out.print("Masukan No Identitas \t: ");
                 keyboard.nextLine();
                 NOKTP=keyboard.nextLine();
                 System.out.print("Masukan Nama Anda \t: ");
		 name=keyboard.nextLine();
		 System.out.print("Masukkan Alamat \t: ");
		 alamat=keyboard.nextLine();
		 System.out.print("Masukkan Alamat Email \t: ");
		 email=keyboard.next();
		 System.out.print("Masukkan Nomer Telepon \t: ");
		 NoHp=keyboard.next();
		 System.out.println("==============================================================");
		 System.out.println(" ");
	}
        
    public void Menu() throws IOException{// Fungsi method menu untuk pilihan menu
		int number;
                	 System.out.println("==============================================================");
                         System.out.println("||             Isi Data Diri Anda Sesuai di KTP             ||");
                         System.out.println("||                         E-Lelang                         ||");
			 System.out.println("==============================================================");
			 System.out.println("1. penjual");//untuk mencetak output Pilihan 
			 System.out.println("2. pembeli");
			 System.out.println("==============================================================");
			 System.out.print("Masukkan Pilihan Anda : ");
			 number=keyboard.nextInt();
	 	 	 switch(number){//percabangan untuk membandingan isi sebuah variabel dengan beberapa nilai
                                case 1 : //kondisi pertama dimana anda mimilih penjual 
					Penjual penjual=new Penjual();//object penjual diinstance pada sebuah method di class Penjual
                                        penjual.MenuPenjual();//memanggil fungsi MenuPenjual dari class penjual                                       System.out.println(" ");
				 	break;
				 case 2 : //kondisi kedua dimana anda memilih pembeli 
                                        Pembeli pembeli=new Pembeli();//object pembeli diinstance pada sebuah method di class Pembeli
                                        hp.Henpon();//memanggil fungsi Henpon dari class hp
                                        Kamera.Foto();//memanggil fungsi Foto dari class kamera
                                        pembeli.MenuPembeli();//memanggil fungsi MenuPembeli dari class pembeli
				 	System.out.println(" ");
                                        break;

                                    }
		}
                
                public static void main(String[] args) throws IOException{
		MainMenu menu=new MainMenu(); //object menu diinstance pada sebuah method di class MainMenu
		menu.Menu();//memanggil fungsi Menu dari class MainMenu
            }
	}

