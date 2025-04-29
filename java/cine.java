/*Tareas a Realizar
Datos Iniciales:

Crear arrays para almacenar:

Nombres de películas.
Números de sala correspondientes.
Cantidad de asientos disponibles por sala.
Precios de las entradas por película.

Menú Principal:

Opción 1 (Cartelera): Mostrar la lista de películas disponibles, indicando sala y precio.

Opción 2 (Comprar entrada):

Permitir al usuario seleccionar una película.

Verificar si hay asientos disponibles.

Actualizar la cantidad de asientos restantes.

Mostrar mensaje de confirmación o error.

Opción 3 (Precios): Mostrar el precio de cada película.

Opción 0 (Salir): Finalizar el programa.

Validaciones:

Asegurar que el programa no falle si el usuario ingresa datos incorrectos (ej: letras en lugar de números).

Evitar que se vendan entradas si no hay asientos disponibles.*/

import java.util.Scanner;
import java.time.LocalTime;

public class cine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definicion de variables
        int opcion;
        String[] peliculas = { "Avatar", "Titanic", "Avengers", "Star Wars" }; // peliculas
        int[][][] salas = new int[4][10][10];// 5 salas, 10 filas, 10 columnas
        double[] precios = { 10.0, 12.5, 15.0, 20.0 }; // precios de las entradas

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
                    cartelera(peliculas, precios);
                    break;
            }

        } while (opcion != 0); // bucle infinito para el menu

        // aignar valores a las salas
        for (int i = 0; i < salas.length; i++) {
            for (int j = 0; j < salas[i].length; j++) {
                for (int k = 0; k < salas[i][j].length; k++) {
                    salas[i][j][k] = 0;
                }
            }
        }

        // comprar entradas
        // consultar precios

    }

    // consultar cartelera
    public static void cartelera(String[] peliculas, double[] precios) {
        System.out.println(" Cartelera:");
        for (int i = 0; i < peliculas.length; i++) {
            System.out.println((i + 1) + ". " + peliculas[i] + " - Sala " + (i + 1) + " - Precio: $" + precios[i]);
        }
    }
}
