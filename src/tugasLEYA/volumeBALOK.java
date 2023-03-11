package tugasLEYA;
import java.util.Scanner;
public class volumeBALOK {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        //inisialisasi variabel
        //p=panjang, l=lebar, t=tinggi, v=volume
        
        double p, l, t, v;
        System.out.print("Masukan panjang balok = ");
        p = input.nextDouble();
        System.out.print("Masukan lebar balok = ");
        l = input.nextDouble();
        System.out.print("Masukan tinggi balok = ");
        t = input.nextDouble();
        
        //hitung volume
        v=p*l*t;
        System.out.println("\nVolume Balok = "+v);
        
    }
}
