import java.util.Scanner;
    /**
     * TugasSepatu
     */
    public class TugasSepatu {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        
    String merk, kategori;
    int ukuran;
    float harga, totalHarga;

    System.out.print("Masukkan Merk Sepatu (specs/910/ortus): ");
    merk = sc.nextLine();
    System.out.print("Masukkan Kategori Sepatu : ");
    kategori = sc.nextLine();
    System.out.print("Masukkan Ukuran Sepatu : ");
    ukuran = sc.nextInt();

    harga = 0;
    switch (kategori.toLowerCase()) {
        case "slip on":
            if (ukuran > 36 && ukuran < 40) {
                harga = 800000;
            }
        break;
        case "high top":
            if (ukuran > 40 && ukuran < 44){
                harga = 1200000;
            }
        break;
        case "woman":
            if (ukuran > 36 && ukuran < 40){
                harga = 1000000;
            }
            break;
        case "man":
            if (ukuran > 41 && ukuran < 44){
                harga = 1800000;
            }
            break;
        case "kids":
            if (ukuran > 36 && ukuran < 40){
                harga = 750000;
            }
            break;
        case "adult":
            if (ukuran > 40 && ukuran < 44){
                harga = 1500000;
            }
            break;
        default:
            System.out.println("Merk Tidak Tersedia");
            break;
    }
    switch (merk.toLowerCase()) {
        case "specs":
            break;
        case "910":
            break;
        case "ortus":
            break;
        default:
            break;
    }
    totalHarga = harga;
    System.out.println("Jadi harga sepatu " + kategori + " ukuran " + ukuran + " ialah " + totalHarga);

        sc.close();
        }
}
