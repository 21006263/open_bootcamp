package Ejercicios_tema_4;
/* Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
    Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
    */
public class ejercicio_1 {
    public static void main(String[] args) {
        int numeroif = 0;

        if (numeroif > 0) {
            System.out.println("Es un positivo");
        } else if (numeroif < 0) {
            System.out.println("Es numero negativo");
        } else {
            System.out.println("El numero es cero");
        }
    }

}
