//import java.util.Scanner;
//
//public class Main {
//    private final short[] daftarNomor = {12334, 12311, 15334, 12313, 26713};
//    public static void main(String[] args) {
//        Scanner pilihan = new Scanner(System.in);
//        int menu;
//
//        do {
//            System.out.println("=== SELAMAT DATANG ===");
//            System.out.println("1. Mendaftar Pasien");
//            System.out.println("2. Mendaftar Pertama Kali");
//            System.out.println("3. Keluar");
//            System.out.print("Pilih menu (1-3): ");
//            menu = pilihan.nextInt();
//
//            switch (menu) {
//                case 1:
//                    daftarPasien();
//                    break;
//                case 2:
//                    daftarPasienBaru();
//                    break;
//                case 3:
//                    System.out.println("Terima kasih. Program selesai.");
//                    break;
//                default:
//                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
//            }
//        } while (menu != 3);
//    }
//
//    private static void daftarPasien() {
//        // Implementasikan logika untuk mendaftarkan pasien yang sudah terdaftar
//        // Sesuai dengan langkah-langkah yang Anda berikan
//        Scanner pasienLama = new Scanner(System.in);
//        short nomorPasien;
//        do {
//            System.out.print("Masukkan nomor pasien anda: ");
//            nomorPasien = pasienLama.nextShort();
//            if (nomorPasien != nomorPeserta());{
//                System.out.println("Nomor Pasien Anda Salah, Silahkan Coba Lagi");
//            }
//        }while (nomorPasien != nomorPeserta());
//        System.out.println("Mancing mania mantap");
//
//
//    }
//
//    private static void daftarPasienBaru() {
//        // Implementasikan logika untuk mendaftarkan pasien baru
//        // Sesuai dengan langkah-langkah yang Anda berikan
//    }
//
//    private static short nomorPeserta(){
//
//    }
//}