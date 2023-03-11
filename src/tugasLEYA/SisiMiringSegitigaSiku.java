package tugasLEYA;
import java.util.Scanner;
public class SisiMiringSegitigaSiku {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //inisialisasi variabel
        //a=alas, t=tinggi, c=sisi miring
        double a,t,c,hasil;
        System.out.print("Masukan alas segitiga = ");
        a = input.nextDouble();
        System.out.print("Masukan tinggi segitiga = ");
        t = input.nextDouble();
        
        //hitung sisi miring
        c = ((a*a)+(t*t));
        
        hasil = Math.sqrt(c);
        System.out.println("\nSisi miring segitiga siku-siku = " +hasil+"cm");
    }
}
