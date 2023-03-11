package tugasLEYA;
import java.util.Scanner;
public class konversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //inisialisasi variabel
        //c=celcius, f=fahrenheit
//        double c, f;
//        
//        System.out.print("Masukan suhu fahrenheit = ");
//        f = input.nextDouble();
//        
//        //konversi f ke c
//        c= (f-32)*5/9;
//        
//        //hasil
//        System.out.println("Hasil konversi = "+c+" derajat celcius");

        System.out.println("Menentukan Detik dalam Bentuk Jam, Menit, dan Detik");
        double hari, jam, menit, second, detik;
        System.out.print("Berapa Detik Yang Mau Dikonversi? ");
        
        detik = input.nextDouble();
        hari = detik/86400;
        jam = (detik%86400)/3600;
        //menit = detik/60;
        menit = (detik%3600)/60;
        second = (detik%3600)%60;
        System.out.println("Detik tersebut dalam bentuk Jam, Menit dan Detik adalah = ");
        System.out.println("Hari "+hari +" Jam "+jam +" Menit "+menit +" Second "+detik);
 
    }
}
