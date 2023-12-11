import java.util.Scanner;

public class ConvertidorTemp1 {

    public static void main(String[] args) {
        // Declaración de variables
        Scanner sc = new Scanner(System.in);
        float grados, conversion;
        String unidad;
        
        // Ingreso de datos
        System.out.print("Ingrese la temperatura: ");
        grados = sc.nextFloat();
        System.out.print("Indique la unidad de medida (C o F): ");
        sc.nextLine();
        unidad = sc.nextLine();

        // Proceso
        // Se asume que si la unidad no es °F, entonces es °C
        if (unidad.equals("F") || unidad.equals("f")) {
            conversion = (float) 5 / 9 * (grados - 32);
            System.out.println("\nLa temperatura en grados Celsius es "
                    + conversion);
        } else {
            conversion = (float) 9 / 5 * grados + 32;
            System.out.println("\nLa temperatura en grados Fahrenheit es "
                    + conversion);
        }
    }
}

