package loop;
import java.util.Scanner;
public class SegitigaAngkaUrut {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.println("Segitiga Angka");
        System.out.print("Masukkan Sisi = ");
        int sisi = a.nextInt();
        for(int i=1; i<=sisi; i++){
            for(int j=0; j<=i; j++){
                System.out.print((i+j)+" ");
            }
            System.out.println(" ");
        }
    }
}
