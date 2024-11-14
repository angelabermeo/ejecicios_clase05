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

            int minimo = valorMinimo(lista);

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

    private static int valorMinimo(int [] Array){
        int minimo = Array[0]; 
        for (int numero: Array) {
            if (numero < minimo) {
                minimo = numero; 
                
            }

            System.out.println("el numero minimo de la coleccion es : " +minimo);
            
        }


        return minimo;
    }

    private static int invertirArray(int [] Array){
        int inicio = 0;
         int fin = arreglo.length - 1;
          while (inicio < fin) { // Intercambiar los elementos de inicio y fin int temp = arreglo[inicio]; arreglo[inicio] = arreglo[fin]; arreglo[fin] = temp; inicio++; fin--; }
    
}
        return
    }



}
