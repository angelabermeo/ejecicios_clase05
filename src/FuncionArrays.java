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

            sumaArray(lista);

            valorMaximo(lista);

            valorMinimo(lista);

            invertirArray(lista);

            mayorAMenor(lista);

            Promedio(lista);

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

    private static void mayorAMenor(int[] Array) {
        for (int i = 0; i < Array.length - 1; i++) {
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[i] < Array[j]) {
                    int temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;
                }
            }
        }

        System.out.print("Arreglo ordenado de mayor a menor: ");
        for (int numero : Array) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    private static int Promedio(int[] Array) {
        int suma = 0;
        for (int i = 0; i < Array.length; i++) {
            suma += Array[i];

        }
        int prom = suma / Array.length;

        System.out.println("el promedio de la coleccion es " + prom);

        return prom;
    }
}
