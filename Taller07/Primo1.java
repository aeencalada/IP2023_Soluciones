package primo1;

//Número primo
import java.util.Scanner;

public class Primo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, c;
        char esPrimo;
        System.out.print("Ingrese un número entero: ");
        n = sc.nextInt();
        esPrimo = 'S';
        c = n - 1;
        while (c >= 2) {
            if (n % c == 0) {
                esPrimo = 'N';
                c = 1;
            } else {
                c = c - 1;
            }
        }
        if (esPrimo == 'S') {
            System.out.println("\nEl número " + n + " es primo.");
        } else {
            System.out.println("\nEl número " + n + " no es primo.");
        }
    }
}
