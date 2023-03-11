package ifelse;
import java.util.Scanner ;
public class login {
    public static void main(String[] args) {
        //membuat instance pemindai baru yang menunjuk ke aliran input
        //yang diterukan sebagai argumen
        Scanner a = new Scanner (System.in);
        
        //variabel yang sudah diisi nilai
        String Nama = "Ervina";
        String Pass = "era123";
        
        //membuat perintah untuk memasukkan nama dan pasword yang diinput
        //langsung oleh user
        System.out.print("Nama      = ");
        String nam = a.next();
        System.out.print("Password  = ");
        String pas = a.next();
        
        //membuat program untuk melakukan pengecekan agar bisa login
        
        //jika nama dan password benar
        if (nam.equalsIgnoreCase(Nama) && pas.equalsIgnoreCase(Pass)){
            //maka akan berhasil login
            System.out.println("Selamat Anda Berhasil Login");
        }
        else{
            //maka tidak bisa login
            System.out.println("Nama/Password Salah");
        }
    }
}
