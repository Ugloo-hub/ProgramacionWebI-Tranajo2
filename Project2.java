import java.util.Scanner;

public class Project2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Practica 1
        int[] numeros = new int[10];
        int suma = 0;
        double promedio;

        System.out.println("===== EJERCICIO 1 =====");

        for (int i = 0; i < 10; i++) {

            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

            suma += numeros[i];
        }

        promedio = (double) suma / 10;

        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);

        //Practica 2
        System.out.println("\n===== EJERCICIO 2 =====");

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < 10; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);

        //Practica 3
        System.out.println("\n===== EJERCICIO 3 =====");

        System.out.print("Ingrese el divisor: ");
        int divisor = sc.nextInt();

        System.out.println("Múltiplos de " + divisor + ":");

        for (int i = 0; i < 10; i++) {

            if (numeros[i] % divisor == 0) {
                System.out.println(numeros[i] + " es múltiplo");
            }
        }

        //Practica4
        System.out.println("\n===== EJERCICIO 4 =====");

        System.out.print("Ingrese el número que desea buscar: ");
        int buscar = sc.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < 10; i++) {

            if (numeros[i] == buscar) {

                System.out.println("Número encontrado en la posición: " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Número no encontrado");
        }

        //Practica 5
        System.out.println("\n===== EJERCICIO 5 =====");

        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] sumaMatrices = new int[3][3];
        int[][] productoMatrices = new int[3][3];

        System.out.println("Ingrese los valores de la matriz A:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Ingrese los valores de la matriz B:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = sc.nextInt();
            }
        }

        System.out.print("Ingrese un número multiplicador: ");
        int numero = sc.nextInt();

        System.out.println("\nMatriz A multiplicada por " + numero + ":");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print((A[i][j] * numero) + "\t");
            }

            System.out.println();
        }

        System.out.println("\nMatriz B multiplicada por " + numero + ":");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print((B[i][j] * numero) + "\t");
            }

            System.out.println();
        }

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                sumaMatrices[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("\nSuma de matrices:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(sumaMatrices[i][j] + "\t");
            }

            System.out.println();
        }

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                for (int k = 0; k < 3; k++) {

                    productoMatrices[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("\nProducto de matrices:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(productoMatrices[i][j] + "\t");
            }

            System.out.println();
        }

        sc.close();
    }
}