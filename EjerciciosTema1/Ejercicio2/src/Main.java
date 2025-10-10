public class Main {
    /* ## Ejercicio 2: Modificar variables
    Crea un programa que defina una variable llamada puntuación con valor inicial 0.
    Luego, modifica su valor tres veces y muestra el resultado final.
    Ejemplo de salida por consola:*/
    public static void main(String[] args) {
        int puntuacion = 0;
        System.out.println("Puntuacion inicial :" + puntuacion);
        puntuacion = puntuacion + 5;
        System.out.println("Puntuacion despues de la primera modificacion: " + puntuacion);
        puntuacion = puntuacion + 15;
        System.out.println("Puntuacion despues de la segunda modificacion: " + puntuacion);
        puntuacion = puntuacion + 30;
        System.out.println("Puntuacion final: " + puntuacion);

    }
}

