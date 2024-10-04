import java.util.Scanner;

public class Pemilihan2Percobaan2_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilihan_menu;
        String member;
        double diskon = 0.0, harga = 0.0, total_bayar;

        System.out.println("-----------------");
        System.out.println("=========== MENU CAFE JTI =========");
        System.out.println("-----------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih: ");
        pilihan_menu = sc.nextInt();
        sc.nextLine();  
        System.out.print("Apakah punya member (y/n)? ");
        member = sc.nextLine();
        System.out.println("---------------------------------------");

        if (member.equalsIgnoreCase("y")) { //menggunakan equalsIgnoreCase untuk membandingkan string 
            diskon = 0.10; 
            System.out.println("Besar diskon = 10%");

            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling (Ricebowl + Ice Tea) = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // menghentikan eksekusi lebih lanjut jika pilihan salah
            }

            // menghitung totoal bayar setelah diskon
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);

        } else if (member.equalsIgnoreCase("n")) { // menggunakan equalsIgnoreCase untuk membandingkan string
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling (Ricebowl + Ice Tea) = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            }

            // Menghitung total bayar
            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Status member tidak valid.");
        }

        System.out.println("-----------------------------------");
        sc.close();
    }
}
