package praktikum2;
import java.util.Scanner;
public class perkalian {
    
//    int mult(int a, int b){
//        int c, d, sum;
//        if (b==1) return(a);
//        c = b-1;
//        d = mult (a,c);
//        sum = d+a;
//        return(sum);
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean sad;
        System.out.print("Are you sad?");
        sad = sc.nextBoolean();
        if(sad==true) {
            System.out.println("stop sad");
            System.out.println("beAwesome");
            sad = false;
        }
        else if (sad==false) {
            System.out.print("let's always be like that!");
        }
        
    }
}
