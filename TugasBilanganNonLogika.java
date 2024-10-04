import java.util.Scanner;
/**
 * TugasBilanganNonLogika
 */
public class TugasBilanganNonLogika {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double bilangan1, bilangan2, bilangan3;

        System.out.print("Masukkan bilangan ke-1 : ");
        bilangan1 = input.nextDouble();
        System.out.print("Masukkan bilangan ke-2 : ");
        bilangan2 = input.nextDouble();
        System.out.print("Masukkan bilangan ke-3 : ");
        bilangan3 = input.nextDouble();

        if (bilangan1 > bilangan2) {
            if (bilangan1 > bilangan3) {
                System.out.print("Bilangan terbesar adalah " + bilangan1);
            }else {
                System.out.print("Bilangan terbesar adalah " + bilangan3);
            }
            }else if (bilangan2 > bilangan3) {
                System.out.print("Bilangan terbesar adalah " + bilangan2);
            }else 
                System.out.print("Bialangan terbesar adalah " + bilangan3);
            
                input.close();
            }
}