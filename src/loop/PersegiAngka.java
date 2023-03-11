package loop;
import java.util.Scanner;
public class PersegiAngka {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
	System.out.println("Persegi Angka");
	System.out.print("Masukkan Sisi = ");
	int sisi = a.nextInt();
            for(int i=1; i<=sisi; i++){
		for(int j=1; j<=sisi; j++){
                    System.out.print(i+" ");
		}
                System.out.println(" ");
            }
    }
}