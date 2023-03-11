package loop;
import java.util.Scanner;
public class BreakContinue {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
         int i=1, j=1;

        do{

            do{

                System.out.print(j+" ");

            }while(j<=3);

            j++;

            i++;

        }while(i<=3);
    }
}
