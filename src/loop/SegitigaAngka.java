package loop;
import java.util.Scanner;
public class SegitigaAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Segitiga Angka");
        System.out.print("Masukkan Sisi = ");
        int sisi = sc.nextInt();
        for(int a=0; a<sisi; a++){
            for(int b=0; b<sisi; b++){
                if (b<a) System.out.print(a+" ");
                else System.out.print("");
            }
            System.out.println(" ");
        }
    }
}
