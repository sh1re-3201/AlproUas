package org.example;

import java.util.Scanner;

public class menuAwal {
    static void menuAwal(){
        Scanner aria = new Scanner(System.in);
        int menu;

        do {
            System.out.println("=== SELAMAT SAKIT ===");
            System.out.println("1. Mendaftar Pasien");
            System.out.println("2. Mendaftar Pertama Kali");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            menu = aria.nextInt();

            switch (menu) {
                case 1:
                    EnhancedLab.daftarPasien();
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
}
