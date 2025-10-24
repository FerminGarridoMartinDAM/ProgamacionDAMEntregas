 //## Ejercicio 5: Declaración y uso de constantes
 //Crea un programa que use constantes para almacenar información que no debe cambiar
 // (como el valor de PI o el nombre de una aplicación) y variables para información que puede cambiar.
 // Muestra todos los valores.

public class Main {
    public static void main(String[] args) {
        final String appName = "Aplicacion DAM";
        final float pi = 3.1416f ;
        final int maxUserNumbers = 5;
        String actualUser = "Pepe";
        int activeUsers = 1;
        final int starLevel = 1;
        int actualLevel = 8;
        final int maxLevel = 100;
        String place = "Madrid";

        System.out.println("Aplicacion: " + appName );
        System.out.println("Valor de pi: " + pi);
        System.out.println("Numero maximos de usuarios: " + maxUserNumbers);
        System.out.println("Usuario actual: " + actualUser);
        System.out.println("Usuarios activos: " + activeUsers);
        System.out.println("Nivel inicial: " + starLevel);
        System.out.println("Nivel actual: " + actualLevel);
        System.out.println("Nivel maximo: " + maxLevel);
        System.out.println("Ubicacion: " + place);


    }
}
