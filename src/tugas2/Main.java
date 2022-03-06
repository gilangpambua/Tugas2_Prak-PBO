/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;
import java.util.Scanner;
import tugas2.ruang.Balok;
import tugas2.ruang.Tabung;
/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int p;
        double pilih,panjang,lebar,tinggibalok = 0;
        double jari,tinggitabung;
        
        System.out.println("Gilang Pappa' Tanto Pambua");
        System.out.println("123200027");
        do{         
        System.out.println("--------------");
        System.out.println("| Menu Utama |");
        System.out.println("--------------");
        System.out.println("1. Hitung Balok");
        System.out.println("2. Hitung Tabung");
        System.out.print("Pilih : ");
        pilih = input.nextInt();
        
        if(pilih==1){
            System.out.print("Input Panjang : ");
            panjang = input.nextInt();
            System.out.print("Input Lebar : ");
            lebar = input.nextInt();
            System.out.print("Input Tinggi : ");
            tinggibalok = input.nextInt();
            
            Balok balok = new Balok(tinggibalok,panjang,lebar);
            
            System.out.println("----------");
            System.out.println("| OUTPUT |");
            System.out.println("----------");
            System.out.println("Luas Persegi Panjang : " + balok.luas());
            System.out.println("Keliling Persegi Panjang : " + balok.keliling());
            System.out.println("Volume Balok : " + balok.volume());
            System.out.println("Luas Permukaan Balok : " + balok.luaspermukaan());
        }
        else if(pilih==2){         
            System.out.print("Input Tinggi : ");
            tinggitabung = input.nextInt();
            System.out.print("Input Jari-Jari : ");
            jari = input.nextInt();
            
            Tabung tabung = new Tabung(tinggitabung,jari);
            
            System.out.println("----------");
            System.out.println("| OUTPUT |");
            System.out.println("----------");
            System.out.println("Luas Lingkaran : " + tabung.luas());
            System.out.println("Keliling Lingkaran : " + tabung.keliling());
            System.out.println("Volume Tabung : " + tabung.volume());
            System.out.println("Luas Permukaan Tabung : " + tabung.luaspermukaan());
        }
        else{
            System.out.println("PILIHAN INPUTAN SALAH");
        }
            System.out.print("Ulangi? (Ya=1)(No=0) : ");
            p = input.nextInt();        
        }while(p==1);
        
    }
    
}
