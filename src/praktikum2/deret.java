package praktikum2;
import java.util.Scanner;
public class deret {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a,b,n;
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        System.out.print("n = ");
        n = sc.nextInt();
        if(n>b){
            do{
                System.out.print(a);
                a = a + b;
                if(a<=n) System.out.print(", ");
            }while (a<=n);
            System.out.println(" ");
        }
        else if (a>n){
            do{
                System.out.print(a);
                a = a + b;
                if(a>=n) System.out.print(", ");
            }while (a>=n);
            System.out.println(" ");
        }
    }
}