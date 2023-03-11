package ifelse;
import java.util.Scanner;
public class ongkoskirim {
    public static void main(String[] args) {
        //membuat instance pemindaian baru yang menunjuk ke
        //aliran input yang diteruskan sebagai argumen
        Scanner a = new Scanner(System.in);
        
        //variabel
        int jarak; //jarak pengiriman
        int berat; //berat oaket
        int biayaberat=0; //biaya
        int total; //biaya pengiriman
        
        //tampilan diskon yang tersedia
        System.out.println("Pengiriman Barang dengan berat <5 Kg = tidak kena tambahan biaya ");
        
        //membuat perintah untuk memasukan berat pengiriman yang langsung 
        //diinput user
        System.out.print("Berat Paket (kg) = ");
        berat = a.nextInt();
        
        //membuat program ongkos kirim menggunakan perintah If-Else
        //jika berat <5
        if(berat < 5){
            //maka tidak terkena biaya pengiriman
            System.out.print("\nJarak Pengiriman (km) = ");
            jarak =a.nextInt();
            System.out.print("Biaya Pengiriman = Rp. ");
            total = a.nextInt();
        }
        else {
            System.out.print("\nBiaya Berat Pengiriman = Rp. ");
            biayaberat = a.nextInt();
            System.out.print("Jarak Pengiriman (km) = ");
            jarak = a.nextInt();
            System.out.print("Biaya Pengiriman = Rp. ");
            total = a.nextInt();
            total = total + biayaberat;
        }
        System.out.println("\nTotal Biaya Pengiriman = Rp. " +total);
    }
}
