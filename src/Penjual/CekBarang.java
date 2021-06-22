
package Penjual;

//melakukan pemanggilan
import java.util.Scanner;
import java.io.*;
import java.util.Vector;

public class CekBarang {
    public void cek(){//Fungsi method cek untuk cek DataBarang.txt
        try{//objek scanner untuk membaca data di DataBarang.txt
           File data = new File("file/DataBarang.txt");//objek File
           Scanner in = new Scanner(data);//untuk membaca data dari file
           
           Vector<String> v = new Vector<String>();//objek vektor
           
           while(in.hasNextLine()){//membaca seluruh isi DataBarang.txt
               v.add(in.nextLine());//Menyimpan data dari DataBarang.txt ke vektor
           }
           System.out.println("\nData :");
           for(int i=0;i<v.size();i++){//mencetak isi dari vektor yang didapat dari DataBarang.txt
               System.out.println(v.get(i));
           }
        }catch(Exception e){//kondisi jika program databarang.txt tidak ditemukan
            System.out.println("File tidak ditemukan");
        }
    }
}


