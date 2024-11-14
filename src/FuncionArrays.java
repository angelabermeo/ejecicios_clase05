import java.util.Scanner;

public class FuncionArrays {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {

            int[] lista = Array(entrada);

            for (int i = 0; i < lista.length; i++) {
                System.out.println("el numero en la posicion " + (i + 1) + " : " + lista[i]);
            }

            int suma = sumaArray(lista);

            int maximo = valorMaximo(lista);

            int minimo = valorMinimo(lista);

            invertirArray(lista);

            System.out.println("¿Desea ingresar otro arreglo? (si/no)");
            String respuesta = entrada.next();
            if (!respuesta.equalsIgnoreCase("si")) {
                continuar = false;

            }
        }
        entrada.close();
    }

    private static int[] Array(Scanner entrada) {
        System.out.println("por favor digite el tamaño de la coleccion ");
        int tamanio = entrada.nextInt();
        int[] array = new int[tamanio];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Por favor ingresa el valor para la posición " + (i + 1) + " : ");
            array[i] = entrada.nextInt();
        }

        return array;
    }

    private static int sumaArray(int[] Array) {
        int suma = 0;
        for (int numero : Array) {
            suma += numero;

        }
        System.out.println("la suma de la coleccion es " + suma);

        return suma;

    }

    private static int valorMinimo(int[] Array) {
        int minimo = Array[0];
        for (int numero : Array) {
            if (numero < minimo) {
                minimo = numero;

            }

        }
        System.out.println("el numero minimo de la coleccion es : " + minimo);

        return minimo;
    }

    private static void invertirArray(int[] Array) {
        int inicio = 0;
        int fin = Array.length - 1;
        while (inicio < fin) {
            int temp = Array[inicio];
            Array[inicio] = Array[fin];
            Array[fin] = temp;
            inicio++;
            fin--;

        }
        System.out.print("Arreglo invertido: ");
        for (int numero : Array) {
            System.out.print(numero + " ");
        }
        System.out.println();

    }

    private static int valorMaximo(int[] Array) {
        int maximo = Array[0];
        for (int numero : Array) {
            if (numero > maximo) {
                maximo = numero;

            }

        }
        System.out.println("el numero maximo de la coleccion es : " + maximo);

        return maximo;
    }

}
