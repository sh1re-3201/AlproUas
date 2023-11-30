package org.example;

import java.util.Scanner;

public class EnhancedLab {
    // Array untuk menyimpan nomor pasien yang sudah terdaftar
    static short[] nomorPasienTerdaftar = {12334, 12311, 15334, 12313, 26713};

    public static void main(String[] args) {
        int asep = 1;
        switch (asep){
            case 1:
                menuAwal();
                break;
        }
    }
    static void menuAwal(){
        Scanner aria = new Scanner(System.in);
        int menu;

        do {
            System.out.println("=== SELAMAT DATANG ===");
            System.out.println("1. Mendaftar Pasien");
            System.out.println("2. Mendaftar Pertama Kali");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            menu = aria.nextInt();

            switch (menu) {
                case 1:
                    daftarPasien();
                    break;
                case 2:
                    daftarPasienBaru();
                    break;
                case 3:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (menu != 3);
    }

    private static void daftarPasien() {
        Scanner pasienLama = new Scanner(System.in);
        short nomorPasien;
        boolean nomorValid;
        char balikMenu;


        do {
            System.out.print("Masukkan nomor rekam medis anda: ");
            nomorPasien = pasienLama.nextShort();
            nomorValid = nomorPeserta(nomorPasien);

            if (!nomorValid) {
                System.out.println("Nomor Pasien Anda Salah, Silahkan Coba Lagi");
                System.out.print("Atau anda ingin kembali ke menu sebelumnya? (y/n)");
                balikMenu = pasienLama.next().charAt(0);
                if (balikMenu == 'y'){
                    menuAwal();
                } else {

                }
            }

        } while (!nomorValid);


        System.out.println("Mancing mania mantap");
    }

    private static void pilihPoli(){
        Scanner pilihanPoli = new Scanner(System.in);
        short erabe;

        do {
            System.out.println("Silahkan pilih poli yang akan anda tuju: ");
            System.out.println("1. Poli Umum");
            System.out.println("2. Poli Bedah");
            System.out.println("3. Poli Mata");
            System.out.println("4. Poli Gigi & Mulut");
            System.out.println("5. Poli Gynekologi");
            System.out.println("6. Poli Gizi");
            System.out.println("7. Poli Penyakit Dalam");
            System.out.print("Pilih poli yang akan anda tuju (1 - 7)");
            erabe = pilihanPoli.nextByte();
            switch (erabe){
                case 1:


            }
        }while (erabe != 7);
    }

    private static void daftarPasienBaru() {
        // Implementasikan logika untuk mendaftarkan pasien baru
        // Sesuai dengan langkah-langkah yang Anda berikan


    }

    // Metode untuk memeriksa apakah nomor pasien sudah terdaftar atau tidak
    private static boolean nomorPeserta(short nomorPasien) {
        for (short nomor : nomorPasienTerdaftar) {
            if (nomor == nomorPasien) {
                System.out.println("Selamat Datang Kembali!");
                return true; // Nomor pasien terdaftar
            }
        }
        return false; // Nomor pasien tidak terdaftar

    }
    static void poliUmum(){
        //TODO diisi oleh daftar dokter sesuai hari
    }
}
