import java.util.Scanner;

public class Semana2Icel {
    private static int sumaPositivos = 0;
    private static int sumaNegativos = 0;
    private static int contadorPositivos = 0;
    private static int contadorNegativos = 0; //creacion de variables globales

    private static final Scanner scanner = new Scanner(System.in); // objeto scanner para la entrada de usuario

    private static final int[] numeros = new int[10]; // Array para almacenar 10 numeros

    public static void PromedioPositivosNegativos() {
        System.out.println("Sistema de promedio numeros positivos y negativos");
        System.out.println("Ingresa los 10 numeros enteros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                contadorPositivos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                contadorNegativos++;
            }
        }
        double promedioPositivos = (contadorPositivos > 0) ? (double) sumaPositivos / contadorPositivos : 0;
        double promedioNegativos = (contadorNegativos > 0) ? (double) sumaNegativos / contadorNegativos : 0;

        System.out.println("Promedio de numeros positivos: " + promedioPositivos);
        System.out.println("Promedio de numeros negativos: " + promedioNegativos);
    }

    public static void PromedioPosicionesPares() {
        System.out.println("Sietema de Posiciones pares");
        System.out.println("Ingresa 10 numeros enteros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
            if (i % 2 == 0) {
                sumaPositivos += numeros[i];
                contadorPositivos++;
            }
        }
        double promedio = (contadorPositivos > 0) ? (double) sumaPositivos / contadorPositivos : 0;

        System.out.println("Promedio de valores en posiciones pares: " + promedio);
    }

    public static void SumaMatrices() {
        System.out.println("Sistema suma de matrices");
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][3];

        System.out.println("Ingresa los elementos de la matriz A (3x3): ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ingresa los elementos de la matriz B (3x3): ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Se esta realizando la suma de las matrices");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("La matriz resultante C es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(C[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner para leer la entrada del usuario
        String respuesta; // Variable para almacenar la respuesta del usuario

        do {
            // Mostrar el menú al usuario
            System.out.println("Bienvenido a este sistema de matrices, ¿qué opción deseas realizar?");
            System.out.println("1. Promedio Positivos Negativos");
            System.out.println("2. Promedio Posiciones Pares");
            System.out.println("3. Suma Matrices");
            System.out.print("Ingresa el número de la opción: ");
            int opcion = scanner.nextInt(); // Leer la opción seleccionada

            // Llamar al método correspondiente según la opción
            if (opcion == 1) {
                PromedioPositivosNegativos();
            } else if (opcion == 2) {
                PromedioPosicionesPares();
            } else if (opcion == 3) {
                SumaMatrices();
            } else {
                System.out.println("Opción inválida. Inténtalo de nuevo.");
            }

            // Preguntar si desea realizar otra operación
            System.out.println("¿Deseas realizar otra operación? (responde 'si' o 'no')");
            scanner.nextLine(); // Consumir el salto de línea pendiente
            respuesta = scanner.nextLine(); // Leer la respuesta del usuario
        } while (respuesta.equalsIgnoreCase("si")); // Continuar si la respuesta es "si"

        // Mensaje de despedida
        System.out.println("Gracias, hasta pronto...");
        scanner.close(); // Cerrar el Scanner
    }
}


