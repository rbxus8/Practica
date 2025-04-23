import java.util.Scanner;

public class cine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definicion de variables
        int opcion;

        // bienvenida
        System.out.println("Bienvenido al cine juli,s");
        System.out.println("la hora es: " + java.time.LocalTime.now());
        System.out.println("la fecha es: " + java.time.LocalDate.now());

        do {

            // menu
            System.out.println("1. Consultar carteleras");
            System.out.println("2. Comprar entradas");
            System.out.println("3. Consultar precios");
            System.out.println("0. Salir");
            System.out.println("Ingrese una opcion: ");

            opcion = scanner.nextInt(); // leer opcion

            switch (opcion) {
                case 1:

                    break;
            }

        } while (opcion != 0); // bucle infinito para el menu

    }
}
