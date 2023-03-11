package praktikum2;
import java.util.Scanner;
import java.time.LocalDate;
import java.util.Locale;
public class cobaa {
     // variabel global
    static Scanner sc = new Scanner(System.in);
    static Scanner s = new Scanner(System.in);
    static LocalDate date = LocalDate.now();
    static String makanan[] = new String[10];
    static int hargaMkn[] = new int[10];
    static String listMenu[] = new String[30];
    static int listPorsi[] = new int[30];
    static int listHarga[] = new int[30];
    static int subTotal[] = new int[30];
    static int totalbeli = 0, list = 0, pemasukan = 0, jumlah = 10;
    static int login, k, a, o;
    static int totalPorsi = 0;
    static String nama, cust;

    // asumsi maksimal 10 daftar menu ; menyimpan 4 data:
    // nama menu, harga, porsi, total
    static void listPesanan(String menu, int harga, int porsi, int subtotal) {
        if (list >= 100) {
            System.out.println("Limit Pemesanan...");
        } else {
            listMenu[list] = menu;
            listHarga[list] = harga;
            listPorsi[list] = porsi;
            subTotal[list] = subtotal;
            totalbeli = subtotal + totalbeli;
            // totalporsi = totalporsi+porsi;
            System.out.println("Pencatatan berhasil");
            list++;
        }
    }

    static int hitung(int porsi, int hargasatuan) {
        return porsi * hargasatuan;
    }

    static String pesanMenu;
    static int pesanHarga;
    static int terlaris[] = new int[15];
    static int jPorsi[] = new int[30];
    static int beli = 0;

    public static void pemesanan() {

        batas();
        System.out.print("Pilih menu: ");
        int pesan = sc.nextInt();
        System.out.print("Jumlah Porsi: ");
        int porsi = sc.nextInt();
        jPorsi[list] = porsi;
        terlaris[pesan - 1] = terlaris[pesan - 1] + jPorsi[list];
        list++;
        if (z == 1) {
            pesanMenu = hasil[pesan - 1][0];
            pesanHarga = Integer.parseInt(hasil[pesan - 1][1]);
        } else {
            pesanMenu = makanan[(pesan - 1)];
            pesanHarga = hargaMkn[(pesan - 1)];
        }
        int subtotal = hitung(porsi, pesanHarga);
        System.out.println("Total: " + subtotal);
        pemasukan = pemasukan + subtotal;
        nama = cust;
        listPesanan(pesanMenu, pesanHarga, porsi, subtotal);
        batas();
        System.out.println("Ingin menambah pesanan ?\n1. Iya\n2. Tidak");
        System.out.print("Pilih: ");
        int pl = sc.nextInt();
        if (pl == 1) {
            pemesanan();
        } else if (pl == 2) {
            System.out.println("Anda kembali ke menu kasir..");
        } else {
            System.out.println("PILIHAN TIDAK ADA!");
        }
        // sc.close();

    }

    static void pembelian() {
        int bayar;
        batas2();
        System.out.println(date.toString());
        System.out.print("Customer: " + nama + "\n");
        batas();
        System.out.println("------------------Struk Pembelian-------------------");
        System.out.println("No.\tITEM\t\tHARGA  QTY  SUBTOTAL");
        for (int i = 0; i < list; i++) {
            if (makanan != null) {
                System.out.print((i + 1) + ". " + listMenu[i] + "\t" + listHarga[i] + "   " + listPorsi[i] + "    "
                        + subTotal[i]);
            }
            System.out.println("");
        }
        batas();
        System.out.println("Total                                " + totalbeli);
        System.out.print("Tunai                                ");
        bayar = sc.nextInt();
        batas();
        if (bayar >= totalbeli) {
            int kembali = bayar - totalbeli;
            System.out.print("Kembalian                            " + kembali + "\n");
            batas2();
            System.out.println("Terima Kasih..\nPEMBELIAN BERHASIL\nSILAHKAN TUNGGU PESANAN ANDA");
        } else {
            System.out.println("UANG ANDA TIDAK CUKUP!\n");
        }
        // sc.close();
    }

    static void rekap() {
        batas();
        System.out.println("NO. TANGGAL\t   ITEM\t\tHARGA\tQTY\tSUBTOTAL");
        for (int i = 0; i < list; i++) {
            System.out.print((i + 1) + ". " + date + "\t");
            System.out.print(listMenu[i] + "\t");
            System.out.print(listHarga[i] + "\t ");
            System.out.print(listPorsi[i] + "\t");
            System.out.print(subTotal[i] + "\n");

        }
        batas();
        System.out.println("TOTAL PEMASUKAN: " + "Rp " + pemasukan);

    }

    static void dataLaris() {
        System.out.println("No Menu\t\t\tPorsi");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + makanan[i] + "\t " + terlaris[i]);
        }
        String[] newMkn = makanan;
        for (int i = 0; i < jumlah - 1; i++) {
            for (int j = i + 1; j < jumlah; j++) {
                if (terlaris[i] < terlaris[j]) {
                    int t = terlaris[j];
                    terlaris[j] = terlaris[i];
                    terlaris[i] = t;
                    // urut menu
                    String data = newMkn[j];
                    newMkn[j] = newMkn[i];
                    newMkn[i] = data;
                    break;
                }
            }

        }
        System.out.println("------------------------------------------");
        System.out.println("Lima Menu Terlaris");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "." + newMkn[i]);
        }
    }

    // method shorting menu
    static String[] sort(String[] menu, int harga[]) {
        for (int i = 0; i < jumlah; i++) {
            for (int j = 0; j < jumlah - 1; j++) {
                if (menu[j].compareToIgnoreCase(menu[j + 1]) > 0) {
                    String t = menu[j];
                    menu[j] = menu[j + 1];
                    menu[j + 1] = t;
                    int h = harga[j];
                    harga[j] = harga[j + 1];
                    harga[j + 1] = h;
                }
            }
        }
        return menu;
    }

    static String[][] hasil = new String[10][2];

    static String[][] search(String[] Menu, int[] Harga, String cari) {
        int idx = 0;
        for (int i = 0; i < makanan.length; i++) {
            String dicari = cari.toLowerCase(Locale.ROOT);
            String mCari = Menu[i].toLowerCase(Locale.ROOT);
            if (mCari.indexOf(dicari) >= 0) {
                hasil[idx][0] = Menu[i];
                hasil[idx][1] = String.valueOf(Harga[i]);
                idx++;
            }

        }
        return hasil;
    }

    static void batas() {
        System.out.println("----------------------------------------------------");
    }

    static void batas2() {
        System.out.println("====================================================");
    }

    static void daftarMenu() {
        batas();
        System.out.println("No.\tDeskripsi\t\t  Harga");
        batas();
        String urut[] = sort(makanan, hargaMkn);
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + urut[i] + "\t\tRp " + hargaMkn[i]);
        }
    }

    static void addMenu() {
        for (int i = 0; i < jumlah; i++) {
        System.out.print("Nama menu: ");
        String nMenu = s.nextLine();
        System.out.print("Harga:\t");
        int nHarga = sc.nextInt();
        makanan[jumlah] = nMenu;
        hargaMkn[jumlah] = nHarga;
        System.out.println("Penambahan Sukses..");
        jumlah++;
        daftarMenu();
        break;
        }
    }

    static int z = 0;

    public static void main(String[] args) {
        // 1. Kasir = Transaksi pembelian (memilih dan mencari menu)
        // 2. Admin = Menanmpilkan, menambah, mengubah(dengan pencarian), dan menghapus
        // data menu makanann dan harganya
        // 3. Owner = Melihat Laporan Jumlah total Pemasukan dari seluruh data
        // penjualan, dan daftar 5 menu makanan paling laScanner sc = new
        // Scanner(System.in);
        // inisialisasi array makanan
        makanan[0] = "Sate Ayam     ";
        hargaMkn[0] = 12000;
        makanan[1] = "Sate Sapi     ";
        hargaMkn[1] = 16000;
        makanan[2] = "Sate Kambing  ";
        hargaMkn[2] = 20000;
        makanan[3] = "Soto Ayam     ";
        hargaMkn[3] = 12000;
        makanan[4] = "Soto Madura  ";
        hargaMkn[4] = 14000;
        makanan[5] = "Soto Lamongan ";
        hargaMkn[5] = 10000;
        makanan[6] = "Nasi Goreng   ";
        hargaMkn[6] = 13000;
        makanan[7] = "Nasi Kuning   ";
        hargaMkn[7] = 11000;
        makanan[8] = "Nasi Bakar    ";
        hargaMkn[8] = 18000;
        makanan[9] = "Nasi Krawu    ";
        hargaMkn[9] = 15000;
        do {
            batas2();
            System.out.println("\t\tWARUNG MAKAN BU ANDIN");
            System.out.println("    Jl. Karang Tembok I No.3-A, Surabaya 60153  ");
            batas2();
            System.out.println("1. Kasir\n2. Admin\n3. Owner\n4. Exit");
            System.out.print("Login sebagai: ");
            login = sc.nextInt();
            switch (login) {
                case 1:
                    batas2();
                    System.out.println("\t\t    USER KASIR  \t\t");
                    batas2();
                    System.out.println("Apakah anda ingin memesan?\n1. Iya\n2. Tidak");
                    System.out.print("Pilih: ");
                    int p = sc.nextInt();
                    if (p == 1) {
                        batas();
                        System.out.print("Customer: ");
                        cust = sc.next();
                        do {
                            batas();
                            System.out.println("1. Daftar Menu\n2. Mencari Menu\n3. Pembayaran\n4. Kembali");
                            System.out.print("Pilih menu kasir: ");
                            k = sc.nextInt();
                            switch (k) {
                                case 1:
                                    daftarMenu();
                                    if (z == 0) {
                                        pemesanan();
                                    } else {

                                    }
                                    break;
                                case 2:
                                    System.out.print("Cari: ");
                                    String dicari = s.nextLine();
                                    batas();
                                    System.out.println("No.\tDeskripsi\t\t  Harga");
                                    batas();
                                    String ada[][] = search(makanan, hargaMkn, dicari);
                                    for (int i = 0; i < jumlah; i++) {
                                        if (ada[i][0] != null) {
                                            System.out.print((i + 1) + ". " + ada[i][0] + "\t\tRp ");
                                            System.out.println(Integer.parseInt(ada[i][1]));
                                        } else {
                                            z = 1;
                                            if (z == 1) {
                                                pemesanan();
                                                break;
                                            } else {
                                                System.out.println("Kembali ke user kasir...");
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                case 3:
                                    pembelian();
                                    break;
                                case 4:
                                    System.out.println("Anda kembali ke menu login..");
                                    break;
                            }
                        } while (k != 4);
                    } else if (p == 2) {
                        break;
                    }
                    break;
                case 2:
                    batas2();
                    System.out.println("\t\t USER ADMIN");
                    batas2();
                    System.out.println("Apakah anda ingin masuk sebagai admin?\n1. Iya\n2. Tidak");
                    System.out.print("Pilih: ");
                    int ma = sc.nextInt();
                    do {
                        daftarMenu();
                        batas();
                        System.out.println("1. Tambah Menu\n2. Hapus Menu\n3. Ubah Menu\n4. Kembali");
                        System.out.print("Pilih: ");
                        a = sc.nextInt();
                        batas();
                        switch (a) {
                            case 1:
                                addMenu();
                                break;
                            case 2:
                                System.out.print("Menu yang akan dihapus: ");
                                String hapus = s.nextLine();
                                int index = -1;
                                boolean ketemu = false;
                                for (int i = 0; i < jumlah; i++) {
                                   if (makanan[i].contains(hapus)) {
                                       ketemu = true;
                                       index = i;
                                       break;
                                   } 

                               }
                               if(ketemu==false){
                                   System.out.println("Menu Tidak Ada");}
                               else {
                                   //mengubah isi array data master
                                   for (int i = index; i < jumlah-1; i++) {
                                       makanan[i] = makanan[i+1];
                                       hargaMkn[i] = hargaMkn[i+1];
                                   }
                                   System.out.println("Penghapusan Sukses...");
                                   jumlah--;
                               }
                                break;
                            case 3:
                                System.out.print("Cari Menu Yang Akan di Ubah = ");
                                String ganti = s.nextLine();
                                String hasilCari2[][] = search(makanan, hargaMkn, ganti);
                                int indeks = 0;
                                boolean ubah = false;
                                for (int i = 0; i < hasilCari2.length; i++) {
                                    if (hasilCari2[i][0] != null) {
                                        System.out.println((i + 1) + " " + hasilCari2[i][0] + " " + hasilCari2[i][1]);
                                    }
                                }

                                System.out.print("Pilih = ");
                                int pilihAdmin2 = sc.nextInt();
                                for (int i = 0; i < jumlah; i++) {
                                    if (makanan[i].compareToIgnoreCase(hasilCari2[pilihAdmin2 - 1][0]) == 0) {
                                        ubah = true;
                                        indeks = i;
                                        break;
                                    }
                                }
                                if (ubah == false) {
                                    System.out.println("Maaf, Menu Tidak Ada");
                                } else {
                                    System.out.print("Masukkan Nama Menu Baru  = ");
                                    String MenuBaru = s.nextLine();
                                    System.out.print("Masukkan Harga Menu Baru = ");
                                    int HargaBaru = sc.nextInt();
                                    makanan[indeks] = MenuBaru;
                                    hargaMkn[indeks] = HargaBaru;
                                    System.out.println("Selamat, Menu Berhasil Diubah...");
                                }
                                break;

                        }

                    } while (a != 4);
                    break;
                case 3:
                    batas2();
                    System.out.println("\t\t USER OWNER");
                    batas2();
                    System.out.println("Apakah anda ingin masuk sebagai owner?\n1. Iya\n2. Tidak");
                    System.out.print("Pilih: ");
                    int own = sc.nextInt();
                    do {
                        System.out.println("1. Rekap Penjualan\n2. Penjualan Terlaris\n3. Kembali");
                        System.out.print("Pilih: ");
                        int mo = sc.nextInt();
                        switch (mo) {
                            case 1:
                                rekap();
                                break;
                            case 2:
                                dataLaris();
                                break;
                            case 3:
                                break;

                        }
                    } while (own != 2);

                    break;
                case 4:
                    System.out.println();
                    System.out.println("Terima Kasih...");
                    System.out.println();
                    break;
            }
        } while (login != 4);
        // sc.close();
    }
}