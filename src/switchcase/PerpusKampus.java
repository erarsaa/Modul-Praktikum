package switchcase;
import java.util.Scanner;
public class PerpusKampus {
    public static void main(String[] args) {
        Scanner a = new Scanner (System.in);
        //Tampilan pilihan
        System.out.println("Perpustakaan Kampus");
        System.out.println("1. Peminjaman Buku");
        System.out.println("2. Pengembalian Buku");
        System.out.println("3. Pencarian Buku");
        System.out.println("4. Daftar Anggota");
        System.out.print("\nPilihan = ");
            byte pilih = a.nextByte();
                
            //seleksi pilihan
            switch(pilih){
                case 1: System.out.println("Anggota?");
                        System.out.println("1 = Ya");
                        System.out.println("2 = Bukan");
                        System.out.print("Pilihan = ");
                            int anggota = a.nextInt();
                        System.out.print("Biaya Peminjaman ");
                            if(anggota==1){
                                System.out.println("Gratis");
                            }
                            else if(anggota==2){
                                System.out.println("Rp. 10.000");
                            }
                            else System.out.println("Ups...");
                    break;
                case 2: System.out.println("Terlambat? ");
                        System.out.println("1 = Ya");
                        System.out.println("2 = Tidak");
                        System.out.print("Pilihan = ");
                            int terlambat = a.nextInt();
                                if(terlambat==1){
                                    System.out.println("Anggota?");
                                    System.out.println("1 = Ya");
                                    System.out.println("2 = Bukan");
                                    System.out.print("Pilihan = ");
                                        int anggota2 = a.nextByte();
                                    System.out.print("Kena Denda ");
                                        if(anggota2==1){
                                            System.out.println("Rp. 1000/hr");
                                        }
                                        else if(anggota2==2){
                                            System.out.println("Rp. 2000/hr");
                                        }
                                }else if(terlambat==2){
                                    System.out.println("Thank Yout");
                                }
                    break;
                case 3: System.out.println("Kelompo Buku");
                        System.out.println("1. Sosial");
                        System.out.println("2. Sains");
                        System.out.println("3. Keagamaan");
                        System.out.print("Pilihan = ");
                            int pilih2 = a.nextInt();
                        System.out.println("Ada di Lantai ");
                            switch(pilih2){
                                case 1: System.out.println("I");
                                    break;
                                case 2: System.out.println("II");
                                    break;
                                case 3: System.out.println("III");
                                    break;
                                default: System.out.println("Ups...");
                            }
                    break;
                case 4: System.out.println("Civitas Kampus");
                        System.out.println("1 = Ya");
                        System.out.println("2 = Bukan");
                        System.out.print("Jawab = ");
                            int civitas = a.nextByte();
                        System.out.print("Biaya Daftarnya ");
                            if (civitas==1) {
                                System.out.println("Gratis");
                            }
                            else if (civitas==2){
                                System.out.println("Rp. 100.000");
                            }
                    break;
                default: System.out.println("Ups...");
            }
    }
}
