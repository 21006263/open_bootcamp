package Ejercicios_tema_4;

/*Por último, para el Switch, deberás crear la variable estacion, y distintos
 case para las cuatro estaciones del año. Dependiendo del valor de la
 variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
 También habrá que poner un default para cuando el valor de la variable no sea una estación.
        */




public class ejercicio_5 {
    public static void  main(String [] args) {

        String estacion = "Primavera";

        switch (estacion) {

            case "Primavera":
                System.out.println("Esta en la estacion de Primavera");
                break;
            case "Otoño":
                System.out.println("Esta en ña estacion de Otoño");
                break;
            case "Verano":
                System.out.println("Esta en la estacion de Verano");
                break;
            case "Invierno":
                System.out.println("Esta en la estacion de Invierno");
                break;
            default:
                System.out.println("No has elegido una estacion meridana correcata");
                break;
        }
    }

}
