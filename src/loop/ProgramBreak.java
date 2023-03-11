package loop;
import java.util.Scanner;
public class ProgramBreak {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int tebakan,salah=0;
        do{
            System.out.print("Maukkan Angka 0-9 = ");
            tebakan = s.nextInt();
            if(tebakan==6){
                System.out.println("ANDA BENAR!!!");
                break;
            }
            salah++;
            System.out.println(salah+ " X Salah :(");
        }while(tebakan!=6);
    }
}
