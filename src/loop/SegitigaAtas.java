package loop;
import java.util.Scanner;
public class SegitigaAtas {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        System.out.println("Program Segitiga Atas");
        System.out.print("Masukkan N = ");
        int j,N=a.nextInt();
        while(N>0){
            j=1;
            do{
                System.out.print(j+" ");
                j++;
            }while(j<=N);
            N--;
            System.out.println("");
        }
    }
}
