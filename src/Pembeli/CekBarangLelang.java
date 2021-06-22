
package Pembeli;

//melakukan pemanggilan
import java.io.File;
import java.util.Scanner;
import java.util.Vector;

public class CekBarangLelang {
    //HP
    public void cekSamsung(){//Fungsi method cekSamsung untuk cek data Samsung.txt
        //objek scanner untuk membaca data di Samsung.txt
        try{
           File data = new File("file/hp/Samsung.txt");//Objek file
           Scanner in = new Scanner(data);//untuk membaca data dari file
           
           Vector<String> v = new Vector<String>();//objek vector
           
           while(in.hasNextLine()){//membaca seluruh isi Samsung.txt
               v.add(in.nextLine());//Menyimpan data dari Samsung.txt ke vektor
           }
           //mencetak isi dari vektor yang didapat dari Samsung.txt
           System.out.println("\nData :");
           for(int i=0;i<v.size();i++){
               System.out.println(v.get(i));
           }
        }catch(Exception e){
            System.out.println("File tidak ditemukan");
        }
    }
    public void cekVivo(){//Fungsi method cekVivo untuk cek data Vivo.txt
        //objek scanner untuk membaca data di Vivo.txt
        try{
           File data = new File("file/hp/Vivo.txt");//objek file
           Scanner in = new Scanner(data);//untuk membaca data dari file
           
           Vector<String> v = new Vector<String>();//objek vector
           
           while(in.hasNextLine()){//membaca seluruh isi Vivo.txt
               v.add(in.nextLine());//Menyimpan data dari Vivo.txt ke vektor
           }
           //mencetak isi dari vektor yang didapat dari Vivo.txt
           System.out.println("\nData :");
           for(int i=0;i<v.size();i++){
               System.out.println(v.get(i));
           }
        }catch(Exception e){
            System.out.println("File tidak ditemukan");
        }
    }
    public void cekIphone(){ //Fungsi method cekIphone untuk cek data Iphone.txt
        //objek scanner untuk membaca data di Iphone.txt
        try{
           File data = new File("file/hp/Iphone.txt");//objek file
           Scanner in = new Scanner(data);//untuk membaca data dari file
           
           Vector<String> v = new Vector<String>();//objek vector
           
           while(in.hasNextLine()){//membaca seluruh isi Iphone.txt
               v.add(in.nextLine());//Menyimpan data dari Iphone.txt ke vektor
           }
           //mencetak isi dari vektor yang didapat dari Iphone.txt
           System.out.println("\nData :");
           for(int i=0;i<v.size();i++){
               System.out.println(v.get(i));
           }
        }catch(Exception e){
            System.out.println("File tidak ditemukan");
        }
    }
    
    //kamera
    public void cekCanon(){//Fungsi method cekCanon untuk cek data Canon.txt
        //objek scanner untuk membaca data di Canon.txt
        try{
           File data = new File("file/kamera/Canon.txt");//objek file
           Scanner in = new Scanner(data);//untuk membaca data dari file
           
           Vector<String> v = new Vector<String>();//objek vector
           
           while(in.hasNextLine()){//membaca seluruh isi Canon.txt
               v.add(in.nextLine());//Menyimpan data dari Canon.txt ke vektor
           }
           //mencetak isi dari vektor yang didapat dari Canon.txt
           System.out.println("\nData :");
           for(int i=0;i<v.size();i++){
               System.out.println(v.get(i));
           }
        }catch(Exception e){
            System.out.println("File tidak ditemukan");
        }
    }   
    public void cekFuji(){//Fungsi method cekFuji untuk cek data Fujifilem.txt
        //objek scanner untuk membaca data di fujifilem.txt
        try{
           File data = new File("file/kamera/Fujifilem.txt");//objek file
           Scanner in = new Scanner(data);//untuk membaca data dari file
           
           Vector<String> v = new Vector<String>();//objek vector
           
           while(in.hasNextLine()){//membaca seluruh isi Fujifilem.txt
               v.add(in.nextLine());//Menyimpan data dari Fujufilem.txt ke vektor
           }
           //mencetak isi dari vektor yang didapat dari Fujifilem.txt
           System.out.println("\nData :");
           for(int i=0;i<v.size();i++){
               System.out.println(v.get(i));
           }
        }catch(Exception e){
            System.out.println("File tidak ditemukan");
        }
    }
    public void cekNikon(){//Fungsi method cekNikon untuk cek data Nikon.txt
        //objek scanner untuk membaca data di Nikon.txt
        try{
           File data = new File("file/kamera/Nikon.txt");//objek file
           Scanner in = new Scanner(data);//untuk membaca data dari file
           
           Vector<String> v = new Vector<String>();//objek vector
           
           while(in.hasNextLine()){//membaca seluruh isi Nikon.txt
               v.add(in.nextLine());//Menyimpan data dari Nikon.txt ke vektor
           }
           //mencetak isi dari vektor yang didapat dari Nikon.txt
           System.out.println("\nData :");
           for(int i=0;i<v.size();i++){
               System.out.println(v.get(i));
           }
        }catch(Exception e){
            System.out.println("File tidak ditemukan");
        }
    }
}
