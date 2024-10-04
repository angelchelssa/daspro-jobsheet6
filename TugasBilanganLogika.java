import java.util.Scanner;
public class TugasBilanganLogika {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

    int bilangan1,bilangan2,bilangan3;

    System.out.print("Masukkan bilangan 1: ");
    bilangan1 = input.nextInt();
    System.out.print("Masukkan bilangan 2: ");
    bilangan2 = input.nextInt();
    System.out.print("Masukkan bilangan 3: ");
    bilangan3 = input.nextInt();

    if (bilangan1 > bilangan2 && bilangan1 > bilangan3) {
        System.out.println("Bilangan terbesar adalah " + bilangan1);
    } else if (bilangan2 > bilangan1 && bilangan2 > bilangan3) {
        System.out.println("Bilangan terbesar adalah " + bilangan2);
    } else {
        System.out.println("Bilangan terbesar adalah " + bilangan3);
    
        }
    }
}