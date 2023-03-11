package praktikum2;
import java.util.Scanner;
public class towerOfHanoi {
    static void towers(int n, char from, char to, char aux){
        if(n==1){
            System.out.println("move disk 1 from " + from+ " to "+to);
            return;
        }
        towers(n-1, from, aux, to);
        System.out.println("move disk "+n+" from " +from+" to "+to);
        towers(n-1,aux,to,from);
    }
    public static void main(String f[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();
        towers(n,'A','C','B'); //method callingA
    }
}