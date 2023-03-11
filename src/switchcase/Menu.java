package switchcase;
import java.util.Scanner;
public class Menu {
    public static void main (String[] args) {
	Scanner a = new Scanner(System.in);
	System.out.println("Toko Berkah Sejahtera");
	System.out.println("1. Beras \n2. Telur");
	System.out.println("3. Gula \n4. Minyak");
	System.out.println("5. Tepung \n6. Garam");
	System.out.print(" Pilihan = ");
            byte pilih = a.nextByte();
	switch(pilih){
	case 1 : System.out.println("Diskon 15%");
	case 5 : 
	case 3 :
	case 4 : System.out.println("Diskon 20%");
			break;
	case 2 :
	case 6 : System.out.println("No Diskon");
			break;
	default : System.out.println("Ups...");
	}    
    }
}